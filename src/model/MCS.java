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
		String message = "El usuario ha sido registrado con exito";
		boolean added = false;
		User objSearch = findUser(userName);
		if(objSearch == null){
			for(int i = 0; i < MAX_USERS && !added; i++){
				if(users[i] == null){
					users[i] = new User(userName, password, age);
					added = true;
				}
			}
			if (added == false){
				message = "Limite de usuarios alcanzado";
			}
		}
		else{
			message = "El usuario ya esta registrado";
		}
		return message;
	}
	
	public String addSong(String title, String artistName, String releaseDate, int duration, int pGenre){
		String message = "La cancion ha sido agregada con exito";
		boolean added = false;
		Song objSearch = findSong(title, artistName);
		if(objSearch == null){
			Genre genre = null;
			switch(pGenre){
		    case 1: genre = Genre.ROCK;
		        break;
		    case 2: genre = Genre.HIPHOP;
		        break;
		    case 3: genre = Genre.CLASSICA;
		    	break;
		    case 4: genre = Genre.REGGAE;
	    		break;
		    case 5: genre = Genre.SALSA;
	    		break;
		    case 6: genre = Genre.METAL;
	    		break;
		    case 7: genre = Genre.POP;
	    		break;
			}
			for(int i = 0; i < MAX_SONGS && !added; i++){
				if(songsPool[i] == null){
					songsPool[i] = new Song(title, artistName, releaseDate, duration, genre);
					added = true;
				}
			}
			if (added == false){
				message = "Limite de canciones alcanzado";
			}
		}
		else{
			message = "La cancion ya ha sido agregada anteriormente";
		}
		return message;
	}
	
	public String addPlayList(String namePL) {
		String message = "La playlist se creo con exito";
		boolean added = false;
		Playlist objSearch = findPL(namePL);
		if(objSearch == null){
			for(int i = 0; i < MAX_PLAYLISTS && !added; i++){
				if(playlists[i] == null){
					playlists[i] = new PrivatePL(namePL);
					added = true;
				}
			}
			if (added == false){
				message = "Limite de playlists alcanzado";
			}
		}
		else{
			message = "Una playlist con el mismo nombre ya ha sido creada";
		}
		return message;	
	}
	
	public User findUser(String userName){
		User objSearch = null;
		boolean found = false;
		for(int i = 0; i < MAX_USERS && !found; i++){
			if(users[i] != null && users[i].getUserName().equalsIgnoreCase(userName)){
				objSearch = users[i];
				found = true;
			}
		}
		return objSearch;	
	}
	
	public Song findSong(String title,String artistName){
		Song objSearch = null;
		boolean found = false;
		for (int i = 0; i<MAX_SONGS && !found; i++) {
			if(songsPool[i] != null && songsPool[i].getTitle().equalsIgnoreCase(title) && songsPool[i].getArtistName().equalsIgnoreCase(artistName)) {
				objSearch = songsPool[i];
				found = true;
			}
		}
		return objSearch;
	}
	
	public Playlist findPL(String namePL){
		Playlist objSearch = null;
		boolean found = false;
		for (int i = 0; i < MAX_PLAYLISTS && !found; i++) {
			if(playlists[i] != null && playlists[i].getNamePlaylist().equalsIgnoreCase(namePL)) {
				objSearch = playlists[i];
				found = true;
			}
		}
		return objSearch;
	}
	
	public void showUsers() {
		for(int i = 0; i < MAX_USERS; i++) {
			if(users[i] != null) {
				System.out.println(users[i].toString());
			}
		}
	}
	
	public void showSongs() {
		for(int i = 0; i < MAX_SONGS; i++) {
			if(songsPool[i] != null) {
				System.out.println(songsPool[i].toString());
			}
		}
	}
	
	public void showPlayLists() {
		for(int i = 0; i < MAX_PLAYLISTS; i++) {
			if(playlists[i] != null) {
				System.out.println(playlists[i].toString());
			}
		}
	}

}