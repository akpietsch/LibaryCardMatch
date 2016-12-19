package info.uni_koeln.de.bib;

public class Main {

	public static void main(String[] args)throws Exception {
	
	
		DataReader dataReader= new DataReader(); 
		dataReader.readLibOCR("LibCard.txt");
		dataReader.readUrl("http://lobid.org/person?name=Goethe&format=full");
		System.out.println(dataReader.result);

	//	dataReader.parseJson();
	
	}

	
	
}
