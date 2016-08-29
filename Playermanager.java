import java.util.*;
public class Playermanager {
	private NFLplayers vikings;

	public Playermanager() {
	vikings = new NFLplayers();
	List<String> list = NFLplayers.getList();
	}
	
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter the name of the player to view stats");
	String findPlayer = in.nextLine();
	char a;
	for (int i = 1; i < findPlayer.length(); i++){
		a = findPlayer.charAt(i);
	}

}

