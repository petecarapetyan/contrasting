package com.contrasting.random;

import java.util.ArrayList;
import java.util.List;

public class RandomProvider {


	public static String randomName() {
		return upLow(first().get(random200())) + " " + upLow(last().get(random100()));
	}

	private static int random100() {
		int random = (int) (Math.random() * 100);
		return random;
	}

	private static int random200() {
		int random = (int) (Math.random() * 200);
		return random;
	}

	public static int random1toMax(int max) {
		int random = 1;
		if (max > 1) {
			random = (int) (Math.random() * max);
			random++;
		}
		return random;
	}

	public static int random0toMax(int max) {
		int random = 0;
		if (max > 1) {
			random = (int) (Math.random() * (max+1));
		}
		return random;
	}

	/**
	 * If you want to return true 90% of the time, give this a 90 as a parameter
	 * 
	 * @param weightPercent
	 * @return
	 */
	public static boolean weightedToYesBoolean(int weightPercent) {
		if (weightPercent > 99) {
			throw new IllegalArgumentException(
					"weightPercent must be between 1 and 99, not "
							+ weightPercent);
		}
		boolean answer = true;
		int comparison = RandomProvider.random100();
		if (comparison > weightPercent) {
			answer = false;
		}
		return answer;
	}

	public static int weighted1or2or3(int one, int two, int three) {
		int answer = 1;
		int total = one + two + three;
		if (total != 100) {
			throw new IllegalArgumentException(
					"weight of one, two, and three must total 100, not "
							+ total);
		}
		if (weightedToYesBoolean(two)) {
			answer = 2;
		} else if (weightedToYesBoolean(three)) {
			answer = 3;
		}
		return answer;
	}

	public static int weighted1through10(int one, int two, int three, int four,
			int five, int six, int seven, int eight, int nine, int ten) {
		int answer = 1;
		int total = one + two + three + four + five + six + seven + eight
				+ nine + ten;
		if (total != 100) {
			throw new IllegalArgumentException(
					"weight of one, two, and three must total 100, not "
							+ total);
		}
		if (weightedToYesBoolean(two)) {
			answer = 2;
		} else if (weightedToYesBoolean(three)) {
			answer = 3;
		} else if (weightedToYesBoolean(four)) {
			answer = 4;
		} else if (weightedToYesBoolean(five)) {
			answer = 5;
		} else if (weightedToYesBoolean(six)) {
			answer = 6;
		} else if (weightedToYesBoolean(seven)) {
			answer = 7;
		} else if (weightedToYesBoolean(eight)) {
			answer = 8;
		} else if (weightedToYesBoolean(nine)) {
			answer = 9;
		} else if (weightedToYesBoolean(ten)) {
			answer = 10;
		}
		return answer;
	}
	public static String upLow(String var) {
		if (var == null | var.equals("")) {
			return " ";
		}
		String start = var.substring(0, 1);
		String finish = var.substring(1, var.length()).toLowerCase();
		return start.toUpperCase() + finish;
	}

	public static String weightedGroup(int bravo, int tango, int alpha,
			int delta) {
		String answer = "Bravo";
		int total = bravo + tango + alpha + delta;
		if (total != 100) {
			throw new IllegalArgumentException(
					"weight of one, two, and three must total 100, not "
							+ total);
		}
		if (weightedToYesBoolean(tango)) {
			answer = "Tango";
		} else if (weightedToYesBoolean(alpha)) {
			answer = "Alpha";
		} else if (weightedToYesBoolean(delta)) {
			answer = "Delta";
		}
		return answer;
	}

