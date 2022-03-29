package Adapter;

import java.util.Scanner;


public class Bo {
	private Magazine m;
	
	public Magazine getM() {
		return m;
	}
	public void setM(Magazine m) {
		this.m = m;
	}
	public static BookData book = new BookData();
	UserData user = new UserData();
	//Administrator login verification
	public int login(String username, String password) {
		if (username.equals(user.getUser())) {
			if (password.equals(user.getPassword())) {
				return 1;//Account and password verification passed
			} else {
				return 0;//The password is wrong
			}
		} else {
			return -1;//The account does not exist
		}
	}
	/*
	 * Menu function display list
	 * 
	 * Book information display function
	 */
	
	
	public void showMagazine(String str) {
		m.write(str);
	}
	
	public void showBook() {
		
		
		System.out.println("This library has total" + (book.booknames.length-remainSpace()) + "book");
		int a = bookinfo();
		if (a == 0) {
			//Show all book information
			showAll();
		} else if (a> 0 && a <= book.booknames.length) {
			//Display related book information
			showPart(a);
		} else {
			System.out.println("The number entered is illegal!");
			showBook();
		}
	}
	//Show all book information
	public void showAll() {
		for (int i = 0; i <book.booknames.length; i++) {
			if (book.booknames[i] != null) {
				System.out.println("---------------------------------------Number" + ( i + 1)
						+ "------------------------------------------------ --------------");
				System.out.println("The book number is" + (i + 1) + "The detailed information is:");
				System.out.print("Book name:" + book.booknames[i] + "");
				System.out.print ( "Author:" + book.authors [i] + "");
				System.out.print("Publication Date:" + book.pubdates[i] + "");
				System.out.print("Total pages:" + book.sumpaginations[i] + "");
				System.out.println("borrower:" + book.borrowreaders[i]);
			}
		}
		System.out.println(
				"------------------------------------------------- -------------------------------------------------- ------");
	}
	//Display related book information
	public void showPart(int a) {
		int i = a;
		System.out.println(
				"---------------Boundary Line-------------------------------- -------------------------------------------------- -----------------");
		System.out.println("Book Number" + (i) + "The detailed information is:");
		System.out.print("Book name:" + book.booknames[i-1] + "");
		System.out.println ( "OF:" + book.authors [i - 1] + "");
		System.out.print("Publication Date:" + book.pubdates[i-1] + "");
		System.out.print("Total pages:" + book.sumpaginations[i-1] + "");
		System.out.println("borrower:" + book.borrowreaders[i-1]);
		System.out.println(
				"------------------------------------------------- --------------Boundary Line ---------------------------------- -----------------");
	}
	//According to the number, judge whether to display globally or partially
	public int bookinfo() {
		for (int i = 0; i <book.booknames.length; i++) {
			if (book.booknames[i] != null) {
				System.out.println("Book name number" + (i + 1) + ":" + book.booknames[i] + "");
			}
		}
		System.out.print("Enter the corresponding number to view the detailed information of the corresponding book (input 0 to view all information):");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		return i;
	}
	//Enter new book judgment
	public int addBook(String bookname, String author, String pubdate, String sumpagination) {
		int flag = 0;//1 means success, 0 means the new book already exists in the library, -1 means the warehouse is full
		if (book.booknames[book.booknames.length-1] != null) {
			flag = -1;//full
		}
		if (book.booknames[book.booknames.length-1] == null) {

			for (int i = 0; i <book.booknames.length; i++) {

				if (bookname.equals(book.booknames[i])) {
					flag = 0;//book.booknames[i] already exists
					break;
				}
				if (!(bookname.equals(book.booknames[i]))) {
					//add books
					add(bookname, author, pubdate, sumpagination);
					flag = 1;//success
					break;
				}
			}
		}
		return flag;
	}
	//Enter new book
	public void add(String bookname, String author, String pubdate, String sumpagination) {
		for (int i = 0; i <book.booknames.length; i++) {
			if (book.booknames[i] == null) {
				book.booknames[i] = bookname;
				book.authors[i] = author;
				book.pubdates[i] = pubdate;
				book.sumpaginations[i] = sumpagination;
				break;
			}
		}
	}
	//Store the remaining capacity of the book
	public int remainSpace() {
		int count = 0;
		try {
			for (int i = 0; i <book.booknames.length; i++) {
				if (book.booknames[i] == null) {
					++count;
				}
			}
		} catch (Exception e) {
			//TODO: handle exception
		}
		return count;
	}
	//Find related book information according to the book title when modifying
	public int selectBook(String bookname) {
		int flag = 0;
		for (int i = 0; i <book.booknames.length; i++) {
			if (bookname.equals("")) {
				flag = -1;//-1 means the book title is not entered
				break;
			}
			//In other cases, it matches the books in the library
			if (bookname.equals(book.booknames[i])) {
				flag = 1;//1Find the related book title
				showPart(i + 1);
				break;
			}
			if (!bookname.equals(book.booknames[i])) {
				if (i == book.booknames.length-1) {
					flag = 0;//0 means not found
				}
			}
		}
		return flag;
	}
	//Find the index based on the title of the book, return to its index if there is this book, if not return -1
	public int selectIndex(String bookname) {
		int flag = -1;
		for (int i = 0; i <book.booknames.length; i++) {
			if (bookname.equals(book.booknames[i])) {
				flag = i;
			}
		}
		return flag;//Can't find this book
	}
	//Modify book information 1 title 2 author 3 publication date 4 total pages 5 borrowers
	public void modinfo(int a, String value, int index) {

		switch (a) {
		case 1:
			book.booknames[index] = value;
			break;

		case 2:
			book.authors[index] = value;
			break;
		case 3:
			book.pubdates[index] = value;
			break;
		case 4:
			book.sumpaginations[index] = value;
			break;
		case 5:
			book.borrowreaders[index] = value;
			break;
		}

	}
	//Delete book function
	public void deleteBook(String bookname) {
		int a = selectIndex(bookname);
		book.booknames[a] = null;
		book.authors[a] = null;
		book.pubdates[a] = null;
		book.sumpaginations[a] = null;
		book.booknames[a] = null;

	}
	//Check if the book is in the library and if it has been lent
	public int testReader(String bookname) {

		//There is this book in the library, find the index of this book, there is this book a>=0, no return -1
		int a = selectIndex(bookname);
		//This book is in the library
		if (a >= 0) {
			if ((book.borrowreaders[a].equals("无") || book.borrowreaders[a].equals("")))//No one takes this book, "" is the direct return value of the scanner
				return 0;//Not borrowed
			else
				return 1;//borrowed
		} else {
			return -1;//There is no such book in the library
		}

	}
	//Set the borrower to none or empty
	public void setBorrowReader(String bookname){
		int a = selectIndex(bookname);
		book.borrowreaders[a]="None";
	}
	//Query the borrower of the specified book
	public String getBorrowReader(String bookname){
		int a = selectIndex(bookname);
		return book.borrowreaders[a];
	}

	//Book borrowing function
	public void borrow(String bookname,String readername){
		int a = selectBook(bookname);
		book.borrowreaders[a]=readername;
	}
}