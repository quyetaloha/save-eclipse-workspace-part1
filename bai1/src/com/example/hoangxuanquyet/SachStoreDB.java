package com.example.hoangxuanquyet;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * This class used : open/close Connect to DB and create Query
 * @author kobe
 */
public class SachStoreDB {
 
Connection connect = null;
 Statement stmt = null;
 ResultSet rs = null;
 
/**
 * Check Driver connect to MySQL
 */
 protected void hasDriver() throws Exception{
	 try {
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	 } catch (ClassNotFoundException ex) {
	 throw new Exception ("Invalid Driver!!Please check this drver....");
 }
 }
 
/**
 * Function used to get the connection to the Database
 * Step 1 - I check my connection or not!!
 * Step 2 - If not, it will be null and initialization.
 * Step 3 - Then it return
 * @return Connection
 */
 protected Connection openConnect() throws Exception{
	 if(connect == null){
		 hasDriver();
		 String url = "jdbc:sqlserver://DESKTOP-EBV3QLN\\\\SQLEXPRESS:1433;databaseName=SachStore";
		 try {
		 this.connect = DriverManager.getConnection(url,"sa","123");
		 } catch (SQLException e) {
		 throw new Exception(e.getMessage() + "Connect failed to database .... ");
		 }
	 }
	 return connect;
 }
 /**
 * Make a Statement to execute the SQL statement
 * @return Statement
 */
 protected Statement getStatement() throws SQLException, Exception{
	 if(stmt == null){
	 stmt = openConnect().createStatement();
	 }
	 return stmt;
 }
 /**
 * Used to execute the Select statement
 * @param strSQL Query VD: Select * from Employee
 * @return ResultSet
 */
 public ArrayList<String> getAllTaiKhoan() throws Exception{
	 ArrayList<String> lst = new ArrayList<String>();
	 String strSQL = "select * from TaiKhoan";
	 try {
	 rs = getStatement().executeQuery(strSQL);
	 while(rs.next()){
	 String acc = rs.getString("username");acc=acc.trim();
	 String pass = rs.getString("password");pass=pass.trim();
	 
	 lst.add(acc+pass);
	 }
	 } catch (Exception e) {
	 throw new Exception(e.getMessage() +" Error at : " + strSQL);
	 }
	 closeConnet();
 return lst;
 }
 public ArrayList<Sach> getAllSach() throws Exception{
	 ArrayList<Sach> lst = new ArrayList<Sach>();
	 String strSQL = "select * from Sach";
	 try {
	 rs = getStatement().executeQuery(strSQL);
	 while(rs.next()){
	 String masach = rs.getString("masach");
	 String tensach = rs.getString("tensach");
	 String theloai = rs.getString("theloai");
	 String nhaxuatban = rs.getString("nhaxuatban");
	 int gia = Integer.parseInt(rs.getString("gia"));
	 Sach sp = new Sach(masach, tensach, theloai, nhaxuatban, gia);
	 lst.add(sp);
	 }
	 } catch (Exception e) {
	 throw new Exception(e.getMessage() +" Error at : " + strSQL);
	 }
	 closeConnet();
	 return lst;
 }
 //them tai khaon
 public boolean insertTaiKhoan(String username,String password) throws Exception{
 String sql = "insert into TaiKhoan values(?,?,?,?)";
 PreparedStatement pst = openConnect().prepareStatement(sql);
 pst.setString(1, username);
 pst.setString(2, password);
 pst.setString(3, "aa");
 pst.setString(4, "aaa");
 return pst.executeUpdate()>0;
 
 }
 
 public boolean insertSach(Sach sp) throws Exception{
 String sql = "insert into Sach values(?,?,?,?,?)";
 PreparedStatement pst = openConnect().prepareStatement(sql);
 pst.setString(1, sp.getMaSach());
 pst.setString(2, sp.getTenSach());
 pst.setString(3, sp.getTheLoai());
 pst.setString(4, sp.getNhaXuatBan());
 pst.setDouble(5, sp.getGia());
 return pst.executeUpdate() > 0;
 
 }
 
 public boolean deleteProduct(String masp) throws Exception{
 String sql = "delete from SanPham where masp=?";
 PreparedStatement pst = openConnect().prepareStatement(sql);
 pst.setString(1, masp);
 return pst.executeUpdate() > 0;
 }
 
 /**
 * Used to execute the Insert, Update, Delete statement
 * @param strSQL Query VD: Insert into TableName values ('??','??')
 * @return The number of lines affected by the command
 */
 public int executeUpdate(String strSQL) throws Exception{
 int result = 0;
	 try {
	 result = getStatement().executeUpdate(strSQL);
	 } catch (Exception ex) {
	 throw new Exception(ex.getMessage() + " Error at: " + strSQL);
	 }finally{
	 this.closeConnet();
	 }
 return result;
 }
 
// public SanPham getProductByID(String masp)throws Exception{
// String sql = "select * from SanPham where masp=?";
// PreparedStatement pst = openConnect().prepareStatement(sql);
// pst.setString(1, masp);
// ResultSet rs = pst.executeQuery();
// SanPham sp = null;
// if(rs.next()){
// String ms = rs.getString("masp");
// String ten = rs.getString("tensp");
// String ncc = rs.getString("nhacc");
// double gia = Double.parseDouble(rs.getString("giadv"));
// sp = new SanPham(ms, ten, ncc, gia);
// }
// return sp;
// }
 
// public boolean UpdateSach(String masp,SanPham newsp) throws Exception{
// String sql = "update SanPham set tensp=?, nhacc=?, giadv=? where masp=?";
// PreparedStatement pst = openConnect().prepareStatement(sql);
// pst.setString(1, newsp.getTensp());
// pst.setString(2, newsp.getNhacc());
// pst.setDouble(3, newsp.getGiadv());
// pst.setString(4, newsp.getMasp());
// return pst.executeUpdate()>0;
// }
 /**
 * A method to close the connection.
 * @throws SQLException
 */
 public void closeConnet() throws SQLException{
	 if(rs != null && !rs.isClosed())
	 rs.close();
	 if(stmt != null)
	 stmt.close();
	 if(connect != null)
	 connect.close();
 }
 
 public static void main(String[] args) throws Exception {
	// new ConnectDB().UpdateProduct("sp01", new SanPham("sp01", "AAAA", "BBBB", 1000));
	 //System.out.println(new ConnectDB().getProductByID("sp01").getTensp());
 
 }
 
}
