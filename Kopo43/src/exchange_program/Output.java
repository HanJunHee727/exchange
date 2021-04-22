package exchange_program;

public class Output {
    
	   public static void printUSD(int usd, int dollar100, int dollar50, int dollar10, 
	                        int dollar5, int dollar2, int dollar1, int changeUSD) {
	      System.out.println("달러 환전 결과");
	      System.out.println("달러 지급 : " + usd + " 달러");
	      System.out.println("100달러 - " + dollar100);
	      System.out.println("50달러 - " + dollar50);
	      System.out.println("10달러 - " + dollar10);
	      System.out.println("5달러 - " + dollar5);
	      System.out.println("2달러 - " + dollar2);
	      System.out.println("1달러 - " + dollar1);
	      Processing.koreaChange(changeUSD);
	   }
	   public static void printEUR(int euro, int euro100, int euro50, int euro10,
	                        int euro5, int euro2, int euro1, int changeEUR) {
	      System.out.println("유로 환전 결과");
	      System.out.println("유로 지급 : " + euro + " 유로");
	      System.out.println("100유로 - " + euro100);
	      System.out.println("50유로 - " + euro50);
	      System.out.println("10유로 - " + euro10);
	      System.out.println("5유로 - " + euro5);
	      System.out.println("2유로 - " + euro2);
	      System.out.println("1유로 - " + euro1);
	      Processing.koreaChange(changeEUR);
	   }
	   public static void printJPY(int en, int en100, int en50, int en10,
	                        int en5, int en2, int en1, int changeJPY) {
	      System.out.println("엔화 환전 결과");
	      System.out.println("엔화 지급 : " + en + " 엔");
	      System.out.println("100엔 - " + en100);
	      System.out.println("50엔 - " + en50);
	      System.out.println("10엔 - " + en10);
	      System.out.println("5엔 - " + en5);
	      System.out.println("2엔 - " + en2);
	      System.out.println("1엔 - " + en1);
	      Processing.koreaChange(changeJPY);
	   } 
	      
	   public static void printKchange(int totalchange, int won1000, int won500, 
	                           int won100, int won50, int won10) {
	      System.out.println("원화 거스름 : " + totalchange + " 원");
	      System.out.println("1000원 - " + won1000 + " 원");
	      System.out.println("500원 - " + won500 + " 원");
	      System.out.println("100원 - " + won100 + " 원");
	      System.out.println("50원 - " + won50 + " 원");
	      System.out.println("10원 - " + won10 + " 원");
	   }
	}

