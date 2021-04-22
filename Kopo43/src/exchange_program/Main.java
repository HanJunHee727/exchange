package exchange_program;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		File_processor fp = new File_processor();
		Output output = new Output();
	    Exchange_Type exType;
	      
	    Processing pc = new Processing();
	    Input input = new Input();
	    fp.headerWrite();
	    do {
	    	exType = new Exchange_Type();
	        exType.w = input.inputWon();
	        exType.type = input.inputType();
	         
	        if (exType.type == Constant.EX_TYPE_QUIT) {
	        	break;
	        } else if(exType.type == Constant.EX_TYPE_USD) {   
	            exType.exchange_type = "USD";
	            exType.cw = (int)(exType.w / Constant.EX_USD);
	            exType.returnwon = ((int)((exType.w / Constant.EX_USD - exType.cw) * Constant.EX_USD / 10)) * 10;
	            pc.exchangeUSD(exType.w);
	         
	        } else if(exType.type == Constant.EX_TYPE_EUR) {
	        	exType.exchange_type = "EU";
		        exType.cw = (int)(exType.w / Constant.EX_EUR);
		        exType.returnwon = ((int)((exType.w / Constant.EX_EUR - exType.cw) * Constant.EX_EUR / 10)) * 10;
		        pc.exchangeEUR(exType.w);
	        } else if(exType.type == Constant.EX_TYPE_JPY) {
	        	exType.exchange_type = "JPY";
			    exType.cw = (int)(exType.w / Constant.EX_JPY);
			    exType.returnwon = ((int)((exType.w / Constant.EX_JPY - exType.cw) * Constant.EX_JPY / 10)) * 10;
			    pc.exchangeJPY(exType.w);
	        } else {
	            System.out.println("잘못 입력하셨습니다.");
	        }   
	        fp.FileWrite(exType.exchange_type, exType.w, (int)exType.cw, exType.returnwon);
	    } while (exType.type != Constant.EX_TYPE_QUIT);
	    	fp.fileClose();
	}
}

