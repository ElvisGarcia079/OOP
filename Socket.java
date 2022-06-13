package elvis.outlets;

public class Socket {
	private int numOfProngs;
	private boolean isAvailable;
	private Plug plugUsed;
	
	
	public Socket() {
		numOfProngs = 2;
		isAvailable = true;
		
	}
	
	public Socket(int numOfProngs) {
		if((numOfProngs != 3) && (numOfProngs != 2)) {
			throw new Error("You can only have 2 or 3 sockets.");
		}
		this.numOfProngs = numOfProngs;
		this.isAvailable = true;
		
	}
	
	public void socketInfo() {
		System.out.println("This socket has " + numOfProngs + " prongs, and is currently " + (isAvailable ? "available to use" : "being used by the following plug: " + this.getPlug()));
		
	}
	
	public void setPlug(Plug plug) {
		this.plugUsed = plug;
	}
	
	public Plug getPlug() {
		return this.plugUsed;
	}
	
	public boolean getAvailability() {
		return isAvailable;
		
	}
	
	public void setAvailability(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public int getNumOfProngs() {
		return this.numOfProngs;
	}
}
