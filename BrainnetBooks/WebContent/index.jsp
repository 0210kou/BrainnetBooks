<%@ page language="java" contentType="text/html; charset=UTF-8" import="Entity.Book, Dao.BookDAO,java.util.ArrayList,java.util.List;"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>書籍検索画面</title>
<link>
</head>
<body>
<div id="headermenu" align="right">
<p>
<label for="namae" accesskey="n">ユーザーID：<%-- getUserID() --%></label></div>
<p>

<div id="" align="center" >
<a href="URL" >書籍検索</a>
　　　<a href="URL">ショッピングカート </a>
　　　<a href="URL" >注文履歴 </a>
　　　<a href="URL" >ログイン</a>　<a href="URL" >/ログアウト </a>
</div>
<br>
<br>
<br>
<div id= "keyword" align="center">
■検索キーワード<br><p>


<%-- Book searchBook = (Book)request.getAttribute("searchBook"); --%>
<%%>

<form action="/BrainnetBooks/FindBook" method="get">
<% Book search = (Book)session.getAttribute("searchBook"); %>

<%if(search == null){ %>
　　　書籍　　　　　　<input type="text" name="bookName" ><br>

<p>
　　　著者　　　　　　<input type="text" name="authorName"><br>
<p>
 　出版社　　　　　　 <input type="text" name="publisherName"><br>
<p>
 カテゴリー　　　　　 <input type="text" name="categoryName"><br>
 <p>
　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　<input type="submit" value="検索">
<br>
</form>
</div>
<br>
<p>
<%} else{%>
<%--if(search.getBookName().equals("") && search.getAuthorName().equals("") &&
		search.getPublisherName().equals("") && search.getCategoryId() == 0){--%>
<%-- String name = search.getBookName();--%>
<%%>
　　　書籍　　　　　　<input type="text" name="bookName" value=<%= search.getBookName()%>><br>
<% System.out.println(search.getBookName() + "\n" +search.getAuthorName() +"jspのスコープの出力");%>
<p>
　　　著者　　　　　　<input type="text" name="authorName"value=<%= search.getAuthorName()%>><br>
<p>
 　出版社　　　　　　 <input type="text" name="publisherName"value=<%= search.getPublisherName()%>><br>
<p>
 カテゴリー　　　　　 <input type="text" name="categoryName"value=<%= search.getCategoryId()%>><br>
 <p>
　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　<input type="submit" value="検索">
<br>
</form>
</div>
<br>
<p>
<% }%>

<br>
<p>




<%-- セッションスコープからインスタンスを取得 --%>
<%-- Book book1 = session.getAttribute("book1"); --%>

<%-- Book book = (Book) session.getAttribute("book1"); --%>

<%-- session.getAttribute("book1"); --%>
<% ArrayList<Book> bookList = (ArrayList<Book>) session.getAttribute("book1"); %>
<%  %>


<%-- for検索条件ヒットした回数文表示 --%>
<table align="center"><caption>■検索結果一覧</caption>
<tr>
	<th>書籍情報</th>

	<th>著者名</th>
	<th>出版社</th>
	<th>税抜価格</th>
	<th>購入希望</th>
	</tr>
	<%if(bookList != null) {%>

	<%for(Book book: bookList){%>
<tr>
	<th><%= book.getIsbn()%><%= book.getBookName() %><%= book.getReleaseDate()%><%=book.getCategoryId() %></th>
	<td>　<%= book.getAuthorName() %> 著</td>
	<td>　<%= book.getPublisherName() %></td>
	<td>　<%= book.getPrice() %></td>
	<td><form action="" method="Post"><input type="text"size=1 name="" >
	<input type="submit" value="追加"> </form></td>
	<% }%>

	<%} %>




</tr>

</table>


</body>
</html>