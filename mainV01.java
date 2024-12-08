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
		boolean usernameExists = false;
		
		File userLo = new File(pathToFile);
		
		Scanner userData = new Scanner(userLo);
		Scanner userIn = new Scanner(System.in);
		
		// USER CHOICE LOGIN OR SIGN IN
		System.out.print("Sign Up(1) # Sign In(2): ");
		int choice = userIn.nextInt();
		
		// Sign Up
		if(choice == 1) {
		
		// USERNAME 
		System.out.print("Please enter your username: ");
		String username = userIn.next();

		// IF USERNAME EXISTS KILLS THE PROGRAM
		while (userData.hasNextLine()) {
		
			String line = userData.nextLine();
			if(line.equals(username)) {
				
				System.out.println("The username already exists!");
				return;
				
			}
			
		}
		
		// PASSWORD
		System.out.print("Please enter your password: ");
		String password = userIn.next();
		
		userData.close();
		
		try {
			
			// WRITES THE USER INFORMATION (UPDATE)
			PrintWriter dataWrite = new PrintWriter(new FileWriter(userLo, true));
			
			dataWrite.print(username + "\n");
			dataWrite.print(password + "\n");
			dataWrite.println();
		
			dataWrite.close();
			
		} 
		catch (FileNotFoundException err) {
			
			// ERROR
			err.printStackTrace();
			
		}
		
		}
		
		//SIGN IN
		else {	
			
			// USERNAME 
			System.out.print("Please enter your username: ");
			String username = userIn.next();

			//
			while (userData.hasNextLine()) {
			
				String line = userData.nextLine();
				if(line.equals(username)) {
					
					// PASSWORD
					System.out.print("Please enter your password: ");
					String password = userIn.next();
					
					if(userData.nextLine().equals(password)) {
						
						System.out.println("Password is correct!");
						
					}
					else {
						
						System.out.println("WRONG PASSWORD!");
						return;
						
					}
					
				}
				
			}
			
			userData.close();
			
		}

	}

}
