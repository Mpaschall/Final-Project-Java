import java.util.*;

public class NflPlayerManager {
public static void main(String[] args){
  
    NflPlayers Alexander = new NflPlayers("Alexander, Mackensie", "20", "ACT", "CB", "TCKL 0, SCK  --, FF --, INT --");
    NflPlayers Asiata = new NflPlayers("Asiata, Matt", "44", "ACT","RB", "CAR 4, YDS 13, AVG 3.3, TDS 0" );
    NflPlayers Barr = new NflPlayers("Barr, Anthony", "55", "ACT", "OLB", "TCKL 2, SCK 0.0, FF 0, INT --");
    NflPlayers Berger = new NflPlayers("Berger, Joe", "61", "ACT", "C", "G 1, GS 1");
    NflPlayers Boone = new NflPlayers("Boone, Alex", "76", "ACT", "OG", "G 1, GS 1");
    NflPlayers Bradford = new NflPlayers("Bradford, Sam", "8", "ACT", "QB", "TDS --, INT --, YDS --, RTG 0.0");
    NflPlayers Bridgewater = new NflPlayers("Bridgewater, Teddy", "5", "RES",  "QB", "TDS --, INT --, YDS --, RTG --");
    NflPlayers Brothers = new NflPlayers("Brothers, Kentrell", "40",  "ACT", "OLB", "TCKL 0, SCK --, FF --, INT --" );
    NflPlayers Clemmings = new NflPlayers("Clemmings, T.J.", "68", "ACT", "OT", "G 0, GS 0");
    NflPlayers Cole = new NflPlayers("Cole, Audie", "57", "ACT", "MLB", "TCKL 0, SCK --, FF --, INT --");
    NflPlayers Crichton = new NflPlayers("Crichton, Scott", "95", "RES", "DE", "TCKL  -- SCK  -- FF  -- INT  --");
    NflPlayers Diggs = new NflPlayers("Diggs, Stefon", "14", "ACT", "WR", "REC 7, YDS 103, AVG 14.7, TDS 0");
    NflPlayers Easton = new NflPlayers("Easton, Nick", "62", "ACT", "C", "G 0, GS 0");
    NflPlayers Ellison = new NflPlayers("Ellison, Rhett", "85", "ACT", "TE", "REC --, YDS --, AVG --, TDS --" );
    NflPlayers Exum = new NflPlayers("Exum, Antone", "32", "RES", "CB", "TCKL --, SCK --, FF --, INT --" );
    NflPlayers Floyd = new NflPlayers("Floyd, Sharrif", "73", "ACT", "DT", "TCKL 0, SCK --, FF --, INT --");
    NflPlayers Fusco = new NflPlayers("Fusco, Brandon", "63", "ACT", "G", "G  1 GS  1");
    NflPlayers Greenway = new NflPlayers("Greenway, Chad", "52", "ACT", "OLB", "TCKL 0, SCK --, FF --, INT --");
    NflPlayers Griffen = new NflPlayers("Griffen, Everson", "97", "ACT", "DE", "TCKL 3, SCK 0.0, FF 0, INT --");
    NflPlayers Harris = new NflPlayers("Harris, Anthony", "41", "ACT", "SS", "TCKL 0, SCK --, FF --, INT --");
    NflPlayers Hill = new NflPlayers("Hill, Shaun", "13", "ACT", "QB", "TDS 0, INT 0, YDS 236, RTG 77.3");
    NflPlayers Hunter = new NflPlayers("Hunter, Danielle", "99", "ACT", "DE", "TCKL 4, SCK 1.0, FF 0, INT  --");
    NflPlayers cJohnson = new NflPlayers("Johnson, Charles", "12", "ACT", "WR", "REC  1 YDS  5 AVG  5.0 TDS  0");
    NflPlayers tJohnson = new NflPlayers("Johnson, Tom", "92", "ACT", "DT", "TCKL 0, SCK --, FF --, INT --");
    NflPlayers Joseph = new NflPlayers("Joseph, Linval", "98", "ACT", "DT", "TCKL 5, SCK 1.0, FF 1, INT --");
    NflPlayers Kalil = new NflPlayers("Kalil, Matt", "75", "ACT", "T", "G 1, GS 1");
    NflPlayers Kearse = new NflPlayers("Kearse, Jayron", "27", "ACT", "SAF", "TCKL 1, SCK 0.0, FF 0, INT --");
    NflPlayers Kendricks = new NflPlayers("Kendricks, Eric", "54", "ACT", "MLB", "TCKL 6, SCK 0.0, FF 0, INT 1");
    NflPlayers Kerin = new NflPlayers("Kerin, Zac", "67", "ACT", "OG", "G 0, GS 0");
    NflPlayers Lamur = new NflPlayers("Lamur, Emmanuel", "59", "ACT", "LB", "TCKL 1, SCK 0.0, FF 0, INT --");
    NflPlayers Line = new NflPlayers("Line, Zach", "48", "ACT", "FB", "CAR --, YDS --, AVG --, TDS --");
    NflPlayers Locke = new NflPlayers("Locke, Jeff", "18", "ACT", "P", "PUNTS 3, AVG 37.7, LNG 51, IN 20 1");
    NflPlayers McDermott = new NflPlayers("McDermott, Kevin", "47", "LS", "ACT", "G  1, GS  0");
    NflPlayers McKinnon = new NflPlayers("McKinnon, Jerick", "21", "ACT", "RB", "CAR 1, YDS 6, AVG 6.0, TDS 0");
    NflPlayers Morgan = new NflPlayers("Morgan, David", "89", "ACT", "TE", "REC --, YDS --, AVG --, TDS --");
    NflPlayers Munnerlyn = new NflPlayers("Munnerlyn, Captain", "24", "ACT", "CB", "TCKL 0, SCK --, FF --, INT --");
    NflPlayers Newman = new NflPlayers("Newman, Terence", "23", "ACT", "CB", "TCKL 7, SCK 0.0, FF 0, INT --");
    NflPlayers Patterson = new NflPlayers("Patterson, Cordarrelle", "84", "ACT", "WR", "REC 1, YDS 6, AVG 6.0, TDS 0");
    NflPlayers Peterson = new NflPlayers("Peterson, Adrian", "28", "ACT", "RB", "CAR 19, YDS 31, AVG 1.6, TDS 0");
    NflPlayers Price = new NflPlayers("Price, Jabari", "25", "RES", "CB", "TCKL --, SCK --, FF --, INT --");
    NflPlayers Pruitt = new NflPlayers("Pruitt, MyCole", "83", "ACT", "TE", "REC --, YDS --, AVG --, TDS --");
    NflPlayers Rhodes = new NflPlayers("Rhodes, Xavier", "29", "ACT", "CB", "TCKL 0, SCK --, FF --, INT --" );
    NflPlayers Robinson = new NflPlayers("Robinson, Edmond", "51", "ACT", "OLB", "TCKL 0, SCK --, FF --, INT --" );
    NflPlayers Robison = new NflPlayers("Robison, Brian", "96", "ACT", "DE", "TCKL 2, SCK 0.0, FF 0, INT --");
    NflPlayers Rudolph = new NflPlayers("Rudolph, Kyle", "82", "ACT", "TE", "REC 4, YDS 65, AVG 16.3, TDS 0");
    NflPlayers Sendejo = new NflPlayers("Sendejo, Andrew", "34", "ACT", "SS", "TCKL 4, SCK 0.0, FF 0, INT --");
    NflPlayers Sherels = new NflPlayers("Sherels, Marcus", "35", "ACT", "CB", "TCKL 1, SCK 0.0, FF 0, INT --");
    NflPlayers Sirles = new NflPlayers("Sirles, Jeremiah", "78", "ACT", "OT", "G 0, GS 0");
    NflPlayers aSmith = new NflPlayers("Smith, Andre", "71", "ACT", "OT",  "G 1, GS 1");
    NflPlayers hSmith = new NflPlayers("Smith, Harrison", "22", "ACT", "FS", "TCKL 8, SCK 0.0, FF 0, INT --");
    NflPlayers Stephen = new NflPlayers("Stephen, Shamar", "93", "ACT",  "DT", "TCKL  0 SCK --, FF --, INT --");
    NflPlayers Thielen = new NflPlayers("Thielen, Adam", "19", "ACT", "WR", "REC 4, YDS 54, AVG 13.5, TDS 0");
    NflPlayers Trattou = new NflPlayers("Trattou, Justin", "94", "ACT", "DE", "TCKL 0, SCK --, FF --, INT --");
    NflPlayers Treadwell = new NflPlayers("Treadwell, Laquon", "11", "ACT", "WR", "REC --, YDS --, AVG --, TDS --");
    NflPlayers Walsh = new NflPlayers("Walsh, Blair", "3", "ACT", "K", "FGA 6, FGM 4, PCT 66.7, LNG 50");
    NflPlayers Waynes = new NflPlayers("Waynes, Trae", "26", "ACT", "CB", "TCKL 10, SCK 0.0, FF 0, INT --");
    NflPlayers Wright = new NflPlayers("Wright, Jarius", "17", "ACT", "WR", "REC --, YDS --, AVG --, TDS --");
   
}
}