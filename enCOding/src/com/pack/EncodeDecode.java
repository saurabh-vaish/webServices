package com.pack;

import org.apache.commons.codec.binary.Base64;

public class EncodeDecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "welcome to encoding and decoding";
		
		System.out.println("normal string is = "+s);
		 
		byte [] nr = s.getBytes();  //converting to byte array
		
		byte[] enc = Base64.encodeBase64(nr);   // converting byte array to encoded array
		
		String enStr = new  String(enc);  // getting ecoded string
		
		System.out.println("encoded string is = "+enStr);   
		
		byte[] decAr = Base64.decodeBase64(enStr);   //  converting encoded string to decoded array
		
		String dec = new String(decAr);  // getting decoded string
		
		System.out.println("decoded string is = "+dec);
		
		
		
	}

}
