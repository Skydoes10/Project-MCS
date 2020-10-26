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
	
	public String toString(){
		return "\n************* Song *************\n **  Title: " +title+ "\n **  Artist: " +artistName+ "\n **  Duration: " +duration+ "\n **  Genre: " +genre+"\n********************************";
	}
	
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
}