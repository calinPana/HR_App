package ro.jademy.hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Sqlimp {
    public static void main(String args[]) {
//        importDb("select * from employees");
        Interface.employeesStartingWith("A");
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
