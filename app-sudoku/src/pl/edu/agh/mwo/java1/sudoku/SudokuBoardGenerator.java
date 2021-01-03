package pl.edu.agh.mwo.java1.sudoku;

public class SudokuBoardGenerator 
{
	
	private int[][] createEmptyArray()
	{
		int[][] board = new int[SudokuBoard.SIZE][SudokuBoard.SIZE];
		for (int i = 0; i < SudokuBoard.SIZE; i++)
		{
			for (int j = 0; j < SudokuBoard.SIZE; j++)
			{
				board[i][j] = 0;
			}
		}
		return board;
	}
	
	public SudokuBoard generateEmptyBoard()
	{
		return new SudokuBoard(createEmptyArray());
	}
	
	public SudokuBoard generateFirstBoard()
	{
		int[][] board = createEmptyArray();
		
		board[0][0] = 3;
		board[0][2] = 5;
		board[0][5] = 2;
		board[0][7] = 4;

		
		board[1][1] = 9;
		board[1][2] = 2;
		
		board[2][1] = 7;
		board[2][3] = 6;
		board[2][6] = 2;
		board[2][8] = 3;
		
		board[3][0] = 5;
		board[3][3] = 1;
		board[3][4] = 3;
		board[3][7] = 2;
		
		board[4][0] = 1;
		board[4][1] = 6;
		board[4][4] = 2;
		board[4][5] = 9;
		board[4][6] = 4;
		
		board[5][4] = 7;
		board[5][5] = 8;
		board[5][8] = 5;
			
		board[6][1] = 1;
		board[6][3] = 8;
		board[6][4] = 4;
		board[6][6] = 6;
		
		board[7][0] = 8;
		board[7][1] = 3;
		board[7][7] = 1;
		board[7][8] = 4;
		
		board[8][0] = 2;
		board[8][6] = 3;
		board[8][7] = 7;
		board[8][8] = 8;
		
		return new SudokuBoard(board);
	}
		
	public SudokuBoard generateSecondBoard()
	{
		int[][] board = createEmptyArray();
		
		board[0][1] = 9;
		board[0][3] = 6;
		board[0][6] = 7;
		board[0][8] = 3;
		
		board[1][0] = 2;
		board[1][5] = 3;
		board[1][7] = 8;
		board[1][8] = 4;
		
		board[2][0] = 7;
		board[2][2] = 3;
		
		board[3][1] = 3;
		board[3][4] = 6;
		board[3][5] = 1;
		
		board[4][0] = 6;
		board[4][8] = 8;
		
		board[5][3] = 9;
		board[5][4] = 4;
		board[5][7] = 7;
		
		board[6][6] = 5;
		board[6][8] = 2;
				
		board[7][0] = 1;
		board[7][1] = 5;
		board[7][3] = 3;
		board[7][8] = 9;
		
		board[8][0] = 9;
		board[8][2] = 6;
		board[8][5] = 2;
		board[8][7] = 1;
	
	
		return new SudokuBoard(board);
	}
	
