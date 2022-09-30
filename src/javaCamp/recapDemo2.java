package javaCamp;

public class recapDemo2 {

	public static void main(String[] args) {
	 double[] myList = {1.5,2.8,3.3,4.6,5.0,6.1};	
     double total =0;
     double max =myList[0];
	 for(double number:myList) {
		 if(max<number) {
			 max=number;
		 }
		 
		 total = total + number;
	     System.out.println(number);	 
	 }
	 
	      System.out.println("total: " + total);
	      System.out.println("the biggest: " + max);
	}

}
