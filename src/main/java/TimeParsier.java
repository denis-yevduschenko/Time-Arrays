import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class TimeParsier {
	
	public static void main(String[] args) throws IOException {
		TimeParsier timeParsier = new TimeParsier();
		timeParsier.printTime();

	}
	
	private URL url = null;
	private URLConnection urlConn = null;
	private InputStreamReader inStream = null;
	private BufferedReader buff = null;
	private String time;
	
	

	public TimeParsier() throws IOException {
		this.url = new URL("http://www.timeapi.org/utc/now");
		this.urlConn = url.openConnection();
		this.inStream = new InputStreamReader(urlConn.getInputStream());
		this.buff = new BufferedReader(inStream);
	}
	
	public void printTime(){
		try {
			printTimeFromInternet();
		} catch(MalformedURLException e) {
			System.out.println("Please check the spelling of the URL: "
							+ e.toString());
		}catch (IOException e) {
			System.out.println("Can't read from Internet: "
					+ e.toString());
		}
	}

	private void printTimeFromInternet() throws IOException{
		setTimeFromURL();
		System.out.println("GMT: " + getTime()); 
		closeAllConnections();
	}

	private void setTimeFromURL() throws IOException{
		
			String temp = buff.readLine();
			time = temp.substring(11, 19);
 
//		} catch(MalformedURLException e) {
//			System.out.println("Please check the spelling of the URL: "
//							+ e.toString());
//		} catch (IOException e1) {
//			System.out.println("Can't read from Internet: "
//					+ e1.toString());
//		} finally {
//			try {
//				inStream.close();
//				buff.close();
//			} catch(Exception e) {
//				System.out.println("Can't close streams "
//						+ e.getMessage());
//			}
//		}
		
	}
	
	private void closeAllConnections(){
		try {
			inStream.close();
			buff.close();
		} catch (IOException e) {
			System.out.println("Can't read from Internet: "
					+ e.toString());
		}
		
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
