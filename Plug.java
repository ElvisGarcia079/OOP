package elvis.outlets;

public class Plug {
	
	private int numOfProngs;
	private boolean isPlugged;
	private String color;
	private double plugLengthInFeet;
	
	public Plug() {
		numOfProngs = 2;
		isPlugged = false;
		color = "White";
		plugLengthInFeet = 3.0;
		System.out.println("Recommendation: To view your Plugs properties and information, run the following function on your new plug \n\n <Your Plug>.info()");
		System.out.println("For example, if I create a new Plug Object called 'plug1'. Then I would run: \n plug1.info()");
		
	}
	
	public Plug(int numOfProngs) {
		if((numOfProngs != 2) && (numOfProngs != 3)) {
			throw new Error("Must contain only 2 or 3 prongs");
		}else {
			this.numOfProngs = numOfProngs;
		}
		isPlugged = false;
		color = "White";
		plugLengthInFeet = 3.0;
	}
	
	public Plug(int numOfProngs, String color) {
		if((numOfProngs != 2) || (numOfProngs != 3)) {
			throw new Error("Must contain only 2 or 3 prongs");
		}else {
			this.numOfProngs = numOfProngs;
		}
		this.color = color;
		isPlugged = false;
		plugLengthInFeet = 3.0;
	}
	
	public Plug(int numOfProngs, String color, double length) {
		if((numOfProngs != 2) || (numOfProngs != 3)) {
			throw new Error("Must contain only 2 or 3 prongs");
		}else {
			this.numOfProngs = numOfProngs;
		}
		this.color = color;
		isPlugged = false;
		plugLengthInFeet = length;
	}
	
	public void plugInfo() {
		System.out.println("[\nPLUG: " + "\n Number of Prongs = " + getNumOfProngs() + ",\n Plugged In = " + getIsPlugged() + ",\n Color = " + getColor() + ",\n Length = " + getPlugLengthInFeet() + "ft" + ",\n ID = " + this + "\n]");
	}
	
	public int getNumOfProngs() {
		return numOfProngs;
	}
	
	public boolean getIsPlugged() {
		return isPlugged;
	}
	
	public double getPlugLengthInFeet() {
		return plugLengthInFeet;
	}
	
	public String getColor() {
		return this.color;
	}
	
//	public void plugIn(Socket socket) {
//		if(socket.getAvailability()) {
//			if(this.getNumOfProngs() <= socket.getNumOfProngs()) {
//				socket.setAvailability(false);
//				socket.setPlug(this);
//				isPlugged = true;
//				System.out.println("You have successfully plugged into this socket");
//			}else {
//				throw new Error("This socket has " + socket.getNumOfProngs() + " prongs and your plug requires a socket with " + this.getNumOfProngs() + " prongs.");
//			}
//		}else {
//			throw new Error("The socket you're attempting to use is currently in use...");
//		}
//	}
	
	public void plugIn(Socket socket) {
		if(socket.getAvailability() && !isPlugged) {
			if(this.getNumOfProngs() <= socket.getNumOfProngs()) {
				socket.setAvailability(false);
				socket.setPlug(this);
				isPlugged = true;
				System.out.println("You have successfully plugged into this socket");
			}else {
				throw new Error("This socket has " + socket.getNumOfProngs() + " prongs and your plug requires a socket with " + this.getNumOfProngs() + " prongs.");
			}
		}else {
			throw new Error("The socket you're attempting to use is currently in use...");
		}
	}
	
	public void unPlug(Socket socket) {
		
		if(!socket.getAvailability()) {
			if(socket.getPlug().equals(this)) {
				socket.setAvailability(true);
				isPlugged = false;
				System.out.println("Successfully unplugged from this socket");
			}else {
				throw new Error("The plug you've chosen is not connected to this socket!");
			}	
		}else {
			throw new Error("This socket is currently not in use and is available...");
		}
	}
	

	
	
	
	
}
