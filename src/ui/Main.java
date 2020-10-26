package ui;

import java.util.Scanner;
import model.MCS;

public class Main{
	
	private MCS mainMCS;
	private Scanner sc;
	
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
			System.out.println("\nSeleccione una opción para empezar:\n" + 
								"\n(1) crear un nuevo usuario" + 
								"\n(2) crear" + 
								"\n(3) crear" + 
								"\n(4) mostrar" + 
								"\n(0) salir\n"
								);
		option = sc.nextInt();
		sc.nextLine();
		switch(option) {
			case 1: createMUser();
				break;
			case 2: 
				break;
			case 3: 
				break;
			case 4: 
				break;
			case 0: menu = false;
				break;
			default:
				System.out.println("Error, opción no válida");
		}
		}
	}
	
	public void createMCS() {
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
	
	public void createMUser(){
		String userName, password;
		int age;
		System.out.println("Para crear un nuevo usuario por favor, ");
		System.out.println("Digite un nombre de usuario (NO puede contener espacios): ");
		userName = sc.nextLine();
		System.out.println("\nDigite la edad del usuario: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("\nDigite una contraseña: ");
		password = sc.nextLine();
		String message = mainMCS.createUser(userName, password, age);
		System.out.println(message);
	}
	
	public void listUsers() {
		System.out.println(mainMCS.showUsers());	
	}
	
	public void createMSong() {
		String title, artistName, releaseDate, genre;
		int duration;
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
		System.out.println("Digite el genero al que pertenece la cancion (ROCK, HIPHOP, CLASSICA, REGGAE, SALSA, METAL, POP)");
		genre = sc.nextLine();
		String message = mainMCS.addSong(title, artistName, releaseDate, duration, genre);
		System.out.println(message);
	}
	
	public void listSongs() {
		System.out.println(mainMCS.showSongs());	
	}
	
}