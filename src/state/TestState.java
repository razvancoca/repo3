package state;

public class TestState {
	
	public static void main(String[] args){
		Editor editor = new Editor();
	
		editor.afisare("Hello World !");
		
		editor.setStare(Stare.BOLD);
		
		editor.afisare("Hello !");
		
		editor.setStare(Stare.ITALIC);
		
		editor.afisare("Salut !");
	}
}
