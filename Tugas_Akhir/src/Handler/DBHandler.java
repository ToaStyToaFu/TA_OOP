package Handler;

import java.sql.*;
import java.util.Scanner;

import Reservations.Reservation;

public class DBHandler {
	private Connection conn;
	private Statement st;
	Scanner sc = new Scanner(System.in);
	
	public DBHandler() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AolOOP","root","");
			st = conn.createStatement();
		}catch (SQLException e) {
			System.out.println("error");
		}
	}
	
	public String searchEmployeeLocation(String ID) {
		String query = "SELECT EmployeeLokasi FROM MsEmployee WHERE EmployeeID LIKE '"+ ID + "';";
		try {
			ResultSet rs = st.executeQuery(query);
			return rs.getString("EmployeeLokasi");
		}catch (SQLException e) {
			System.out.println(e);
		}
		return null;
	}
	
	public void addReservation(Reservation reserve) {
		String query = "INSERT INTO MsReserve VALUES (?, ?, ?, ?, ?, ?, ?);";
		try (PreparedStatement pst = conn.prepareStatement(query)){
			pst.setString(1, reserve.getName());
			pst.setString(2, reserve.getTableAmmount().toString());
			pst.setString(3, reserve.getTableType());
			pst.setString(4, reserve.getPeopleAmmount().toString());
			pst.setString(5, reserve.getTableStatus());
			pst.setString(6, reserve.getLocation());
			pst.setString(7, "id");
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public void addMenu() {
		
	}
}
