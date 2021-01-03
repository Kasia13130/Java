package pl.edu.agh.mwo.java1.sudoku;

public class SudokuBoardChecker
{

	public SudokuBoardChecker() 
	{
		super();
	}
	
	public boolean verifyBoardStructure(SudokuBoard board)
	{	
		// sprawdzenie wartosci
		int[][] tab = board.getBoard();
		
		for (int i = 0; i < SudokuBoard.SIZE; i++)
		{
			
			for (int j = 0; j < SudokuBoard.SIZE; j++)
			{
				if (!(0 <= tab[i][j] && tab[i][j] <= 9))
				{
					return false;
				}
			}
		}
		
		// sprawdzenie kolumn
		for (int j = 0; j < SudokuBoard.SIZE; j++) 
		{			
			for (int i = 0; i < SudokuBoard.SIZE; i++) 
			{
				for (int z = 0; z < SudokuBoard.SIZE; z++)
				{
					if (tab[i][j] != 0 && z != i && tab[z][j] != 0)
					{
						if (tab[i][j] == tab[z][j])
						{		
							return false;
						}
					}
				}
			}
		}
		
		// sprawdzenie wierszy
		for (int i = 0; i < SudokuBoard.SIZE; i++) 
		{			
			for (int j = 0; j < SudokuBoard.SIZE; j++) 
			{
				for (int z = 0; z < SudokuBoard.SIZE; z++)
				{
					if (z != j && tab[i][z] != 0 && tab[i][j] != 0)
					{
						if (tab[i][j] == tab[i][z])
						{			
							return false;
						}
					}
				}
			}
		}
		
		// sprawdzenie kwadratow
		for (int block = 0; block < (SudokuBoard.SIZE); block++)
		{
			boolean[] square = new boolean[SudokuBoard.SIZE];
			for (int j = block / 3 * 3; j < block / 3 * 3 + 3; j++)
			{
				for (int k = block % 3 * 3; k < block % 3 * 3 + 3; k++)
				{
					if (tab[j][k] != 0)
					{
						if (square[(int) (tab[j][k] -1)])
						{
							return false;
						}
						square[(int) (tab[j][k] -1)] = true;
					}
				}
			}
		}
				
		return true;
	}
	

	public boolean verifyBoard(SudokuBoard board)
	{
		return verifyBoardStructure(board);
	}
}

