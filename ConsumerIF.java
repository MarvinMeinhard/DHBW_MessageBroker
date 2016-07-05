
public interface ConsumerIF {
	//Konstruktoren jeweils mit ID und Name
		
		
		public boolean subscribe(int ID);
		//abbonieren eines Produzenten			
		public boolean subscribe(String name);
		//abbonieren eines Produzenten
		public boolean unscubscribe(int ID);
		//deabbonieren eines Produzenten
		public boolean unsubscribe(String name);
		//deabbonieren eines Produzenten
		public boolean close();
		//deabbonieren aller Produzenten und löschen des Consumer-Objekts
		public void output();
		//ausgabe alles
		public void output(int ID);
		//ausgabe eines Konsumenten
		public void output(String name);
		//ausgabe eines Konsumenten
		public String getName();
		//return name
		public int getID();
		//return ID
		public void listProducers();
		//gibt auf konsole Namen und ID's der aktiven Produzenten aus
}