	private static List<String> first() {
		List<String> first = new ArrayList<String>();
		first.add("Jackson");
		first.add("Aiden");
		first.add("Liam");
		first.add("Lucas");
		first.add("Noah");
		first.add("Mason");
		first.add("Jayden");
		first.add("Ethan");
		first.add("Jacob");
		first.add("Jack");
		first.add("Caden");
		first.add("Logan");
		first.add("Benjamin");
		first.add("Michael");
		first.add("Caleb");
		first.add("Ryan");
		first.add("Alexander");
		first.add("Elijah");
		first.add("James");
		first.add("William");
		first.add("Oliver");
		first.add("Connor");
		first.add("Matthew");
		first.add("Daniel");
		first.add("Luke");
		first.add("Brayden");
		first.add("Jayce");
		first.add("Henry");
		first.add("Carter");
		first.add("Dylan");
		first.add("Gabriel");
		first.add("Joshua");
		first.add("Nicholas");
		first.add("Isaac");
		first.add("Owen");
		first.add("Nathan");
		first.add("Grayson");
		first.add("Eli");
		first.add("Landon");
		first.add("Andrew");
		first.add("Max");
		first.add("Samuel");
		first.add("Gavin");
		first.add("Wyatt");
		first.add("Christian");
		first.add("Hunter");
		first.add("Cameron");
		first.add("Evan");
		first.add("Charlie");
		first.add("David");
		first.add("Sebastian");
		first.add("Joseph");
		first.add("Dominic");
		first.add("Anthony");
		first.add("Colton");
		first.add("John");
		first.add("Tyler");
		first.add("Zachary");
		first.add("Thomas");
		first.add("Julian");
		first.add("Levi");
		first.add("Adam");
		first.add("Isaiah");
		first.add("Alex");
		first.add("Aaron");
		first.add("Parker");
		first.add("Cooper");
		first.add("Miles");
		first.add("Chase");
		first.add("Muhammad");
		first.add("Christopher");
		first.add("Blake");
		first.add("Austin");
		first.add("Jordan");
		first.add("Leo");
		first.add("Jonathan");
		first.add("Adrian");
		first.add("Colin");
		first.add("Hudson");
		first.add("Ian");
		first.add("Xavier");
		first.add("Camden");
		first.add("Tristan");
		first.add("Carson");
		first.add("Jason");
		first.add("Nolan");
		first.add("Riley");
		first.add("Lincoln");
		first.add("Brody");
		first.add("Bentley");
		first.add("Nathaniel");
		first.add("Josiah");
		first.add("Declan");
		first.add("Jake");
		first.add("Asher");
		first.add("Jeremiah");
		first.add("Cole");
		first.add("Mateo");
		first.add("Micah");
		first.add("Elliot");
		first.add("Sophia");
		first.add("Emma");
		first.add("Olivia");
		first.add("Isabella");
		first.add("Mia");
		first.add("Ava");
		first.add("Lily");
		first.add("Zoe");
		first.add("Emily");
		first.add("Chloe");
		first.add("Layla");
		first.add("Madison");
		first.add("Madelyn");
		first.add("Abigail");
		first.add("Aubrey");
		first.add("Charlotte");
		first.add("Amelia");
		first.add("Ella");
		first.add("Kaylee");
		first.add("Avery");
		first.add("Aaliyah");
		first.add("Hailey");
		first.add("Hannah");
		first.add("Addison");
		first.add("Riley");
		first.add("Harper");
		first.add("Aria");
		first.add("Arianna");
		first.add("Mackenzie");
		first.add("Lila");
		first.add("Evelyn");
		first.add("Adalyn");
		first.add("Grace");
		first.add("Brooklyn");
		first.add("Ellie");
		first.add("Anna");
		first.add("Kaitlyn");
		first.add("Isabelle");
		first.add("Sophie");
		first.add("Scarlett");
		first.add("Natalie");
		first.add("Leah");
		first.add("Sarah");
		first.add("Nora");
		first.add("Mila");
		first.add("Elizabeth");
		first.add("Lillian");
		first.add("Kylie");
		first.add("Audrey");
		first.add("Lucy");
		first.add("Maya");
		first.add("Annabelle");
		first.add("Makayla");
		first.add("Gabriella");
		first.add("Elena");
		first.add("Victoria");
		first.add("Claire");
		first.add("Savannah");
		first.add("Peyton");
		first.add("Maria");
		first.add("Alaina");
		first.add("Kennedy");
		first.add("Stella");
		first.add("Liliana");
		first.add("Allison");
		first.add("Samantha");
		first.add("Keira");
		first.add("Alyssa");
		first.add("Reagan");
		first.add("Molly");
		first.add("Alexandra");
		first.add("Violet");
		first.add("Charlie");
		first.add("Julia");
		first.add("Sadie");
		first.add("Ruby");
		first.add("Eva");
		first.add("Alice");
		first.add("Eliana");
		first.add("Taylor");
		first.add("Callie");
		first.add("Penelope");
		first.add("Camilla");
		first.add("Bailey");
		first.add("Kaelyn");
		first.add("Alexis");
		first.add("Kayla");
		first.add("Katherine");
		first.add("Sydney");
		first.add("Lauren");
		first.add("Jasmine");
		first.add("London");
		first.add("Bella");
		first.add("Adeline");
		first.add("Caroline");
		first.add("Vivian");
		first.add("Juliana");
		first.add("Gianna");
		first.add("Skyler");
		first.add("Jordyn");
		return first;
	}

