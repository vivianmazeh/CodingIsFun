package JavaNote;

import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;

/*
 * 
 * a socket identifies an endpoint in net work and allows a single computer serve many clients at once
 * 
 * */
public class Networking {
	
	public static void showcase() throws MalformedURLException {
		
		
		Socket socket = new Socket();
		
		URL url = new URL("https://shop.lululemon.com/");
		
		System.out.println(url.getHost());
		System.out.println();
		System.out.println(url.getPort());
		System.out.println();
	}
	
	
	

}
