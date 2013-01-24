package ServerLib;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* USER HASH CLASS
 * 
 * This object is used to hash a username and password. This
 * can be used for authentication with the server. The server should use
 * a hash function as well to verify identities.
 * 
 */

public class UserHash {
	private static final String SALT = "#@DSJKL_dsad_d!";
	private byte[] hash = null;
	
	// UserHash constructor
	public UserHash (String username, String password) 
			throws NoSuchAlgorithmException, 
			UnsupportedEncodingException 
	{
		String textToHash = username + SALT + password;
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		messageDigest.update(
        		textToHash.getBytes("iso-8859-1"), 
        		0, 
        		textToHash.length());
        hash = messageDigest.digest();
	}
	
	public byte[] getHash() {
		return hash;
	}
}
