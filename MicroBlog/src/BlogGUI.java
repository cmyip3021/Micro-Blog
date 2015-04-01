import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BlogGUI implements ActionListener {
	
	private JButton refresh;
	private JButton post;
	private JTextArea postTextArea;
	private JTextField postContent;
	private JFrame mainFrame;
	private JLabel infoOfArea;
	private JPanel postPanel;
	
	public BlogGUI(){
		
	}
	
	public void setWindow(){
		JFrame mainFrame = new JFrame("Micro Blog Demo.");
		mainFrame.setLayout(new GridLayout(2,1));
		mainFrame.setSize(500, 500);
		
		JButton refresh = new JButton("refresh");//create sth
		JButton post = new JButton("post");
		post.addActionListener(this);
					//new ActionListener() {
//            public void actionPerformed(ActionEvent e)
//            {postContent.setText("You click POST!");
//           }
//        });      
//		refresh.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e)
//            {postContent.setText("You click REFRESH!");
//           }
//        });  
				
		JTextArea postTextArea = new JTextArea("What is on your mind?",10,30);
		JTextField postContent = new JTextField("Here is puts my posts.",30);
		postContent.setHorizontalAlignment(JTextField.CENTER);
		JLabel infoOfArea = new JLabel("something here");
		
		JPanel postPanel = new JPanel();// add sth
//		postTextArea.setBackground(Color.yellow);
		postPanel.setLayout(new BorderLayout());
		postPanel.add(infoOfArea,BorderLayout.NORTH);
		postTextArea.setBackground(new Color(255 ,255 ,220));//new color 
		
		postPanel.add(postTextArea,BorderLayout.CENTER);
//		postPanel.add(refresh,BorderLayout.LINE_START);
//		postPanel.add(post,BorderLayout.LINE_END);
			JPanel buttonPanel = new JPanel();
//			buttonPanel.setLayout(new BorderLayout());
			buttonPanel.add(refresh);
			buttonPanel.add(post);
		postPanel.add(buttonPanel,BorderLayout.SOUTH);
		postContent.setEditable(false);
		postContent.setBackground(new Color(220,220,220));//from web not success
		
		mainFrame.add(postPanel);
		mainFrame.add(postContent);
		mainFrame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == post){
			postContent.setText("You click POST!");
			
		}
//		else if(e.getSource()==refresh)
//			postContent.setText("You click REFRESH!");
	}

	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlogGUI blogGUI = new BlogGUI();
		blogGUI.setWindow();

	}


	
}
