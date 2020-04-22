import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import javax.swing.*;
class first implements ActionListener
{
	
	String s,s0,s1,s2;
		
	JMenuBar menubar=new JMenuBar();
	JMenu theme;
	
	JMenuItem default_r,blue,green,black,pink,yellow,cyan,lightgray,lightgreen;
	JLabel jl=new JLabel();
	
	private static int WIDTH=400;
	private static int HIEGHT=400;
	
	static JFrame frame=new JFrame(" BY ABULALA KARIMUDDIN SHAIKH ");
	
	static JPanel panel=new JPanel();;
	static JPanel button_panel=new JPanel(new GridLayout(5,4));
	
	JTextField enter=new JTextField(20);
	
	Font font=new Font("ARIEL",25,25);
	
	JButton square,zero,one,two,three,four,five,six,seven,eight,nine,add,sub,mult,div,allclear,dot,equals,percent,clear;
	first()
	{	 
		s0=s1=s2="";
				
		frame.setSize(WIDTH, HIEGHT);
		
		enter.setForeground(Color.RED);
		enter.setAlignmentX(enter.RIGHT_ALIGNMENT);
		enter.setPreferredSize(new Dimension(400,70));
		
		frame.add(enter,BorderLayout.NORTH);
		//menu bar
		
	}
	void Theme()
	{
		theme=new JMenu("THEME");
		
		default_r=new JMenuItem("RED");
		
		blue=new JMenuItem("BLUE");
		
		green=new JMenuItem("GREEN");
		
		black=new JMenuItem("BLACK");
		
		pink=new JMenuItem("PINK");
		
		yellow=new JMenuItem("YELLOW");
		
		cyan=new JMenuItem("CYAN");
		
		lightgray=new JMenuItem("LIGHT GREY");
		
		lightgreen=new JMenuItem("LIGHT GREEN");
		
		theme.add(default_r);
		theme.add(blue);
		theme.add(green);
		theme.add(black);
		theme.add(pink);
		theme.add(yellow);
		theme.add(cyan);
		theme.add(lightgray);
		theme.add(lightgreen);
		
		menubar.add(theme);
		frame.setJMenuBar(menubar);
		
		pink.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==pink)
				{
					zero.setForeground(Color.PINK);
					zero.setBackground(Color.WHITE);
					
					one.setForeground(Color.PINK);
					one.setBackground(Color.WHITE);
					
					two.setForeground(Color.PINK);
					two.setBackground(Color.WHITE);
					
					three.setForeground(Color.PINK);
					three.setBackground(Color.WHITE);
					
					four.setForeground(Color.PINK);
					four.setBackground(Color.WHITE);
					
					five.setForeground(Color.PINK);
					five.setBackground(Color.WHITE);
					
					six.setForeground(Color.PINK);
					six.setBackground(Color.WHITE);
					
					seven.setForeground(Color.PINK);
					seven.setBackground(Color.WHITE);
					
					eight.setForeground(Color.PINK);
					eight.setBackground(Color.WHITE);
					
					nine.setForeground(Color.PINK);
					nine.setBackground(Color.WHITE);
				
					allclear.setForeground(Color.WHITE);
					allclear.setBackground(Color.PINK);
					
					clear.setForeground(Color.WHITE);
					clear.setBackground(Color.PINK);
					
					dot.setForeground(Color.PINK);
					dot.setBackground(Color.WHITE);
					
					percent.setForeground(Color.WHITE);
					percent.setBackground(Color.PINK);
					
					add.setForeground(Color.WHITE);
					add.setBackground(Color.PINK);
					
					sub.setForeground(Color.WHITE);
					sub.setBackground(Color.PINK);
					
					mult.setForeground(Color.WHITE);
					mult.setBackground(Color.PINK);
					
					div.setForeground(Color.WHITE);
					div.setBackground(Color.PINK);
					
					equals.setForeground(Color.white);
					equals.setBackground(Color.PINK);
					
					square.setBackground(Color.WHITE);
					square.setForeground(Color.PINK);
					
					enter.setForeground(Color.PINK);

				}
			}
		});
		blue.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==blue)
				{
					enter.setForeground(Color.BLUE);

					
					zero.setForeground(Color.BLUE);
					zero.setBackground(Color.WHITE);
					
					one.setForeground(Color.BLUE);
					one.setBackground(Color.WHITE);
					
					two.setForeground(Color.BLUE);
					two.setBackground(Color.WHITE);
					
					three.setForeground(Color.BLUE);
					three.setBackground(Color.WHITE);
					
					four.setForeground(Color.BLUE);
					four.setBackground(Color.WHITE);
					
					five.setForeground(Color.BLUE);
					five.setBackground(Color.WHITE);
					
					six.setForeground(Color.BLUE);
					six.setBackground(Color.WHITE);
					
					seven.setForeground(Color.BLUE);
					seven.setBackground(Color.WHITE);
					
					eight.setForeground(Color.BLUE);
					eight.setBackground(Color.WHITE);
					
					nine.setForeground(Color.BLUE);
					nine.setBackground(Color.WHITE);
				
					allclear.setForeground(Color.WHITE);
					allclear.setBackground(Color.BLUE);
					
					clear.setForeground(Color.WHITE);
					clear.setBackground(Color.BLUE);
					
					dot.setForeground(Color.BLUE);
					dot.setBackground(Color.WHITE);
					
					percent.setForeground(Color.WHITE);
					percent.setBackground(Color.BLUE);
					
					add.setForeground(Color.WHITE);
					add.setBackground(Color.BLUE);
					
					sub.setForeground(Color.WHITE);
					sub.setBackground(Color.BLUE);
					
					mult.setForeground(Color.WHITE);
					mult.setBackground(Color.BLUE);
					
					div.setForeground(Color.WHITE);
					div.setBackground(Color.BLUE);
					
					equals.setForeground(Color.white);
					equals.setBackground(Color.BLUE);
					
					square.setBackground(Color.WHITE);
					square.setForeground(Color.BLUE);
				}
			}
		});
		green.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==green)
				{
					enter.setForeground(Color.GREEN);

					
					zero.setForeground(Color.GREEN);
					zero.setBackground(Color.WHITE);
					
					one.setForeground(Color.GREEN);
					one.setBackground(Color.WHITE);
					
					two.setForeground(Color.GREEN);
					two.setBackground(Color.WHITE);
					
					three.setForeground(Color.GREEN);
					three.setBackground(Color.WHITE);
					
					four.setForeground(Color.GREEN);
					four.setBackground(Color.WHITE);
					
					five.setForeground(Color.GREEN);
					five.setBackground(Color.WHITE);
					
					six.setForeground(Color.GREEN);
					six.setBackground(Color.WHITE);
					
					seven.setForeground(Color.GREEN);
					seven.setBackground(Color.WHITE);
					
					eight.setForeground(Color.GREEN);
					eight.setBackground(Color.WHITE);
					
					nine.setForeground(Color.GREEN);
					nine.setBackground(Color.WHITE);
				
					allclear.setForeground(Color.WHITE);
					allclear.setBackground(Color.GREEN);
					
					clear.setForeground(Color.WHITE);
					clear.setBackground(Color.GREEN);
					
					dot.setForeground(Color.GREEN);
					dot.setBackground(Color.WHITE);
					
					percent.setForeground(Color.WHITE);
					percent.setBackground(Color.GREEN);
					
					add.setForeground(Color.WHITE);
					add.setBackground(Color.GREEN);
					
					sub.setForeground(Color.WHITE);
					sub.setBackground(Color.GREEN);
					
					mult.setForeground(Color.WHITE);
					mult.setBackground(Color.GREEN);
					
					div.setForeground(Color.WHITE);
					div.setBackground(Color.GREEN);
					
					equals.setForeground(Color.white);
					equals.setBackground(Color.GREEN);
					
					square.setBackground(Color.WHITE);
					square.setForeground(Color.GREEN);
				}
			}
		});
		black.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==black)
				{
					
					enter.setForeground(Color.BLACK);
					
					zero.setForeground(Color.BLACK);
					zero.setBackground(Color.WHITE);
					
					one.setForeground(Color.BLACK);
					one.setBackground(Color.WHITE);
					
					two.setForeground(Color.BLACK);
					two.setBackground(Color.WHITE);
					
					three.setForeground(Color.BLACK);
					three.setBackground(Color.WHITE);
					
					four.setForeground(Color.BLACK);
					four.setBackground(Color.WHITE);
					
					five.setForeground(Color.BLACK);
					five.setBackground(Color.WHITE);
					
					six.setForeground(Color.BLACK);
					six.setBackground(Color.WHITE);
					
					seven.setForeground(Color.BLACK);
					seven.setBackground(Color.WHITE);
					
					eight.setForeground(Color.BLACK);
					eight.setBackground(Color.WHITE);
					
					nine.setForeground(Color.BLACK);
					nine.setBackground(Color.WHITE);
				
					allclear.setForeground(Color.WHITE);
					allclear.setBackground(Color.BLACK);
					
					clear.setForeground(Color.WHITE);
					clear.setBackground(Color.BLACK);
					
					dot.setForeground(Color.BLACK);
					dot.setBackground(Color.WHITE);
					
					percent.setForeground(Color.WHITE);
					percent.setBackground(Color.BLACK);
					
					add.setForeground(Color.WHITE);
					add.setBackground(Color.BLACK);
					
					sub.setForeground(Color.WHITE);
					sub.setBackground(Color.BLACK);
					
					mult.setForeground(Color.WHITE);
					mult.setBackground(Color.BLACK);
					
					div.setForeground(Color.WHITE);
					div.setBackground(Color.BLACK);
					
					equals.setForeground(Color.white);
					equals.setBackground(Color.BLACK);
					
					square.setBackground(Color.WHITE);
					square.setForeground(Color.BLACK);
				}
			}
		});
		
		yellow.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==yellow)
				{
					enter.setForeground(Color.yellow);
					
					zero.setForeground(Color.yellow);
					zero.setBackground(Color.WHITE);
					
					one.setForeground(Color.yellow);
					one.setBackground(Color.WHITE);
					
					two.setForeground(Color.yellow);
					two.setBackground(Color.WHITE);
					
					three.setForeground(Color.yellow);
					three.setBackground(Color.WHITE);
					
					four.setForeground(Color.yellow);
					four.setBackground(Color.WHITE);
					
					five.setForeground(Color.yellow);
					five.setBackground(Color.WHITE);
					
					six.setForeground(Color.yellow);
					six.setBackground(Color.WHITE);
					
					seven.setForeground(Color.yellow);
					seven.setBackground(Color.WHITE);
					
					eight.setForeground(Color.yellow);
					eight.setBackground(Color.WHITE);
					
					nine.setForeground(Color.yellow);
					nine.setBackground(Color.WHITE);
					
					allclear.setForeground(Color.WHITE);
					allclear.setBackground(Color.yellow);
					
					clear.setForeground(Color.WHITE);
					clear.setBackground(Color.yellow);
					
					dot.setForeground(Color.yellow);
					dot.setBackground(Color.WHITE);
					
					percent.setForeground(Color.WHITE);
					percent.setBackground(Color.yellow);
					
					add.setForeground(Color.WHITE);
					add.setBackground(Color.yellow);
					
					sub.setForeground(Color.WHITE);
					sub.setBackground(Color.yellow);
					
					mult.setForeground(Color.WHITE);
					mult.setBackground(Color.yellow);
					
					div.setForeground(Color.WHITE);
					div.setBackground(Color.yellow);
					
					equals.setBackground(Color.yellow);
					equals.setForeground(Color.white);
					
					square.setBackground(Color.WHITE);
					square.setForeground(Color.yellow);
				}
			}
		});
		
		cyan.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==cyan)
				{
					enter.setForeground(Color.cyan);
					
					zero.setForeground(Color.cyan);
					zero.setBackground(Color.WHITE);
					
					one.setForeground(Color.cyan);
					one.setBackground(Color.WHITE);
					
					two.setForeground(Color.cyan);
					two.setBackground(Color.WHITE);
					
					three.setForeground(Color.cyan);
					three.setBackground(Color.WHITE);
					
					four.setForeground(Color.cyan);
					four.setBackground(Color.WHITE);
					
					five.setForeground(Color.cyan);
					five.setBackground(Color.WHITE);
					
					six.setForeground(Color.cyan);
					six.setBackground(Color.WHITE);
					
					seven.setForeground(Color.cyan);
					seven.setBackground(Color.WHITE);
					
					eight.setForeground(Color.cyan);
					eight.setBackground(Color.WHITE);
					
					nine.setForeground(Color.cyan);
					nine.setBackground(Color.WHITE);
					
					allclear.setForeground(Color.WHITE);
					allclear.setBackground(Color.cyan);
					
					clear.setForeground(Color.WHITE);
					clear.setBackground(Color.cyan);
					
					dot.setForeground(Color.cyan);
					dot.setBackground(Color.WHITE);
					
					percent.setForeground(Color.WHITE);
					percent.setBackground(Color.cyan);
					
					add.setForeground(Color.WHITE);
					add.setBackground(Color.cyan);
					
					sub.setForeground(Color.WHITE);
					sub.setBackground(Color.cyan);
					
					mult.setForeground(Color.WHITE);
					mult.setBackground(Color.cyan);
					
					div.setForeground(Color.WHITE);
					div.setBackground(Color.cyan);
					
					equals.setBackground(Color.cyan);
					equals.setForeground(Color.white);
					
					square.setBackground(Color.WHITE);
					square.setForeground(Color.cyan);
				}
			}
		});
		
		lightgray.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==lightgray)
				{
					enter.setForeground(Color.lightGray);
					
					zero.setForeground(Color.lightGray);
					zero.setBackground(Color.WHITE);
					
					one.setForeground(Color.lightGray);
					one.setBackground(Color.WHITE);
					
					two.setForeground(Color.lightGray);
					two.setBackground(Color.WHITE);
					
					three.setForeground(Color.lightGray);
					three.setBackground(Color.WHITE);
					
					four.setForeground(Color.lightGray);
					four.setBackground(Color.WHITE);
					
					five.setForeground(Color.lightGray);
					five.setBackground(Color.WHITE);
					
					six.setForeground(Color.lightGray);
					six.setBackground(Color.WHITE);
					
					seven.setForeground(Color.lightGray);
					seven.setBackground(Color.WHITE);
					
					eight.setForeground(Color.lightGray);
					eight.setBackground(Color.WHITE);
					
					nine.setForeground(Color.lightGray);
					nine.setBackground(Color.WHITE);
				
					allclear.setForeground(Color.WHITE);
					allclear.setBackground(Color.lightGray);
					
					clear.setForeground(Color.WHITE);
					clear.setBackground(Color.lightGray);
					
					dot.setForeground(Color.lightGray);
					dot.setBackground(Color.WHITE);
					
					percent.setForeground(Color.WHITE);
					percent.setBackground(Color.lightGray);
					
					add.setForeground(Color.WHITE);
					add.setBackground(Color.lightGray);
					
					sub.setForeground(Color.WHITE);
					sub.setBackground(Color.lightGray);
					
					mult.setForeground(Color.WHITE);
					mult.setBackground(Color.lightGray);
					
					div.setForeground(Color.WHITE);
					div.setBackground(Color.lightGray);
					
					equals.setForeground(Color.white);
					equals.setBackground(Color.lightGray);
					
					square.setBackground(Color.WHITE);
					square.setForeground(Color.lightGray);
				}
			}
		});
		
		lightgreen.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==lightgreen)
				{
					enter.setForeground(Color.getHSBColor(898, 868, 378));
					
					zero.setForeground(Color.getHSBColor(898, 868, 378));
					zero.setBackground(Color.WHITE);
					
					one.setForeground(Color.getHSBColor(898, 868, 378));
					one.setBackground(Color.WHITE);
					
					two.setForeground(Color.getHSBColor(898, 868, 378));
					two.setBackground(Color.WHITE);
					
					three.setForeground(Color.getHSBColor(898, 868, 378));
					three.setBackground(Color.WHITE);
					
					four.setForeground(Color.getHSBColor(898, 868, 378));
					four.setBackground(Color.WHITE);
					
					five.setForeground(Color.getHSBColor(898, 868, 378));
					five.setBackground(Color.WHITE);
					
					six.setForeground(Color.getHSBColor(898, 868, 378));
					six.setBackground(Color.WHITE);
					
					seven.setForeground(Color.getHSBColor(898, 868, 378));
					seven.setBackground(Color.WHITE);
					
					eight.setForeground(Color.getHSBColor(898, 868, 378));
					eight.setBackground(Color.WHITE);
					
					nine.setForeground(Color.getHSBColor(898, 868, 378));
					nine.setBackground(Color.WHITE);
				
					allclear.setForeground(Color.WHITE);
					allclear.setBackground(Color.getHSBColor(898, 868, 378));
					
					clear.setForeground(Color.WHITE);
					clear.setBackground(Color.getHSBColor(898, 868, 378));
					
					dot.setForeground(Color.getHSBColor(898, 868, 378));
					dot.setBackground(Color.WHITE);
					
					percent.setForeground(Color.WHITE);
					percent.setBackground(Color.getHSBColor(898, 868, 378));
					
					add.setForeground(Color.WHITE);
					add.setBackground(Color.getHSBColor(898, 868, 378));
					
					sub.setForeground(Color.WHITE);
					sub.setBackground(Color.getHSBColor(898, 868, 378));
					
					mult.setForeground(Color.WHITE);
					mult.setBackground(Color.getHSBColor(898, 868, 378));
					
					div.setForeground(Color.WHITE);
					div.setBackground(Color.getHSBColor(898, 868, 378));
					
					equals.setForeground(Color.white);
					equals.setBackground(Color.getHSBColor(898, 868, 378));
					
					square.setBackground(Color.WHITE);
					square.setForeground(Color.getHSBColor(898, 868, 378));
				}
			}
		});
		
		default_r.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==default_r)
				{
					enter.setForeground(Color.RED);
					
					zero.setForeground(Color.RED);
					zero.setBackground(Color.WHITE);
					
					one.setForeground(Color.RED);
					one.setBackground(Color.WHITE);
					
					two.setForeground(Color.RED);
					two.setBackground(Color.WHITE);
					
					three.setForeground(Color.RED);
					three.setBackground(Color.WHITE);
					
					four.setForeground(Color.RED);
					four.setBackground(Color.WHITE);
					
					five.setForeground(Color.RED);
					five.setBackground(Color.WHITE);
					
					six.setForeground(Color.RED);
					six.setBackground(Color.WHITE);
					
					seven.setForeground(Color.RED);
					seven.setBackground(Color.WHITE);
					
					eight.setForeground(Color.RED);
					eight.setBackground(Color.WHITE);
					
					nine.setForeground(Color.RED);
					nine.setBackground(Color.WHITE);
				
					allclear.setForeground(Color.WHITE);
					allclear.setBackground(Color.RED);
					
					clear.setForeground(Color.WHITE);
					clear.setBackground(Color.RED);
					
					dot.setForeground(Color.RED);
					dot.setBackground(Color.WHITE);
					
					percent.setForeground(Color.WHITE);
					percent.setBackground(Color.RED);
					
					add.setForeground(Color.WHITE);
					add.setBackground(Color.RED);
					
					sub.setForeground(Color.WHITE);
					sub.setBackground(Color.RED);
					
					mult.setForeground(Color.WHITE);
					mult.setBackground(Color.RED);
					
					div.setForeground(Color.WHITE);
					div.setBackground(Color.RED);
					
					equals.setForeground(Color.white);
					equals.setBackground(Color.RED);
					
					square.setBackground(Color.WHITE);
					square.setForeground(Color.RED);
				}
			}
		});
	}
	void initialize()
	{
		allclear=new JButton("A");
		clear=new JButton("C");
		percent=new JButton("%");
		zero=new JButton("0");
		one=new JButton("1");
		two=new JButton("2");
		three=new JButton("3");
		four=new JButton("4");
		five=new JButton("5");
		six=new JButton("6");
		seven=new JButton("7");
		eight=new JButton("8");
		nine=new JButton("9");
		add=new JButton("+");
		sub=new JButton("-");
		mult=new JButton("*");
		div=new JButton("/");
		equals=new JButton("=");
		dot=new JButton(".");
		square=new JButton("^");
	}
	void do_things()
	{
		button_panel.add(allclear);
		allclear.addActionListener(this);
		button_panel.add(clear);
		clear.addActionListener(this);
		button_panel.add(percent);
		percent.addActionListener(this);
		button_panel.add(div);
		div.addActionListener(this);
		button_panel.add(seven);
		seven.addActionListener(this);
		button_panel.add(eight);
		eight.addActionListener(this);
		button_panel.add(nine);
		nine.addActionListener(this);
		button_panel.add(mult);
		mult.addActionListener(this);
		button_panel.add(four);
		four.addActionListener(this);
		button_panel.add(five);
		five.addActionListener(this);
		button_panel.add(six);
		six.addActionListener(this);
		button_panel.add(sub);
		sub.addActionListener(this);
		button_panel.add(one);
		one.addActionListener(this);
		button_panel.add(two);
		two.addActionListener(this);
		button_panel.add(three);
		three.addActionListener(this);
		button_panel.add(add);
		add.addActionListener(this);
		button_panel.add(dot);
		dot.addActionListener(this);
		button_panel.add(zero);
		zero.addActionListener(this);
		button_panel.add(square);
		square.addActionListener(this);
		button_panel.add(equals);
		equals.addActionListener(this);
		
		//frame setting
		//c.add(button_panel,BorderLayout.CENTER);
		//frame.add(c);
		frame.add(button_panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);	

	}
	void fonts()
	{
		zero.setFont(font);
		one.setFont(font);
		two.setFont(font);
		three.setFont(font);
		four.setFont(font);
		five.setFont(font);
		six.setFont(font);
		seven.setFont(font);
		eight.setFont(font);
		nine.setFont(font);
		add.setFont(font);
		sub.setFont(font);
		mult.setFont(font);
		div.setFont(font);
		equals.setFont(font);
		percent.setFont(font);
		square.setFont(font);
		dot.setFont(font);
		allclear.setFont(font);
		clear.setFont(font);
	}
	void colors()
	{
		zero.setForeground(Color.RED);
		zero.setBackground(Color.WHITE);
		
		one.setForeground(Color.RED);
		one.setBackground(Color.WHITE);
		
		two.setForeground(Color.RED);
		two.setBackground(Color.WHITE);
		
		three.setForeground(Color.RED);
		three.setBackground(Color.WHITE);
		
		four.setForeground(Color.RED);
		four.setBackground(Color.WHITE);
		
		five.setForeground(Color.RED);
		five.setBackground(Color.WHITE);
		
		six.setForeground(Color.RED);
		six.setBackground(Color.WHITE);
		
		seven.setForeground(Color.RED);
		seven.setBackground(Color.WHITE);
		
		eight.setForeground(Color.RED);
		eight.setBackground(Color.WHITE);
		
		nine.setForeground(Color.RED);
		nine.setBackground(Color.WHITE);
		
		allclear.setForeground(Color.WHITE);
		allclear.setBackground(Color.RED);
		
		clear.setForeground(Color.WHITE);
		clear.setBackground(Color.RED);
		
		dot.setForeground(Color.RED);
		dot.setBackground(Color.WHITE);
		
		percent.setForeground(Color.WHITE);
		percent.setBackground(Color.RED);
		
		add.setForeground(Color.WHITE);
		add.setBackground(Color.RED);
		
		sub.setForeground(Color.WHITE);
		sub.setBackground(Color.RED);
		
		mult.setForeground(Color.WHITE);
		mult.setBackground(Color.RED);
		
		div.setForeground(Color.WHITE);
		div.setBackground(Color.RED);
		
		equals.setBackground(Color.RED);
		equals.setForeground(Color.white);
		
		square.setBackground(Color.WHITE);
		square.setForeground(Color.RED);
	}
	public void actionPerformed(ActionEvent e) 
	{
		s=e.getActionCommand();
		
		try
		{
			//if value is number
			if(s.charAt(0)>='0' && s.charAt(0)<='9' || s.charAt(0)=='.')//  (Not Working)  || s.charAt(0)=='-' similar to adddition multiplication and division
			{
				//if operand is present, then add second number
				if(! (s1.equals("")) )
					s2=s2+s;
				else
					s0=s0+s;
				//set value of text
				enter.setText(s0+s1+s2);
			}
			else if(s.charAt(0)=='C')
			{
				//clear one letter
				s0=s1=s2="";
				//set value of text
				enter.setText(enter.getText().substring(0,enter.getText().length()-1));
			}
			else if(s.charAt(0)=='A')
			{
				//clear the text_field
				s0=s1=s2="";
				
				enter.setText(s0+s1+s2);
			}
			else if(s.charAt(0)=='=')
			{
				double result;
				
				//store value in first
				if(s1.equals("+"))
				{
					result=(Double.parseDouble(s0))+(Double.parseDouble(s2));
				}
				else if(s1.equals("-"))
				{
					result=(Double.parseDouble(s0))-(Double.parseDouble(s2));
				}
				else if(s1.equals("*"))
				{
					result=(Double.parseDouble(s0))*(Double.parseDouble(s2));
				}
				else if(s1.equals("/"))
				{
					result=(double)(Double.parseDouble(s0))/(Double.parseDouble(s2));
				}
				else if(s1.equals("^"))
				{
					//result=(Double.parseDouble(s0))*(Double.parseDouble(s0));
					result = 1;
					for(int i=1;i<=Double.parseDouble(s2);i++)
						result = result*Double.parseDouble(s0);
				}
				else
				{
					result=( (Double.parseDouble(s0))*(Double.parseDouble(s2))/100);
				}
				//storing value in result
				enter.setText(s0+s1+s2 +"="+result);
				//convert it to string
				s0=Double.toString(result);
				
				s1=s2="";
			}
			else
			{
				// if suppose there was no operand
				if(s1.equals("") || s2.equals(""))
				{
					s1=s;
				}
				//else evaluate
				else
				{
					double result;
					
					//store value in first
					if(s1.equals("+"))
					{
						result=(Double.parseDouble(s0))+(Double.parseDouble(s2));
					}
					else if(s1.equals("-"))
					{
						result=(Double.parseDouble(s0))-(Double.parseDouble(s2));
					}
					else if(s1.equals("*"))
					{
						result=(Double.parseDouble(s0))*(Double.parseDouble(s2));
					}
					else if(s1.equals("/"))
					{
						result=(double)(Double.parseDouble(s0))/(Double.parseDouble(s2));
					}
					else if(s1.equals("^"))
					{
						//result=(Double.parseDouble(s0))*(Double.parseDouble(s0));
						result = 1;
						for(int i=1;i<=Double.parseDouble(s2);i++)
							result = result*Double.parseDouble(s0);
					}
					else
					{
						result=(double)( (Double.parseDouble(s0))*(Double.parseDouble(s2))/100);
					}
					s0=Double.toString(result);
					
					//place the operator
					s1=s;
					
					//make the operator blank
					s2="";
					
				}
				enter.setText(s0+s1+s2);
			}
		}
		catch(Exception ae)
		{
			enter.setText("IO_EXCEPTION");
		}
	}
	
}

public class finalcalculator 
{

	public static void main(String[] args) 
	{
		first f=new first();
		f.Theme();
		f.initialize();
		f.do_things();
		f.fonts();
		f.colors();
	}

}
