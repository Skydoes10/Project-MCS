package ui;

import java.util.Scanner;
import model.MCS;

public class Main{
	
	private Scanner sc;
	private MCS mainMCS;
	
	public Main(){
		sc = new Scanner(System.in);
		createMCS();
	}
	
	public static void main(String[] args) {
		Main objMain = new Main();
		objMain.menu();
	}
	
	public void menu(){
		boolean menu = true;
		int option;
		while(menu) {
			System.out.println("\n**********************************************************" +
								"\nSeleccione una opción para empezar:\n" + 
								"\n(1) Crear un nuevo usuario" + 
								"\n(2) Agregar cancion al Pool" + 
								"\n(3) Agregar una cancion a una Playlist" + 
								"\n(4) Crear una nueva playlist" + 
								"\n(5) Mostrar informacion" + 
								"\n(6) " +
								"\n(0) Salir" +
								"\n**********************************************************"
								);
		option = sc.nextInt();
		sc.nextLine();
		switch(option) {
			case 1: createMUser();
				break;
			case 2: addMSong();
				break;
			case 3: menu2(option);
				break;
			case 4: menu2(option);
				break;
			case 5: menu3();
				break;
			case 6: 
				break;
			case 0: menu = false;
					System.out.println("\nBye!");
				break;
			default:
					System.out.println("\nError, opción no válida");
		}
		}
	}
	
