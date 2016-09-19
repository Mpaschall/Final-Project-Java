import java.util.*;
public class NflPlayers {
	public String pName;
	public String num;
	public String status;
	public String position;
	public String stats;
	public String side;

    public static ArrayList<String> vikings = new ArrayList();
    
    public NflPlayers(String pName, String num, String status, String position, String stats, String side){
    	vikings.clear();
       vikings.add(pName);
       vikings.add(num);
       vikings.add(status);
       vikings.add(position);
       vikings.add(stats);
       System.out.println(vikings);
    	
}
}