package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDataBase {
	Connection cnn=null;
    public Connection getConnectDB(){
        
            try{
         //   String uRL="jdbc:sqlserver://DESKTOP-EBV3QLN\\SQLEXPRESS:1433;databaseName=bai1";
            String uRL="jdbc:sqlserver://DESKTOP-EBV3QLN\\SQLEXPRESS:1433;databaseName=test";
           
            String user="sa";
            String pass="123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn = DriverManager.getConnection(uRL, user, pass);
            System.out.println("Thanh cong !");
            } catch( Exception e){
                System.out.println("That bai !");
            }
        
        return cnn;
    }
}
