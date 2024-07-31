package jdbc;

import java.sql.*;

public class JdbcDemo {

	private static final String URL = "jdbc:mysql://localhost/corejava";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Yuvaraju@1307";

	public static void main(String[] args) {
		JdbcDemo demo = new JdbcDemo();

		demo.insert(2, "yuvi", 50000);
		demo.insert(5, "yuvi", 6000);
		demo.insert(6, "yuvi", 40000);
		demo.update(2, "Jane Doe", 55000);
		demo.select(10);
		demo.delete(2);

	}

	public void insert(int id, String name, int sal) {
		String sql = "INSERT INTO jdbc (id, name, sal) VALUES (" + id + ", '" + name + "', " + sal + ")";
		executeUpdate(sql, "Insert");
	}

	public void update(int id, String newName, int newSal) {
		String sql = "UPDATE jdbc SET name = '" + newName + "', sal = " + newSal + " WHERE id = " + id;
		executeUpdate(sql, "Update");
	}

	public void delete(int id) {
		String sql = "DELETE FROM jdbc WHERE id = " + id;
		executeUpdate(sql, "Delete");
	}

	public void select(int id) {
		String sql = "SELECT name, sal FROM jdbc WHERE id = " + id;
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement smt = con.createStatement();
				ResultSet rs = smt.executeQuery(sql)) {

			if (rs.next()) {
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				System.out.println("Name: " + name + ", Salary: " + sal);
			} else {
				System.out.println("No record found for id: " + id);
			}
		} catch (Exception e) {
			System.err.println("Error during select: " + e.getMessage());
		}
	}

	private void executeUpdate(String sql, String operation) {
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement smt = con.createStatement()) {

			int resultset = smt.executeUpdate(sql);
			System.out.println(operation + " operation completed. Rows : " + resultset);

		} catch (Exception e) {
			System.err.println("Error during " + operation + ": " + e.getMessage());
		}
	}
}
