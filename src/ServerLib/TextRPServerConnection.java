package ServerLib;

import java.net.InetAddress;

public class TextRPServerConnection {
	
	private InetAddress ipAddress;
	private int port;
	private boolean isConnected = false;
	private boolean isAuthenticated = false;
	private String username = null;
	private UserHash userHash;
	
	public TextRPServerConnection(InetAddress ipAddress) {
		this(ipAddress, 8880);
	}
	
	public TextRPServerConnection(InetAddress ipAddress, int port) {
		this.ipAddress = ipAddress;
		this.port = port;
	}
	
	public boolean connectToServer() {
		// Upon success, set isConnected to true and return true
		isConnected = true;
		return true;
	}
	
	public boolean sendDataToServer(String data) {
		return true;
	}
	
	public boolean authenticateUser(String username, String password) {
		// Upon successful authentication, return true
		isAuthenticated = true;
		return true;
	}
	
	public boolean deauthenticateUser() {
		isAuthenticated = false;
		return true;
	}
}
