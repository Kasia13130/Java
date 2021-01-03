// A program that generates logins based on the list of students
public class LoginGenerator
{
	
    public static void main(String[] args)
	{

		String[] studentNames = {"Budynek Piotr",
				"Chalupa Krystyna",
				"Wiezowiec Jan",
				"Szkieletor Andrzej",
				"Domek Marianna"};

		String firstPart;
		String secondPart;
		String space = " ";
		int spaceIndex;
		String thirdPart = "@student.agh.edu.pl";

		for (String studentName : studentNames)
		{
			spaceIndex = studentName.indexOf(space);	
			System.out.println(studentName);

			secondPart = studentName.substring(spaceIndex, spaceIndex + 3);		
			String secPart = secondPart.toString().toLowerCase().replace(" ", "");

			firstPart = studentName.substring(0, 3);
			String firPart = firstPart.toString().toLowerCase();

			System.out.println(firPart + secPart + thirdPart + "\n");

		}
	}

}