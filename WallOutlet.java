package elvis.outlets;
//No need to import because they are part of the same package. Therefore, through the use of composition, I can use the class within this one.

//A wall outlet HAS-A socket.... So I am using composition in order to represent that. 

//When I create a wall outlet, I want it to have two sockets. 


public class WallOutlet {
	
	//This array will contain a list of Socket objects. 
   private Socket[] sockets;
	
   //This is a default constructor
   public WallOutlet() {
	   sockets = new Socket[2];
	   sockets[0] = new Socket(2);
	   sockets[1] = new Socket(2);
   }
   
   public WallOutlet(int numOfSockets) {
	   sockets = new Socket[numOfSockets];
	   for(int i = 0; i < numOfSockets; i++) {
		   sockets[i] = new Socket(2);  
	   }
   }
   
   public WallOutlet(int numOfSockets, int numOfProngs) {
	   sockets = new Socket[numOfSockets];
	   for(int i = 0; i < numOfSockets; i++) {
		   sockets[i] = new Socket(numOfProngs);
	   }
   }
   
   
   public int getNumOfSockets() {
	   return sockets.length;
   }
   
   
   public void displayWallOutlet() {
	   System.out.println("This wall outlet has " + getNumOfSockets() + " sockets on it. The following is the information on each:");
	   for(int i = 0; i < sockets.length; i++) {
		   System.out.println("Socket number " + (i + 1) + " has " + sockets[i].getNumOfProngs() + " prongs and " + (sockets[i].getAvailability() ? "is available":"is unavailable"));
		 
	   }
   }
   
   public void getSockets() {
	   int counter = 0;
	   while(counter < sockets.length) {
		   sockets[counter].socketInfo();
		   counter++;
	   }
   }
   
   public Socket getSocket(int position) {
	   if(position <= 0) {
		   throw new Error("Please choose a number greater than 0");
	   }
	   
	   if(position > sockets.length) {
		   throw new Error("That socket doesn't exist... please select another socket.");
	   }
	   return sockets[position - 1];
   }
   
}



