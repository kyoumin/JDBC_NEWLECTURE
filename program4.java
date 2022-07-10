package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program4 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{

//	String title ="TEST3";
//	//String writerId ="newlec";
//	String content = "test content3 ";
//	String files="";
	int id = 257;
	
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String sql = "DELETE NOTICE WHERE ID=?"; 
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection(url,"NEWLEC","dbals6439!");
	//Statement st = con.createStatement();
	PreparedStatement st = con.prepareStatement(sql);
	st.setInt(1,id);
//	st.setString(2, content);
//	st.setString(3, files);
//	st.setInt(4, id);
	int result = st.executeUpdate();
	System.out.println(result);
	//ResultSet rs = st.executeQuery(sql);
	
	
	
//	while(rs.next()) {
//	int id = rs.getInt("ID");
//	String title = rs.getString("TITLE");
//	//System.out.println(title);
//	String WriterId = rs.getString("WRITER_ID");
//	Date regDate = rs.getDate("REGDATE");
//	String content = rs.getString("CONTENT");
//	int hit = rs.getInt("hit");
//	
//	System.out.printf("id:%d, title:%s, writerid:%s, regDate:%s, content:%s, hit:%d\n",id,title,WriterId,regDate,content,hit);
//	}
	//rs.close();
	st.close();
	con.close();
	}
}


