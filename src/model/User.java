package model;

public class User{
	//Constants
	public static final int MAXPL = 5;
	
	//Attributes
	private String userName;
	private String password;
	private int age;
	private Category category;
	
	//Relationships
	
	//Builder
	public User(String userName, String password, int age){
		this.userName = userName;
		this.password = password;
		this.age = age;
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
	
	public String toString(){
		return "\n************* User *************\n **  UserName: " +userName+ "\n **  Age: " +age+ "\n **  Category: " +category+ "\n********************************";
	}
	
}