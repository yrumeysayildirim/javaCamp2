package javaCamp;

public class loopDemo {

	public static void main(String[] args) {
		//for
		for(int i=2; i<=10;i+=2) {
			System.out.println(i);
		}
		System.out.println("the loop is over!");
         
		int i=1;
        //while
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("the loop is over!");
	    //Do-While
		int j = 1;
		do {
			System.out.println(j);
		j+=2;
			
		}while(j<10);
		
		System.out.println("the loop is over!");
	
	}

}
