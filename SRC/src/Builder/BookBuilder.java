package Builder;



public class BookBuilder {
	
	private String bookname;
	private String author;
	private String pubdate;
	private int sumpagination;
	public BookBuilder setBookname(String bookname) {
		this.bookname = bookname;
		return this;
	}
	public BookBuilder setAuthor(String author) {
		this.author = author;
		return this;
	}
	public BookBuilder setPubdate(String pubdate) {
		this.pubdate = pubdate;
		return this;
	}
	public BookBuilder setSumpagination(int sumpagination) {
		this.sumpagination = sumpagination;
		return this;
	}
	
	public Book getBook() {
		System.out.println(bookname + " "+ author+ "  " + pubdate + " " + sumpagination);
//		try {
//			BookData.booknames[i] = bookname;
//			BookData.authors[i] = author;
//			BookData.pubdates[i] = pubdate;
//			BookData.sumpaginations[i] = sumpagination;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		return new Book(bookname, author, pubdate, sumpagination);
		
	}
}
