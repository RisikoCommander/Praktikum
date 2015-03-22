
public class Spielfeld implements Zeichenbar{
	
	public Spielfeld(Welt welt) {
		for(int i = 0; i < welt.feld.length; i++){
			for(int k = 0; k < welt.feld[i].length; k++){
				if(i == 0 || i == welt.feld.length - 1 || k == 0 || k == welt.feld[i].length - 1){
					welt.feld[i][k] = "#";
				}else {
					welt.feld[i][k] = " ";
				}
			}
		}
	}
	
	@Override
	public void draw(String[][] context) {

	}
}
