package com.spring.security.test;

import java.sql.*;
import java.util.Objects;

public class JdbcTest {

    private static final String SQL_QUERY = "SELECT * FROM BOOK";

    public static void main(String[] args) throws SQLException {
        Connection con = null;

        try {
            Class.forName("org.h2.Driver");

            //con = DriverManager.getConnection("http://192.168.43.11:8082");
            System.out.println("About to create database connection");
            con = DriverManager.
                    getConnection("jdbc:h2:tcp://localhost/./esha;IFEXISTS=TRUE", "sa", "sa");
            System.out.println("database connection created successfully.");
            Statement stmt = con.createStatement();
            System.out.println("About to execute sql query:  " + SQL_QUERY);
            ResultSet rs = stmt.executeQuery(SQL_QUERY);
            System.out.println("Query executed successfully, Book details are: ");
            System.out.println(" id |  Name | Author | Price");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getInt(4));
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(con)) {
                con.close();
            }
        }
    }
}
