package com.example;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String email = req.getParameter("email");

        String dbURL = "jdbc:mysql://localhost:3306/first_db";
        String dbUser = "root";
        String dbPass = "30Sayed@03";

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);

            if (conn != null) {
                System.out.println("✅ Connected to database");
            } else {
                System.out.println("❌ Failed to connect");
                out.println("<h2>Database connection failed.</h2>");
                return;
            }

            String sql = "INSERT INTO users (username, email) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, email);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                out.println("<h2> Data Inserted Successfully!</h2>");
            } else {
                out.println("<h2> No rows were inserted.</h2>");
            }

            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<h2>❌ SQL Error: " + e.getMessage() + "</h2>");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            out.println("<h2>❌ JDBC Driver not found.</h2>");
        }
    }
}


