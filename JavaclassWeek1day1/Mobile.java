package JavaclassWeek1day1;

//Create a class for Mobile
public class Mobile {
	
	//declare below variables with appropriate values
	String mobileBrandName = "IPhone";
	char mobileLogo = 'A';
	short noOfMobilePiece = 1;
	int modelNumber = 11;
	long mobileImeiNumber = 2564848374758L;
	float mobilePrice = 63737;
	boolean isDamaged = false;
	
	public static void main(String[] args) {
		
		//create object for Mobile
    Mobile myPhone = new Mobile(); 
    //call all the variables inside main method and print the values.
    System.out.println(myPhone.mobileBrandName);
    System.out.println(myPhone.mobileLogo);
    System.out.println(myPhone.noOfMobilePiece);
    System.out.println(myPhone.modelNumber);
    System.out.println(myPhone.mobileImeiNumber);
    System.out.println(myPhone.isDamaged);
		
	}

}
