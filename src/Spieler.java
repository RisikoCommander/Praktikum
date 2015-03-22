
public class Spieler implements Zeichenbar {
	private int[] position = {1,1};
	
	public Spieler(Welt welt){
		welt.feld[this.position[1]][this.position[0]] = "O";
	}
	
	@Override
	public void draw(String[][] context) {
		String eingabe = Main.welt.getEingabe();
		
		if(eingabe.equals("w")){
			int y = this.position[1] - 1;
			if(!(y >= 1 && y <= context.length -2)){
				return;
			}
			
			context[this.position[1]][this.position[0]] = " ";
			this.position[1] = y;
			context[y][this.position[0]] = "O";
			return;
		}
		
		if(eingabe.equals("s")){
			int y = this.position[1] + 1;
			if(!(y >= 1 && y <= context.length -2)){
				return;
			}
			
			context[this.position[1]][this.position[0]] = " ";
			this.position[1] = y;
			context[y][this.position[0]] = "O";
			return;
		}
		
		if(eingabe.equals("a")){
			int x = this.position[0] - 1;
			if(!(x >= 1 && x <= context[0].length -2)){
				return;
			}
			
			context[this.position[1]][this.position[0]] = " ";
			this.position[0] = x;
			context[this.position[1]][x] = "O";
			return;
		}
		
		if(eingabe.equals("d")){
			int x = this.position[0] + 1;
			if(!(x >=1 && x <= context[0].length -2)){
				return;
			}
			
			context[this.position[1]][this.position[0]] = " ";
			this.position[0] = x;
			context[this.position[1]][x] = "O";
			return;
		}
	}

}
