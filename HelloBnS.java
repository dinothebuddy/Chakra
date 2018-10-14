import java.util.*;
import java.io.*;

public class HelloBnS{
	
	public static void main(String[] args) throws IOException{		
		System.out.println("Hello World This is TDTU");
		FileReader fr = new FileReader("name.txt");
		Scanner sc = new Scanner(fr);
		String name;
		int count = 0;
		while(sc.hasNextLine()){
			name = sc.nextLine();
			System.out.println("Hello World I am " + name);
			count++;
		}
		System.out.print(count);
	}
}