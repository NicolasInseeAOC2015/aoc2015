package resolution;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import utils.FlatFileReader;

public final class Day1 {

	public static void main(String[] args) throws IOException {
		
		part2();
		
		
		

	}

	protected static void part1() throws IOException {
		Integer resultat=null;
		File file=FlatFileReader.getFileByName("2015_input1_day1");
		String input = FileUtils.readFileToString(file,Charset.forName("UTF-8"));
		
			
			
			int ups=StringUtils.countMatches(input, "(");
			int downs=StringUtils.countMatches(input, ")");
			
			resultat=ups-downs;
			
	
		
		System.out.println("resultat="+resultat.toString());
	}
	
	
	protected static void part2() throws IOException {
		
		
		File file=FlatFileReader.getFileByName("2015_input1_day1");
		String uneLigne = FileUtils.readFileToString(file,Charset.forName("UTF-8"));
		
		int position=trouverPosition(uneLigne);
		
		System.out.println("position:"+position);
		
		
	}

	protected static int trouverPosition(String uneLigne) {
		int position=0;
		int etage=0;
		
		while (etage > -1) {
			String evolution=uneLigne.substring(0, 1);
			position=position +1;
			if (evolution.equals("(")) {
				etage=etage+1;
			} else {
				etage=etage-1;

			}
			uneLigne=uneLigne.substring(1);


		}
		return position;
	}

}
