package exchange_program;

import java.util.Scanner;

public class Input {
	public static Scanner scanner = new Scanner(System.in);
	
	   Input() {
	      scanner = new Scanner(System.in);
	   }
	   public double inputWon() {
	      double w;
	      System.out.print("���� ��ȭ �Է� : ");
	      w = scanner.nextDouble();
	      return w;
	   }
	   public int inputType() {
	      int type;
	      System.out.print("ȯ���� ���� ���� (0:����, 1:USD, 2:EUR, 3:JPY) ? ");
	      type = scanner.nextInt();
	      return type;
	   }
	}
