

public class BookDAOTest {
	public static void main(String[]args) {
		testFindBook();
		testFindBook1();
	}
	public static void testFindBook() {
		//Book book = new Book("1","Head First Java",
			//	"Kathy Serra", "O'REILLY", 4000, null, 0,
				//"2015-02-27 20:59:14", null);
		Book book = new Book();
		//DAOインスタンスを生成
		BookDAO dao = new BookDAO();

		Book result = dao.findBook(book);
		if(result != null &&
				result.getBook_name().equals("Head First Java") ||
				result.getAuthor_name().equals("Kathy Serra") ||
				result.getPublisher_name().equals("O'REILLY")
				){
			System.out.println("testFindBook:成功しました");
		}else{
			System.out.println("testFindBook:失敗しました");
		}


	}
	public static void testFindBook1(){
		Book book = new Book("1","Head First Java",
				"Kathy Serra", "O'REILLY", 4000, null, 0,
				"2015-02-27 20:59:14", null);
		BookDAO dao = new BookDAO();
		Book result = dao.findBook(book);
		if(result == null){
			System.out.println("testFindBook:成功しました");
		}else{
			System.out.println("testFindBook:失敗しました");
		}
	}
}
