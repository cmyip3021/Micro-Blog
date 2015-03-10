package base;
public class User implements Comparable<User>{
	private int ID;
	private String name;
	private String email;
	
	public User(int id, String name, String email){
		this.ID=id;
		this.name=name;
		this.email=email;
		
	}
	
	public String toString(){
		return "User [userId="+this.ID+", userName="+this.name+", userEmail="+this.email+"]";
	}
	public int getID(){
		return this.ID;
	}
	public void setID(int id){
		this.ID=id;
	}
	
	public String getName(){
		return this.name;
	}
	public void setID(String name){
		this.name=name;
	}
	
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	
	public int compareTo(User u){
		if(this.ID>u.ID)
			return 1;
		else if(this.ID<u.ID)
			return -1;
		else //if(this.ID ==u.ID)
			return 0;
	}
	
	
}
