package ro.jademy.hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Interface {

    public void menu() {
        System.out.println("Choose an option");
        System.out.println("See employees starting with a specific letter");
    }

    public static void employeesStartingWith(String s) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees", "root", "");
//here sonoo is database name, root is username and password


            PreparedStatement stm = con.prepareStatement("SELECT * FROM employees WHERE last_name LIKE ?");
            stm.setString(1, s + "%");

            ResultSet rs = stm.executeQuery();
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)
                        + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getDate(6));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
