package model;

public class Song{
	//Attributes
	private String title;
	private String artistName;
	private String releaseDate;
	private int duration;
	
	//Relationships
	private Genre genre;
	
	//Builder
	public Song(String title, String artistName, String releaseDate, int duration, Genre genre){
		this.title = title;
		this.artistName = artistName;
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.genre = genre;
	}//End Builder
	
	//getters and setters
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getArtistName(){
		return artistName;
	}
	
	public void setArtistName(String artistName){
		this.artistName = artistName;
	}
	
	public String getReleaseDate(){
		return releaseDate;
	}
	
	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}
	
	public int getDuration(){
		return duration;
	}
	
	public void setDuration(int duration){
		this.duration = duration;
	}
	
	public Genre getGenre(){
		return genre;
	}
	
	public void setGenre(Genre genre){
		this.genre = genre;
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
	
	public String toString(){
		return "\n************* Song *************\n **  Title: " +title+ "\n **  Artist: " +artistName+ "\n **  Duration: " +convertDuration()+ "\n **  Genre: " +genre+"\n********************************";
	}
}