import java.io.Serializable;

/**
 *
 * @author 白川
 *Book(javabeans)Entity
 *パラメータを取得してインスタンスに格納するためにBookクラスを作成する
 */
public class Book implements Serializable{


	//現在日時を取得(保留)
	//Date nowDate = new Date();

	//
	//SimpleDateFormat formatA = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");


	/**
	 * 格フィールドをprivateで設定
	 */
	private String	isbn; 				//ISBN番号
	private String	book_name; 			//書籍名
	private String	author_name;		//著者名
	private String	publisher_name;		//出版社名
	private int   	price;				//税抜価格
	private String  release_date;		//発売日
	private int 	category_id;		//カテゴリID
	private String  modify_datetime;	//更新日時
	private String 	create_datetime;	//登録日時

	/**
	 * 引数なしでもnewできるような戻り値なしのコンストラクタ
	 */
	public Book(){

	}
	/**
	 * 戻り値ありのコンストラクタ
	 */
	public Book(String isbn,String book_name,String author_name,String publisher_name,int price,String release_date,
			int category_id,String modify_datetime,String create_datetime){
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
		// TODO 自動生成されたコンストラクター・スタブ
		this.isbn = isbn;
		this.book_name = book_name;
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
	public int getPrice(){
		return price;
	}

	public String getRelease_date() {
		return release_date;
	}

	public int getCategory_id() {
		return category_id;
	}

	public String getModify_datetime() {
		return modify_datetime;
	}
	public String getCreate_datetime() {
		return create_datetime;
	}




}
