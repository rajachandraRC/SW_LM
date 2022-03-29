package LMSFactory;

public class UserFactory {

public user getInstance(String str) {
	
	if(str.equals("S"))
		return new Student();
	else if(str.equals("A"))
		return new Admin();
	else
		return new Guest();
	
}
}
