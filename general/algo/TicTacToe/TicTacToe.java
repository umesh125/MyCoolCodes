package general.algo.TicTacToe;

import java.util.Scanner;

public class TicTacToe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Implementing TicTacTo");
 
 Scanner scr=new Scanner(System.in);
 String board[][]=new String[3][3];

 boolean GameOver=false;
 
 for(int x=0;x<9;x++)
 {
 
	 System.out.println("Select block  Enter Choice ");
	 
	int i=scr.nextInt();
	int j=scr.nextInt();
	String ch=scr.next();
	String xx="x";
	String oo="o";
	
	//char choice=ch;
	if((ch.toLowerCase().equals(xx) || ch.toLowerCase().equals(oo)) && ((i<3)&&(j<3)))
	{	
		
 board[i][j]=ch.toLowerCase();
	}
	else
	{
		System.out.println("Wrong Input !");
		if(x==0)
			x=0;
		if(x>0)
			x--;
	}
 
	
	
	 for(int r=0;r<3;r++)
	 {
		 for(int c=0;c<3;c++)
		 {
			 System.out.print("["+board[r][c]+"]");
		 }
		 System.out.println();
		 

	 
	 
		
	 
	 }
	
	/*
	if(x>=4)
	{
		System.out.println("player "+Winner(board));
		
	}*/
	 
	if(GameOver=Winner(board))
		break;
	
	//System.out.println("GameOver "+GameOver);
	
	}//end of for loop
	
 if(!GameOver)
 System.out.println("Game Draw !");
 
 
	}
	
	static boolean Winner(String board[][])
	{
		boolean GameOver=false;
		String xwin="xxx";
		String owin="ooo";
		String tx,to;
		// Checking in row
		for(int r=0;r<3;r++)
		{
			tx="";
			to="";
			for(int c=0;c<3;c++)
			{
				tx=tx + board[r][c];
				to=to+board[r][c];
				
			}
			if(tx.equals(xwin))
			{
				GameOver=true;
				
				System.out.println("Player X won !");
				return GameOver;
				
			}
			else if(to.equals(owin))
			{
				GameOver=true;
				
				System.out.println("Player O won !");
				return GameOver;
			}
			
			
		}
	// Checking in cl
		
		for(int r=0;r<3;r++)
		{
			tx="";
			to="";
			for(int c=0;c<3;c++)
			{
				tx=tx + board[c][r];
				to=to+board[c][r];
				
			}
			if(tx.equals(xwin))
			{
				GameOver=true;
				
				System.out.println("Player X won !");
				return GameOver;
			}
			else if(to.equals(owin))
			{
				GameOver=true;
				
				System.out.println("Player O won !");
				return GameOver;
			}
			
			
			
			
			
		}
		
		tx="";
		to="";
		tx=tx+board[0][0]+board[1][1]+board[2][2];
		to=to+board[0][0]+board[1][1]+board[2][2];
		
		if(tx.equals(xwin))
		{
			System.out.println("Player X won !");
			GameOver=true;
			
			
			return GameOver;
		}
		
		
		if(to.equals(owin))
		{
			System.out.println("Player O won !");
			GameOver=true;
				
			
			return GameOver;
		}
		
		
		tx="";
		to="";
		tx=""+board[0][2]+board[1][1]+board[2][0];
		to=to+board[0][2]+board[1][1]+board[2][0];
		
		if(tx.equals(xwin))
		{
			GameOver=true;
			
			System.out.println("Player X won !");
			return GameOver;
		}
		
		if(to.equals(owin))
		{
			GameOver=true;
				
			System.out.println("Player O won !");
			return GameOver;
		}
		
		return GameOver;
		
	}
	

}
