package model;

public class SharedPL extends Playlist{
	
	private String[] users;
	
	public SharedPL(String namePlaylist, String[] users, int duration){
		super(namePlaylist, duration);
		this.users = users;
	}
	
	public String[] getUsers(){
		return users;
	}
	
	public void setUsers(String[] users){
		this.users = users;
	}
	
	public String toString(){
		return "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +getDuration()+ "\n **  Genre: " +getPLGenres()+ "\n **  Members: " +members()+ "\n********************************";
	}
	
	public String members() {
		return "\n" +
				 "   **  "+users[0] +
				 "   **  "+users[1] +
				 "   **  "+users[2] +
				 "   **  "+users[3] +
				 "   **  "+users[4];
	}
}