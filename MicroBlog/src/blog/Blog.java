package blog;
import base.*;

import java.util.ArrayList;
import java.util.Calendar;


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
		this.allPosts.add(p); 
		
//		int size = this.allPosts.size();	
//		int new_size = this.allPosts.size();
//		if(new_size==size+1){  //OK?
//			System.out.println("Create a new post successfully.");
//		}	
	}
	
	public void list(){
		if(!this.allPosts.isEmpty()){ //what if size=0
			int size=this.allPosts.size();
			//int i;
			System.out.println("Current posts:");
			for(int i=0;i<size;i++){ //OK??
				System.out.print("Post["+(i+1)+"]:" );
				System.out.println(this.allPosts.get(i));
				//Post[1]:Mon Mar 09 17:02:07 CST 2015
				//123 since allPosts is arraylist<Post>
				//which have attributes:date and content
			
			}
		}
	}
	
	public void delete(int index){
		int size=this.allPosts.size();
		if(size>index && index>-1){
			this.allPosts.remove(index);
		}
		else{
			System.out.println("Illegal deletion.");
		}
	}
	
	public String toString(){  // why can use toString()?
		return this.allPosts.toString();
	}
	//p.11 what does the slide mean?
	public boolean equals(Object o){
		if (this == o) return true;		// check memory address(object)
										// check values (primitive type)
										//				e.g. int, double
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

	public void search(int month, String someone){
		
		Calendar cal = Calendar.getInstance();
		for (Post p: allPosts){
			
			cal.setTime(p.getDate());
			int postMonth = cal.get(Calendar.MONTH);
			postMonth=postMonth+1;
			if(month==postMonth){
				if(p.contains(someone)){
					System.out.println(p);
				}
			}
				
			
		}
		
	}
	
	
	
	
	
	
	
	private Object i(int size, int i) {///?????????????????????
		// TODO Auto-generated method stub
		return null;
	}

	public void setPosts(ArrayList<Post> allposts2) {
		// TODO Auto-generated method stub
		this.allPosts=allposts2;
	}
}