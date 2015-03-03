import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 白川
 * Bookテーブルに接続し、処理を担当するDAO
 *
 */
public class BookDAO {
	public Book findBook() {
		Connection conn = null;
		//Book book = null;
		try{
			//JDBCドライバを読み込む
			Class.forName("com.mysql.jdbc.Driver");

			//データベースに接続
			conn = DriverManager.getConnection
					("jdbc:mysql://192.168.137.0:3306/bn_books","bn_user","");

			//Select文を準備
			String sql = "select * from book ";
				//	+ "where book_name = ? or"
				//	+ "where author_name = ?  or"
				//	+ "where publisher_name = ? ";

			//準備したSQL文をPreparedStatementインスタンスに渡す
			PreparedStatement pStmt = conn.prepareStatement(sql);
			//pStmt.setString(2, book.getBook_name());
			//pStmt.setString(3, book.getAuthor_name());
			//pStmt.setString(4, book.getPublisher_name());


			//select文を実行し、ResultSetインスタンスにSelect文の実行結果を取得
			ResultSet rs = pStmt.executeQuery();

			//そのBookを表すBookインスタンスを生成
			if(rs.next()){
				String isbn			= rs.getString("isbn");
				String book_name = rs.getString("book_name");
				String author_name = rs.getString("author_name");
				String publisher_name = rs.getString("publisher_name");
				int    price			= rs.getInt("price");
				String  release_date = rs.getString("release_date");
				int category_id = rs.getInt("category_id");
				String  modify_datetime = rs.getString("modify_datetime");
				String 	create_datetime = rs.getString("create_datetime");

				 Book book = new Book(isbn,book_name,author_name,
				 publisher_name, price, release_date,
						 category_id, modify_datetime, create_datetime);

			}




		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}finally{
			//データベース切断
			if(conn != null){
				try{
					conn.close();
				}catch(SQLException e){
					e.printStackTrace();
					return null;

				}
			}
		}
		//検索結果をまたはnullを返す
		return book;
	}
}
