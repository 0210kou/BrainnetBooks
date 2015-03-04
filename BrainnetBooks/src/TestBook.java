import org.junit.Test;


public class TestBook {

//	Bookインスタンスを生成
//	Book book = new Book();
//	DAOインスタンスを生成
	BookDAO dao = new BookDAO();

	BookDAOTest test = new BookDAOTest();

//	fail("まだ実装されていません");

//	(expected=IllegalArgumentException.class)
	@Test public void test() {


	}
	@Test public void test1(){



	}
	@Test public void BookDAOTestテスト(){
//		Book book = test.findBook();
//		Book book =  test.findBook("Head First Java","Kathy Serra");
		StringBuilder sb = new StringBuilder();

//		Book book = new Book("Head First Java","Kathy Serra");
		Book book = new Book();

//		部分一致
		Book book3 = test.findBook( "%st%","%rra%");

		sb.append(book3.getBook_name()+ "\n");
		sb.append(book3.getModify_datetime()+ "\n");
		sb.append(book3.getIsbn()+ "\n");
		sb.append(book3.getCategory_id()+ "\n");
		sb.append("\n");



//		insert
		Book book4 = test.additionBook("3", "java入門", "中山", "インプレス",
				2800, "2014-08-11", 5);
		sb.append(book4.getIsbn()+ "\n");
		sb.append(book4.getBook_name()+ "\n");
		sb.append(book4.getAuthor_name()+ "\n");
		sb.append(book4.getPublisher_name()+ "\n");
		sb.append(book4.getPrice()+ "\n");
		sb.append(book4.getRelease_date()+ "\n");
		sb.append(book.getCategory_id()+ "\n");
		sb.append(book.getModify_datetime()+ "\n");
		sb.append(book.getCreate_datetime()+ "\n");


		System.out.println(sb.toString());

    }

}

