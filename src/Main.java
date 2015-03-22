import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static Welt welt = new Welt();
	
	public static void main(String[] args) throws IOException {
		Spielfeld spielfeld = new Spielfeld(Main.welt);
		Spieler spieler = new Spieler(Main.welt);
		while(true){
			spielfeld.draw(Main.welt.feld);
			spieler.draw(Main.welt.feld);
			String out = Main.welt.print();
			System.out.println(out);
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter String: ");
	        Main.welt.setEingabe(br.readLine());
	        
	        
		}
	}

}