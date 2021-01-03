package pl.edu.agh.mwo.java1.sudoku;

public class SudokuBoard 
{	
	public static final int SIZE = 9;
	private final int[][] board;

	public SudokuBoard(int[][] board) 
	{
		super();
		this.board = board;
	}
	
	public int[][] getBoard() 
	{
		return board;
	}
	
	

}
