package dao;

import java.sql.*;

import conn.DBcon;
import model.User;

public class UserDao 
{
	Connection conn;
	public UserDao() throws Exception
	{
		conn=DBcon.getConn();
	}

	public boolean insertCustomer(User userObj)throws Exception
	{
		PreparedStatement psmt=conn.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
		
		psmt.setString(1, userObj.getloginId());
		psmt.setString(2, userObj.getPassword());
		psmt.setString(3, userObj.getCustomerName());
		psmt.setString(4, userObj.getEmailId());
		psmt.setString(5, userObj.getMobile());
		psmt.setString(6, userObj.getAddress());
		psmt.setString(7, userObj.getCountry());
		
		int row_eff=psmt.executeUpdate();
		
		if(row_eff>0)
			return true;
		else
			return false;
			
		
		
	}
	
}
