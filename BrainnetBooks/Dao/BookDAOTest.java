import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author 白川
 * Bookテーブルに接続し、処理を担当するDAO
 *
 */
public class BookDAOTest {
	public Book findBook(String a, String b) {
		Connection conn = null;
		Book book = null;
		try{
			//JDBCドライバを読み込む
			Class.forName("com.mysql.jdbc.Driver");

			//データベースに接続
			conn = DriverManager.getConnection
					("jdbc:mysql://192.168.137.0:3306/bn_books","bn_user","");

			//Select文を準備
			String sql = "select * from book "
					+ "where book_name like ? and"
					+ " author_name like ? ";
//					+ "where publisher_name = ? ";isbn,book_name, author_name,publisher_name,price,release_date,"
//				category_id,modify_datetime,create_datetime

			//準備したSQL文をPreparedStatementインスタンスに渡す
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1,a);
			pStmt.setString(2, b);
//			pStmt.setString(3, "O'REILLY");


			//select文を実行し、ResultSetインスタンスにSelect文の実行結果を取得
			ResultSet rs = pStmt.executeQuery();

			//そのBookを表すBookインスタンスを生成
			while(rs.next()){
				String isbn			= rs.getString("isbn");
				String book_name = rs.getString("book_name");
				String author_name = rs.getString("author_name");
				String publisher_name = rs.getString("publisher_name");
				short    price			= rs.getShort("price");
				String  release_date = rs.getString("release_date");
				short category_id = rs.getShort("category_id");
				Date  modify_datetime = rs.getDate("modify_datetime");
				Date 	create_datetime = rs.getDate("create_datetime");

				 book = new Book(isbn,book_name,author_name,publisher_name,
						 price, release_date,
						category_id, modify_datetime,create_datetime ); //

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
/**
 * 	insert
 *
 */
	public Book additionBook(String a, String b,
			String c, String d, int e, String f,int g){
		Connection conn = null;
		Book book = null;
		try{
			//JDBCドライバを読み込む
			Class.forName("com.mysql.jdbc.Driver");

			//データベースに接続
			conn = DriverManager.getConnection
					("jdbc:mysql://192.168.137.0:3306/bn_books","bn_user","");

			//Select文を準備
			String insert = "insert into book(isbn,book_name,author_name,"
					+ "publisher_name,price,release_date,category_id) "
					+ " values(?, ?, ?, ?, ?, ?, ?)";

			//準備したSQL文をPreparedStatementインスタンスに渡す
			PreparedStatement pStmt = conn.prepareStatement(insert);
			pStmt.setString(1, a);
			pStmt.setString(2, b);
			pStmt.setString(3, c);
			pStmt.setString(4, d);
			pStmt.setInt(5, e);
			pStmt.setString(6, f);
			pStmt.setInt(7, g);

			//insert文を実行
			pStmt.executeUpdate(insert);
			/*
			ResultSet rs = pStmt.executeQuery("SELECT * FROM book");

			//そのBookを表すBookインスタンスを生成
			while(rs.next()){
				String isbn			= rs.getString("isbn");
				String book_name = rs.getString("book_name");
				String author_name = rs.getString("author_name");
				String publisher_name = rs.getString("publisher_name");
				short    price			= rs.getShort("price");
				String  release_date = rs.getString("release_date");
				short category_id = rs.getShort("category_id");
				Date  modify_datetime = rs.getDate("modify_datetime");
				Date 	create_datetime = rs.getDate("create_datetime");

				book = new Book(isbn,book_name,author_name,publisher_name,
						 price, release_date,
						category_id, modify_datetime,create_datetime );

			}*/




		}catch(SQLException ee){
			ee.printStackTrace();
			return null;
		}catch(ClassNotFoundException ee){
			ee.printStackTrace();
			return null;
		}finally{
			//データベース切断
			if(conn != null){
				try{
					conn.close();

				}catch(SQLException ee){
					ee.printStackTrace();
					return null;

				}
			}
		}
		//検索結果をまたはnullを返す
				return book;
	}
}
