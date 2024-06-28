package jdbc;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:sqlite:/Users/lohithkumarneerukonda/Documents/employee";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM Employee e ;";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String empName = resultSet.getString("emp_name");
                int empId = resultSet.getInt("emp_id");
                System.out.println("Employee ID: " + empId + ", Employee Name: " + empName);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
