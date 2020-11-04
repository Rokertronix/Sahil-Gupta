package conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {

	public static Connection getConn() throws Exception
	{

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo","root","password123");
		return conn;
	}
}

/*create database jdbcdemo;


create table customer(
loginId varchar(15),
passwd varchar(15),
customerName varchar(30),
emailId varchar(15),
mobile varchar(10),
address varchar(100),
country varchar(30)
)
*/