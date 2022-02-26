package com.company.login.database;

import com.company.login.bean.LoginBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");


        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees",
                "root", "12345")) {
            LoginBean login =null;
            PreparedStatement stmt = connection.prepareStatement("select * from login where username=? and password=?");
            stmt.setString(1,"Elvin");
            stmt.setString(2, "12345");
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            while(rs.next()){
                login.setUsername(rs.getString("username"));
                login.setPassword(rs.getString("password"));
            }
            System.out.println(login.getUsername()+", parol is "+login.getPassword());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public boolean validate(LoginBean login) throws Exception{

            Class.forName("com.mysql.jdbc.Driver");


        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees",
                "root", "12345")) {
            PreparedStatement stmt = connection.prepareStatement("select * from login where username=? and password=?");
            stmt.setString(1, login.getUsername());
            stmt.setString(2, login.getPassword());
            System.out.println(stmt);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }
}