	public SudokuBoard generateThirdBoard()
	{
		int[][] board = createEmptyArray();
		
		board[0][0] = 4;
		board[0][1] = 9;
		board[0][2] = 8;
		board[0][3] = 6;
		board[0][4] = 2;
		board[0][5] = 5;
		board[0][6] = 7;
		board[0][7] = 3;
		board[0][8] = 1;
		
		board[1][0] = 2;
		board[1][1] = 6;
		board[1][2] = 5;
		board[1][3] = 7;
		board[1][4] = 1;
		board[1][5] = 3;
		board[1][6] = 9;
		board[1][7] = 8;
		board[1][8] = 4;
		
		board[2][0] = 7;
		board[2][1] = 1;
		board[2][2] = 3;
		board[2][3] = 8;
		board[2][4] = 9;
		board[2][5] = 4;
		board[2][6] = 2;
		board[2][7] = 5;
		board[2][8] = 6;
		
		board[3][0] = 8;
		board[3][1] = 3;
		board[3][2] = 7;
		board[3][3] = 2;
		board[3][4] = 6;
		board[3][5] = 1;
		board[3][6] = 4;
		board[3][7] = 9;
		board[3][8] = 5;
		
		board[4][0] = 6;
		board[4][1] = 4;
		board[4][2] = 9;
		board[4][3] = 5;
		board[4][4] = 3;
		board[4][5] = 7;
		board[4][6] = 1;
		board[4][7] = 2;
		board[4][8] = 8;
		
		board[5][0] = 5;
		board[5][1] = 2;
		board[5][2] = 1;
		board[5][3] = 9;
		board[5][4] = 4;
		board[5][5] = 8;
		board[5][6] = 6;
		board[5][7] = 7;
		board[5][8] = 3;
		
	
		board[6][0] = 3;
		board[6][1] = 7;
		board[6][2] = 4;
		board[6][3] = 1;
		board[6][4] = 8;
		board[6][5] = 9;
		board[6][6] = 5;
		board[6][7] = 6;
		board[6][8] = 2;
		
		board[7][0] = 1;
		board[7][1] = 5;
		board[7][2] = 2;
		board[7][3] = 3;
		board[7][4] = 7;
		board[7][5] = 6;
		board[7][6] = 8;
		board[7][7] = 4;
		board[7][8] = 9;
		
		board[8][0] = 9;
		board[8][1] = 8;
		board[8][2] = 6;
		board[8][3] = 4;
		board[8][4] = 5;
		board[8][5] = 2;
		board[8][6] = 3;
		board[8][7] = 1;
		board[8][8] = 7;
	
		return new SudokuBoard(board);
	}	
	
	public SudokuBoard generateFourthBoard()
	{
		int[][] board = createEmptyArray();
		
		board[0][0] = 2;
		board[0][1] = 4;
		board[0][2] = 8;
		board[0][3] = 3;
		board[0][4] = 9;
		board[0][5] = 5;
		board[0][6] = 7;
		board[0][7] = 1;
		board[0][8] = 6;
		
		board[1][0] = 5;
		board[1][1] = 7;
		board[1][2] = 1;
		board[1][3] = 6;
		board[1][4] = 2;
		board[1][5] = 8;
		board[1][6] = 3;
		board[1][7] = 4;
		board[1][8] = 9;
		
		board[2][0] = 9;
		board[2][1] = 3;
		board[2][2] = 6;
		board[2][3] = 7;
		board[2][4] = 4;
		board[2][5] = 1;
		board[2][6] = 5;
		board[2][7] = 8;
		board[2][8] = 2;
		
		board[3][0] = 6;
		board[3][1] = 8;
		board[3][2] = 2;
		board[3][3] = 5;
		board[3][4] = 3;
		board[3][5] = 9;
		board[3][6] = 1;
		board[3][7] = 7;
		board[3][8] = 4;
		
		board[4][0] = 3;
		board[4][1] = 5;
		board[4][2] = 9;
		board[4][3] = 1;
		board[4][4] = 7;
		board[4][5] = 4;
		board[4][6] = 6;
		board[4][7] = 2;
		board[4][8] = 8;
		
		board[5][0] = 7;
		board[5][1] = 1;
		board[5][2] = 4;
		board[5][3] = 8;
		board[5][4] = 6;
		board[5][5] = 2;
		board[5][6] = 9;
		board[5][7] = 5;
		board[5][8] = 3;
		
	
		board[6][0] = 8;
		board[6][1] = 6;
		board[6][2] = 3;
		board[6][3] = 4;
		board[6][4] = 1;
		board[6][5] = 7;
		board[6][6] = 2;
		board[6][7] = 9;
		board[6][8] = 5;
		
		board[7][0] = 1;
		board[7][1] = 9;
		board[7][2] = 5;
		board[7][3] = 2;
		board[7][4] = 8;
		board[7][5] = 6;
		board[7][6] = 4;
		board[7][7] = 3;
		board[7][8] = 7;
		
		board[8][0] = 4;
		board[8][1] = 2;
		board[8][2] = 7;
		board[8][3] = 9;
		board[8][4] = 5;
		board[8][5] = 3;
		board[8][6] = 8;
		board[8][7] = 6;
		board[8][8] = 1;
	
		return new SudokuBoard(board);
	}	
	
