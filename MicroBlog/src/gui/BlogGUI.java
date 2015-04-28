package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Date;

import javax.swing.*;

import base.Post;
import base.User;
import blog.Blog;


public class BlogGUI implements ActionListener {
	
	private JButton refresh,post; //**
	//private JButton post;
	private JTextArea postTextArea;
	private JTextArea postContent;
	private JFrame mainFrame;
	private JLabel infoOfArea;
	private JPanel postPanel;
	private User user= new User(01,"name","email@ust.hk");
	private Blog myBlog = new Blog(user);
	
	
	public BlogGUI(){
		
	}
	
	public void setWindow(){
		 mainFrame = new JFrame("Micro Blog Demo.");
		mainFrame.setLayout(new GridLayout(2,1));
		mainFrame.setSize(500, 500);
		
		refresh = new JButton("refresh");//create sth
		post = new JButton("post");
		post.addActionListener(new postListener()); 
		refresh.addActionListener(new refreshListener());
//            public void actionPerformed(ActionEvent e)
//            {postContent.setText("You click POST!");
//           }
//        });      
//		refresh.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e)
//            {postContent.setText("You click REFRESH!");
//           }
//        });  
		
		 postTextArea = new JTextArea("What is on your mind?",10,30);
		 postTextArea.addKeyListener(new lengthListerner());
		 postContent = new JTextArea("Here is puts my posts.",10,30);
		//postContent.setHorizontalAlignment(JTextField.CENTER);
		 //infoOfArea = new JLabel("You can still input 140 Characters");
		String content = postTextArea.getText();
		 infoOfArea = new JLabel("You can still input "+(140-content.length())+" Characters");
		
		 postPanel = new JPanel();// add sth
//		postTextArea.setBackground(Color.yellow);
		postPanel.setLayout(new BorderLayout());
		postPanel.add(infoOfArea,BorderLayout.NORTH);
		postTextArea.setBackground(new Color(255 ,255 ,220));//new color 
		
		postPanel.add(postTextArea,BorderLayout.CENTER);
//		postPanel.add(refresh,BorderLayout.LINE_START);
//		postPanel.add(post,BorderLayout.LINE_END);
			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new GridLayout(1,2));
			buttonPanel.add(refresh);
			buttonPanel.add(post);
		postPanel.add(buttonPanel,BorderLayout.SOUTH);
		postContent.setEditable(false);
		postContent.setBackground(new Color(220,220,220));//from web not success
		
		mainFrame.add(postPanel);
		mainFrame.add(postContent);
		mainFrame.setVisible(true);
	}


//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getSource() == post){
//			postContent.setText("You click POST!");
//			
//		}
//		else if(e.getSource()==refresh)
//			postContent.setText("You click REFRESH!");
//	}

	class postListener implements ActionListener{

	@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String content = postTextArea.getText();
		if(content.equals(null)){
			
		}
		if(content.length()>140){
			
		}
		Date d =new Date();
		Post newpost = new Post(d, content);
		
		myBlog.post(newpost);
		String savefilepath="C:/Users/cmyipaa.CSD/Desktop/blogfile.blog"; //**
		myBlog.save(savefilepath);
		postContent.setText(content);
		postTextArea.setText("");
		}
		
	}
	
	class refreshListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String loadfilepath="C:/Users/cmyipaa.CSD/Desktop/blogfile.blog"; //**
			try {
				myBlog.load(loadfilepath);
			} catch (ClassNotFoundException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace(); ////**************************************
			}
			postContent.setText(myBlog.printBlog());
			postTextArea.setText("");
			
		}
		
	}
	
	class lengthListerner implements KeyListener{
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			String content = postTextArea.getText();
			if(content.length()>140){
				infoOfArea.setText("Your post length has exceeded 140!");
			}
			infoOfArea.setText("You can still input "+(140-content.length())+" Characters");
		}

	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlogGUI blogGUI = new BlogGUI();
		blogGUI.setWindow();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	
}
