package DiffieHellman;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1Hash{
	
	public byte[] SHA1Hash(String s) throws NoSuchAlgorithmException{
		
		MessageDigest m;
		m = MessageDigest.getInstance("SHA-1");
		m.reset();
		m.update(s.getBytes());
		return m.digest();
		
	}
}