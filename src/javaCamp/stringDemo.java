package javaCamp;

public class stringDemo {

	public static void main(String[] args) {
		String message = "The weather is very nice today!";
 
		System.out.println(message);
		System.out.println("Numbers of elements:"+ message.length());
		System.out.println("5th element:"+message.charAt(4));
		System.out.println(message.concat(" heyy"));
		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("!"));
		
		char[]character = new char[5];
		message.getChars(0, 4, character, 0);
		System.out.println(character);
		System.out.println(message.indexOf('a'));
		System.out.println(message.lastIndexOf('a'));
		
		System.out.println(message.replace(' ', '-'));
		System.out.println(message.substring(3,11));
		
		for(String word : message.split(" ")) {
			System.out.println(word);
			}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		
	}

}
