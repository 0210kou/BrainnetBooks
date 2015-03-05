package Dao;

import static org.junit.Assert.*;

import org.junit.Test;

import Entity.Book;

public class TestBook {


	//Bookインスタンス生成
	Book book = new Book();
//	findBook()を持っているclassのインスタンスを生成
	BookDAOTest test = new BookDAOTest();

	StringBuilder sb = new StringBuilder();



	@Test public void test() {

		Book book = test.findBook("First Java","Serra","ILLY","3");
//		第一引数と第二引数が同じ値であるか判別します。違う場合はfalseになります。
					assertEquals("First Java", book.getBook_name());
					assertEquals("Serra", book.getAuthor_name());
					assertEquals("ILLY", book.getPublisher_name());
					assertEquals(3, book.getCategory_id()); //shor型なの失敗する


	}
	@Test public void test1(){
//		部分一致

		Book book1 = test.findBook( "st","rra","O'REILLY","1");

		Book book2 = test.findBook("st","rra","O'REILLY","1");
		//Object1とObject2が同じObjectを参照していないか判定する同じオブジェクトの場合
//		falseを返す
					assertNotSame(book1, book2);












	}
	@Test public void Test2(){

		Book book3 = test.findBook("st","rra","O'REILLY","1");
		Book book4 = new Book();

		//引数(Object)がNullでないか判定する
				assertNotNull(book3);//引数(Object)がNullでないか判定する

//		上記と同様に振舞うが、Nullだった場合には第一引数のStringを返す
				assertNotNull("Nullになっている",book4.getCategory_id());



	}
	@Test public void Test3(){

		Book book5 = new Book();
		Book book6 = test.findBook("st","rra","O'REILLY","1");


				assertNotEquals(book5, book6);





    }
	@Test public void Test4(){

		Book book7 = test.findBook("First Java","Serra","ILLY","3");
//		第二引数がnullでないことを検証。
		assertNotNull(book7.getCreate_datetime());

	}
	@Test public void Test5(){


	}


}

