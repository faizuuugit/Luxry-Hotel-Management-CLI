//package serviceImplementation;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.Date;
//
//public class DbService  {
//	private static Connection conn;
//	private static Statement stmt;
//	
//	
//	static{
//		try {
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/luxry_hotel", "root", "root");
//			 stmt = conn.createStatement();
////		stmt.executeUpdate(createCustomer);
////		stmt.executeUpdate(createRooms);
////		stmt.executeUpdate(createReservations);
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public static void createUser(String firstName, String lastName, String email) throws SQLException  {
//		String query = "insert into customers(email,first_name, last_name) values(? , ?, ?)";
//		PreparedStatement pstmt = conn.prepareStatement(query);
//		pstmt.setString(1, email);
//		pstmt.setString(2, firstName);
//		pstmt.setString(3,lastName);
//		pstmt.executeUpdate(); 
//        pstmt.close();
//		
//	}
//
//	public static void addRooms(int i, double d) throws SQLException {
//		String query ="insert into rooms(room_number,price) values(?,?)";
//		PreparedStatement pstmt = conn.prepareStatement(query);
//		pstmt.setInt(1, i);
//		pstmt.setDouble(2, d);
//		pstmt.executeUpdate();
//		pstmt.close();
//	}
//	
//	
//public static ArrayList findRooms() throws SQLException{
//	
//	ArrayList op = new ArrayList();
//	String query = "select * from rooms";
//	Statement st = conn.createStatement();
//	ResultSet rs = st.executeQuery(query);
//	
//	int n_c = rs.getMetaData().getColumnCount();
//	
//	while(rs.next()){
//		
//		ArrayList ar = new ArrayList();
//		
//		for(int i=1;i<=n_c;i++){
//			
//			ar.add(rs.getString(i));
//			
//		}
//		op.add(ar);
//	}
//	
//	System.out.println(op);
//	return op;
//	
//}
//	
//	
//}
