package Adapter;


public class BookData {
	//Book stack
	public BookData() {
		{
			String noreaders= "No";
			for (int i = 0; i <borrowreaders.length; i++) {
				borrowreaders[i]=noreaders;
			}
			for (int i = 0; i <5; i++) {
				switch (i) {
				case 0:
					booknames[i]="God-level powerhouse in the city";
					authors[i]="Day When Noon";
					pubdates[i]="2016-03-31";
					sumpaginations[i]="1320";
					break;
				case 1:
					booknames[i]="City Cultivator Master";
					authors[i]="Snow without tears";
					pubdates[i]="2017-07-25";
					sumpaginations[i]="656";
					break;
				case 2:
					booknames[i]="Human Flower Guard";
					authors[i]="Chicken Feidan";
					pubdates[i]="2016-01-31";
					sumpaginations[i]="1120";
					break;
				case 3:
					booknames[i]="7.Realms Immortal Venerable";
					authors[i]="Unscrupulous scholar";
					pubdates[i]="2017-04-04";
					sumpaginations[i]="1310";
					break;
				case 4:
					booknames[i]="Love the naughty princess";
					authors[i]="Remnant Luo Xiaoxiao";
					pubdates[i]="2012-08-20";
					sumpaginations[i]="954";
					break;
				}
			}
													
		}
	}
	
	public void shelf( String str)
	{
		System.out.println(str);
	}
	
	public String[] booknames = new String[10];//book name
	public String[] authors = new String[10];//Author
	public String[] pubdates = new String[10];//Publication date
	public String[] sumpaginations = new String[10];//Total number of pages
	public String[] borrowreaders = new String[10];//borrower

}