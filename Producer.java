import java.io.*;
import java.net.*;
public class Producer implements ProducerIF {
	private final int ID;
	private final String name;
	
	String serverHost = null;//IP-Adresse des Servers
	
	
	
	
	public Producer(String s, int i){
		this.name = s;
		this.ID = i;
		
	}
	@Override
	public void write() throws IOException{
		

	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}

}
