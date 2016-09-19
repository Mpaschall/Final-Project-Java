import java.util.ArrayList;
public class NflOffense {
	public String pName;
	public String num;
	public String status;
	public String position;
	public String stats;
	public String side;

	public static ArrayList<String> vikingsOff = new ArrayList();
  
    public NflOffense(String pName, String num, String status, String position, String stats, String side){
    	vikingsOff.clear();
    	vikingsOff.add(pName);
    	vikingsOff.add(num);
    	vikingsOff.add(status);
    	vikingsOff.add(position);
    	vikingsOff.add(stats);
    	System.out.println(vikingsOff);
    	
}
}