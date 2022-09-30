package javaCamp;

public class multiDimensionalArraysDemos {

	public static void main(String[] args) {
		String [][] cities = new String[3][3];
         
		cities[0][0] = "İstanbul";
		cities[0][1] = "İzmir";
		cities[0][2] = "Ankara";
		cities[1][0] = "Antalya";
		cities[1][1] = "Trabzon";
		cities[1][2] = "Diyarbakır";
		cities[2][0] = "Gaziantep";
		cities[2][1] = "Samsun";
		cities[2][2] = "Erzurum";
		
		for(int i =0; i<=2;i++) {
			System.out.println("--------------");
		  for(int j=0; j<=2;j++){
			System.out.println(cities[i][j]); 
		  }
			
		}
		
	}

}
