package userLoginPrjct;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

public class mainV01 {

	public static void main(String[] args) throws IOException {
		
		// PATH TO FILES
		String fileName = "userN_pass";
		final String pathToDataBase = "DataBase" + File.separator + "userData";
		final String pathToFile = pathToDataBase + File.separator + fileName + ".txt";
		
		File userLo = new File(pathToFile);
		
		Scanner userIn = new Scanner(System.in);
		
		System.out.print("Login(1) # Sign In(2): ");
		int choice = userIn.nextInt();
		
		//LOGIN
		if(choice == 1) {
		
		// USERNAME 
		System.out.print("Please enter your username: ");
		String username = userIn.next();
		
		// PASSWORD
		System.out.print("Please enter your password: ");
		String password = userIn.next();
		
		try {
			
			PrintWriter dataWrite = new PrintWriter(new FileWriter(userLo, true));
			
			dataWrite.print(username + "\n");
			dataWrite.print(password + "\n");
			dataWrite.println();
		
			dataWrite.close();
			
		} 
		catch (FileNotFoundException e) {

			e.printStackTrace();
			
		}
		
		}
		
		//SIGN IN
		else {
			
			
			
		}

	}

}
