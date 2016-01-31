import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class TimeParsier {
	
	public static void printTime(){
		URL url = null;
		URLConnection urlConn = null;
		InputStreamReader inStream = null;
		BufferedReader buff = null;
		String time;
		try {
			url = new URL("http://www.timeapi.org/utc/now");
			urlConn = url.openConnection();
			inStream = new InputStreamReader(urlConn.getInputStream());
			buff = new BufferedReader(inStream);
			String temp = buff.readLine();
			time = temp.substring(11, 19);
			System.out.println("GMT: " + time); 
		} catch(MalformedURLException e) {
			System.out.println("Please check the spelling of the URL: "
							+ e.toString());
		} catch (IOException e1) {
			System.out.println("Can't read from Internet: "
					+ e1.toString());
		} finally {
			try {
				inStream.close();
				buff.close();
			} catch(Exception e) {
				System.out.println("Can't close streams "
						+ e.getMessage());
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		TimeParsier.printTime();

	}

}
