package filehandlingconcepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeNameandPhoneInOneFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File names = new File("C:\\Users\\sanke\\OneDrive\\Desktop\\names.txt");
		File phonenumbers = new File("C:\\Users\\sanke\\OneDrive\\Desktop\\phonenumbers.txt");
		File studentDetails = new File("C:\\Users\\sanke\\OneDrive\\Desktop\\studentDetails.txt");
		System.out.println(names.exists());
		System.out.println(phonenumbers.exists());
		
		try {
			FileReader readNames = new FileReader(names);
			FileReader readPhoneNumbers = new FileReader(phonenumbers);
			BufferedReader namesB = new BufferedReader(readNames);
			BufferedReader numbersB = new BufferedReader(readPhoneNumbers);
			String name = namesB.readLine();
			String number = numbersB.readLine();
			FileWriter fw = new FileWriter(studentDetails);
			while(name != null && number != null) {
				fw.write(name + ": " + number +"\n");
				name = namesB.readLine();
				number = numbersB.readLine();
			}
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
