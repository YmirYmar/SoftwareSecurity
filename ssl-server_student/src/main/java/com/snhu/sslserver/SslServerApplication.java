package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";

@RestController
class ServerController{
    @RequestMapping("/hash")
    public String myHash() throws Exception{ // Added throws Exception, specifically NoSuchAlgorithmException.
    	String data = "Hello World Check Sum! Name: Neo Huynh";
    	
        MessageDigest md = MessageDigest.getInstance("SHA-256"); // Creates instance of the MessageDigest class for SHA-256 hashing 
        
        md.update(data.getBytes()); // Passes the data using the bytes from the provided string
        
        byte[] digest = md.digest(); // Generate the message and returns in the form of a byte array

        StringBuffer hexString = new StringBuffer(); // Converts the byte array to HexString format
        
        for (byte b : digest) { // simple for loop for length of digest
        	String hex = Integer.toHexString(0xff & b); // converts each byte into a two-digit hexadecimal value
        	
        	if (hex.length() == 1) { // if the hex string is only one character, append '0'
        		hexString.append('0');
        	}
        	
        	hexString.append(hex); // other wise append the hex to the StringBuffer
        }
        
        return "<p>data:"+data+"<p>Checksum: "+hexString.toString(); // prints my data and the checksum
    }
}
