
public class Welt {
	public String[][] feld = new String[20][40];
	
	private String eingabe = "";
	public void setEingabe(String eingabe){

		if(eingabe.equals("w") || eingabe.equals("s") || eingabe.equals("d") || eingabe.equals("a")){
			this.eingabe = eingabe;
		}
	}
	
	public String getEingabe(){
		return this.eingabe;
	}
	
	public String print(){
		String out = "";
		for(int i = 0; i < this.feld.length; i++){
			for(int k = 0; k < this.feld[i].length; k++){
				out += this.feld[i][k];
			}
			out += "\n";
		}
		return out;
	}
}
