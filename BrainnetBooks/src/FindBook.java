

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.BookDAO;
import Entity.Book;

/**
 * Servlet implementation class FindBook
 */
@WebServlet("/FindBook")
public class FindBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		//1.リクエストパラメータを取得する

		//受け取る文字のエンコードを指定する
		request.setCharacterEncoding("UTF-8");


		//bookNameフィールドに入力された値をgetParameterで取得
		String book = request.getParameter("bookName");

		//authorNameフィールドに入力された値をgetParameterで取得
		String author = request.getParameter("authorName");

		//publisherNameフィールドに入力された値をgetParameterで取得
		String publisher = request.getParameter("publisherName");

		//categoryNameフィールドに入力された値をgetParameterで取得
		String category = request.getParameter("categoryName");

		//BookDAOのインスタンス生成

		BookDAO dao = new BookDAO();


		ArrayList<Book> book1 = dao.findBook(book, author, publisher, category);


		//HttpSessionインスタンスの取得
		HttpSession session = request.getSession();

		//sessionスコープにインスタンスを保存
		session.setAttribute("book1", book1);

		if(category.equals("")){
			category = "0";
		}

		short cate = Short.parseShort(category);

		Book searchBook = new Book(book,author,publisher,cate);
		session.setAttribute("searchBook",searchBook);

		System.out.println(session.getAttribute("searchBook") + "入力値をセッションスコープに格納できているか確認");

////		リストに格納された値を出力してテストするためのコード
//
//		response.setContentType("text/html; charset=UTF-8");
//
//		HttpSession session = request.getSession();
//
//
//		request.setCharacterEncoding("UTF-8");
////		String book = request.getParameter("a");
////		String book1 = request.getParameter("b");
////		String book2 = request.getParameter("c");
////		String book3 = request.getParameter("1");
//
////		short cate = Short.parseShort(request.getParameter("1"));
//
//		Book searchBook = new Book("book","book1","book2",(short)1);
//
//
//		session.setAttribute("searchBook",searchBook);
//
//
//		PrintWriter out = response.getWriter();
//		out.println("<html><head><title>test</title></head>");
//		out.println("<body><p>" + session.getAttribute("searchBook")+"</p></body>");
//		out.println("</html>");
//		ArrayList<Book> book2 = dao.findBook("", "", "", "3");





//		short category1 = Short.parseShort(category);
//		Book book2 = new Book(book,author,publisher,category1);
//		request.setAttribute("book2",book2);


		//リダイレクト
		response.sendRedirect("/BrainnetBooks/");

		//メイン画面にフォワード
//				RequestDispatcher dispatcher =
//						request.getRequestDispatcher("/");
//						dispatcher.forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub















	}

}
