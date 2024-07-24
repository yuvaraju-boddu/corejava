package jdbc;

import java.sql.*;

public class Display {

	public static void main(String[] args) throws Exception {

		try {
			String sql = "select name from jdbc where id=1";
			String url = "jdbc:mysql://localhost/corejava";
			String username = "root";
			String password = "Yuvaraju@1307";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			rs.next();
			String name = rs.getString(1);
			System.out.println(name);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