	public SudokuBoard generateWrongFirstBoard()
	{
		int[][] board = createEmptyArray();
		
		board[0][5] = 5;
		board[0][7] = 3;
		
		board[1][0] = 2;
		board[1][4] = 2;
		board[1][6] = 9;
		
		board[2][1] = 1;
		board[2][3] = 8;
		board[2][5] = 4;
		
		board[3][0] = 8;
		board[3][3] = 2;
		board[3][6] = 4;
		
		board[4][2] = 9;
		board[4][5] = 7;
		board[4][8] = 8;
		
		board[5][0] = 5;
		board[5][1] = 2;
		board[5][6] = 6;
	
		board[6][0] = 3;
		board[6][1] = 7;
		board[6][2] = 4;
		
		board[7][7] = 4;
		board[7][8] = 9;
		
		board[8][0] = 9;
		board[8][7] = 1;
		board[8][8] = 7;
	
		return new SudokuBoard(board);
	}	
	
	public SudokuBoard generateWrongSecondBoard()
	{
		int[][] board = createEmptyArray();
		
		board[0][0] = 5;
		board[0][1] = 8;
		board[0][2] = 9;
		board[0][3] = 6;
		board[0][4] = 2;
		board[0][5] = 4;
		board[0][6] = 7;
		board[0][7] = 3;
		board[0][8] = 1;
		
		board[1][0] = 8;
		board[1][1] = 6;
		board[1][2] = 5;
		board[1][3] = 4;
		board[1][4] = 1;
		board[1][5] = 2;
		board[1][6] = 9;
		board[1][7] = 5;
		board[1][8] = 4;
		
		board[2][0] = 3;
		board[2][1] = 1;
		board[2][2] = 3;
		board[2][3] = 8;
		board[2][4] = 6;
		board[2][5] = 4;
		board[2][6] = 2;
		board[2][7] = 8;
		board[2][8] = 6;
		
		board[3][0] = 3;
		board[3][1] = 3;
		board[3][2] = 7;
		board[3][3] = 5;
		board[3][4] = 6;
		board[3][5] = 1;
		board[3][6] = 4;
		board[3][7] = 9;
		board[3][8] = 5;
		
		board[4][0] = 6;
		board[4][1] = 2;
		board[4][2] = 9;
		board[4][3] = 5;
		board[4][4] = 8;
		board[4][5] = 7;
		board[4][6] = 1;
		board[4][7] = 3;
		board[4][8] = 8;
		
		board[5][0] = 5;
		board[5][1] = 8;
		board[5][2] = 1;
		board[5][3] = 9;
		board[5][4] = 3;
		board[5][5] = 8;
		board[5][6] = 6;
		board[5][7] = 4;
		board[5][8] = 3;
			
		board[6][0] = 3;
		board[6][1] = 7;
		board[6][2] = 9;
		board[6][3] = 1;
		board[6][4] = 1;
		board[6][5] = 9;
		board[6][6] = 5;
		board[6][7] = 3;
		board[6][8] = 2;
		
		board[7][0] = 1;
		board[7][1] = 7;
		board[7][2] = 2;
		board[7][3] = 3;
		board[7][4] = 7;
		board[7][5] = 5;
		board[7][6] = 8;
		board[7][7] = 4;
		board[7][8] = 2;
		
		board[8][0] = 9;
		board[8][1] = 8;
		board[8][2] = 6;
		board[8][3] = 3;
		board[8][4] = 5;
		board[8][5] = 2;
		board[8][6] = 3;
		board[8][7] = 8;
		board[8][8] = 7;
	
		return new SudokuBoard(board);
	}	
}