	public void createMCS() {
		mainMCS = new MCS();
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((\r\n" + 
				"((((((((((((((((/((((((((((((((((((((((((((((((((\r\n" + 
				"(((/  .(((((((*  .((((((*        (((((/      /(((\r\n" + 
				"(((/   .((((((.  .(((((   ,((((((((((*  .((((((((\r\n" + 
				"(((/    /((((/   .((((/  ,(((((((((((.  /((((((((\r\n" + 
				"(((/     ((((*   .((((*  ,(((((((((((/   ((((((((\r\n" + 
				"(((/  *  *(((     ((((*  ,((((((((((((,  .(((((((\r\n" + 
				"(((/  /.  ((*     ((((*  *(((((((((((((,   ((((((\r\n" + 
				"(((/  //  ,(  .   ((((*  *((((((((((((((/   /((((\r\n" + 
				"(((/  *(*  ,  (   ((((*  *((((((((((((((((   /(((\r\n" + 
				"(((/  ,(/    ,(   /(((*  ,(((((((((((((((((   (((\r\n" + 
				"(((/  .((    ((   /((((  .(((((((((((((((((.  /((\r\n" + 
				"(((/  .((.  .((.  *((((,  *((((((((((((((((   /((\r\n" + 
				"(((/  .((((((((.  *(((((   *((((/,/(((((((/   (((\r\n" + 
				"(((/  .((((((((.  *((((((.        *((   .   .((((\r\n" + 
				"(((((((((((((((/*/((((((((((///(((((((////(((((((\r\n" + 
				"(((((((((((((((((((((((((((((((((((((((((((((((((\r\n" + 
				"               ./(###((///((###(*                \r\n" + 
				"           *#(,                   *((,           \r\n" + 
				"        ,#/                           ((         \r\n" + 
				"      .#*          .**/////*,.          ((       \r\n" + 
				"     *(.      .//////////////////*       *#      \r\n" + 
				"    .#,     *///////////////////////,     /(     \r\n" + 
				"    /(    *///////////////////////////    .#.    \r\n" + 
				"  ,/////,*/////////////////////////////,*////*.  \r\n" + 
				"  /////////////////////////*,...,/////////////,  \r\n" + 
				"  //////*,,,********,,.............,,,,,//////,  \r\n" + 
				"  //////*.........//*........//*.......,//////,  \r\n" + 
				"  //////*.........,,.........,,........,//////,  \r\n" + 
				"  //////*..............................,//////,  \r\n" + 
				"   *///*  ........,/.........**.......  .*///,   \r\n" + 
				"            .......,/*.....,/*.......            \r\n" + 
				"               ........,,,,.......               \r\n" + 
				"                    .........                    \r\n" + 
				"     \r\n" + 
				"*************************************************\r\n"
				);
	}
	
	public void menu2(int opt) {
		boolean menu = true;
		while(menu) {
			System.out.println(
					"\n************************************************************\n" +
					"Digite la opcion deseada:\n" +
					"(1) Playlist publica\n" +
					"(2) Playlist privada\n"+
					"(3) Playlist restringida\n"+ 
					"(0) Para volver\n" +
					"************************************************************\n"
					);
			int option = sc.nextInt();
			sc.nextLine();
			if(opt == 3) {
				switch(option) {
				case 1:	addSongtoPL(option);
						menu = false;
					break;
				case 2:	addSongtoPL(option);
						menu = false;
					break;
				case 3:	addSongtoPL(option);
						menu = false;
					break;
				case 0:	menu = false;
					break;
				default: System.out.println("\nOpcion no valida");
				}
			}
			else {
				switch(option) {
				case 1:	createPL(option);
						menu = false;
					break;
				case 2:	createPL(option);
						menu = false;
					break;
				case 3:	createPL(option);
						menu = false;
					break;
				case 0:	menu = false;
					break;
				default: System.out.println("\nOpcion no valida");
				}
			}
		}
	}
	
	
	
	public void menu3() {
		boolean menu = true;
		while(menu) {
			System.out.println(
					"\n************************************************************\n" +
					"Digite la opcion deseada:\n" +
					"(1) Mostrar lista de todos los usuarios registrados\n" +
					"(2) Mostrar lista de todas las canciones del Pool\n"+
					"(3) Mostrar lista de todas las Playlist\n"+ 
					"(0) Para volver\n" +
					"************************************************************\n"
					);
			int option = sc.nextInt();
			sc.nextLine();
			switch(option) {
				case 1:	listUsers();
						menu = false;
					break;
				case 2:	listSongs();
						menu = false;
					break;
				case 3:	listPL();
						menu = false;
					break;
				case 0:	menu = false;
					break;
				default: System.out.println("\nOpcion no valida");
			}
		}
	}
	
	public void createMUser(){
		String userName, password;
		int age;
		System.out.println("Para crear un nuevo usuario por favor, ");
		System.out.println("Digite un nombre de usuario (NO puede contener espacios): ");
		userName = sc.nextLine();
		System.out.println("\nDigite una contraseña: ");
		password = sc.nextLine();
		System.out.println("\nDigite la edad del usuario: ");
		age = sc.nextInt();
		sc.nextLine();
		String message = mainMCS.createUser(userName, password, age);
		System.out.println(message);
	}
	
	public void listUsers() {
		mainMCS.showUsers();	
	}
	
	public void addMSong() {
		String title, artistName, releaseDate, userName;
		int duration, genre;
		System.out.println("Para agregar una nueva cancion al Pool de canciones por favor,");
		System.out.println("Digite el nombre del usuario que va a agregar la cancion:");
		userName = sc.nextLine();
		System.out.println("\nDigite un nombre de la cancion: ");
		title = sc.nextLine();
		System.out.println("\nDigite el nombre del artista o banda: ");
		artistName = sc.nextLine();
		System.out.println("\nDigite la fecha de lanzamiento de la cancion: ");
		releaseDate = sc.nextLine();
		System.out.println("\nDigite la duracion de la cancion en segundos: ");
		duration = sc.nextInt();
		sc.nextLine();
		System.out.println("\nA que genero pertenece la cancion?:\n" +
				"(1) ROCK\n" + 
				"(2) HIP HOP\n" +
				"(3) MUSICA CLASICA\n" + 
				"(4) REGGAE\n" + 
				"(5) SALSA\n" + 
				"(6) METAL\n" + 
				"(7) POP\n"
				);
		genre = sc.nextInt();
		sc.nextLine();
		String message = mainMCS.addSong(title, artistName, releaseDate, duration, genre, userName);
		System.out.println(message);
	}
	
	public void listSongs() {
		mainMCS.showSongs();	
	}
	
	public void createPL(int option) {
		String namePL, userName;
		String[] userNames = new String[5];
		System.out.println("\nDigite el nombre de la playlist:");
		namePL = sc.nextLine();
		if(option == 1) {
			String message = mainMCS.addPlayList(namePL);
			System.out.println(message);
		}
		else if(option == 2) {
			System.out.println("\nDigite el nombre del usuario que va a crear la playlist:");
			userName = sc.nextLine();
			String message = mainMCS.addPlayList(namePL, userName);
			System.out.println(message);
		}
		else if(option == 3) {
			System.out.println("\nDigite el nombre de los 5 integrantes de la playlist: \nNOTA: El usuario creador de la playlist debe ser el integrante 1");
			for(int i = 0; i < userNames.length; i++) {
				System.out.println("\nIntegrante:");
				userNames[i] = sc.nextLine();
			}
			String message = mainMCS.addPlayList(namePL, userNames);
			System.out.println(message);
		}	
	}
	
	public void listPL() {
		mainMCS.showPlayLists();	
	}
	
	public void addSongtoPL(int option){
		String namePL, nameSong, nameArtist, userName;
		String[] userNames = new String[5];
		System.out.println("\nDigite el nombre de la playlist:");
		namePL = sc.nextLine();
		System.out.println("\nDigite el titulo de la cancion del Pool que desea agregar:");
		nameSong = sc.nextLine();
		System.out.println("\nDigite el nombre del artista de la cancion del Pool que desea agregar:");
		nameArtist = sc.nextLine();
		if(option == 1) {
			String message = mainMCS.addSongtoPlay(namePL, nameSong, nameArtist);
			System.out.println(message);
		}
		else if(option == 2) {
			System.out.println("\nDigite el nombre del usuario que va a agregar la cancion:");
			userName = sc.nextLine();
			String message = mainMCS.addSongtoPlay(namePL, nameSong, nameArtist, userName);
			System.out.println(message);
		}
		else if(option == 3) {
			System.out.println("\nDigite el nombre del usuario que va a agregar la cancion:");
			userName = sc.nextLine();
			String message = mainMCS.addSongtoPlay(namePL, nameSong, nameArtist, userName);
			System.out.println(message);
		}
	}
}