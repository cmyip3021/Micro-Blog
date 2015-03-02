package base;
import java.util.Date;

public class Post {

	private Date date;
	private String content;
	
	public Post(Date date, String content){
		this.date = date;
		this.content = content;
		System.out.println(date);
	}
	
	public String getContent(){
		return this.content;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public String toString(){
		return getContent();
	}
	
	public boolean equals(Object o){
		if (this == o) return true;
		if(o == null) return false;
		if(getClass() != o.getClass()) return false;
		Post post = (Post) o;
		if(!date.equals(post.date)) return false;
		if(!content.equals(post.content)) return false;
		return true;
	}
	/*what is hashCode()*/
	public int hashCode(){
		int hashCode = 0;
		date.hashCode();
		content.hashCode();
		return hashCode;
	}
	
	public boolean contains(String keyword){
		if(this.content.contains(keyword))
			return true;
		else
			return false;
	}
}
