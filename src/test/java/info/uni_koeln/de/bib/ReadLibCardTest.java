package info.uni_koeln.de.bib;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class ReadLibCardTest {
	
	@Test
	public void readLibCardTxt() {
	
	File file = new File("LibCard.txt");

	try {

		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			System.out.println(str);
		}
		sc.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
}


}
