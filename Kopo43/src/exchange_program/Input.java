package exchange_program;

import java.util.Scanner;

public class Input {
	public static Scanner scanner = new Scanner(System.in);
	
	   Input() {
	      scanner = new Scanner(System.in);
	   }
	   public double inputWon() {
	      double w;
	      System.out.print("받은 원화 입력 : ");
	      w = scanner.nextDouble();
	      return w;
	   }
	   public int inputType() {
	      int type;
	      System.out.print("환전할 종류 선택 (0:종료, 1:USD, 2:EUR, 3:JPY) ? ");
	      type = scanner.nextInt();
	      return type;
	   }
	}
