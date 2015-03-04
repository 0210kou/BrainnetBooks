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

//	Timestamp t = new Timestamp(modify_datetime);

	//
	//

//	private static String TIME_FORMAT = "yyyy/MM/dd HH:mm:ss";
//	System.out.println(TimestampUtil.formattedTimestamp(TimestampUtil.current(), TIME_FORMAT));
	/**
	 * 格フィールドをprivateで設定
	 */
	private String	isbn; 				//ISBN番号
	private String	book_name; 			//書籍名
	private String	author_name;		//著者名
	private String	publisher_name;		//出版社名
	private short   	price;				//税抜価格
	private String  release_date;		//発売日
	private short 	category_id;		//カテゴリID
	private Date  modify_datetime = d;	//更新日時
	private Date 	create_datetime = d;	//登録日時

	/**
	 * 引数なしでもnewできるような戻り値なしのコンストラクタ
	 */
	public Book(){

	}
	/**
	 * 戻り値ありのコンストラクタ
	 */
	public Book(String isbn,String book_name,String author_name,String publisher_name,short price,String release_date,
			short category_id,Date modify_datetime,Date create_datetime){
		this.isbn = isbn;
		this.book_name = book_name;
		this.author_name = author_name;
		this.publisher_name = publisher_name;
		this.price = price;
		this.release_date = release_date;
		this.category_id = category_id;
		this.modify_datetime = modify_datetime;
		this.create_datetime = create_datetime;

	}

	public Book(String isbn, String book_name) {

		this.isbn = isbn;
		this.book_name = book_name;
	}
	public Book(String isbn, String book_name, String author_name,
			String publisher_name, short price, String release_date,
			short category_id, Date modify_datetime) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.isbn = isbn;
		this.book_name = book_name;
		this.author_name = author_name;
		this.publisher_name = publisher_name;
		this.price = price;
		this.release_date = release_date;
		this.category_id = category_id;
		this.modify_datetime = modify_datetime;

	}
	/**
	 * 格フィールドのゲッター
	 */
	public String getIsbn() {
		return isbn;
	}

	public String getBook_name() {
		return book_name;
	}

	public String getAuthor_name() {
		return author_name;
	}
	public String getPublisher_name() {
		return publisher_name;
	}
	public short getPrice(){
		return price;
	}

	public String getRelease_date() {
		return release_date;
	}

	public short getCategory_id() {
		return category_id;
	}

	public Date getModify_datetime() {
		return modify_datetime;
	}
	public Date getCreate_datetime() {
		return create_datetime;
	}




}
