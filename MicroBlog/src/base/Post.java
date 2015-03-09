package base;
import java.util.Date;

public class Post implements Comparable<Post>{

	private Date date;
	private String content;
	
	public Post(Date date, String content){
		this.date = date;
		this.content = content;
		
	}
	
	public String getContent(){
		return this.content;
	}
	
	public void setContent(String content){
		this.content = content;
	}
								//return what u want only ,not print
	public String toString(){   // System.out.println(post);
								//result in:
								//Mon Mar 09 17:02:07 CST 2015
								//123
		return this.date+"\n"+getContent();
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
		hashCode=date.hashCode()+content.hashCode();
		return hashCode;
	}
	
	public boolean contains(String keyword){
		if(this.content.contains(keyword))
			return true;
		else
			return false;
	}

	@Override
	public int compareTo(Post p) {  //????before after
		//sort:compareTo() + implements Comparable<type>
					
		// TODO Auto-generated method stub
		if(this.date.after(p.date))
			return 1;
		else if (this.date.before(p.date))
			return -1;
		else
			return 0;
	}
}
