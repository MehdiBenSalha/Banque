import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Administration {
	
	public static void main(String [] args) {
	try{ File f = new File("Journal.txt");
	Scanner sc = new Scanner(f);
	while(sc.hasNextLine()) {
		String s = sc.nextLine();
		System.out.println(s);
	}
	}
	catch(FileNotFoundException e){
		System.out.print("Error");
		e.printStackTrace();
	}
}}
