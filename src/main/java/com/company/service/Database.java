//
//package com.company.service;
//
//
//import java.sql.*;
//
//public  class Database  {
//
//    private  static Connection connection;
//    private static Statement statement;
//
//    public static void getDbConnection(){
//       try {
//            String dbHost = "Localhost";
//            String dbPort = "3306";
//            String dbUser = "root";
//            String dbPass = "root";
//            String dbName = "studentoncourse";
//
//           String connectionString = "jdbc:mysql//" + dbHost + ":"
//                   + dbPort + "/" + dbName;
//           try {
//               Class.forName("com.mysql.jdbc.Driver");
//           } catch (ClassNotFoundException e) {
//               e.printStackTrace();
//           }
//           try {
//               connection = DriverManager.getConnection(connectionString, dbUser, dbPass);
//           } catch (SQLException e) {
//               e.printStackTrace();
//           }
//       } catch (Exception e) {
//           e.printStackTrace();
//       }
//
//    }
//    public static void disconnect() {
//        try {
//            statement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        try {
//            connection.close();
//            System.out.println("Disconnected");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public  static ResultSet getResultSet() throws SQLException {
//        return statement.getResultSet();
//    }
//
//    public Statement getStatement() {
//        return statement;
//    }
//
//    public static PreparedStatement getPreparedStatement(String value) throws SQLException {
//        return connection.prepareStatement(value);
//    }
//
//}
