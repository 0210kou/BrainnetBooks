

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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



		Book book1 = dao.findBook(book, author, publisher, category);












	}

}
