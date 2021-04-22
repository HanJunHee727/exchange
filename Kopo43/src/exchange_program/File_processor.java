package exchange_program;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class File_processor {
	private FileWriter fw;
	private boolean isFileExist;
	
	public File_processor() {
		try {
			File file = new File("C:\\Users\\apf_temp_admin\\Desktop\\exchange_program.csv");
			if(file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			fw = new FileWriter("C:\\Users\\apf_temp_admin\\Desktop\\exchange_program.csv", true);					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void headerWrite() throws IOException {
		if(isFileExist == false) {
			String head = "날짜," + "환전대상," + "금액(원)," + "환전결과(해당 국가 금액)," + "거스름돈(원)" + "\n";
			fw.write(head);
		}		
	}
	
	public void FileWrite(String exchange_type, double w, double cw, int returnwon) throws IOException {
		Exchange_Type exType = new Exchange_Type();
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY-MM-dd");
		fw.write(sdt.format(calt.getTime()) + ",");
		String result = exType.exchange_type + "," + exType.w + "," + exType.cw + "," + exType.returnwon + "\n";
		fw.write(result);
		
	}
}	
