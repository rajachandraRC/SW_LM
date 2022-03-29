package Adapter;

public class MagazineAdapter implements Magazine {
	
	
	BookData bd = new BookData();

	@Override
	public void write(String str) {
		
		bd.shelf(str);
		
	}

}
