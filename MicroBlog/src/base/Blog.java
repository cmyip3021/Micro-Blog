package base;
import base.*;
import java.util.ArrayList;


public class Blog {
	
	private User user;
	private ArrayList<Post> allPosts;
	
	public Blog(User user){
		ArrayList<Post> list = new ArrayList<Post>(); //OK?
		
		this.user=user;
		this.allPosts=list;
	}
	
	public void setUser(User user){
		this.user=user;
	}
	
	public User getUser(){
		return this.user;
	}
	
	public void post(Post p){
		int size = this.allPosts.size();
		this.allPosts.add(p); //OK?
		int new_size = this.allPosts.size();
		if(new_size==size+1){  //OK?
			System.out.println("Create a new post successfully.");
		}	
	}
	
	public void list(){
		if(!this.allPosts.isEmpty()){
			int size=this.allPosts.size();
			//int i;
			for(int i=0;i<size;i++){ //OK??
				System.out.println(this.allPosts.get(i));
			}
		}
	}
	
	public void delete(int index){
		int size=this.allPosts.size();
		if(size>index && index>-1){
			this.allPosts.remove(index);
		}
		else{
			System.out.println("The input index is illegal.");
		}
	}
	
//	public String toString(){ //??????????what is the output
//	
//	}
//	 //p.11 what does the slide mean?
//	public boolean equals(Object o){
//		
//	}
//	public int hashCode(){
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private Object i(int size, int i) {///?????????????????????
		// TODO Auto-generated method stub
		return null;
	}
}
