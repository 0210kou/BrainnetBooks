import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author 白川
 * bookに接続し、処理を担当するDAO
 *
 */
public class BookDAO {

	public List<Book> findBook(){
		Connection conn = null;
		List<Book> bookList = new ArrayList<Book>();



	try{

//		JDBCドライバを読み込む
		Class.forName("com.mysql.jdbc.Driver");

//		データベースへ接続
		conn = DriverManager.getConnection
				("jdbc:mysql://192.168.137.0:3306/bn_books","bn_user","");

//		select文の準備
		String sql = "select isbn, book_name from book";

		//準備したSQL文をPreparedStatementインスタンスに渡す
		PreparedStatement pStmt = conn.prepareStatement(sql);

		//select文を実行し、ResultSetインスタンスにSelect文の実行結果を取得
		ResultSet rs = pStmt.executeQuery();

//		rsに格納されたレコードの内容をBookインスタンスに設定し、ArrayList
	//	インスタンスに追加

		while(rs.next()){
			String isbn			= rs.getString("isbn");
			String book_name = rs.getString("book_name");
//			String author_name = rs.getString("author_name");
//			String publisher_name = rs.getString("publisher_name");
//			int    price			= rs.getInt("price");
//			String  release_date = rs.getString("release_date");
//			int category_id = rs.getInt("category_id");
//			String  modify_datetime = rs.getString("modify_datetime");
//			String 	create_datetime = rs.getString("create_datetime");

//			インスタンスの生成
			Book book = new Book(isbn,book_name);

			bookList.add(book);
		}


	}catch(SQLException e){
		e.printStackTrace();
	}catch(ClassNotFoundException e){
		e.printStackTrace();
		return null;
	}finally{
		if(conn != null){
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
				return null;
			}
		}

	}
	return bookList;

}
}