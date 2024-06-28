package jdbc;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        try {
            //1. Load the Driver
//            Class.forName("");
//            System.out.println("Driver Loaded!");

            //2. Establish Connection.
            String url = "jdbc:mysql://localhost:3306/EmployeeDB";
            String username = "root";
            String password = "admin";

            Connection connection = DriverManager.getConnection(url,username,password);

            //3. Create Statement
            Statement statement = connection.createStatement();

            String sql = "select * from employees;";
            //4. Executing Query
            ResultSet resultSet = statement.executeQuery(sql);

            //5. Maintaining result Set
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
                String position = resultSet.getString("position");
                Double salary = resultSet.getDouble("salary");
                System.out.println("Id: " + id + "| name: " + name + "| department: " + department +
                        "| position: " + position + "| salary: " + salary);
            }

            //6. Closing all resources.
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
