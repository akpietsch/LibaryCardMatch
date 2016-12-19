package info.uni_koeln.de.bib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JasonParserTest {
	public String sURL = "http://lobid.org/person?name=Goethe&format=full";

	@Test
	public void parseJson() throws IOException, ParseException {
		URL url = new URL(sURL);

		BufferedReader reader = null;

		HttpURLConnection request = (HttpURLConnection) url.openConnection();
		request.setRequestMethod("GET");

		StringBuilder sb = new StringBuilder();

		reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
		String line = null;
		while ((line = reader.readLine()) != null) {
			sb.append(line);
			sb.append("\n");
		}

		if (reader != null) {
			reader.close();
		}

		Gson gson = new GsonBuilder().setLenient().disableHtmlEscaping().setPrettyPrinting().create();
		JsonParser parser = new JsonParser();
		String jData = gson.toJson(sb.toString());

		JsonObject obj = parser.parse(sb.toString()).getAsJsonObject();
		LobidAPI lobid = gson.fromJson(obj.get("preferredName"), LobidAPI.class);
		System.out.println(lobid);

	}
}
