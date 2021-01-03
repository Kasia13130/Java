package pl.edu.agh.mwo.java1.sudoku;

//import java.util.Arrays;
//import pl.edu.agh.mwo.java1.sudoku.SudokuBoard;
//import pl.edu.agh.mwo.java1.sudoku.SudokuBoardGenerator;
//import pl.edu.agh.mwo.java1.sudoku.SudokuBoardWriter;

public class SudokuApp 
{
	
	public static void main(String[] args)
	{
		
		SudokuBoardGenerator generator = new SudokuBoardGenerator();
		SudokuBoardWriter writer = new SudokuBoardWriter();
		SudokuBoardChecker check = new SudokuBoardChecker();

		SudokuBoard emptyBoard;
		emptyBoard = generator.generateEmptyBoard();  
		writer.writeBoard(emptyBoard);
		check.verifyBoardStructure(emptyBoard);
		if (check.verifyBoard(emptyBoard) == false) 
		{
			System.out.println("This sudoku board is incorrect. \n");
		} 
		else 
			System.out.println("This sudoku board is correct. \n");
				
		// wygenerowanie pierwszej tablicy
		SudokuBoard firstBoard;
		firstBoard = generator.generateFirstBoard();
		writer.writeBoard(firstBoard);
		if (check.verifyBoard(firstBoard) == false) 
		{
			System.out.println("This sudoku board is incorrect. \n");
		} 
		else 
			System.out.println("This sudoku board is correct. \n");
				
		
		// wygenerowanie drugiej tablicy
		SudokuBoard secondBoard;
		secondBoard = generator.generateSecondBoard();
		writer.writeBoard(secondBoard);
		check.verifyBoardStructure(secondBoard);
		if (check.verifyBoard(secondBoard) == false) 
		{
			System.out.println("This sudoku board is incorrect. \n");
		} 
		else 
			System.out.println("This sudoku board is correct. \n");

				
		// wygenerowanie trzeciej tablicy
		SudokuBoard thirdBoard;
		thirdBoard = generator.generateThirdBoard();
		writer.writeBoard(thirdBoard);
		check.verifyBoardStructure(thirdBoard);
		if (check.verifyBoard(thirdBoard) == false) 
		{
			System.out.println("This sudoku board is incorrect. \n");
		} 
		else 
			System.out.println("This sudoku board is correct. \n");
		
		// wygenerowanie czwartej tablicy
		SudokuBoard fourthBoard;
		fourthBoard = generator.generateFourthBoard();
		writer.writeBoard(fourthBoard);
		check.verifyBoardStructure(fourthBoard);
		if (check.verifyBoard(fourthBoard) == false) 
		{
			System.out.println("This sudoku board is incorrect. \n");
		} 
		else 
			System.out.println("This sudoku board is correct. \n");

		
		// wygenerowanie niepoprawnej pierwszej tablicy
		SudokuBoard wrongFirstBoard;
		wrongFirstBoard = generator.generateWrongFirstBoard();
		writer.writeBoard(wrongFirstBoard);
		check.verifyBoardStructure(wrongFirstBoard);
		if (check.verifyBoard(wrongFirstBoard) == false) 
		{
			System.out.println("This sudoku board is incorrect. \n");
		} 
		else 
			System.out.println("This sudoku board is correct. \n");
		
		// wygenerowanie niepoprawnej drugiej tablicy
		SudokuBoard wrongSecondBoard;
		wrongSecondBoard = generator.generateWrongSecondBoard();
		writer.writeBoard(wrongSecondBoard);
		check.verifyBoardStructure(wrongSecondBoard);
		if (check.verifyBoard(wrongSecondBoard) == false) 
		{
			System.out.println("This sudoku board is incorrect. \n");
		} 
		else 
			System.out.println("This sudoku board is correct. \n");
		
	}
}
