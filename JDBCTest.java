

/*
    1) load the driver:
        Class.forName("driver_name");

    2) create a connection
        Conccection con=DriverManager.getConnection(url,username,password); // url="jdbc:mysql://localhost:3306/database_name"

    3) create a query, statement, preparedstatement, callablestatement

    4) process the data

    5) close the connection: con.close();
*/


import java.sql.*;

class JDBCTest {
    public static void main(String arg[]) 
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            // create a connection
            String url="jdbc:mysql://localhost:3306/jdbctesting";
            String user="root";
            String password="root123";

            Connection con=DriverManager.getConnection(url,user,password);

            if(con.isClosed()){
                System.out.println("connection is closed...");
            } else {
                System.out.println("connection is created....");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}