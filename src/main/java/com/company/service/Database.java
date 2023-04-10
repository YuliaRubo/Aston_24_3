
package com.company.service;


import java.sql.*;

//public  class Database  {
//    public static void main(String[] args) {
//
//
////        private Connection connection;
////        private  Statement statement;
//
//        //public static void getDbConnection () {
//            try {
//                String dbHost = "Localhost";
//                String dbPort = "3306";
//                String dbUser = "root";
//                String dbPass = "root";
//                String dbName = "studentoncourse";
//                try{
//                    Class.forName("com.mysql.cj.jdbc.Driver");
//                    Connection con=DriverManager.getConnection(
//                            "jdbc:mysql://Localhost:3306/studentoncourse","root","root");
//
//                    Statement s = con.createStatement();
//                    ResultSet rs = s.executeQuery("Select id from student");
//                    while(rs.next())
//                        System.out.println(rs.getInt(1));
//                    s.close();
//
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        }
//      //
//        public static ResultSet getResultSet () throws SQLException {
//            return statement.getResultSet();
//        }
//
//        public Statement getStatement () {
//            return statement;
//        }
//
//        public static PreparedStatement getPreparedStatement (String value) throws SQLException {
//            return connection.prepareStatement(value);
//        }
   // }
//}
