package resolution;

import java.io.File;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;

import beans.House;
import utils.FlatFileReader;

public class Day3 {







	public static void main(String[] args) throws Exception {


		part1();




	}

	protected static int nombreDeMaisonsVisitees(String ligne) throws Exception {
		char[] instructions=ligne.toCharArray();

		Set<House> maisons=new HashSet<House>();
		House maison0=new House(0,0);
		maisons.add(maison0);
		House maisonPrecedente=maison0;

		for (char c : instructions) {
			House maison=new House();

			switch (c) {
			case '^':
				maison.setX(maisonPrecedente.getX());
				maison.setY(maisonPrecedente.getY()+1);
				maisonPrecedente=maison;
				maisons.add(maison);
				break;

			case '>':
				maison.setX(maisonPrecedente.getX()+1);
				maison.setY(maisonPrecedente.getY());
				maisonPrecedente=maison;
				maisons.add(maison);
				break;
			case '<':
				maison.setX(maisonPrecedente.getX()-1);
				maison.setY(maisonPrecedente.getY());
				maisonPrecedente=maison;
				maisons.add(maison);
				break;
			case 'v':
				maison.setX(maisonPrecedente.getX());
				maison.setY(maisonPrecedente.getY()-1);
				maisonPrecedente=maison;
				maisons.add(maison);
				break;


			default:
				throw new Exception("charactere non prevu:"+c);



			}

		}
		return maisons.size();
	}

	private static void part1() throws Exception {
		File file=FlatFileReader.getFileByName("2015_input1_day3");

		String ligne = Files.readString(file.toPath());

		int nbMaisons = nombreDeMaisonsVisitees(ligne);

		System.out.println("nombre de maisons:"+nbMaisons);

	}



}
