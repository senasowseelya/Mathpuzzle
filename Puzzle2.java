import java.awt.*;  
import java.awt.event.*;  
import javax.swing.JOptionPane;  
import javax.swing.*;
import java.util.*;
import java.io.IOException;


public class Puzzle2 extends JFrame {  
  public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setExtendedState( f.getExtendedState()|JFrame.MAXIMIZED_BOTH );
	f.setVisible(true);
	JButton b=new JButton("NUMBER PUZZLE");
	b.setFont(new Font("Sans Serif", Font.PLAIN,100));
	b.setBackground(Color.lightGray);
	b.setForeground(Color.RED);
	f.add(b);
	try{
	Thread.sleep(2000);
	}
	catch(InterruptedException e)
	{
	e.printStackTrace();}
	f.setVisible(false);
    f.dispose();
	JFrame frame=new JFrame();
	frame.setExtendedState( frame.getExtendedState()|JFrame.MAXIMIZED_BOTH );
	frame.setSize(1500,5000);
	frame.setVisible(true);
	frame.setTitle("");
	JButton start=new JButton("START"); 
	start.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		Level ob= new Level();
		ob.Leveleasy();
		}
	});
    start.setBounds(80,30,120,40);	
	start.setVisible(true);
    JButton level=new JButton("LEVEL");
    level.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
			JFrame l=new JFrame();
			l.setExtendedState( f.getExtendedState()|JFrame.MAXIMIZED_BOTH );
	        JButton easy=new JButton("EASY");
	        easy.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent e)
			{
			Level ob =new Level();
			ob.Leveleasy();
			}	
	        });
	        easy.setBounds(80,30,120,40);
			easy.setVisible(true);			
			l.add(easy);
			JButton medium=new JButton("MEDIUM");
			medium.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e)
			{
			Level ob =new Level();
			ob.Levelmedium();
			}	
	        });
			medium.setBounds(80,70,120,40);
			medium.setVisible(true);	
			l.add(medium);
			JButton hard=new JButton("HARD");
			hard.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e)
			{
			Level ob =new Level();
			ob.Levelhard();
			}	
	        });
            
			hard.setBounds(80,100,120,40);
			hard.setVisible(true);
			 l.add(hard);			
			easy.setFont(new Font("Sans Serif", Font.PLAIN, 60));
			easy.setBackground(Color.WHITE);
			easy.setForeground(Color.RED);
			medium.setFont(new Font("Sans Serif", Font.PLAIN, 60));
			medium.setBackground(Color.WHITE);
			medium.setForeground(Color.RED);
			hard.setFont(new Font("Sans Serif", Font.PLAIN, 60));
			hard.setBackground(Color.WHITE);
			hard.setForeground(Color.RED);
			l.setSize(200,200);
			l.setTitle("");
			l.dispose();
			l.pack();
			l.setVisible(true);
			l.setLayout(new GridLayout(3,1,20,0)); 
			}});	
	level.setBounds(80,70,120,40);
    level.setVisible(true);
	JButton instructions=new JButton("INSTRUCTIONS"); 
	instructions.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
	{
	    JFrame p= new JFrame();
		p.setExtendedState( p.getExtendedState()|JFrame.MAXIMIZED_BOTH );
	    JTextArea textArea = new JTextArea();
        textArea.setText("\n\n\n\n                                               PUZZLE GAME INSTRUCTIONS\n\n\n			1.Click  on the button adjacent to the Empty Button so that the button will be replaced by the empty slot\n\n\n			2.Arrange all the numbers in ascending order(1 2 3 4 ...)\n\n\n			3.Arrange them in given time or else the game will be stopped");
        Font font = new Font("Sans Serif", Font.BOLD, 20);
        textArea.setEditable(false);
		textArea.setFont(font); 
        textArea.setForeground(Color.BLACK);
        p.add(textArea);
		p.dispose();
        p.pack();
        p.setVisible(true);
	
	}
	});
	instructions.setBounds(80,100,120,40);
    instructions.setVisible(true);
	JButton quit=new JButton("QUIT");  
    quit.setBounds(80,150,120,40);
	quit.addActionListener(e -> {
     int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Are you sure to quit the game?", 
                                  "Choose", 
                                  JOptionPane.YES_NO_OPTION);  
if (selectedOption == JOptionPane.YES_OPTION) {
	System.exit(0);
    
}

});
	start.setFont(new Font("Sans Serif", Font.PLAIN, 60));
    start.setBackground(Color.WHITE);
	start.setForeground(Color.RED);
	level.setFont(new Font("Sans Serif", Font.PLAIN, 60));
    level.setBackground(Color.WHITE);
	level.setForeground(Color.RED);
	instructions.setFont(new Font("Sans Serif", Font.PLAIN, 60));
    instructions.setBackground(Color.WHITE);
	instructions.setForeground(Color.RED);
	quit.setFont(new Font("Sans Serif", Font.PLAIN, 60));
    quit.setBackground(Color.WHITE);
	quit.setForeground(Color.RED);
	frame.add(start); 
	frame.add(level);
	frame.add(instructions);   
	frame.add(quit);  
	frame.setLayout(new GridLayout(4,1,20,0));  
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }	
}  
 








































