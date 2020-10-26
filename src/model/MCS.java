package model;

public class MCS{
	//Constants
	public static final int MAX_USERS = 10;
	public static final int MAX_SONGS = 20;
	public static final int MAX_PLAYLISTS = 50;
	
	//Attributes
	private int numUsers;
	private int numSongs;
	private int amountPL;
	
	//Relationships
	private User[] users;
	private Playlist[] playlists;
	private Song[] songsPool;
	
	//Builder
	public MCS(){
		this.numUsers = MAX_USERS;
		this.numSongs = MAX_SONGS;
		this.amountPL = MAX_PLAYLISTS;
		users = new User[MAX_USERS];
		songsPool = new Song[MAX_SONGS];
		playlists = new Playlist[MAX_PLAYLISTS];
	}//End Builder
	
	public String createUser(String userName, String password, int age){
		String message = "";
		boolean addUser = false;
		User objSearch = findUser(userName);
		
		if (objSearch != null) {
			message="El usuario ya esta registrado";
		}
		else {
			for (int i = 0; i<MAX_USERS && !addUser; i++) {
				if (users[i] == null){
					users[i] = new User (userName, password, age);
					addUser = true;
					message = "El usuario ha sido registrado con exito";
				}
			}
			if (addUser == false) {
				message = "Limite de usuarios alcanzado";
			}
		}
		return message;
	}
	
	public String addSong(String title, String artistName, String releaseDate, int duration, String pGenre){
		String message = "";
		boolean addSg = false;
		Song objSearch = findSong(title, artistName, releaseDate);
		
		if (objSearch != null) {
			message="La cancion ya ha sido agregada anteriormente al Pool de canciones";
		}
		else {
			Genre genre= Genre.valueOf(pGenre);
			for (int i = 0; i<MAX_SONGS && !addSg; i++) {
				if (songsPool[i] == null){
					songsPool[i] = new Song (title, artistName, releaseDate, duration, genre);
					addSg = true;
					message = "El usuario ha sido registrado con exito";
				}
			}
			if (addSg == false)
				message = "Limite de usuarios alcanzado";  
		}
		return message;
	}
	
	public User findUser(String userName){
		User objSearch = null;
		boolean found = false;
		for (int i = 0; i<MAX_USERS && !found; i++) {
			if(users[i] != null && users[i].getUserName().equalsIgnoreCase(userName)) {
				objSearch = users[i];
				found = true;
			}
		}
		return objSearch;
	}
	
	public Song findSong(String title,String artistName,String releaseDate){
		Song objSearch = null;
		boolean found = false;
		for (int i = 0; i<MAX_SONGS && !found; i++) {
			if(songsPool[i] != null && songsPool[i].getTitle().equalsIgnoreCase(title) && songsPool[i].getArtistName().equalsIgnoreCase(artistName) && songsPool[i].getReleaseDate().equalsIgnoreCase(releaseDate)) {
				objSearch = songsPool[i];
				found = true;
			}
		}
		return objSearch;
	}
	
	/*public boolean hasPlaceUser(){
		
		return ;
	}
	
	public boolean hasPlaceSong(){
		
		return ;
	}*/
	
	public String[] showUsers(){
		String[] out = new String[MAX_USERS];
		for (int i = 0; i<MAX_USERS; i++) {
			out[i] = users[i].toString();
		}
		return out;
	}
	
	public String[] showSongs(){
		String[] out = new String[MAX_SONGS];
		for (int i = 0; i<MAX_SONGS; i++) {
			out[i] = songsPool[i].toString();
		}
		return out;
	}
	
	
}