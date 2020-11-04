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
			System.out.println("\n**********************************************" +
								"\nSeleccione una opción para empezar:\n" + 
								"\n(1) crear un nuevo usuario" + 
								"\n(2) Agregar cancion" + 
								"\n(3) crear una nueva playlist" + 
								"\n(4) mostrar lista de todos los usuarios registrados" + 
								"\n(5) mostrar lista de todas las canciones del Pool" +
								"\n(0) salir" +
								"\n**********************************************"
								);
		option = sc.nextInt();
		sc.nextLine();
		switch(option) {
			case 1: createMUser();
				break;
			case 2: addMSong();
				break;
			case 3: menu2();
				break;
			case 4: listUsers();
				break;
			case 5: listSongs();
				break;
			case 0: menu = false;
					System.out.println("Bye!");
				break;
			default:
					System.out.println("Error, opción no válida");
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
	
	public void menu2() {
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
			switch(option) {
				case 1:	createPatient(option);
					break;
				case 2:	createPatient(option);
					break;
				case 3:	createPatient(option);
					break;
				case 0:	menu = false;
					break;
				default: System.out.println("Opcion no valida");
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
		String title, artistName, releaseDate;
		int duration, genre;
		System.out.println("Para agregar una nueva cancion al Pool de canciones por favor,");
		System.out.println("Digite un nombre de la cancion: ");
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
		String message = mainMCS.addSong(title, artistName, releaseDate, duration, genre);
		System.out.println(message);
	}
	
	public void listSongs() {
		mainMCS.showSongs();	
	}
	
	public void createPL(int option) {
		System.out.println("Digite el nombre de la playlist:");
		String namePL = sc.nextLine();
		if(option == 1) {
			String message = mainMCS.addPlayList(namePL);
			System.out.println(message);
		}
		else if(option == 2) {
			String message = mainMCS.addPlayList(namePL);
			System.out.println(message);
		}

	}
	
}