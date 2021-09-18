import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.Map;

import java.util.HashMap;

public class HashMapReadFile {

	public static void main(String[] args) {
		Map<String, String> map;
		try {
			map = getDataInLog("Thật nhiều");
			System.out.println("Text found: " + map);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static Map<String, String> getDataInLog(String lookFor) throws FileNotFoundException {
		Map<String, String> lineColMap = new HashMap<String, String>();
		
		File logFile = new File("H:\\docx.txt");
		BufferedReader br = new BufferedReader(new FileReader(logFile));

		int index = 0;
		try {
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);

				if (sCurrentLine.contains(lookFor)) {
					System.out.println(sCurrentLine);
					lineColMap.put(String.valueOf(index), sCurrentLine);
				}
				index += 1;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return lineColMap;
	}

	public static String getLast(Map<String, String> mapData) {
		int count = 1;
		String data = "";

		for (Map.Entry<String, String> it : mapData.entrySet()) {
			if (count == mapData.size()) {
				data = it.getValue();
			}
			count++;
		}

		return data;
	}
}
