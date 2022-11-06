package JavaclassWeek1day1;

//Create a class for TwoWheeler
public class TwoWheeler {
	
	//declared below variables with appropriate values
	   int noOfWheels = 2;
	   short noOfMirrors = 2;
	   long chassisNumber = 1657892976347L;
	   boolean isPunctured = false;
	   String bikeName = "NinjaH2R";
	   double runningKM = 234253.53;

	   
	public static void main(String[] args) {
		
		//Creating a object for two wheeler and call all the variables inside main method and print the values.
		TwoWheeler mybike = new TwoWheeler();
		System.out.println("Im Driving Fast");
		System.out.println(mybike.bikeName);
		System.out.println(mybike.noOfWheels);
		System.out.println(mybike.chassisNumber);
		System.out.println(mybike.isPunctured);
		System.out.println(mybike.runningKM);


	}

}
