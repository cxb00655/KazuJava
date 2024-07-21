package samplejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleJdbc2 {

	public static void main(String[] args) {
		
		String url = "jdbc:derby://localhost:1527/work/SampleDB";
		String sql = "select * from item";
		try (Connection con = DriverManager.getConnection(url)){
			PreparedStatement ps =  con.prepareStatement(sql);
			try(ResultSet rs = ps.executeQuery()){
				while(rs.next()) {
					System.out.println("列名：" + rs.getInt("id") +"/"+ rs.getString("name"));
					System.out.println("列番号：" + rs.getInt(1) +"/"+ rs.getString(2));
				}
			}
			
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}
