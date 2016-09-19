import java.util.ArrayList;
public class NflDefense {
	public String pName;
	public String num;
	public String status;
	public String position;
	public String stats;
	public String side;

	public static ArrayList<String> vikingsDef = new ArrayList();
  
    public NflDefense(String pName, String num, String status, String position, String stats, String side){
    	vikingsDef.clear();
       vikingsDef.add(pName);
       vikingsDef.add(num);
       vikingsDef.add(status);
       vikingsDef.add(position);
       vikingsDef.add(stats);
       System.out.println(vikingsDef);
    	
}
}