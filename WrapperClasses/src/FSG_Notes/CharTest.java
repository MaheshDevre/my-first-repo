package FSG_Notes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharTest {

	public static void main(String[] args) throws IOException {
		char ch;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Enter a Character");
			ch=(char)br.read();
			
			System.out.print("you entered: ");
			if(Character.isDigit(ch))
			{
				System.out.println("a digit");
			}
			else if(Character.isLowerCase(ch))
			{
				System.out.println("an uppercase letter");
			}
			else if(Character.isLowerCase(ch))
			{
				System.out.println("an lowercase letter");
			}
			else if(Character.isSpaceChar(ch))
			{
				System.out.println("a spacebar character");
			}
			else if(Character.isWhitespace(ch))
			{
				System.out.println("a whitespace character");
			
				return;
			}
			else		
				System.out.println("Sorry, I dont know that");
				br.skip(2);
			

		}
	}

}
