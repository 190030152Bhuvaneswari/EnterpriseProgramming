package Task1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Task1.Bean;
import Task1.DBUtil;
public class Insertion {
	public 	int customerInsertion(Bean student ) throws ClassNotFoundException,SQLException{
	     Connection con =DBUtil.DBConnection();
	     PreparedStatement ps = con.prepareStatement("insert into customer values (?,?,?)");
	     ps.setInt(1,student.getItemid());
		 ps.setString(2, student.getItemname() );
		 ps.setInt(3, student.getCost());
			int i=ps.executeUpdate();
			return i;
}
	public void customerDisplay(Bean student) throws ClassNotFoundException , SQLException {
		Connection con =DBUtil.DBConnection();
		PreparedStatement ps = con.prepareStatement("select * from customer");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " "+rs.getString(2)+" "+rs.getInt(3));
		}
		rs.close();
	}
  
}
