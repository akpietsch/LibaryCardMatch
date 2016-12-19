package info.uni_koeln.de.bib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;


public class UrlTest {
	
	@Test
	public void readUrl() throws IOException {
	
		String sURL = "http://lobid.org/person?name=Goethe&format=full";
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
			

			}
		} finally {
			if (reader != null) {
				reader.close();
			}
			System.out.println(sb.toString());
		}

		
	}


}
