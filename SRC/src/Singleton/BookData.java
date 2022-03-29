package Singleton;


public class BookData {
	public BookData() {
		{
			String noreaders= "No";
			for (int i = 0; i <borrowreaders.length; i++) {
				borrowreaders[i]=noreaders;
			}
			for (int i = 0; i <5; i++) {
				switch (i) {
				case 0:
					booknames[i]="Design Patters:Elements of Resuable software";
					authors[i]="Erich Gamma";
					pubdates[i]="2016-03-31";
					sumpaginations[i]="1320";
					break;
				case 1:
					booknames[i]="Clean Architecture";
					authors[i]="Robert C. Martin";
					pubdates[i]="2017-07-25";
					sumpaginations[i]="656";
					break;
				case 2:
					booknames[i]=" Pattern-Oriented Software Architecture Volume";
					authors[i]="Frank Buschmann, Hans Rohnert";
					pubdates[i]="2016-01-31";
					sumpaginations[i]="1120";
					break;
				case 3:
					booknames[i]=" Enterprise Integration Patterns";
					authors[i]="Gregor Hohpe";
					pubdates[i]="2017-04-04";
					sumpaginations[i]="1310";
					break;
				case 4:
					booknames[i]="Just Enough Software Architecture";
					authors[i]="George H. Fairbanks";
					pubdates[i]="2012-08-20";
					sumpaginations[i]="954";
					break;
				}
			}
													
		}
	}

	public String[] booknames = new String[10];
	public String[] authors = new String[10];
	public String[] pubdates = new String[10];
	public String[] sumpaginations = new String[10];
	public String[] borrowreaders = new String[10];

}