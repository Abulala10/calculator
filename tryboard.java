import java.awt.*;
import javax.swing.*;
class try1 extends Frame
{
	JPanel[][] chessboardgrid=new JPanel[8][8];
	private  Dimension size = new Dimension(400,400);
	Panel chessboard;
	
	try1()
	{
		chessboard=new Panel(new GridLayout(8,8));
		chessboard.setPreferredSize(size);
		chessboard.setBounds(0, 0, 600, 600);
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				chessboardgrid[i][j]=new JPanel(new GridLayout());
				chessboard.add(chessboardgrid[i][j]);
				if(i%2==0)
				{
					if(j%2==0)
					{
						chessboardgrid[i][j].setBackground(Color.RED);
					}
					else
					{
						chessboardgrid[i][j].setBackground(Color.WHITE);
					}
				}
				else
				{
					if(j%2==0)
					{
						chessboardgrid[i][j].setBackground(Color.WHITE);
					}
					else
					{
						chessboardgrid[i][j].setBackground(Color.RED);
					}
				}
			}
		}
		add(chessboard);
		setSize(1000,1000);
		setVisible(true);
	}
	void addimg()
	{
		for(int row=0;row<8;row++)
		{
			for(int col=0;col<8;col++)
			{
				JPanel square= (JPanel) chessboardgrid[row][col];
				if(row==0)
				{
					if(row==0 || col==7)
					{
						JLabel pawn=new JLabel(new ImageIcon("chessimg.jpg"));
						square.add(pawn);
					}
				}
			}
		}
	}
}
public class tryboard 
{

	public static void main(String[] args) 
	{
		try1 t1=new try1();
		t1.addimg();
	}

}
