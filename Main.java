package elvis.outlets;

public class Main {
	//I want it to not show me the address of my Sockets, although that is a good start... I want it to get me the Sockets themselves..
	//But what can I use to represent the sockets themselves.. Sockets.showInfo();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WallOutlet outlet1 = new WallOutlet();
		
		outlet1.displayWallOutlet();
		
		Plug plug1 = new Plug();
		plug1.plugInfo();
		
		plug1.plugIn(outlet1.getSocket(1));
		
		outlet1.displayWallOutlet();
		
		//plug1.plugIn(outlet1.getSocket(2));
		
		Plug plug2 = new Plug(3);
		
		//plug2.plugIn(outlet1.getSocket(2));
		
		WallOutlet outlet2 = new WallOutlet(2, 3);
		
		outlet2.displayWallOutlet();
		
		plug2.plugIn(outlet2.getSocket(1));
		
		outlet2.displayWallOutlet();
		
		plug2.unPlug(outlet2.getSocket(1));
		
		
	}

}
