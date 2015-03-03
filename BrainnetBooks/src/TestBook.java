import java.util.List;

import org.junit.Test;


public class TestBook {

//	(expected=IllegalArgumentException.class)
	@Test public void test() {

//		Bookインスタンスを生成
		Book book = new Book();
//		DAOインスタンスを生成
		BookDAO dao = new BookDAO();
//		fail("まだ実装されていません");
	}
	@Test public void test1(){

		BookDAO dao = new BookDAO();
		List<Book> bookList = dao.findBook();
//		System.out.println(book.get(0));

		for(Book bookBook : bookList){
			System.out.println(bookBook.getIsbn());
			System.out.println(bookBook.getBook_name());
		}

	}

}
