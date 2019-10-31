package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		ConnectDataBase kn=new ConnectDataBase();
        Connection con = kn.getConnectDB();
       
        try {
            ArrayList<String> dsCombo = new ArrayList<>();
            PreparedStatement ps = null;
            String sql="SELECT * FROM login";
            String sql2="INSERT INTO login(id,name,pass) VALUES('1234','quyetdaik','98')";
           
            
            PreparedStatement ps2 = null;
            ps2=con.prepareStatement(sql2);
            Statement a=con.createStatement();
            a.execute(sql2);
            ps=con.prepareStatement(sql);
            // gan ket qua tra ve
            ResultSet rs = ps.executeQuery();
            //gan vao mang
            
            while(rs.next()){
                String id=rs.getString("id");//id.trim();
                String name =rs.getString("name");//name.trim();
                String pass =rs.getString("pass");//pass.trim();
                String d=id+name+pass;
                dsCombo.add(d);
                
            }
            System.out.println("get data combo success "+dsCombo.size());
            for(String s:dsCombo){
                System.out.println(s);
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            System.out.println("error!");
        }
      
        
    }
 }
