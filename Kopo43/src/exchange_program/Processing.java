package exchange_program;

import java.util.Scanner;

public class Processing {
	   public static Scanner s = new Scanner(System.in);   
	   static double won;
	   static int type;
	   static double USDResult;
	   static double EURResult;
	   static double JPYResult;
	   static int usd;
	   static int euro;
	   static int en;
	   static double kchange_USD;
	   static double kchange_EUR;
	   static double kchange_JPY;
	   static int changeUSD; 
	   static int changeEUR;
	   static int changeJPY;
	   public static Output out = new Output();
	   
	   public static void exchangeUSD(double won) {
	      USDResult = won / Constant.EX_USD;
	      usd = (int)USDResult;
	      kchange_USD = (USDResult - usd)*Constant.EX_USD/10;
	      changeUSD = (int)kchange_USD;
	      
	      int dollar100 = usd/100;
	      int dollar50 = usd%100/50;
	      int dollar10 = usd%100%50/10;
	      int dollar5 = usd%100%50%10/5;
	      int dollar2 = usd%100%50%10%5/2;
	      int dollar1 = usd%100%50%10%5%2/1;   
	      
	      Output.printUSD(usd, dollar100, dollar50, dollar10, dollar5, dollar2, dollar1, changeUSD); 
	   }
	   public static void exchangeEUR(double won) {
	      EURResult = won / Constant.EX_EUR;
	      euro = (int)EURResult;
	      kchange_EUR = (EURResult - euro)*Constant.EX_EUR/10;
	      changeEUR = (int)kchange_EUR;
	      
	      int euro100 = euro/100;
	      int euro50 = euro%100/50;
	      int euro10 = euro%100%50/10;
	      int euro5 = euro%100%50%10/5;
	      int euro2 = euro%100%50%10%5/2;
	      int euro1 = euro%100%50%10%5%2/1;
	      
	      Output.printEUR(euro, euro100, euro50, euro10, euro5, euro2, euro1, changeEUR);
	   }
	   public static void exchangeJPY(double won) {
	      JPYResult = won / Constant.EX_JPY;
	      en = (int)JPYResult;
	      kchange_JPY = (JPYResult - en)*Constant.EX_JPY/10;
	      changeJPY = (int)kchange_JPY;
	      
	      int en100 = en/100;
	      int en50 = en%100/50;
	      int en10 = en%100%50/10;
	      int en5 = en%100%50%10/5;
	      int en2 = en%100%50%10%5/2;
	      int en1 = en%100%50%10%5%2/1;
	      
	      Output.printJPY(en, en100, en50, en10, en5, en2, en1, changeJPY);
	   }
	   public static void koreaChange(int change) {
	      int totalchange = change*10;
	      int won1000 = change*10/1000;
	      int won500 = change*10%1000/500;
	      int won100 = change*10%1000%500/100;
	      int won50 = change*10%1000%500%100/50;
	      int won10 = change*10%1000%500%100%50/10;
	      
	      Output.printKchange(totalchange, won1000, won500, won100, won50, won10);
	   }   
	}

