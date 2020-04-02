package utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FlatFileReader {
	
	
	public static List<String> readLinesOfFile(String filename) throws IOException{
			
		URL fileUrl=FlatFileReader.class.getClassLoader().getResource(filename);
		File file=new File(fileUrl.getFile());
		
		List<String> retour;
	retour = FileUtils.readLines(file, Charset.forName("UTF-8"));
						
		return retour;
		
		
	}
	
	public static File getFileByName(String fileName) {
		
		URL fileUrl=FlatFileReader.class.getClassLoader().getResource(fileName);
		File file=new File(fileUrl.getFile());
		return file;
		
		
		
	}
	
}