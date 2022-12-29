package com.bridgelab.mysql;


import java.sql.*;


public class MysqlConnection {

	public static void main(String[] args) {
       Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
          connection =   DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ESNews",
                "root", "root");
 
            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
 
            java.sql.Statement statement;
            statement = connection.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select * from hostelStudentInfo");
           while(resultSet.next()) {
        	   System.out.println(resultSet.getInt(1)+ " " +resultSet.getString(2)+ " " +resultSet.getDouble(3) + " "  +resultSet.getString(4).charAt(0));
           }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }


	}

}
