package ro.jademy.hr;

import ro.jademy.hr.model.Department;
import ro.jademy.hr.model.Employee;
import ro.jademy.hr.model.Salary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBconnection {

    public ResultSet runQuery(String query, Connection con) throws SQLException {
        PreparedStatement stm = con.prepareStatement(query);

        return stm.executeQuery();
    }

    public List<Employee> getAllEmployees(Connection conn) throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        String employeesQuery = "SELECT * FROM employees";
        ResultSet rs = runQuery(employeesQuery, conn);
        while (rs.next()) {
            Employee empl = new Employee(rs.getString(1), rs.getDate(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getDate(6));

            // call methods to get employee salaries, departments and titles
            empl.getSalaries().addAll(getSalaries(empl, conn));


            employeeList.add(empl);
        }

        return employeeList;
    }

    public List<Salary> getSalaries(Employee employee, Connection conn) throws SQLException {

        List<Salary> salaries = new ArrayList<>();
        String salariesQuery = "SELECT * FROM salaries WHERE emp_no = " + employee.getEmpNo();
        ResultSet rs = runQuery(salariesQuery, conn);
        while (rs.next()) {
            Salary salary = new Salary(rs.getString(1), rs.getInt(2), rs.getDate(3),
                    rs.getDate(4));
            salaries.add(salary);
        }


        // query to return salaries for a given employee

        return salaries;
    }

    public List<Department> getDepartments(Employee employee, Connection conn) throws SQLException {

        List<Department> departments = new ArrayList<>();
        String salariesQuery = "SELECT * FROM departments WHERE emp_no = " + employee.getEmpNo();
        ResultSet rs = runQuery(salariesQuery, conn);
        while (rs.next()) {
            Department department = new Department(rs.getString(1), rs.getInt(2), rs.getDate(3),
                    rs.getDate(4));
            departments.add(department);
        }


        // query to return salaries for a given employee

        return salaries;
    }
}
