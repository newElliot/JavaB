package DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AMPM {
	public static void main(String[] args) {
		
		String dateTimeFormat = "HH:MM:SS a";
		SimpleDateFormat format = new SimpleDateFormat(dateTimeFormat);
		System.out.print(format.format(new Date()));
	}
}
