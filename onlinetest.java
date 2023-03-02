

import java.awt.event.*;
import javax.swing.*;

class OnlineTest extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest(String s)
	{
		super(s);
		l=new JLabel();
		add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton("Bookmark");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);add(b2);
		set();
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);
		jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);
		jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);
		b2.setBounds(270,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
				count=count+1;
			current++;
			set();	
			if(current==9)
			{
				b1.setEnabled(false);
				b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Bookmark"))
		{
			JButton bk=new JButton("Bookmark"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);
			bk.addActionListener(this);
			m[x]=current;
			x++;
			current++;
			set();	
			if(current==9)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		if(e.getActionCommand().equals("Bookmark"+y))
		{
			if(check())
				count=count+1;
			now=current;
			current=m[y];
			set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		}
		}
	
		if(e.getActionCommand().equals("Result"))
		{
			if(check())
				count=count+1;
			current++;
			//System.out.println("correct ans="+count);
			JOptionPane.showMessageDialog(this,"correct ans="+count);
			System.exit(0);
		}
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Question 1: Which one among these is not a datatype");
			jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");	
		}
		if(current==1)
		{
			l.setText("Question 2: Is SQL a frontend or backend framework ?");
			jb[0].setText("FrontEnd");jb[1].setText("BackEnd");jb[2].setText("BOTH");jb[3].setText("None of the above");
		}
		if(current==2)
		{
			l.setText("Question 3:Which part of SQL Language provides commands for creating tables:");
			jb[0].setText("DDL");jb[1].setText("DML");jb[2].setText("DCL");jb[3].setText("ALL");
		}
		if(current==3)
		{
			l.setText("Question 4:String class is defined in which package");
			jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");
		}
		if(current==4)
		{
			l.setText("Question 5: The C Language is which type of language?");
			jb[0].setText("Procedural programming");jb[1].setText("Object Oriented programming");jb[2].setText("BOTH");jb[3].setText("None of the above");
		}
		if(current==5)
		{
			l.setText("Question 6: Which one among these is not a keyword");
			jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");
		}
		if(current==6)
		{
			l.setText("Question 7: In Which Year was C Language developed? ");
			jb[0].setText("1972 by dennis ritchie");jb[1].setText("1982 by dennis ritchie");jb[2].setText("1993 by dennis ritchie");jb[3].setText("1970 by dennis ritchie");
		}
		if(current==7)
		{
			l.setText("Question 8: Which of the following are the basic concepts of OOP:");
			jb[0].setText("Abstraction");jb[1].setText("Encapsulation");jb[2].setText("Inheritance");jb[3].setText("All of the above");		
		}
		if(current==8)
		{
			l.setText("Question 9:which statement of java allows us to define methods with logic:");
			jb[0].setText("class block");jb[1].setText("main method");jb[2].setText("print statement");jb[3].setText("all of the above");
		}
		if(current==9)
		{
			l.setText("Question 10: Which one among these is not a DDL command of SQL Language:");
			jb[0].setText("Create");jb[1].setText("Insert");jb[2].setText("Drop");jb[3].setText("Alter");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[2].isSelected());
		if(current==1)
			return(jb[1].isSelected());
		if(current==2)
			return(jb[0].isSelected());
		if(current==3)
			return(jb[0].isSelected());
		if(current==4)
			return(jb[0].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[3].isSelected());
		if(current==8)
			return(jb[0].isSelected());
		if(current==9)
			return(jb[1].isSelected());
		return false;
	}
	public static void main(String s[])
	{
		new OnlineTest("BRAIN_GYM Tutorials: TEST");
	}


}