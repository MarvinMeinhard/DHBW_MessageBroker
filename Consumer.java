import java.io.Serializable;
import java.net.*;
import java.io.*;

public class Consumer implements ConsumerIF, Serializable {
	private final int ID;
	private final String name;

	public Consumer(String s, int i){
		this.ID = i;
		this.name = s;
	}

	@Override
	public boolean subscribe(int ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean subscribe(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unscubscribe(int ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unsubscribe(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub

	}

	@Override
	public void output(int ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void output(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return this.ID;
	}
	@Override
	public void listProducers(){
		
	
	}

}
