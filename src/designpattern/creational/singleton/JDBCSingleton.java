package designpattern.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton {

	// static member
	private static JDBCSingleton jdbcSingleton;

	// private constructor
	private JDBCSingleton() {

	}

	// static factory method to provide global point of access
	public static JDBCSingleton getInstance() {
		if (jdbcSingleton == null) {
			jdbcSingleton = new JDBCSingleton();
		}
		return jdbcSingleton;
	}

	// get the db connection
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "123456");
		return con;
	}

	// insert data
	public int insertData(String name, String address, String email, String telephone) throws SQLException {
		Connection connection = null;

		PreparedStatement ps = null;

		int recordCounter = 0;

		try {

			connection = this.getConnection();
			ps = connection.prepareStatement("insert into customer(name,address, email, telephone) values (?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setString(3, email);
			ps.setString(4, telephone);
			recordCounter = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
		return recordCounter;
	}

	// view data
	public void viewData(String name) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			con = this.getConnection();
			ps = con.prepareStatement("select * from customer where name=?");
			ps.setString(1, name);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Name= " + rs.getString(3) + "\t" + "address= " + rs.getString(1));

			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}

	// update data
	public int updateData(String name, String address, String email, String telephone) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;

		int recordCounter = 0;
		try {
			c = this.getConnection();
			ps = c.prepareStatement(" update customer set name=?, address=?, email=?, telephone=? where name='" + name + "' ");
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setString(3, email);
			ps.setString(4, telephone);
			recordCounter = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (ps != null) {
				ps.close();
			}
			if (c != null) {
				c.close();
			}
		}
		return recordCounter;
	}
	
	// to delete data 
    public int deleteData(int userid) throws SQLException{  
         Connection c=null;  
         PreparedStatement ps=null;  
         int recordCounter=0;  
         try {  
                  c=this.getConnection();  
                 ps=c.prepareStatement(" delete from customer where uid='"+userid+"' ");  
                 recordCounter=ps.executeUpdate();  
         } catch (Exception e) { e.printStackTrace(); }   
         finally{  
         if (ps!=null){  
                 ps.close();  
        }if(c!=null){  
                 c.close();  
         }   
      }  
        return recordCounter;  
     }  

}
