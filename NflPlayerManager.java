import java.util.*;

public class NflPlayerManager {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	
	System.out.println("Main Menu");
	System.out.println("---------");
	System.out.println("Lineup");
	System.out.println("Roster");
	System.out.println("Draft");
	System.out.println("Challenge");
	System.out.println("Weekly Results");
	System.out.println("Please type the word for the menu option you would like");
	String menuOption = in.nextLine();
	if(menuOption.equals("Lineup")){
		System.out.print(NflPlayers.pLineup);
	}
	else if(menuOption.equals("Roster")){
	System.out.println("Please choose an option. 1 - Team, 2 - Defense, 3 - Offense, 4 - Special Teams");
	int answer = in.nextInt();
	
	if(answer == 1){
		System.out.println("Name  " + "Number  " + " Status " + " Position " + " Stats ");
		System.out.println("------------------------------------------------------------------------------");
	NflPlayers Alexander = new NflPlayers("Alexander, Mackensie", "20", "ACT", "CB", "TCKL 0, SCK  --, FF --, INT --", "Defense");
    NflPlayers Asiata = new NflPlayers("Asiata, Matt", "44", "ACT","RB", "CAR 4, YDS 13, AVG 3.3, TDS 0", "Offense");
    NflPlayers Barr = new NflPlayers("Barr, Anthony", "55", "ACT", "OLB", "TCKL 2, SCK 0.0, FF 0, INT --", "Defense");
    NflPlayers Berger = new NflPlayers("Berger, Joe", "61", "ACT", "C", "G 1, GS 1", "Offense");
	NflPlayers Boone = new NflPlayers("Boone, Alex", "76", "ACT", "OG", "G 1, GS 1", "Offense");
	NflPlayers Bradford = new NflPlayers("Bradford, Sam", "8", "ACT", "QB", "TDS --, INT --, YDS --, RTG 0.0", "Offense");
	NflPlayers Bridgewater = new NflPlayers("Bridgewater, Teddy", "5", "RES",  "QB", "TDS --, INT --, YDS --, RTG --", "Offense");
	NflPlayers Brothers = new NflPlayers("Brothers, Kentrell", "40",  "ACT", "OLB", "TCKL 0, SCK --, FF --, INT --", "Defense");
	NflPlayers Clemmings = new NflPlayers("Clemmings, T.J.", "68", "ACT", "OT", "G 0, GS 0", "Offense");
	NflPlayers Cole = new NflPlayers("Cole, Audie", "57", "ACT", "MLB", "TCKL 0, SCK --, FF --, INT --", "Defense");
	NflPlayers Crichton = new NflPlayers("Crichton, Scott", "95", "RES", "DE", "TCKL  -- SCK  -- FF  -- INT  --", "Defense");
	NflPlayers Diggs = new NflPlayers("Diggs, Stefon", "14", "ACT", "WR", "REC 7, YDS 103, AVG 14.7, TDS 0", "Offense");
	NflPlayers Easton = new NflPlayers("Easton, Nick", "62", "ACT", "C", "G 0, GS 0", "Offense");
	NflPlayers Ellison = new NflPlayers("Ellison, Rhett", "85", "ACT", "TE", "REC --, YDS --, AVG --, TDS --", "Offense");
	NflPlayers Exum = new NflPlayers("Exum, Antone", "32", "RES", "CB", "TCKL --, SCK --, FF --, INT --", "Defense");
	NflPlayers Floyd = new NflPlayers("Floyd, Sharrif", "73", "ACT", "DT", "TCKL 0, SCK --, FF --, INT --", "Defense");
	NflPlayers Fusco = new NflPlayers("Fusco, Brandon", "63", "ACT", "G", "G  1 GS  1", "Offense");
	NflPlayers Greenway = new NflPlayers("Greenway, Chad", "52", "ACT", "OLB", "TCKL 0, SCK --, FF --, INT --", "Defense");
	NflPlayers Griffen = new NflPlayers("Griffen, Everson", "97", "ACT", "DE", "TCKL 3, SCK 0.0, FF 0, INT --", "Defense");
	NflPlayers Harris = new NflPlayers("Harris, Anthony", "41", "ACT", "SS", "TCKL 0, SCK --, FF --, INT --", "Defense");
	NflPlayers Hill = new NflPlayers("Hill, Shaun", "13", "ACT", "QB", "TDS 0, INT 0, YDS 236, RTG 77.3", "Offense");
	NflPlayers Hunter = new NflPlayers("Hunter, Danielle", "99", "ACT", "DE", "TCKL 4, SCK 1.0, FF 0, INT  --", "Defense");
	NflPlayers cJohnson = new NflPlayers("Johnson, Charles", "12", "ACT", "WR", "REC  1 YDS  5 AVG  5.0 TDS  0", "Offense");
	NflPlayers tJohnson = new NflPlayers("Johnson, Tom", "92", "ACT", "DT", "TCKL 0, SCK --, FF --, INT --", "Defense");
	NflPlayers Joseph = new NflPlayers("Joseph, Linval", "98", "ACT", "DT", "TCKL 5, SCK 1.0, FF 1, INT --", "Defense");
	NflPlayers Kalil = new NflPlayers("Kalil, Matt", "75", "ACT", "T", "G 1, GS 1", "Offense");
	NflPlayers Kearse = new NflPlayers("Kearse, Jayron", "27", "ACT", "SAF", "TCKL 1, SCK 0.0, FF 0, INT --", "Defense");
	NflPlayers Kendricks = new NflPlayers("Kendricks, Eric", "54", "ACT", "MLB", "TCKL 6, SCK 0.0, FF 0, INT 1", "Defense");
	NflPlayers Kerin = new NflPlayers("Kerin, Zac", "67", "ACT", "OG", "G 0, GS 0", "Offense");
	NflPlayers Lamur = new NflPlayers("Lamur, Emmanuel", "59", "ACT", "LB", "TCKL 1, SCK 0.0, FF 0, INT --", "Defense");
	NflPlayers Line = new NflPlayers("Line, Zach", "48", "ACT", "FB", "CAR --, YDS --, AVG --, TDS --", "Offense");
	NflPlayers Locke = new NflPlayers("Locke, Jeff", "18", "ACT", "P", "PUNTS 3, AVG 37.7, LNG 51, IN 20 1", "Special Teams");
	NflPlayers McDermott = new NflPlayers("McDermott, Kevin", "47", "LS", "ACT", "G  1, GS  0", "Special Teams");
	NflPlayers McKinnon = new NflPlayers("McKinnon, Jerick", "21", "ACT", "RB", "CAR 1, YDS 6, AVG 6.0, TDS 0", "Offense");
	NflPlayers Morgan = new NflPlayers("Morgan, David", "89", "ACT", "TE", "REC --, YDS --, AVG --, TDS --", "Offense");
	NflPlayers Munnerlyn = new NflPlayers("Munnerlyn, Captain", "24", "ACT", "CB", "TCKL 0, SCK --, FF --, INT --", "Defense");
	NflPlayers Newman = new NflPlayers("Newman, Terence", "23", "ACT", "CB", "TCKL 7, SCK 0.0, FF 0, INT --", "Defense");
	NflPlayers Patterson = new NflPlayers("Patterson, Cordarrelle", "84", "ACT", "WR", "REC 1, YDS 6, AVG 6.0, TDS 0", "Offense");
	NflPlayers Peterson = new NflPlayers("Peterson, Adrian", "28", "ACT", "RB", "CAR 19, YDS 31, AVG 1.6, TDS 0", "Offense");	    
	NflPlayers Price = new NflPlayers("Price, Jabari", "25", "RES", "CB", "TCKL --, SCK --, FF --, INT --", "Defense");
    NflPlayers Pruitt = new NflPlayers("Pruitt, MyCole", "83", "ACT", "TE", "REC --, YDS --, AVG --, TDS --", "Offense");	    
    NflPlayers Rhodes = new NflPlayers("Rhodes, Xavier", "29", "ACT", "CB", "TCKL 0, SCK --, FF --, INT --", "Defense");
    NflPlayers Robinson = new NflPlayers("Robinson, Edmond", "51", "ACT", "OLB", "TCKL 0, SCK --, FF --, INT --", "Defense");
    NflPlayers Robison = new NflPlayers("Robison, Brian", "96", "ACT", "DE", "TCKL 2, SCK 0.0, FF 0, INT --", "Defense");
    NflPlayers Rudolph = new NflPlayers("Rudolph, Kyle", "82", "ACT", "TE", "REC 4, YDS 65, AVG 16.3, TDS 0", "Offense");
    NflPlayers Sendejo = new NflPlayers("Sendejo, Andrew", "34", "ACT", "SS", "TCKL 4, SCK 0.0, FF 0, INT --", "Defense");
    NflPlayers Sherels = new NflPlayers("Sherels, Marcus", "35", "ACT", "CB", "TCKL 1, SCK 0.0, FF 0, INT --", "Defense");	    
    NflPlayers Sirles = new NflPlayers("Sirles, Jeremiah", "78", "ACT", "OT", "G 0, GS 0", "Offense");	    
    NflPlayers aSmith = new NflPlayers("Smith, Andre", "71", "ACT", "OT",  "G 1, GS 1", "Offense");
    NflPlayers hSmith = new NflPlayers("Smith, Harrison", "22", "ACT", "FS", "TCKL 8, SCK 0.0, FF 0, INT --", "Defense");
	NflPlayers Stephen = new NflPlayers("Stephen, Shamar", "93", "ACT",  "DT", "TCKL  0 SCK --, FF --, INT --", "Defense");
	NflPlayers Thielen = new NflPlayers("Thielen, Adam", "19", "ACT", "WR", "REC 4, YDS 54, AVG 13.5, TDS 0", "Offense");
	NflPlayers Trattou = new NflPlayers("Trattou, Justin", "94", "ACT", "DE", "TCKL 0, SCK --, FF --, INT --", "Defense");
	NflPlayers Treadwell = new NflPlayers("Treadwell, Laquon", "11", "ACT", "WR", "REC --, YDS --, AVG --, TDS --", "Offense");
	NflPlayers Walsh = new NflPlayers("Walsh, Blair", "3", "ACT", "K", "FGA 6, FGM 4, PCT 66.7, LNG 50", "Special Teams");
	NflPlayers Waynes = new NflPlayers("Waynes, Trae", "26", "ACT", "CB", "TCKL 10, SCK 0.0, FF 0, INT --", "Defense");
	NflPlayers Wright = new NflPlayers("Wright, Jarius", "17", "ACT", "WR", "REC --, YDS --, AVG --, TDS --", "Offense");
	}
	
	else if(answer == 2){
		System.out.println("Name  " + "Number  " + " Status " + " Position " + " Stats ");
		System.out.println("------------------------------------------------------------------------------");
    NflDefense Alexander = new NflDefense("Alexander, Mackensie", "20", "ACT", "CB", "TCKL 0, SCK  --, FF --, INT --", "Defense");
    NflDefense Barr = new NflDefense("Barr, Anthony", "55", "ACT", "OLB", "TCKL 2, SCK 0.0, FF 0, INT --", "Defense");
    NflDefense Brothers = new NflDefense("Brothers, Kentrell", "40",  "ACT", "OLB", "TCKL 0, SCK --, FF --, INT --", "Defense");
    NflDefense Cole = new NflDefense("Cole, Audie", "57", "ACT", "MLB", "TCKL 0, SCK --, FF --, INT --", "Defense");
    NflDefense Crichton = new NflDefense("Crichton, Scott", "95", "RES", "DE", "TCKL  -- SCK  -- FF  -- INT  --", "Defense");
    NflDefense Exum = new NflDefense("Exum, Antone", "32", "RES", "CB", "TCKL --, SCK --, FF --, INT --", "Defense");
    NflDefense Floyd = new NflDefense("Floyd, Sharrif", "73", "ACT", "DT", "TCKL 0, SCK --, FF --, INT --", "Defense");
    NflDefense Greenway = new NflDefense("Greenway, Chad", "52", "ACT", "OLB", "TCKL 0, SCK --, FF --, INT --", "Defense");
    NflDefense Griffen = new NflDefense("Griffen, Everson", "97", "ACT", "DE", "TCKL 3, SCK 0.0, FF 0, INT --", "Defense");
    NflDefense Harris = new NflDefense("Harris, Anthony", "41", "ACT", "SS", "TCKL 0, SCK --, FF --, INT --", "Defense");
    NflDefense Hunter = new NflDefense("Hunter, Danielle", "99", "ACT", "DE", "TCKL 4, SCK 1.0, FF 0, INT  --", "Defense");
    NflDefense tJohnson = new NflDefense("Johnson, Tom", "92", "ACT", "DT", "TCKL 0, SCK --, FF --, INT --", "Defense");
    NflDefense Joseph = new NflDefense("Joseph, Linval", "98", "ACT", "DT", "TCKL 5, SCK 1.0, FF 1, INT --", "Defense");
    NflDefense Kearse = new NflDefense("Kearse, Jayron", "27", "ACT", "SAF", "TCKL 1, SCK 0.0, FF 0, INT --", "Defense");
    NflDefense Kendricks = new NflDefense("Kendricks, Eric", "54", "ACT", "MLB", "TCKL 6, SCK 0.0, FF 0, INT 1", "Defense");
    NflDefense Lamur = new NflDefense("Lamur, Emmanuel", "59", "ACT", "LB", "TCKL 1, SCK 0.0, FF 0, INT --", "Defense");
    NflDefense Munnerlyn = new NflDefense("Munnerlyn, Captain", "24", "ACT", "CB", "TCKL 0, SCK --, FF --, INT --", "Defense");
    NflDefense Newman = new NflDefense("Newman, Terence", "23", "ACT", "CB", "TCKL 7, SCK 0.0, FF 0, INT --", "Defense");
    NflDefense Price = new NflDefense("Price, Jabari", "25", "RES", "CB", "TCKL --, SCK --, FF --, INT --", "Defense");
    NflDefense Rhodes = new NflDefense("Rhodes, Xavier", "29", "ACT", "CB", "TCKL 0, SCK --, FF --, INT --", "Defense");
    NflDefense Robinson = new NflDefense("Robinson, Edmond", "51", "ACT", "OLB", "TCKL 0, SCK --, FF --, INT --", "Defense");
    NflDefense Robison = new NflDefense("Robison, Brian", "96", "ACT", "DE", "TCKL 2, SCK 0.0, FF 0, INT --", "Defense");
    NflDefense Sendejo = new NflDefense("Sendejo, Andrew", "34", "ACT", "SS", "TCKL 4, SCK 0.0, FF 0, INT --", "Defense");
    NflDefense Sherels = new NflDefense("Sherels, Marcus", "35", "ACT", "CB", "TCKL 1, SCK 0.0, FF 0, INT --", "Defense");
    NflDefense hSmith = new NflDefense("Smith, Harrison", "22", "ACT", "FS", "TCKL 8, SCK 0.0, FF 0, INT --", "Defense");
    NflDefense Stephen = new NflDefense("Stephen, Shamar", "93", "ACT",  "DT", "TCKL  0 SCK --, FF --, INT --", "Defense");
    NflDefense Trattou = new NflDefense("Trattou, Justin", "94", "ACT", "DE", "TCKL 0, SCK --, FF --, INT --", "Defense");
    NflDefense Waynes = new NflDefense("Waynes, Trae", "26", "ACT", "CB", "TCKL 10, SCK 0.0, FF 0, INT --", "Defense");
	}
	else if(answer == 3){
		System.out.println("Name  " + "Number  " + " Status " + " Position " + " Stats ");
		System.out.println("------------------------------------------------------------------------------");
		NflOffense Asiata = new NflOffense("Asiata, Matt", "44", "ACT","RB", "CAR 4, YDS 13, AVG 3.3, TDS 0", "Offense");
		NflOffense Berger = new NflOffense("Berger, Joe", "61", "ACT", "C", "G 1, GS 1", "Offense");
	    NflOffense Boone = new NflOffense("Boone, Alex", "76", "ACT", "OG", "G 1, GS 1", "Offense");
	    NflOffense Bradford = new NflOffense("Bradford, Sam", "8", "ACT", "QB", "TDS --, INT --, YDS --, RTG 0.0", "Offense");
	    NflOffense Bridgewater = new NflOffense("Bridgewater, Teddy", "5", "RES",  "QB", "TDS --, INT --, YDS --, RTG --", "Offense");
	    NflOffense Clemmings = new NflOffense("Clemmings, T.J.", "68", "ACT", "OT", "G 0, GS 0", "Offense");
	    NflOffense Diggs = new NflOffense("Diggs, Stefon", "14", "ACT", "WR", "REC 7, YDS 103, AVG 14.7, TDS 0", "Offense");
	    NflOffense Easton = new NflOffense("Easton, Nick", "62", "ACT", "C", "G 0, GS 0", "Offense");
	    NflOffense Ellison = new NflOffense("Ellison, Rhett", "85", "ACT", "TE", "REC --, YDS --, AVG --, TDS --", "Offense");
	    NflOffense Fusco = new NflOffense("Fusco, Brandon", "63", "ACT", "G", "G  1 GS  1", "Offense");
	    NflOffense Hill = new NflOffense("Hill, Shaun", "13", "ACT", "QB", "TDS 0, INT 0, YDS 236, RTG 77.3", "Offense");
	    NflOffense cJohnson = new NflOffense("Johnson, Charles", "12", "ACT", "WR", "REC  1 YDS  5 AVG  5.0 TDS  0", "Offense");
	    NflOffense Kalil = new NflOffense("Kalil, Matt", "75", "ACT", "T", "G 1, GS 1", "Offense");
	    NflOffense Kerin = new NflOffense("Kerin, Zac", "67", "ACT", "OG", "G 0, GS 0", "Offense");
	    NflOffense Line = new NflOffense("Line, Zach", "48", "ACT", "FB", "CAR --, YDS --, AVG --, TDS --", "Offense");
	    NflOffense McKinnon = new NflOffense("McKinnon, Jerick", "21", "ACT", "RB", "CAR 1, YDS 6, AVG 6.0, TDS 0", "Offense");
	    NflOffense Morgan = new NflOffense("Morgan, David", "89", "ACT", "TE", "REC --, YDS --, AVG --, TDS --", "Offense");
	    NflOffense Patterson = new NflOffense("Patterson, Cordarrelle", "84", "ACT", "WR", "REC 1, YDS 6, AVG 6.0, TDS 0", "Offense");
	    NflOffense Peterson = new NflOffense("Peterson, Adrian", "28", "ACT", "RB", "CAR 19, YDS 31, AVG 1.6, TDS 0", "Offense");
	    NflOffense Pruitt = new NflOffense("Pruitt, MyCole", "83", "ACT", "TE", "REC --, YDS --, AVG --, TDS --", "Offense");
	    NflOffense Rudolph = new NflOffense("Rudolph, Kyle", "82", "ACT", "TE", "REC 4, YDS 65, AVG 16.3, TDS 0", "Offense");
	    NflOffense Sirles = new NflOffense("Sirles, Jeremiah", "78", "ACT", "OT", "G 0, GS 0", "Offense");
	    NflOffense aSmith = new NflOffense("Smith, Andre", "71", "ACT", "OT",  "G 1, GS 1", "Offense");
	    NflOffense Thielen = new NflOffense("Thielen, Adam", "19", "ACT", "WR", "REC 4, YDS 54, AVG 13.5, TDS 0", "Offense");
	    NflOffense Treadwell = new NflOffense("Treadwell, Laquon", "11", "ACT", "WR", "REC --, YDS --, AVG --, TDS --", "Offense");
	    NflOffense Wright = new NflOffense("Wright, Jarius", "17", "ACT", "WR", "REC --, YDS --, AVG --, TDS --", "Offense");
	}
	else if(answer == 4){
		System.out.println("Name  " + "Number  " + " Status " + " Position " + " Stats ");
		System.out.println("------------------------------------------------------------------------------");
		NflPlayers Locke = new NflPlayers("Locke, Jeff", "18", "ACT", "P", "PUNTS 3, AVG 37.7, LNG 51, IN 20 1", "Special Teams");
		NflPlayers McDermott = new NflPlayers("McDermott, Kevin", "47", "LS", "ACT", "G  1, GS  0", "Special Teams");
		NflPlayers Walsh = new NflPlayers("Walsh, Blair", "3", "ACT", "K", "FGA 6, FGM 4, PCT 66.7, LNG 50", "Special Teams");
	}
	else System.out.println("Selection not valid, please try again.");
	}
	else if(menuOption.equals("Draft")){
		System.out.println("Please type the last name of the player you would like to draft, starting with a capital letter.");
		System.out.println("------------------------------------------------------------------------------");
		String draftPlayer = in.nextLine();
		System.out.println("Name  " + "Number  " + " Status " + " Position " + " Stats ");
		System.out.println("------------------------------------------------------------------------------");
		NflPlayers Alexander = new NflPlayers("Alexander, Mackensie", "20", "ACT", "CB", "TCKL 0, SCK  --, FF --, INT --", "Defense");
	    NflPlayers Asiata = new NflPlayers("Asiata, Matt", "44", "ACT","RB", "CAR 4, YDS 13, AVG 3.3, TDS 0", "Offense");
	    NflPlayers Barr = new NflPlayers("Barr, Anthony", "55", "ACT", "OLB", "TCKL 2, SCK 0.0, FF 0, INT --", "Defense");
	    NflPlayers Berger = new NflPlayers("Berger, Joe", "61", "ACT", "C", "G 1, GS 1", "Offense");
		NflPlayers Boone = new NflPlayers("Boone, Alex", "76", "ACT", "OG", "G 1, GS 1", "Offense");
		NflPlayers Bradford = new NflPlayers("Bradford, Sam", "8", "ACT", "QB", "TDS --, INT --, YDS --, RTG 0.0", "Offense");
		NflPlayers Bridgewater = new NflPlayers("Bridgewater, Teddy", "5", "RES",  "QB", "TDS --, INT --, YDS --, RTG --", "Offense");
		NflPlayers Brothers = new NflPlayers("Brothers, Kentrell", "40",  "ACT", "OLB", "TCKL 0, SCK --, FF --, INT --", "Defense");
		NflPlayers Clemmings = new NflPlayers("Clemmings, T.J.", "68", "ACT", "OT", "G 0, GS 0", "Offense");
		NflPlayers Cole = new NflPlayers("Cole, Audie", "57", "ACT", "MLB", "TCKL 0, SCK --, FF --, INT --", "Defense");
		NflPlayers Crichton = new NflPlayers("Crichton, Scott", "95", "RES", "DE", "TCKL  -- SCK  -- FF  -- INT  --", "Defense");
		NflPlayers Diggs = new NflPlayers("Diggs, Stefon", "14", "ACT", "WR", "REC 7, YDS 103, AVG 14.7, TDS 0", "Offense");
		NflPlayers Easton = new NflPlayers("Easton, Nick", "62", "ACT", "C", "G 0, GS 0", "Offense");
		NflPlayers Ellison = new NflPlayers("Ellison, Rhett", "85", "ACT", "TE", "REC --, YDS --, AVG --, TDS --", "Offense");
		NflPlayers Exum = new NflPlayers("Exum, Antone", "32", "RES", "CB", "TCKL --, SCK --, FF --, INT --", "Defense");
		NflPlayers Floyd = new NflPlayers("Floyd, Sharrif", "73", "ACT", "DT", "TCKL 0, SCK --, FF --, INT --", "Defense");
		NflPlayers Fusco = new NflPlayers("Fusco, Brandon", "63", "ACT", "G", "G  1 GS  1", "Offense");
		NflPlayers Greenway = new NflPlayers("Greenway, Chad", "52", "ACT", "OLB", "TCKL 0, SCK --, FF --, INT --", "Defense");
		NflPlayers Griffen = new NflPlayers("Griffen, Everson", "97", "ACT", "DE", "TCKL 3, SCK 0.0, FF 0, INT --", "Defense");
		NflPlayers Harris = new NflPlayers("Harris, Anthony", "41", "ACT", "SS", "TCKL 0, SCK --, FF --, INT --", "Defense");
		NflPlayers Hill = new NflPlayers("Hill, Shaun", "13", "ACT", "QB", "TDS 0, INT 0, YDS 236, RTG 77.3", "Offense");
		NflPlayers Hunter = new NflPlayers("Hunter, Danielle", "99", "ACT", "DE", "TCKL 4, SCK 1.0, FF 0, INT  --", "Defense");
		NflPlayers cJohnson = new NflPlayers("Johnson, Charles", "12", "ACT", "WR", "REC  1 YDS  5 AVG  5.0 TDS  0", "Offense");
		NflPlayers tJohnson = new NflPlayers("Johnson, Tom", "92", "ACT", "DT", "TCKL 0, SCK --, FF --, INT --", "Defense");
		NflPlayers Joseph = new NflPlayers("Joseph, Linval", "98", "ACT", "DT", "TCKL 5, SCK 1.0, FF 1, INT --", "Defense");
		NflPlayers Kalil = new NflPlayers("Kalil, Matt", "75", "ACT", "T", "G 1, GS 1", "Offense");
		NflPlayers Kearse = new NflPlayers("Kearse, Jayron", "27", "ACT", "SAF", "TCKL 1, SCK 0.0, FF 0, INT --", "Defense");
		NflPlayers Kendricks = new NflPlayers("Kendricks, Eric", "54", "ACT", "MLB", "TCKL 6, SCK 0.0, FF 0, INT 1", "Defense");
		NflPlayers Kerin = new NflPlayers("Kerin, Zac", "67", "ACT", "OG", "G 0, GS 0", "Offense");
		NflPlayers Lamur = new NflPlayers("Lamur, Emmanuel", "59", "ACT", "LB", "TCKL 1, SCK 0.0, FF 0, INT --", "Defense");
		NflPlayers Line = new NflPlayers("Line, Zach", "48", "ACT", "FB", "CAR --, YDS --, AVG --, TDS --", "Offense");
		NflPlayers Locke = new NflPlayers("Locke, Jeff", "18", "ACT", "P", "PUNTS 3, AVG 37.7, LNG 51, IN 20 1", "Special Teams");
		NflPlayers McDermott = new NflPlayers("McDermott, Kevin", "47", "LS", "ACT", "G  1, GS  0", "Special Teams");
		NflPlayers McKinnon = new NflPlayers("McKinnon, Jerick", "21", "ACT", "RB", "CAR 1, YDS 6, AVG 6.0, TDS 0", "Offense");
		NflPlayers Morgan = new NflPlayers("Morgan, David", "89", "ACT", "TE", "REC --, YDS --, AVG --, TDS --", "Offense");
		NflPlayers Munnerlyn = new NflPlayers("Munnerlyn, Captain", "24", "ACT", "CB", "TCKL 0, SCK --, FF --, INT --", "Defense");
		NflPlayers Newman = new NflPlayers("Newman, Terence", "23", "ACT", "CB", "TCKL 7, SCK 0.0, FF 0, INT --", "Defense");
		NflPlayers Patterson = new NflPlayers("Patterson, Cordarrelle", "84", "ACT", "WR", "REC 1, YDS 6, AVG 6.0, TDS 0", "Offense");
		NflPlayers Peterson = new NflPlayers("Peterson, Adrian", "28", "ACT", "RB", "CAR 19, YDS 31, AVG 1.6, TDS 0", "Offense");	    
		NflPlayers Price = new NflPlayers("Price, Jabari", "25", "RES", "CB", "TCKL --, SCK --, FF --, INT --", "Defense");
	    NflPlayers Pruitt = new NflPlayers("Pruitt, MyCole", "83", "ACT", "TE", "REC --, YDS --, AVG --, TDS --", "Offense");	    
	    NflPlayers Rhodes = new NflPlayers("Rhodes, Xavier", "29", "ACT", "CB", "TCKL 0, SCK --, FF --, INT --", "Defense");
	    NflPlayers Robinson = new NflPlayers("Robinson, Edmond", "51", "ACT", "OLB", "TCKL 0, SCK --, FF --, INT --", "Defense");
	    NflPlayers Robison = new NflPlayers("Robison, Brian", "96", "ACT", "DE", "TCKL 2, SCK 0.0, FF 0, INT --", "Defense");
	    NflPlayers Rudolph = new NflPlayers("Rudolph, Kyle", "82", "ACT", "TE", "REC 4, YDS 65, AVG 16.3, TDS 0", "Offense");
	    NflPlayers Sendejo = new NflPlayers("Sendejo, Andrew", "34", "ACT", "SS", "TCKL 4, SCK 0.0, FF 0, INT --", "Defense");
	    NflPlayers Sherels = new NflPlayers("Sherels, Marcus", "35", "ACT", "CB", "TCKL 1, SCK 0.0, FF 0, INT --", "Defense");	    
	    NflPlayers Sirles = new NflPlayers("Sirles, Jeremiah", "78", "ACT", "OT", "G 0, GS 0", "Offense");	    
	    NflPlayers aSmith = new NflPlayers("Smith, Andre", "71", "ACT", "OT",  "G 1, GS 1", "Offense");
	    NflPlayers hSmith = new NflPlayers("Smith, Harrison", "22", "ACT", "FS", "TCKL 8, SCK 0.0, FF 0, INT --", "Defense");
		NflPlayers Stephen = new NflPlayers("Stephen, Shamar", "93", "ACT",  "DT", "TCKL  0 SCK --, FF --, INT --", "Defense");
		NflPlayers Thielen = new NflPlayers("Thielen, Adam", "19", "ACT", "WR", "REC 4, YDS 54, AVG 13.5, TDS 0", "Offense");
		NflPlayers Trattou = new NflPlayers("Trattou, Justin", "94", "ACT", "DE", "TCKL 0, SCK --, FF --, INT --", "Defense");
		NflPlayers Treadwell = new NflPlayers("Treadwell, Laquon", "11", "ACT", "WR", "REC --, YDS --, AVG --, TDS --", "Offense");
		NflPlayers Walsh = new NflPlayers("Walsh, Blair", "3", "ACT", "K", "FGA 6, FGM 4, PCT 66.7, LNG 50", "Special Teams");
		NflPlayers Waynes = new NflPlayers("Waynes, Trae", "26", "ACT", "CB", "TCKL 10, SCK 0.0, FF 0, INT --", "Defense");
		NflPlayers Wright = new NflPlayers("Wright, Jarius", "17", "ACT", "WR", "REC --, YDS --, AVG --, TDS --", "Offense");
	}
	else if(menuOption.equals("Challenge")){
		System.out.println("Friends list");
		System.out.println("------------");
		System.out.println("This option is currently under development");
	}
	else if(menuOption.equals("Weekly Results")){
		System.out.println("Wins  " + "Losses  " + "Overall  " );
		System.out.println("0   " + "  0   " + "     0  ");
	}
}
}