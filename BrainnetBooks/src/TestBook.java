import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class TestBook {

//	Bookインスタンスを生成
	Book book = new Book();
//	DAOインスタンスを生成
	BookDAO dao = new BookDAO();

	BookDAOTest test = new BookDAOTest();

//	fail("まだ実装されていません");

//	(expected=IllegalArgumentException.class)
	@Test public void test() {


	}
	@Test public void test1(){

		BookDAO dao = new BookDAO();
		List<Book> bookList = dao.findBook();
		Book book = new Book();
//		System.out.println(book.get(0));


		for(Book bookBook : bookList){
//			System.out.println(bookBook.getIsbn());
//			System.out.println(bookBook.getBook_name());
			assertNotNull(bookBook.getIsbn());

		}

	}

	@Test public void test2(){
		List<Book> bookList = dao.findBook();
		for(Book bookBook : bookList){
			assertEquals(bookBook.getBook_name(),"Head First Java");
//			assertEquals(bookBook.getBook_name(),"First Java");
			assertNotNull(bookBook.getBook_name());
		}



	}
	@Test public void BookDAOTestテスト(){
//		Book book = test.findBook();
//		Book book =  test.findBook("Head First Java","Kathy Serra");
		Book d = test.findBook("Head First Java","Kathy Serra");
		System.out.println(d);

		//System.out.println(book.getModify_datetime());

//		assertEquals(book.getBook_name(),"Head First Java");
//		System.out.println(TimestampUtil.formattedTimestamp(TimestampUtil.current(), TIME_FORMAT));
    }

}

