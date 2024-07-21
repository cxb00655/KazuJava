package samplejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class SampleJdbcexecuteBatch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		var url = "jdbc:derby://localhost:1527/work/SampleDB";
		var sqlDel = "delete from item where id = ?";
		String[] names = {"apple","banana","orange"};
		var sql = "insert into item values(?,?)";

		try (Connection con = DriverManager.getConnection(url)){
			try (PreparedStatement ps = con.prepareStatement(sqlDel)) {
				int i = 10;
				for (String name : names) {
					ps.setInt(1,i);
					ps.addBatch();
					i++;
				}
				
				int[] results = ps.executeBatch();
				System.out.println("削除しました。");
				System.out.println(Arrays.toString(results));
				
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}	 catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		
		try (Connection con = DriverManager.getConnection(url)){
			try (PreparedStatement ps = con.prepareStatement(sql)) {
				int i = 10;
				for (String name : names) {
					ps.setInt(1,i);
					ps.setString(2, name);
					ps.addBatch();
					i++;
				}
				
				int[] results = ps.executeBatch();
				System.out.println("挿入しました。");
				System.out.println(Arrays.toString(results));
				
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}	 catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		
		
	}

}
