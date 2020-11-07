package ui;

import java.util.Scanner;
import model.MCS;

public class Main{
	
	private Scanner sc;
	private MCS mainMCS;
	
	/**
	 * The scanner is instantiated and sends to show the application logo. <br>
	 * <b>post: </b> the scanner is instantiated. <br>
	 */
	public Main(){
		sc = new Scanner(System.in);
		createMCS();
	}
	
	public static void main(String[] args) {
		Main objMain = new Main();
		objMain.menu();
	}
	
	/**
	 * Shows the main menu. <br>
	 * <b>pre: </b> the scanner must have instantiated. <br>
	 * <b>post: </b> the option chosen for the user. <br>
	 */
	public void menu(){
		boolean menu = true;
		int option;
		while(menu) {
			System.out.println("\n**********************************************************" +
								"\nSeleccione una opción para empezar:\n" + 
								"\n(1) Crear un nuevo usuario" + 
								"\n(2) Agregar cancion al Pool" + 
								"\n(3) Crear una nueva playlist" + 
								"\n(4) Agregar una cancion a una Playlist" + 
								"\n(5) Calificar playlist publica" + 
								"\n(6) Mostrar informacion" +
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
			case 5: ratePlaylist();
				break;
			case 6: menu3();
				break;
			case 0: menu = false;
					System.out.println("\nBye!");
				break;
			default:
					System.out.println("\nError, opción no válida");
		}
		}
	}
	
	/**
	 * Shows the application logo. <br>
	 * <b>post: </b> Shows the logo. <br>
	 */
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
	
	/**
	 * Shows the submenu of the playlists. <br>
	 * <b>pre: </b> Having chosen an option in the main menu. <br>
	 * <b>post: </b> the option chosen in the submenu. <br>
	 * @param opt  the option chosen in the main menu. opt == 4 || opt == 3.
	 */
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
			if(opt == 4) {
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
	
	/**
	 * Shows the submenu of show information. <br>
	 * <b>pre: </b> Having chosen an option in the main menu. <br>
	 * <b>post: </b> the option chosen in this submenu. <br>
	 */
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
	
	/**
	 * Create a new user. <br>
	 * <b>pre: </b> In the main menu has chosen the option for create a new user. <br>
	 * <b>post: </b> A new user has been created. <br>
	 */
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
	
	/**
	 * Show the list of all registered users. <br>
	 * <b>pre: </b> There must be at least one registered user. <br>
	 * <b>post: </b> Shows the list of all users. <br>
	 */
	public void listUsers() {
		mainMCS.showUsers();	
	}
	
	/**
	 * Add a new song to the Pool of songs. <br>
	 * <b>pre: </b> There must be at least one registered user. <br>
	 * <b>post: </b> Add a new song to the Pool of songs. <br>
	 */
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
		System.out.println("\nDigite la fecha (Año) de lanzamiento de la cancion: ");
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
	
	/**
	 * Show the list of all songs added to the song pool. <br>
	 * <b>pre: </b> There must be at least one added song. <br>
	 * <b>post: </b> Shows the list of all songs. <br>
	 */
	public void listSongs() {
		mainMCS.showSongs();	
	}
	
	/**
	 * Create a new playlist. <br>
	 * <b>pre: </b> Have chosen what type of playlist to create. <br>
	 * <b>post: </b> Create a new playlist. <br>
	 * @param option  the option chosen in the submenu of the playlists. option == 1 || option == 2 || option == 3.
	 */
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
	
	/**
	 * Show the list of all created playlists. <br>
	 * <b>pre: </b> There must be at least one created playlist. <br>
	 * <b>post: </b> Shows the list of all playlists. <br>
	 */
	public void listPL() {
		mainMCS.showPlayLists();	
	}
	
	/**
	 * Add a song to a playlist. <br>
	 * <b>pre: </b> There must be at least one created playlist and there must be at least one added song. <br>
	 * <b>post: </b> Add the song to the playlist. <br>
	 * @param option  the option chosen in the submenu of the playlists. option == 1 || option == 2 || option == 3.
	 */
	public void addSongtoPL(int option){
		String namePL, nameSong, nameArtist, userName;
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
	
	/**
	 * Rate a public playlist. <br>
	 * <b>pre: </b> At least one public playlist must have been created. <br>
	 * <b>post: </b> A public playlist has been rated. <br>
	 */
	public void ratePlaylist() {
		String namePL, userName;
		double score;
		System.out.println("\nDigite el nombre del usuario que va a realizar la calificacion:");
		userName = sc.nextLine();
		System.out.println("\nDigite el nombre de la playlist:");
		namePL = sc.nextLine();
		System.out.println("\nDigite una calificacion de 1 a 5 que le quiera dar a la playlist:");
		score = sc.nextDouble();
		sc.nextLine();
		String message = mainMCS.ratePL(namePL, userName, score);
		System.out.println(message);
	}
}