package Entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 白川
 *Book(javabeans)
 *パラメータを取得してインスタンスに格納するためにBookクラスを作成する
 *@Entity
 */
public class Book implements Serializable{


	//現在日時を取得
	Date d = new Date();
//	SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

//	Timestamp t = new Timestamp(modifyDatetime);

	//
	//

//	private static String TIME_FORMAT = "yyyy/MM/dd HH:mm:ss";
//	System.out.println(TimestampUtil.formattedTimestamp(TimestampUtil.current(), TIME_FORMAT));
	/**
	 * 格フィールドをprivateで設定
	 */
	private String	isbn; 				//ISBN番号
	private String	bookName; 			//書籍名
	private String	authorName;		//著者名
	private String	publisherName;		//出版社名
	private short   	price;				//税抜価格
	private String  releaseDate;		//発売日
	private short 	categoryId ;		//カテゴリID
	private Date  modifyDatetime = d;	//更新日時
	private Date 	createDatetime = d;	//登録日時

	/**
	 * 引数なしでもnewできるような戻り値なしのコンストラクタ
	 */
	public Book(){

	}
	/**
	 * 戻り値ありのコンストラクタ
	 */
	public Book(String isbn,String bookName,String authorName,String publisherName,short price,String releaseDate,
			short categoryId,Date modifyDatetime,Date createDatetime){
		this.isbn = isbn;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisherName = publisherName;
		this.price = price;
		this.releaseDate = releaseDate;
		this.categoryId = categoryId;
		this.modifyDatetime = modifyDatetime;
		this.createDatetime = createDatetime;

	}

	@Override
	public String toString() {
//	検索結果を返す書籍名、著者名、出版社名、税抜き価格を返す
		return "\n" +this.isbn + "\n" + this.bookName + "\n" +this.authorName +
				"\n" +this.publisherName + "\n" +this.price
				 + "\n" +this.releaseDate + "\n" +this.categoryId
				+ "\n" +this.modifyDatetime + "\n" +this.createDatetime + " " + "\n";
	}
	public Book(String isbn, String bookName) {

		this.isbn = isbn;
		this.bookName = bookName;
	}
	public Book(String isbn, String bookName, String authorName,
			String publisherName, short price, String releaseDate,
			short categoryId, Date modifyDatetime) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.isbn = isbn;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisherName = publisherName;
		this.price = price;
		this.releaseDate = releaseDate;
		this.categoryId = categoryId;
		this.modifyDatetime = modifyDatetime;

	}
	public Book(String bookName, String authorName, String publisherName, short categoryId) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisherName = publisherName;
		this.categoryId = categoryId;
	}



	/**
	 * 格フィールドのゲッター
	 */
	public String getIsbn() {
		return isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthorName() {
		return authorName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public short getPrice(){
		return price;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public short getCategoryId() {
		return categoryId;
	}

	public Date getModifyDatetime() {
		return modifyDatetime;
	}
	public Date getCreateDatetime() {
		return createDatetime;
	}




}
