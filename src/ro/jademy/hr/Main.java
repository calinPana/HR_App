package ro.jademy.hr;

import ro.jademy.hr.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

class Main {

    public static void main(String args[]) {
//        importDb("select * from employees");
        //Interface.employeesStartingWith("A");


//        //Creating the employee objects
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees", "root", "");
//here sonoo is database name, root is username and password

            DBconnection dBconnection = new DBconnection();
            List<Employee> employees = dBconnection.getAllEmployees(conn);

            for (Employee employee : employees) {
                System.out.println(employee);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
//
//
//
//
//        //Creating the title objects
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/employees", "root", "");
////here sonoo is database name, root is username and password
//
//
//            Statement stm = con.createStatement();
//
//            ResultSet rs = stm.executeQuery("SELECT DISTINCT title FROM titles");
//            while (rs.next())
//                titles.add(new Title(rs.getString(1)));
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//
//        //Creating the salary objects
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/employees", "root", "");
////here sonoo is database name, root is username and password
//
//            Statement stm = con.createStatement();
//
//            ResultSet rs = stm.executeQuery("SELECT * FROM salaries");
//            while (rs.next())
//                salaries.add(new Salary(rs.getString(1), rs.getInt(2), rs.getDate(3),
//                        rs.getDate(4)));
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//
//
//        //Creating the department objects
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/employees", "root", "");
////here sonoo is database name, root is username and password
//
//            Statement stm = con.createStatement();
//
//            ResultSet rs = stm.executeQuery("SELECT * FROM departments");
//            while (rs.next())
//                departments.add(new Department(rs.getString(1), rs.getString(2)));
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }

//
//        for (int i = 0; i < departments.size(); i++) {
//            System.out.println(departments.get(i).getDeptTitle());
//        }
//
//
//        Application app = new Application(employees, salaries, departments, titles);


    }


//    public static void importDb(String code) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/employees", "root", "");
////here sonoo is database name, root is username and password
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(code);
//            while (rs.next())
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)
//                        + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getDate(6));
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }


//    }
}
