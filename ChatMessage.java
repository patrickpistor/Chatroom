import java.io.*;

public class ChatMessage implements Serializable {
	
	protected static final long serialVersionUID = 1112122200L;
	static final int WHOISIN = 0;
	static final int MESSAGE = 1;
	static final int LOGOUT = 2;
	private int myType = 0;
	private String myMessage = "";
	
	ChatMessage(int type, String message) {
		myType = type;
		myMessage = message;
	}
	
	int getType() {
		return myType;
	}
	
	String getMessage() {
		return myMessage;
	}
}
