import java.lang.*;
public interface ProducerIF {
	
	
	//Konstruktoren jeweils mit ID und Name
	
	public void write() throws Exception;
	//Nachricht eingeben und diese an den Server weiterleiten
	
	public boolean close();
	//beendet Produzent
}
