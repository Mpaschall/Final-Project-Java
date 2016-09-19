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
    public void celebrate(){
    	double rNG = (int) (Math.random() * 4);
    	if(rNG == 0){
    	System.out.println("I won't let you down coach!");
    	}
    	else if(rNG == 1){
    		System.out.println("Put me in Coach, I'm ready to play!");
    	}
    		else if(rNG == 2){
    			System.out.println("Yeah, I know, I'm the best!");
    	}
    		else if(rNG == 3){
    			System.out.println("Oh yeah! We're gonna win this!");
    		}
    		else{
    			System.out.println("WooHoo!");
    		}
}
}