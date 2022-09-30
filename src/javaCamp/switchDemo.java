package javaCamp;
import java.util.Scanner;

public class switchDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String grade;
		System.out.println("You entered a note:");
		String uniGrade =scan.nextLine();
	    
		switch(uniGrade) {
		case "A":
			System.out.println("perfect");
			break;
		case "B":
			System.out.println("very good");
			break;
		case "C":
			System.out.println("good");
			break;
		case "D":
			System.out.println("not bad");
			break;
		case "F":
			System.out.println("bad");
			break;
			default:
				System.out.println("invalid note ");
		}
		

	}

}
