package model;

public class MCS{
	//Constants
	public static final int MAX_USERS = 10;
	public static final int MAX_SONGS = 50;
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
					users[i] = new User(userName, password, age, 0);
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
	
	public String addSong(String title, String artistName, String releaseDate, int duration, int pGenre, String userName){
		String message = "La cancion ha sido agregada con exito";
		boolean added = false;
		Song objSearch = findSong(title, artistName);
		if(objSearch == null){
			if(amountSongs(userName) == true) {
				message = "No se pudo agregar la cancion al pool de canciones";
			}
			else {
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
			    default: message = "Opcion no valida";
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
		}
		else{
			message = "La cancion ya ha sido agregada anteriormente";
		}
		return message;
	}
	
	public String addPlayList(String namePL, String userName) {
		String message = "La playlist se creo con exito";
		boolean added = false;
		Playlist objSearch = findPL(namePL);
		User objSearch2 = findUser(userName);
		if(objSearch2 != null) {
			if(objSearch == null){
				for(int i = 0; i < MAX_PLAYLISTS && !added; i++){
					if(playlists[i] == null){
						playlists[i] = new PrivatePL(namePL, userName, 0);
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
		}
		else {
			message = "Usuario no encontrado";
		}
		return message;	
	}
		
	public String addPlayList(String namePL, String[] userNames) {	
		String message;
		boolean added = false;
		Playlist objSearch = findPL(namePL);
		message = findUser(userNames);
		if(message == "") {
			if(objSearch == null){
				for(int i = 0; i < MAX_PLAYLISTS && !added; i++){
					if(playlists[i] == null){
						playlists[i] = new SharedPL(namePL, userNames, 0);
						added = true;
						message = "La playlist se creo con exito";
					}
				}
				if (added == false){
					message = "Limite de playlists alcanzado";
				}
			}
			else{
				message = "Una playlist con el mismo nombre ya ha sido creada";
			}
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
					playlists[i] = new PublicPL(namePL, 0.0, 0, 0);
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
	
	public String addSongtoPlay(String namePL, String title, String nameArtist) {
		String message = "La cancion se agrego con exito a la Playlist";
		boolean added = false;
		Playlist objSearch = findPL(namePL);
		Song objSearch2 = findSong(title, nameArtist);
		if(objSearch != null && objSearch2 != null) {
			if(objSearch instanceof PublicPL){
				objSearch.setDuration(objSearch.getDuration() + objSearch2.getDuration());
				for(int i = 0; i < objSearch.getPLGenres().length && !added; i++) {
					if(objSearch.getPLGenres()[i] == objSearch2.getGenre()) {
						added = true;
					}
					else if(objSearch.getPLGenres()[i] == null) {
						objSearch.getPLGenres()[i] = objSearch2.getGenre();
						objSearch.setPLGenres(objSearch.getPLGenres());
						added = true;
					}
				}
			}
				if (added == false){
					message = "Limite de la playlist alcanzado";
				}
		}
		else{
			message = "La playlist o la cancion no existen";
		}
		return message;
	}
	
	public String addSongtoPlay(String namePL, String title, String nameArtist, String userName) {
		String message = "La cancion se agrego con exito a la Playlist";
		boolean added = false;
		Playlist objSearch = findPL(namePL);
		Song objSearch2 = findSong(title, nameArtist);
		User objSearch3 = findUser(userName);
		if(objSearch != null && objSearch2 != null && objSearch3 != null) {
			if(objSearch instanceof PrivatePL){
				if(((PrivatePL) objSearch).getCreatorUser().equalsIgnoreCase(objSearch3.getUserName())) {
					objSearch.setDuration(objSearch.getDuration() + objSearch2.getDuration());
					for(int i = 0; i < objSearch.getPLGenres().length && !added; i++) {
						if(objSearch.getPLGenres()[i] == objSearch2.getGenre()) {
							added = true;
						}
						else if(objSearch.getPLGenres()[i] == null) {
							objSearch.getPLGenres()[i] = objSearch2.getGenre();
							added = true;
						}
					}
				}
			}
			else if(objSearch instanceof SharedPL) {
				for(int e = 0; e < ((SharedPL) objSearch).getUsers().length; e++) {
					if(((SharedPL) objSearch).getUsers()[e].equalsIgnoreCase(objSearch3.getUserName())) {
						objSearch.setDuration(objSearch.getDuration() + objSearch2.getDuration());
						for(int i = 0; i < objSearch.getPLGenres().length && !added; i++) {
							if(objSearch.getPLGenres()[i] == objSearch2.getGenre()) {
								added = true;
							}
							else if(objSearch.getPLGenres()[i] == null) {
								objSearch.getPLGenres()[i] = objSearch2.getGenre();
								added = true;
							}
						}
					}
				}
			}
				if (added == false){
					message = "Limite de la playlist alcanzado";
				}
		}
		else{
			message = "La playlist o la cancion no existen";
		}
		return message;
	}
	
	public String ratePL(String namePL, String userName, double score) {
		String message = "La calificaion fue un exito!";
		double rate;
		int amount = 0;
		Playlist objSearch = findPL(namePL);
		User objSearch2 = findUser(userName);
		if(objSearch != null && objSearch2 != null) {
			if(objSearch instanceof PublicPL) {
				if(score <= 5) {
					rate = ((PublicPL) objSearch).getScore();
					rate += score;
					amount++;
					amount += ((PublicPL) objSearch).getAmountScores();
					((PublicPL) objSearch).setScore(rate);
					((PublicPL) objSearch).setAmountScores(amount);
				}
				else {
					message = "La calificacion debe estar entre 1 y 5";
				}
			}
			if(!(objSearch instanceof PublicPL)) {
				message = "La playlist no es una playlist publica";
			}
		}
		else if(objSearch != null && objSearch2 == null) {
			message = "El usuario no esta registrado";
		}
		else if(objSearch == null && objSearch2 != null) {
			message = "Playlist no encontrada";
		}
		else if(objSearch == null && objSearch2 == null) {
			message = "Playlist no encontrada y el usuario no esta registrado";
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
	
	public String findUser(String[] userNames){
		boolean end = false;
		String userName, message = "";
		for(int e = 0; e < userNames.length && !end; e++){
			userName = userNames[e];
			boolean found = false;
			for(int i = 0; i < MAX_USERS; i++){	
				if(users[i] != null && users[i].getUserName().equalsIgnoreCase(userName)){
					found = true;
				}
			}
			if(found == false) {
				end = true;
				message = "Un usuario no fue encontrado";
			}
		}
		return message;
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
	
	public boolean amountSongs(String userName){
		int amountSongs;
		boolean search = true;
		for(int i = 0; i < MAX_USERS && search; i++){
			if(users[i] != null && users[i].getUserName().equalsIgnoreCase(userName)){
				amountSongs = users[i].getAmountSongs();
				amountSongs ++;
				users[i].setAmountSongs(amountSongs);
				search = false;
			}
		}
		if(search == true) {
			System.out.println("Usuario no encontrado");
		}
		return search;
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