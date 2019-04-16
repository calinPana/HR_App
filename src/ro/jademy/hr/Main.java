package ro.jademy.hr;

import ro.jademy.hr.model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String args[]) {
        List<Title> titles = new ArrayList<>();

        //Creating the employee objects
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees", "root", "");
            //here sonoo is database name, root is username and password

            DBconnection dBconnection = new DBconnection();
            List<Employee> employees = dBconnection.getAllEmployees(conn);

            for (Employee employee : employees) {
                List<Salary> salaries = dBconnection.getSalaries(employee, conn);
                employee.getSalaries().addAll(salaries);
                List<Department> departments = dBconnection.getDepartments(employee, conn);
                employee.getDepartments().addAll(departments);
            }

            Application app = new Application(employees);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void importDb(String code) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees", "root", "");
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(code);
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)
                        + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getDate(6));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
