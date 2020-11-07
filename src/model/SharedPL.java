package model;

public class SharedPL extends Playlist{
	
	private String[] users;
	
	public SharedPL(String namePlaylist, String[] users, int duration){
		super(namePlaylist, duration);
		users = new String[5];
	}
	
	public String[] getUsers(){
		return users;
	}
	
	public void setUsers(String[] users){
		this.users = users;
	}
	
	public String toString(){ 
		String out;
		if(getPLGenres()[0] == null) {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre:  \n **  Members: " +members()+ "\n************************************";
		}
		else {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre: " +printGenres()+ "\n **  Members: " +members()+ "\n************************************";
		}
		return out;
	}
	
	public String members() {
		return  "\n   **  "+users[0] +
				"\n   **  "+users[1] +
				"\n   **  "+users[2] +
				"\n   **  "+users[3] +
				"\n   **  "+users[4];
	}
	
}