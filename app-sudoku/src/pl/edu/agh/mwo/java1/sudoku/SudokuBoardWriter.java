package pl.edu.agh.mwo.java1.sudoku;

import java.util.Arrays;

public class SudokuBoardWriter 
{
	public void writeBoard(SudokuBoard board)
	{
		
		for (int[] row: board.getBoard())
		{
			System.out.println(Arrays.toString(row));
		}
		
	}
}
