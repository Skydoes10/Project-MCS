package model;

public class User{
	
	//Attributes
	private String userName;
	private String password;
	private int age;
	private int amountSongs;
	
	//Relationships
	private Category category;
	
	//Builder
	public User(String userName, String password, int age, int amountSongs){
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.amountSongs = amountSongs;
		this.category = Category.NEWBIE;
	}//End Builder
	
	//getters and setters
	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAmountSongs(){
		return amountSongs;
	}
	
	public void setAmountSongs(int amountSongs){
		this.amountSongs = amountSongs;
	}
	
	public Category getCategory(){
		return category;
	}
	
	public void setCategory(Category category){
		this.category = category;
	}
	
	public void updateCategory() {
		if(getAmountSongs() > 2) {
			setCategory(Category.LITTLE_CONTRIBUTOR);
		}
		else if(getAmountSongs() > 9) {
			setCategory(Category.MILD_CONTRIBUTOR);
		}
		else if(getAmountSongs() > 29) {
			setCategory(Category.STAR_CONTRIBUTOR);
		}
	}
	
	
	
	public String toString(){
		updateCategory();
		return "\n************* User *************\n **  UserName: " +userName+ "\n **  Age: " +age+ "\n **  Category: " +category+ "\n********************************";
	}
	
}