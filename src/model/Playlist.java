package model;

abstract public class Playlist{
	//Constants
	public static final int SIZE = 7;
	
	//Relationships
	private Genre[] genres;
	private Song[] songs;
	
	//Attributes
	private String namePlaylist;
	private int duration;
	
	//Builder
	public Playlist(String namePlaylist, int duration){
		this.namePlaylist = namePlaylist;
		this.duration = duration;
		genres = new Genre[SIZE];
	}//End Builder
	
	//getters and setters
	public String getNamePlaylist(){
		return namePlaylist;
	}
	
	public void setNamePlaylist(String namePlaylist){
		this.namePlaylist = namePlaylist;
	}
	
	public int getDuration(){
		return duration;
	}
	
	public void setDuration(int duration){
		this.duration = duration;
	}
	
	public Song[] getSongs(){
		return songs;
	}
	
	public void setSongs(Song[] songs){
		this.songs = songs;
	}

	public void setPLGenres(Genre[] genres){
		this.genres = genres;
	}
	
	public Genre[] getPLGenres(){
		return genres;
	}
	
	public String convertDuration() {
		String converted = "";
		int duration, minutes, seconds, hours;
		duration = getDuration();
		if(duration >= 3600) {
			hours = duration/3600;
			minutes = ((duration-hours*3600)/60);
			seconds = duration-(hours*3600+minutes*60);
			if(seconds < 10 && minutes > 10) {
				converted = hours + minutes +":0"+ seconds;
			}
			else if(seconds > 10 && minutes < 10) {
				converted = hours +":0"+ minutes +":"+ seconds;
			}
			else if(seconds < 10 && minutes < 10) {
				converted = hours +":0"+ minutes +":0"+ seconds;
			}
			else {
				converted = hours +":"+ minutes +":"+ seconds;
			}
		}
		else {
			minutes = duration/60;
			seconds = duration-(minutes*60);
			if(seconds < 10) {
				converted = minutes +":0"+ seconds;
			}
			else {
				converted = minutes +":"+ seconds;
			}
		}
		return converted;
	}
	
	public String printGenres() {
		boolean end = false;
		String enviar = "";
		if(genres[0] != null) {
			enviar = ""+genres[0];
		}
		for(int i = 1; i < genres.length && !end; i++) {
			if(genres[i] != null) {
				if(genres[i-1] == genres[i]) {
					end = true;
				}
				else {
					enviar += ", "+genres[i];
				}
			}
			else if(genres[i] == null) {
				end = true;
			}
		}
		return enviar;
	}
}