	private static List<String> last() {
		List<String> last = new ArrayList<String>();
		last.add("SMITH");
		last.add("JOHNSON");
		last.add("WILLIAMS");
		last.add("JONES");
		last.add("BROWN");
		last.add("DAVIS");
		last.add("MILLER");
		last.add("WILSON");
		last.add("MOORE");
		last.add("TAYLOR");
		last.add("ANDERSON");
		last.add("THOMAS");
		last.add("JACKSON");
		last.add("WHITE");
		last.add("HARRIS");
		last.add("MARTIN");
		last.add("THOMPSON");
		last.add("GARCIA");
		last.add("MARTINEZ");
		last.add("ROBINSON");
		last.add("CLARK");
		last.add("RODRIGUEZ");
		last.add("LEWIS");
		last.add("LEE");
		last.add("WALKER");
		last.add("HALL");
		last.add("ALLEN");
		last.add("YOUNG");
		last.add("HERNANDEZ");
		last.add("KING");
		last.add("WRIGHT");
		last.add("LOPEZ");
		last.add("HILL");
		last.add("SCOTT");
		last.add("GREEN");
		last.add("ADAMS");
		last.add("BAKER");
		last.add("GONZALEZ");
		last.add("NELSON");
		last.add("CARTER");
		last.add("MITCHELL");
		last.add("PEREZ");
		last.add("ROBERTS");
		last.add("TURNER");
		last.add("PHILLIPS");
		last.add("CAMPBELL");
		last.add("PARKER");
		last.add("EVANS");
		last.add("EDWARDS");
		last.add("COLLINS");
		last.add("STEWART");
		last.add("SANCHEZ");
		last.add("MORRIS");
		last.add("ROGERS");
		last.add("REED");
		last.add("COOK");
		last.add("MORGAN");
		last.add("BELL");
		last.add("MURPHY");
		last.add("BAILEY");
		last.add("RIVERA");
		last.add("COOPER");
		last.add("RICHARDSON");
		last.add("COX");
		last.add("HOWARD");
		last.add("WARD");
		last.add("TORRES");
		last.add("PETERSON");
		last.add("GRAY");
		last.add("RAMIREZ");
		last.add("JAMES");
		last.add("WATSON");
		last.add("BROOKS");
		last.add("KELLY");
		last.add("SANDERS");
		last.add("PRICE");
		last.add("BENNETT");
		last.add("WOOD");
		last.add("BARNES");
		last.add("ROSS");
		last.add("HENDERSON");
		last.add("COLEMAN");
		last.add("JENKINS");
		last.add("PERRY");
		last.add("POWELL");
		last.add("LONG");
		last.add("PATTERSON");
		last.add("HUGHES");
		last.add("FLORES");
		last.add("WASHINGTON");
		last.add("BUTLER");
		last.add("SIMMONS");
		last.add("FOSTER");
		last.add("GONZALES");
		last.add("BRYANT");
		last.add("ALEXANDER");
		last.add("RUSSELL");
		last.add("GRIFFIN");
		last.add("DIAZ");
		last.add("HAYES");
		last.add("MYERS");
		last.add("FORD");
		last.add("HAMILTON");
		last.add("GRAHAM");
		last.add("SULLIVAN");
		last.add("WALLACE");
		last.add("WOODS");
		last.add("COLE");
		last.add("WEST");
		last.add("JORDAN");
		last.add("OWENS");
		last.add("REYNOLDS");
		last.add("FISHER");
		last.add("ELLIS");
		last.add("HARRISON");
		last.add("GIBSON");
		last.add("MCDONALD");
		last.add("CRUZ");
		last.add("MARSHALL");
		last.add("ORTIZ");
		last.add("GOMEZ");
		last.add("MURRAY");
		last.add("FREEMAN");
		last.add("WELLS");
		last.add("WEBB");
		last.add("SIMPSON");
		last.add("STEVENS");
		last.add("TUCKER");
		last.add("PORTER");
		last.add("HUNTER");
		last.add("HICKS");
		last.add("CRAWFORD");
		last.add("HENRY");
		last.add("BOYD");
		last.add("MASON");
		last.add("MORALES");
		last.add("KENNEDY");
		last.add("WARREN");
		last.add("DIXON");
		last.add("RAMOS");
		last.add("REYES");
		last.add("BURNS");
		last.add("GORDON");
		last.add("SHAW");
		last.add("HOLMES");
		last.add("RICE");
		last.add("ROBERTSON");
		last.add("HUNT");
		last.add("BLACK");
		last.add("DANIELS");
		last.add("PALMER");
		last.add("MILLS");
		last.add("NICHOLS");
		last.add("GRANT");
		last.add("KNIGHT");
		last.add("FERGUSON");
		last.add("ROSE");
		last.add("STONE");
		last.add("HAWKINS");
		last.add("DUNN");
		last.add("PERKINS");
		last.add("HUDSON");
		last.add("SPENCER");
		last.add("GARDNER");
		last.add("STEPHENS");
		last.add("PAYNE");
		last.add("PIERCE");
		last.add("BERRY");
		last.add("MATTHEWS");
		last.add("ARNOLD");
		last.add("WAGNER");
		last.add("WILLIS");
		last.add("RAY");
		last.add("WATKINS");
		last.add("OLSON");
		last.add("CARROLL");
		last.add("DUNCAN");
		last.add("SNYDER");
		last.add("HART");
		last.add("CUNNINGHAM");
		last.add("BRADLEY");
		last.add("LANE");
		last.add("ANDREWS");
		last.add("RUIZ");
		last.add("HARPER");
		last.add("FOX");
		last.add("RILEY");
		last.add("ARMSTRONG");
		last.add("CARPENTER");
		last.add("WEAVER");
		last.add("GREENE");
		last.add("LAWRENCE");
		last.add("ELLIOTT");
		last.add("CHAVEZ");
		last.add("SIMS");
		last.add("AUSTIN");
		last.add("PETERS");
		last.add("KELLEY");
		last.add("FRANKLIN");
		last.add("LAWSON");
		last.add("FIELDS");
		last.add("GUTIERREZ");
		last.add("RYAN");
		last.add("SCHMIDT");
		last.add("CARR");
		last.add("VASQUEZ");
		last.add("CASTILLO");
		last.add("WHEELER");
		last.add("CHAPMAN");
		last.add("OLIVER");
		last.add("MONTGOMERY");
		last.add("RICHARDS");
		last.add("WILLIAMSON");
		last.add("JOHNSTON");
		last.add("BANKS");
		last.add("MEYER");
		last.add("BISHOP");
		last.add("MCCOY");
		last.add("HOWELL");
		last.add("ALVAREZ");
		last.add("MORRISON");
		last.add("HANSEN");
		last.add("FERNANDEZ");
		last.add("GARZA");
		last.add("HARVEY");
		last.add("LITTLE");
		last.add("BURTON");
		last.add("STANLEY");
		last.add("NGUYEN");
		last.add("GEORGE");
		last.add("JACOBS");
		last.add("REID");
		last.add("KIM");
		last.add("FULLER");
		last.add("LYNCH");
		last.add("DEAN");
		last.add("GILBERT");
		last.add("GARRETT");
		last.add("ROMERO");
		last.add("WELCH");
		last.add("LARSON");
		last.add("FRAZIER");
		last.add("BURKE");
		last.add("HANSON");
		last.add("DAY");
		last.add("MENDOZA");
		last.add("MORENO");
		last.add("BOWMAN");
		last.add("MEDINA");
		last.add("FOWLER");
		last.add("BREWER");
		last.add("HOFFMAN");
		last.add("CARLSON");
		last.add("SILVA");
		last.add("PEARSON");
		last.add("HOLLAND");
		last.add("DOUGLAS");
		last.add("FLEMING");
		last.add("JENSEN");
		last.add("VARGAS");
		last.add("BYRD");
		last.add("DAVIDSON");
		last.add("HOPKINS");
		last.add("MAY");
		last.add("TERRY");
		last.add("HERRERA");
		last.add("WADE");
		last.add("SOTO");
		last.add("WALTERS");
		last.add("CURTIS");
		last.add("NEAL");
		last.add("CALDWELL");
		last.add("LOWE");
		last.add("JENNINGS");
		last.add("BARNETT");
		last.add("GRAVES");
		last.add("JIMENEZ");
		last.add("HORTON");
		last.add("SHELTON");
		last.add("BARRETT");
		last.add("OBRIEN");
		last.add("CASTRO");
		last.add("SUTTON");
		last.add("GREGORY");
		last.add("MCKINNEY");
		last.add("LUCAS");
		last.add("MILES");
		last.add("CRAIG");
		last.add("RODRIQUEZ");
		last.add("CHAMBERS");
		last.add("HOLT");
		last.add("LAMBERT");
		last.add("FLETCHER");
		last.add("WATTS");
		last.add("BATES");
		last.add("HALE");
		last.add("RHODES");
		last.add("PENA");
		last.add("BECK");
		last.add("NEWMAN");
		last.add("HAYNES");
		last.add("MCDANIEL");
		last.add("MENDEZ");
		last.add("BUSH");
		last.add("VAUGHN");
		last.add("PARKS");
		last.add("DAWSON");
		last.add("SANTIAGO");
		last.add("NORRIS");
		last.add("HARDY");
		last.add("LOVE");
		last.add("STEELE");
		last.add("CURRY");
		last.add("POWERS");
		last.add("SCHULTZ");
		last.add("BARKER");
		last.add("GUZMAN");
		last.add("PAGE");
		last.add("MUNOZ");
		last.add("BALL");
		last.add("KELLER");
		last.add("CHANDLER");
		last.add("WEBER");
		last.add("LEONARD");
		last.add("WALSH");
		last.add("LYONS");
		last.add("RAMSEY");
		last.add("WOLFE");
		last.add("SCHNEIDER");
		last.add("MULLINS");
		last.add("BENSON");
		last.add("SHARP");
		last.add("BOWEN");
		last.add("DANIEL");
		last.add("BARBER");
		last.add("CUMMINGS");
		last.add("HINES");
		last.add("BALDWIN");
		last.add("GRIFFITH");
		last.add("VALDEZ");
		last.add("HUBBARD");
		last.add("SALAZAR");
		last.add("REEVES");
		last.add("WARNER");
		last.add("STEVENSON");
		last.add("BURGESS");
		last.add("SANTOS");
		last.add("TATE");
		last.add("CROSS");
		last.add("GARNER");
		last.add("MANN");
		last.add("MACK");
		last.add("MOSS");
		last.add("THORNTON");
		last.add("DENNIS");
		last.add("MCGEE");
		last.add("FARMER");
		last.add("DELGADO");
		last.add("AGUILAR");
		last.add("VEGA");
		last.add("GLOVER");
		last.add("MANNING");
		last.add("COHEN");
		last.add("HARMON");
		last.add("RODGERS");
		last.add("ROBBINS");
		last.add("NEWTON");
		last.add("TODD");
		last.add("BLAIR");
		last.add("HIGGINS");
		last.add("INGRAM");
		last.add("REESE");
		last.add("CANNON");
		last.add("STRICKLAND");
		last.add("TOWNSEND");
		last.add("POTTER");
		last.add("GOODWIN");
		last.add("WALTON");
		last.add("ROWE");
		last.add("HAMPTON");
		last.add("ORTEGA");
		last.add("PATTON");
		last.add("SWANSON");
		last.add("JOSEPH");
		last.add("FRANCIS");
		last.add("GOODMAN");
		last.add("MALDONADO");
		last.add("YATES");
		last.add("BECKER");
		last.add("ERICKSON");
		last.add("HODGES");
		last.add("RIOS");
		last.add("CONNER");
		last.add("ADKINS");
		last.add("WEBSTER");
		last.add("NORMAN");
		last.add("MALONE");
		last.add("HAMMOND");
		last.add("FLOWERS");
		last.add("COBB");
		last.add("MOODY");
		last.add("QUINN");
		last.add("BLAKE");
		last.add("MAXWELL");
		last.add("POPE");
		last.add("FLOYD");
		last.add("OSBORNE");
		last.add("PAUL");
		last.add("MCCARTHY");
		last.add("GUERRERO");
		last.add("LINDSEY");
		last.add("ESTRADA");
		last.add("SANDOVAL");
		last.add("GIBBS");
		last.add("TYLER");
		last.add("GROSS");
		last.add("FITZGERALD");
		last.add("STOKES");
		last.add("DOYLE");
		last.add("SHERMAN");
		last.add("SAUNDERS");
		last.add("WISE");
		last.add("COLON");
		last.add("GILL");
		last.add("ALVARADO");
		last.add("GREER");
		last.add("PADILLA");
		last.add("SIMON");
		last.add("WATERS");
		last.add("NUNEZ");
		last.add("BALLARD");
		last.add("SCHWARTZ");
		last.add("MCBRIDE");
		last.add("HOUSTON");
		last.add("CHRISTENSEN");
		last.add("KLEIN");
		last.add("PRATT");
		last.add("BRIGGS");
		last.add("PARSONS");
		last.add("MCLAUGHLIN");
		last.add("ZIMMERMAN");
		last.add("FRENCH");
		last.add("BUCHANAN");
		last.add("MORAN");
		last.add("COPELAND");
		last.add("ROY");
		last.add("PITTMAN");
		last.add("BRADY");
		last.add("MCCORMICK");
		last.add("HOLLOWAY");
		last.add("BROCK");
		last.add("POOLE");
		last.add("FRANK");
		last.add("LOGAN");
		last.add("OWEN");
		last.add("BASS");
		last.add("MARSH");
		last.add("DRAKE");
		last.add("WONG");
		last.add("JEFFERSON");
		last.add("PARK");
		last.add("MORTON");
		last.add("ABBOTT");
		last.add("SPARKS");
		last.add("PATRICK");
		last.add("NORTON");
		last.add("HUFF");
		last.add("CLAYTON");
		last.add("MASSEY");
		last.add("LLOYD");
		last.add("FIGUEROA");
		last.add("CARSON");
		last.add("BOWERS");
		last.add("ROBERSON");
		last.add("BARTON");
		last.add("TRAN");
		last.add("LAMB");
		last.add("HARRINGTON");
		last.add("CASEY");
		last.add("BOONE");
		last.add("CORTEZ");
		last.add("CLARKE");
		last.add("MATHIS");
		last.add("SINGLETON");
		last.add("WILKINS");
		last.add("CAIN");
		last.add("BRYAN");
		last.add("UNDERWOOD");
		last.add("HOGAN");
		last.add("MCKENZIE");
		last.add("COLLIER");
		last.add("LUNA");
		last.add("PHELPS");
		last.add("MCGUIRE");
		last.add("ALLISON");
		last.add("BRIDGES");
		last.add("WILKERSON");
		last.add("NASH");
		last.add("SUMMERS");
		last.add("ATKINS");
		last.add("WILCOX");
		last.add("PITTS");
		last.add("CONLEY");
		last.add("MARQUEZ");
		last.add("BURNETT");
		last.add("RICHARD");
		last.add("COCHRAN");
		last.add("CHASE");
		last.add("DAVENPORT");
		last.add("HOOD");
		last.add("GATES");
		last.add("CLAY");
		last.add("AYALA");
		last.add("SAWYER");
		last.add("ROMAN");
		last.add("VAZQUEZ");
		last.add("DICKERSON");
		last.add("HODGE");
		last.add("ACOSTA");
		last.add("FLYNN");
		last.add("ESPINOZA");
		last.add("NICHOLSON");
		last.add("MONROE");
		last.add("WOLF");
		last.add("MORROW");
		last.add("KIRK");
		last.add("RANDALL");
		last.add("ANTHONY");
		last.add("WHITAKER");
		last.add("OCONNOR");
		last.add("SKINNER");
		last.add("WARE");
		last.add("MOLINA");
		last.add("KIRBY");
		last.add("HUFFMAN");
		last.add("BRADFORD");
		last.add("CHARLES");
		last.add("GILMORE");
		last.add("DOMINGUEZ");
		last.add("ONEAL");
		last.add("BRUCE");
		last.add("LANG");
		last.add("COMBS");
		last.add("KRAMER");
		last.add("HEATH");
		last.add("HANCOCK");
		last.add("GALLAGHER");
		last.add("GAINES");
		last.add("SHAFFER");
		last.add("SHORT");
		last.add("WIGGINS");
		last.add("MATHEWS");
		last.add("MCCLAIN");
		last.add("FISCHER");
		last.add("WALL");
		last.add("SMALL");
		last.add("MELTON");
		last.add("HENSLEY");
		last.add("BOND");
		last.add("DYER");
		last.add("CAMERON");
		last.add("GRIMES");
		last.add("CONTRERAS");
		last.add("CHRISTIAN");
		last.add("WYATT");
		last.add("BAXTER");
		last.add("SNOW");
		last.add("MOSLEY");
		last.add("SHEPHERD");
		last.add("LARSEN");
		last.add("HOOVER");
		last.add("BEASLEY");
		last.add("GLENN");
		last.add("PETERSEN");
		last.add("WHITEHEAD");
		last.add("MEYERS");
		last.add("KEITH");
		last.add("GARRISON");
		last.add("VINCENT");
		last.add("SHIELDS");
		last.add("HORN");
		last.add("SAVAGE");
		last.add("OLSEN");
		last.add("SCHROEDER");
		last.add("HARTMAN");
		last.add("WOODARD");
		last.add("MUELLER");
		last.add("KEMP");
		last.add("DELEON");
		last.add("BOOTH");
		last.add("PATEL");
		last.add("CALHOUN");
		last.add("WILEY");
		last.add("EATON");
		last.add("CLINE");
		last.add("NAVARRO");
		last.add("HARRELL");
		last.add("LESTER");
		last.add("HUMPHREY");
		last.add("PARRISH");
		last.add("DURAN");
		last.add("HUTCHINSON");
		last.add("HESS");
		last.add("DORSEY");
		last.add("BULLOCK");
		last.add("ROBLES");
		last.add("BEARD");
		last.add("DALTON");
		last.add("AVILA");
		last.add("VANCE");
		last.add("RICH");
		last.add("BLACKWELL");
		last.add("YORK");
		last.add("JOHNS");
		last.add("BLANKENSHIP");
		last.add("TREVINO");
		last.add("SALINAS");
		last.add("CAMPOS");
		last.add("PRUITT");
		last.add("MOSES");
		last.add("CALLAHAN");
		last.add("GOLDEN");
		last.add("MONTOYA");
		last.add("HARDIN");
		last.add("GUERRA");
		last.add("MCDOWELL");
		last.add("CAREY");
		last.add("STAFFORD");
		last.add("GALLEGOS");
		last.add("HENSON");
		last.add("WILKINSON");
		last.add("BOOKER");
		last.add("MERRITT");
		last.add("MIRANDA");
		last.add("ATKINSON");
		last.add("ORR");
		last.add("DECKER");
		last.add("HOBBS");
		last.add("PRESTON");
		last.add("TANNER");
		last.add("KNOX");
		last.add("PACHECO");
		last.add("STEPHENSON");
		last.add("GLASS");
		last.add("ROJAS");
		last.add("SERRANO");
		last.add("MARKS");
		last.add("HICKMAN");
		last.add("ENGLISH");
		last.add("SWEENEY");
		last.add("STRONG");
		last.add("PRINCE");
		last.add("MCCLURE");
		last.add("CONWAY");
		last.add("WALTER");
		last.add("ROTH");
		last.add("MAYNARD");
		last.add("FARRELL");
		last.add("LOWERY");
		last.add("HURST");
		last.add("NIXON");
		last.add("WEISS");
		last.add("TRUJILLO");
		last.add("ELLISON");
		last.add("SLOAN");
		last.add("JUAREZ");
		last.add("WINTERS");
		last.add("MCLEAN");
		last.add("RANDOLPH");
		last.add("LEON");
		last.add("BOYER");
		last.add("VILLARREAL");
		last.add("MCCALL");
		last.add("GENTRY");
		last.add("CARRILLO");
		last.add("KENT");
		last.add("AYERS");
		last.add("LARA");
		last.add("SHANNON");
		last.add("SEXTON");
		last.add("PACE");
		last.add("HULL");
		last.add("LEBLANC");
		last.add("BROWNING");
		last.add("VELASQUEZ");
		last.add("LEACH");
		last.add("CHANG");
		last.add("HOUSE");
		last.add("SELLERS");
		last.add("HERRING");
		last.add("NOBLE");
		last.add("FOLEY");
		last.add("BARTLETT");
		last.add("MERCADO");
		last.add("LANDRY");
		last.add("DURHAM");
		last.add("WALLS");
		last.add("BARR");
		last.add("MCKEE");
		last.add("BAUER");
		last.add("RIVERS");
		last.add("EVERETT");
		last.add("BRADSHAW");
		last.add("PUGH");
		last.add("VELEZ");
		last.add("RUSH");
		last.add("ESTES");
		last.add("DODSON");
		last.add("MORSE");
		last.add("SHEPPARD");
		last.add("WEEKS");
		last.add("CAMACHO");
		last.add("BEAN");
		last.add("BARRON");
		last.add("LIVINGSTON");
		last.add("MIDDLETON");
		last.add("SPEARS");
		last.add("BRANCH");
		last.add("BLEVINS");
		last.add("CHEN");
		last.add("KERR");
		last.add("MCCONNELL");
		last.add("HATFIELD");
		last.add("HARDING");
		last.add("ASHLEY");
		last.add("SOLIS");
		last.add("HERMAN");
		last.add("FROST");
		last.add("GILES");
		last.add("BLACKBURN");
		last.add("WILLIAM");
		last.add("PENNINGTON");
		last.add("WOODWARD");
		last.add("FINLEY");
		last.add("MCINTOSH");
		last.add("KOCH");
		last.add("BEST");
		last.add("SOLOMON");
		last.add("MCCULLOUGH");
		last.add("DUDLEY");
		last.add("NOLAN");
		last.add("BLANCHARD");
		last.add("RIVAS");
		last.add("BRENNAN");
		last.add("MEJIA");
		last.add("KANE");
		last.add("BENTON");
		last.add("JOYCE");
		last.add("BUCKLEY");
		last.add("HALEY");
		last.add("VALENTINE");
		last.add("MADDOX");
		last.add("RUSSO");
		last.add("MCKNIGHT");
		last.add("BUCK");
		last.add("MOON");
		last.add("MCMILLAN");
		last.add("CROSBY");
		last.add("BERG");
		last.add("DOTSON");
		last.add("MAYS");
		last.add("ROACH");
		last.add("CHURCH");
		last.add("CHAN");
		last.add("RICHMOND");
		last.add("MEADOWS");
		last.add("FAULKNER");
		last.add("ONEILL");
		last.add("KNAPP");
		last.add("KLINE");
		last.add("BARRY");
		last.add("OCHOA");
		last.add("JACOBSON");
		last.add("GAY");
		last.add("AVERY");
		last.add("HENDRICKS");
		last.add("HORNE");
		last.add("SHEPARD");
		last.add("HEBERT");
		last.add("CHERRY");
		last.add("CARDENAS");
		last.add("MCINTYRE");
		last.add("WHITNEY");
		last.add("WALLER");
		last.add("HOLMAN");
		last.add("DONALDSON");
		last.add("CANTU");
		last.add("TERRELL");
		last.add("MORIN");
		last.add("GILLESPIE");
		last.add("FUENTES");
		last.add("TILLMAN");
		last.add("SANFORD");
		last.add("BENTLEY");
		last.add("PECK");
		last.add("KEY");
		last.add("SALAS");
		last.add("ROLLINS");
		last.add("GAMBLE");
		last.add("DICKSON");
		last.add("BATTLE");
		last.add("SANTANA");
		last.add("CABRERA");
		last.add("CERVANTES");
		last.add("HOWE");
		last.add("HINTON");
		last.add("HURLEY");
		last.add("SPENCE");
		last.add("ZAMORA");
		last.add("YANG");
		last.add("MCNEIL");
		last.add("SUAREZ");
		last.add("CASE");
		last.add("PETTY");
		last.add("GOULD");
		last.add("MCFARLAND");
		last.add("SAMPSON");
		last.add("CARVER");
		last.add("BRAY");
		last.add("ROSARIO");
		last.add("MACDONALD");
		last.add("STOUT");
		last.add("HESTER");
		last.add("MELENDEZ");
		last.add("DILLON");
		last.add("FARLEY");
		last.add("HOPPER");
		last.add("GALLOWAY");
		last.add("POTTS");
		last.add("BERNARD");
		last.add("JOYNER");
		last.add("STEIN");
		last.add("AGUIRRE");
		last.add("OSBORN");
		last.add("MERCER");
		last.add("BENDER");
		last.add("FRANCO");
		last.add("ROWLAND");
		last.add("SYKES");
		last.add("BENJAMIN");
		last.add("TRAVIS");
		last.add("PICKETT");
		last.add("CRANE");
		last.add("SEARS");
		last.add("MAYO");
		last.add("DUNLAP");
		last.add("HAYDEN");
		last.add("WILDER");
		last.add("MCKAY");
		last.add("COFFEY");
		last.add("MCCARTY");
		last.add("EWING");
		last.add("COOLEY");
		last.add("VAUGHAN");
		last.add("BONNER");
		last.add("COTTON");
		last.add("HOLDER");
		last.add("STARK");
		last.add("FERRELL");
		last.add("CANTRELL");
		last.add("FULTON");
		last.add("LYNN");
		last.add("LOTT");
		last.add("CALDERON");
		last.add("ROSA");
		last.add("POLLARD");
		last.add("HOOPER");
		last.add("BURCH");
		last.add("MULLEN");
		last.add("FRY");
		last.add("RIDDLE");
		last.add("LEVY");
		last.add("DAVID");
		last.add("DUKE");
		last.add("ODONNELL");
		last.add("GUY");
		last.add("MICHAEL");
		last.add("BRITT");
		last.add("FREDERICK");
		last.add("DAUGHERTY");
		last.add("BERGER");
		last.add("DILLARD");
		last.add("ALSTON");
		last.add("JARVIS");
		last.add("FRYE");
		last.add("RIGGS");
		last.add("CHANEY");
		last.add("ODOM");
		last.add("DUFFY");
		last.add("FITZPATRICK");
		last.add("VALENZUELA");
		last.add("MERRILL");
		last.add("MAYER");
		last.add("ALFORD");
		last.add("MCPHERSON");
		last.add("ACEVEDO");
		last.add("DONOVAN");
		last.add("BARRERA");
		last.add("ALBERT");
		last.add("COTE");
		last.add("REILLY");
		last.add("COMPTON");
		last.add("RAYMOND");
		last.add("MOONEY");
		last.add("MCGOWAN");
		last.add("CRAFT");
		last.add("CLEVELAND");
		last.add("CLEMONS");
		last.add("WYNN");
		last.add("NIELSEN");
		last.add("BAIRD");
		last.add("STANTON");
		last.add("SNIDER");
		last.add("ROSALES");
		last.add("BRIGHT");
		last.add("WITT");
		last.add("STUART");
		last.add("HAYS");
		last.add("HOLDEN");
		last.add("RUTLEDGE");
		last.add("KINNEY");
		last.add("CLEMENTS");
		last.add("CASTANEDA");
		last.add("SLATER");
		last.add("HAHN");
		last.add("EMERSON");
		last.add("CONRAD");
		last.add("BURKS");
		last.add("DELANEY");
		last.add("PATE");
		last.add("LANCASTER");
		last.add("SWEET");
		last.add("JUSTICE");
		last.add("TYSON");
		last.add("SHARPE");
		last.add("WHITFIELD");
		last.add("TALLEY");
		last.add("MACIAS");
		last.add("IRWIN");
		last.add("BURRIS");
		last.add("RATLIFF");
		last.add("MCCRAY");
		last.add("MADDEN");
		last.add("KAUFMAN");
		last.add("BEACH");
		last.add("GOFF");
		last.add("CASH");
		last.add("BOLTON");
		last.add("MCFADDEN");
		last.add("LEVINE");
		last.add("GOOD");
		last.add("BYERS");
		last.add("KIRKLAND");
		last.add("KIDD");
		last.add("WORKMAN");
		last.add("CARNEY");
		last.add("DALE");
		last.add("MCLEOD");
		last.add("HOLCOMB");
		last.add("ENGLAND");
		last.add("FINCH");
		last.add("HEAD");
		last.add("BURT");
		last.add("HENDRIX");
		last.add("SOSA");
		last.add("HANEY");
		last.add("FRANKS");
		last.add("SARGENT");
		last.add("NIEVES");
		last.add("DOWNS");
		last.add("RASMUSSEN");
		last.add("BIRD");
		last.add("HEWITT");
		last.add("LINDSAY");
		last.add("LE");
		last.add("FOREMAN");
		last.add("VALENCIA");
		last.add("ONEIL");
		last.add("DELACRUZ");
		last.add("VINSON");
		last.add("DEJESUS");
		last.add("HYDE");
		last.add("FORBES");
		last.add("GILLIAM");
		last.add("GUTHRIE");
		last.add("WOOTEN");
		last.add("HUBER");
		last.add("BARLOW");
		last.add("BOYLE");
		last.add("MCMAHON");
		last.add("BUCKNER");
		last.add("ROCHA");
		last.add("PUCKETT");
		last.add("LANGLEY");
		last.add("KNOWLES");
		last.add("COOKE");
		last.add("VELAZQUEZ");
		last.add("WHITLEY");
		last.add("NOEL");
		last.add("VANG");
		return last;
	}

}
