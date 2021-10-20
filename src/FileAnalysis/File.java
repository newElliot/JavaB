package FileAnalysis;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {

	public static void main(String[] args) {
		Path dir = Paths.get("C:\\Users\\minht\\.m2\\repository");

	    try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
	    	int count = 0;
	        for (Path p : stream) {
	        	if(Files.walk(p).mapToLong( x -> x.toFile().length() ).sum() > 1000000000) {
	        		count++;
	        		long size = Files.walk(p).mapToLong( x -> x.toFile().length() ).sum();
	        		System.out.println(p + " --- size: " + size);
	        	}
	            
	        }
	        System.out.println("Total: " + count);
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    }

	}
	
	public static String formatSize(long v) {
	    if (v < 1024) return v + " B";
	    int z = (63 - Long.numberOfLeadingZeros(v)) / 10;
	    return String.format("%.1f %sB", (double)v / (1L << (z*10)), " KMGTPE".charAt(z));
	}
	
	public static String humanReadableByteCount(long bytes, boolean si) {
	    int unit = si ? 1000 : 1024;
	    if (bytes < unit) return bytes + " B";
	    int exp = (int) (Math.log(bytes) / Math.log(unit));
	    String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp-1) + (si ? "" : "i");
	    return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
	}


}
