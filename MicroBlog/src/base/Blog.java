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
		this.allPosts.add(p); //OK?
		
//		int size = this.allPosts.size();	
//		int new_size = this.allPosts.size();
//		if(new_size==size+1){  //OK?
//			System.out.println("Create a new post successfully.");
//		}	
	}
	
	public void list(){
		if(!this.allPosts.isEmpty()){
			int size=this.allPosts.size();
			//int i;
			System.out.println("Current posts:");
			for(int i=0;i<size;i++){ //OK??
				System.out.print("Post["+(i+1)+"]:" );
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
	
	public String toString(){ //??????????what is the output
		return this.allPosts.toString();
	}
	//p.11 what does the slide mean?
	public boolean equals(Object o){
		if (this == o) return true;
		if(o == null) return false;
		if(getClass() != o.getClass()) return false;
		Blog blog = (Blog) o;
		if(!user.equals(blog.user)) return false;
		if(!allPosts.equals(blog.allPosts)) return false;
		return true;
	}
	public int hashCode(){
		int hashCode = 0;
		hashCode=user.hashCode()+allPosts.hashCode();
		return hashCode;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private Object i(int size, int i) {///?????????????????????
		// TODO Auto-generated method stub
		return null;
	}
}
