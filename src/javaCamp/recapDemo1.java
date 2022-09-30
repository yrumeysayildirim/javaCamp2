package javaCamp;

public class recapDemo1 {

	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 19;
		int number3 = 24;
		int theBiggest = number1;
		
		
		if(theBiggest<number2) {
			theBiggest = number2;
		}
		
		if(theBiggest<number3){
			theBiggest = number3;
		} 
		
		System.out.println("The biggest: "+ theBiggest);
	}

}
