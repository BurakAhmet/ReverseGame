import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word to see it's reverse \nEnter your word: ");
		String kelime = input.nextLine();
		System.out.print(kelime+" ");
		int bas = 0 ,son = kelime.length() - 1;
		while (bas <= son) 
		{
				System.out.print(kelime.charAt(son));
				son--;
		}
		input.close();
	}

}