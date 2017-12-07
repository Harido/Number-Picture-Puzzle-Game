//**************************
// Name: Khalid Francis
// Student ID: st20086664

// Name: Kamrul Haque
// Student ID: st20086633

// Name: Houssein Abdillahi
// Student ID: st20064411

// Name: Haya Fahad A Alshalan
// Student ID: st20108912

// Name:Abdi Hassan 
// Student ID: st20086716
//**************************


package PicturePuzzleGame;

	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;

	public class PicturePuzzleGUI extends JFrame implements ActionListener {

	//Button and box list
		JButton box1, box2, box3, box4, box5, box6, box7, box8, box9; 
			
		// this is part is to add the picture parts
		Icon number;
		Icon PictureBox1 = new ImageIcon ("Picture/NG5.PNG");
		Icon PictureBox2 = new ImageIcon ("Picture/NG7.PNG");
		Icon PictureBox3 = new ImageIcon ("Picture/NG6.PNG");
		Icon PictureBox4 = new ImageIcon ("Picture/NG4.PNG");
		Icon PictureBox5 = new ImageIcon ("Picture/NG8.PNG");
		Icon PictureBox6 = new ImageIcon ("Picture/NG3.PNG");
		Icon PictureBox7 = new ImageIcon ("Picture/NG2.PNG");
		Icon PictureBox8 = new ImageIcon ("Picture/NG1.PNG");
		
	    // this part of the code is to start the window application	
		public static void main(String args[]) {
		
			PicturePuzzleGUI ppg = new PicturePuzzleGUI();
			
		}// end of main method 

		private JPanel panel;
		public JButton newGame;
		
		PicturePuzzleGUI() {
			
			super("Picture Puzzle");

			panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(Color.black);
			setContentPane(panel);
			
			//This code is for adding the boxes
			box1 = new JButton(PictureBox1);
			box1.setBounds(93,13,100,100);
			box1.setBackground(Color.black);
			panel.add(box1);
			
			box2 = new JButton(PictureBox2);
			box2.setBounds(205,13,100,100);
			box2.setBackground(Color.black);
			panel.add(box2);
			
			box3 = new JButton(PictureBox3);
			box3.setBounds(317,13,100,100);
			box3.setBackground(Color.black);
			panel.add(box3);
			
			box4 = new JButton(PictureBox4);
			box4.setBounds(93,120,100,100);
			box4.setBackground(Color.black);
			panel.add(box4);
			
			box5 = new JButton(PictureBox5);
			box5.setBounds(205,126,100,100);
			box5.setBackground(Color.black);
			panel.add(box5);
			
			box6 = new JButton(PictureBox6);
			box6.setBounds(317,126,100,100);
			box6.setBackground(Color.black);
			panel.add(box6);
			
			box7 = new JButton(PictureBox7);
			box7.setBounds(93,235,100,100);
			box7.setBackground(Color.black);
			panel.add(box7);
			
			box8 = new JButton(PictureBox8);
			box8.setBounds(205,235,100,100);
			box8.setBackground(Color.black);
			panel.add(box8);
			
			box9 = new JButton();
			box9.setBounds(317,235,100,100);
			box9.setBackground(Color.black);
			panel.add(box9);
			
			//this code is for the new game button 
			newGame = new JButton(); 
			newGame.setText("New Game");
			newGame.setBounds(205,404,100,72);
			newGame.addActionListener(new newGameAction());
			panel.add(newGame);
			
			// this is to add all the box button to the action listener 
			add(box1);add(box2);add(box3);add(box4);
			add(box5);add(box6);add(box7);add(box8);
			
			box1.addActionListener(this);box2.addActionListener(this);
			box3.addActionListener(this);box4.addActionListener(this);
			box5.addActionListener(this);box6.addActionListener(this);
			box7.addActionListener(this);box8.addActionListener(this);

			// this part of the code is to creat the window	
			setTitle("Picture Puzzle Game");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(new Dimension(500, 600));
			setLocationRelativeTo(null);
			setResizable(false);
			setVisible(true);	
			}//end of PicturePuzzleGUI method

		// this is the function for the boxes to move from left, right, top and down
		@Override
		public void actionPerformed(ActionEvent e) {

		if(e.getSource()==box1){
			Icon s1=box1.getIcon();
			if(box2.getIcon()==number) {
				box2.setIcon(s1);
				box1.setIcon(number);
			}else if(box4.getIcon()==number) {
				box4.setIcon(s1);
				box1.setIcon(number);
			}
		}//end of if statement	
		
		if(e.getSource()==box2){
			Icon s1=box2.getIcon();
			if(box1.getIcon()==number) {
				box1.setIcon(s1);
				box2.setIcon(number);
			}else if(box4.getIcon()==number) {
				box5.setIcon(s1);
				box2.setIcon(jaguar);
			}
			else if(box3.getIcon()==number){
				box3.setIcon(s1);
				box2.setIcon(number);
			}
		}//end of if statement
			
		if(e.getSource()==box3){
			Icon s1=box3.getIcon();
			if(box2.getIcon()==number) {
				box2.setIcon(s1);
				box3.setIcon(number);
			}else if(box4.getIcon()==number) {
				box6.setIcon(s1);
				box3.setIcon(number);
			}
		}//end of if statement	
		
		if(e.getSource()==box4){
			Icon s1=box4.getIcon();
			if(box1.getIcon()==number) {
				box1.setIcon(s1);
				box4.setIcon(jaguar);
			}else if(box5.getIcon()==number) {
				box5.setIcon(s1);
				box4.setIcon(number);
			}
			else if(box7.getIcon()==number){
				box7.setIcon(s1);
				box4.setIcon(number);
			}
		}//end of if statement
			
		if(e.getSource()==box5) {
			Icon s1=box5.getIcon();
			if(box2.getIcon()==number) {
			box2.setIcon(s1);
			box5.setIcon(number);
			
			}else if(box4.getIcon()==number) {
					box4.setIcon(s1);
					box5.setIcon(number);
		}else if (box6.getIcon()==number) {
				box6.setIcon(s1);
				box5.setIcon(number);	
		}else if (box8.getIcon()==number) {
			box8.setIcon(s1);
			box5.setIcon(number);		
		}
		}//end of if statement
		
			if(e.getSource()==box6){
				Icon s1=box6.getIcon();
				if(box3.getIcon()==number) {
					box3.setIcon(s1);
					box6.setIcon(number);
				}else if(box5.getIcon()==number) {
					box5.setIcon(s1);
					box6.setIcon(number);
				}else if(box9.getIcon()==number){
					box9.setIcon(s1);
					box6.setIcon(number);
				}
			}//end of if statement
		
			if(e.getSource()==box7){
				Icon s1=box7.getIcon();
				if(box4.getIcon()==number) {
					box4.setIcon(s1);
					box7.setIcon(number);
				}else if(box8.getIcon()==number) {
					box8.setIcon(s1);
					box7.setIcon(number);
				}
			}//end of if statement	
			
			if(e.getSource()==box8){
				Icon s1=box8.getIcon();
				if(box7.getIcon()==number) {
					box7.setIcon(s1);
					box8.setIcon(number);
				}else if(box5.getIcon()==number) {
					box5.setIcon(s1);
					box8.setIcon(number);
				}else if(box9.getIcon()==number){
					box9.setIcon(s1);
					box8.setIcon(number);
				}
			}//end of if statement
			
			if(e.getSource()==box9){
				Icon s1=box9.getIcon();
				if(box8.getIcon()==number) {
					box8.setIcon(s1);
					box9.setIcon(number);
				}else if(box6.getIcon()==number) {
					box6.setIcon(s1);
					box9.setIcon(number);
				}
			}//end of if statement	
		}//end of action listener
		
		//this part of the code is the function of new game so that it can restart the game
		public class newGameAction implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent evt) {

				if(evt.getSource() == newGame)
				{
				dispose ();
				PicturePuzzleGUI game = new PicturePuzzleGUI();
				game.setVisible(true);
				
				}// end of if statment
			} //end of actionPerformed
		}//end of newGameAction class
	}//end of PicturePuzzleGUI class
	
	
		
