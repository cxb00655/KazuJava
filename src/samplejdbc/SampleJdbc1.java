package samplejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleJdbc1 {

	public static void main(String[] args) {
		
		String url = "jdbc:derby://localhost:1527/work/SampleDB";
		String sql = "select * from item where id = ?";
		var sqlIns = "insert into item values(?,?)";
		var sqlDel = "delete from item where id = ?";
		 List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3,4));
		try (Connection con = DriverManager.getConnection(url)){
			PreparedStatement ps =  con.prepareStatement(sql);
			for(Integer i : numbers) {
				ps.setInt(1, i);
				try(ResultSet rs = ps.executeQuery()){
					while(rs.next()) {
						System.out.println("name : " + rs.getString("name"));
					}
				}
				
			}
			
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		try (Connection con = DriverManager.getConnection(url)){
			PreparedStatement ps =  con.prepareStatement(sqlIns);
			ps.setInt(1, 5);
			ps.setString(2, "これはテストです");
			ps.executeUpdate();
			System.out.println("insertしました。");
			
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		
		try (Connection con = DriverManager.getConnection(url)){
			PreparedStatement ps =  con.prepareStatement(sqlDel);
			ps.setInt(1, 5);
			ps.executeUpdate();
			System.out.println("deleteしました。");
			
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}
