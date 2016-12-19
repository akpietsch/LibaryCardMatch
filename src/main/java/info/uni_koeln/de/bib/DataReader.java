package info.uni_koeln.de.bib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DataReader {

	public String result;

	public String readUrl(String sURL) throws IOException {

		URL url = new URL(sURL);

		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder();
		HttpURLConnection request = (HttpURLConnection) url.openConnection();
		request.setRequestMethod("GET");

		try {
			reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
				sb.append("\n");

			}
		} finally {
			if (reader != null) {
				reader.close();
			}
		}

		return result = sb.toString();
	}

	
	public void parseJsonLD() throws ParseException {
		Gson gson = new GsonBuilder().disableHtmlEscaping().setLenient().create();
	
	}
	
	

	public String readLibOCR(String location) throws Exception {

		File file = new File(location);
		
		StringBuilder sb = new StringBuilder();

		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				sb.append(line);
				sb.append("\n");
		
			}
			sc.close();
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return sb.toString();

	}

	public void matchToOCR() throws Exception {
		// TODO

	}

}
