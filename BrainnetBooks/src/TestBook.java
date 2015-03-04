import org.junit.Test;


public class TestBook {




	BookDAOTest test = new BookDAOTest();
	StringBuilder sb = new StringBuilder();



	@Test public void test() {
		StringBuilder sb = new StringBuilder();
		Book book = test.findBook("Head First Java","Kathy Serra");
		sb.append(book.getIsbn()+ "\n");
		sb.append(book.getBook_name()+ "\n");
		sb.append(book.getAuthor_name()+ "\n");
		sb.append(book.getPublisher_name()+ "\n");
		sb.append(book.getPrice()+ "\n");
		sb.append(book.getRelease_date()+ "\n");
		sb.append(book.getCategory_id()+ "\n");
		sb.append(book.getModify_datetime()+ "\n");
		sb.append(book.getCreate_datetime()+ "\n");
		sb.append("\n");
		System.out.println(sb.toString());
	}
	@Test public void test1(){
//		部分一致
		Book book3 = test.findBook( "%st%","%rra%");

		sb.append(book3.getBook_name()+ "\n");
		sb.append(book3.getModify_datetime()+ "\n");
		sb.append(book3.getIsbn()+ "\n");
		sb.append(book3.getCategory_id()+ "\n");
		sb.append("\n");

		System.out.println(sb.toString());


	}
	@Test public void Test2(){
		StringBuilder sb = new StringBuilder();

	Book book = test.findBook("Head First Java","Kathy Serra");
	sb.append(book.getIsbn()+ "\n");
	sb.append(book.getBook_name()+ "\n");
	sb.append(book.getAuthor_name()+ "\n");
	sb.append(book.getPublisher_name()+ "\n");
	sb.append(book.getPrice()+ "\n");
	sb.append(book.getRelease_date()+ "\n");
	sb.append(book.getCategory_id()+ "\n");
	sb.append(book.getModify_datetime()+ "\n");
	sb.append(book.getCreate_datetime()+ "\n");
	sb.append("\n");

	System.out.println(sb.toString());







	}
	@Test public void Test3(){

//		insert
		Book book4 = test.additionBook("3", "java入門", "中山", "インプレス",
				(short)2800, "2014-08-11", (short)5);
		sb.append(book4.getIsbn()+ "\n");
		sb.append(book4.getBook_name()+ "\n");
		sb.append(book4.getAuthor_name()+ "\n");
		sb.append(book4.getPublisher_name()+ "\n");
		sb.append(book4.getPrice()+ "\n");
		sb.append(book4.getRelease_date()+ "\n");
		sb.append(book4.getCategory_id()+ "\n");
		sb.append(book4.getModify_datetime()+ "\n");
		sb.append(book4.getCreate_datetime()+ "\n");
		sb.append("\n");

		System.out.println(sb.toString());

    }

}

