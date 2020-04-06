package resolution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import utils.FlatFileReader;

public final class Day2 {


	static class Paquet{

		int l;
		int w;
		int h;




		public Paquet() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Paquet(String dimensions) {

			String[] split = StringUtils.split(dimensions, "x");
			this.l=Integer.valueOf(split[0]);
			this.w=Integer.valueOf(split[1]);
			this.h=Integer.valueOf(split[2]);

		}

		int getRibbonNeeded() {



			return getSmallestPerimeter()+(l*w*h);


		}

		protected int getSmallestPerimeter() {
			List<Integer> dimensions=new ArrayList<Integer>();
			dimensions.add(this.h);
			dimensions.add(this.w);
			dimensions.add(this.l);

			dimensions.sort(Comparator.naturalOrder());



			return 2*(dimensions.get(0)+dimensions.get(1));



		}


		int getSurfacePaperNeeded() {

			int surface=(2*l*w) + (2*w*h) + (2*h*l);

			int surface1=l*w;
			int surface2=w*h;
			int surface3=h*l;


			int surfaceMin=NumberUtils.min(surface1, surface2, surface3);

			return surface+surfaceMin;




		}



	}

	public static void main(String[] args) throws IOException {


		part2();




	}

	private static void part1() throws IOException {
		List<String> dimensionsList = FlatFileReader.readLinesOfFile("2015_input1_day2");
		int surfaceNeeded=0;
		for (String dimensions : dimensionsList) {
			Paquet paquet = new Paquet(dimensions);
			surfaceNeeded +=paquet.getSurfacePaperNeeded();


		}

		System.out.println("surface papier:"+surfaceNeeded);
	}


	private static void part2() throws IOException {
		List<String> dimensionsList = FlatFileReader.readLinesOfFile("2015_input1_day2");
		int ribbonNeeded=0;
		for (String dimensions : dimensionsList) {
			Paquet paquet = new Paquet(dimensions);
			ribbonNeeded +=paquet.getRibbonNeeded();


		}

		System.out.println("feet of ribbon:"+ribbonNeeded);


	}



}
