<%@ page language="java" contentType="text/html; charset=UTF-8"
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
<form action="/BrainnetBooks/FindBook" method="post">
　　　書籍　　　　　　<input type="text" name="bookName"><br>
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

<%-- for検索条件ヒットした回数文表示 --%>
<table align="center"><caption>■検索結果一覧</caption>
<tr>
	<th>書籍情報</th>

	<th>著者名</th>
	<th>出版社</th>
	<th>税抜価格</th>
	<th>購入希望</th>
	</tr>
<tr>
	<th><%-- get書籍名、ISBM,発売日、カテゴリ名() --%></th>
	<td><%-- get著者名() --%> 著</td>
	<td><%-- get出版社() --%></td>
	<td><%-- get税抜価格() --%></td>
	<td><form action="" method="Post"><input type="text"size=1 name="">
	<input type="submit" value="追加"></form></td>

</tr>

</table>


</body>
</html>