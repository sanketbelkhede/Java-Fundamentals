package filehandlingconcepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BasicofFileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\sanke\\OneDrive\\Desktop\\Example3");//this path can be a folder or a file
		System.out.println(file.exists()); //returns if file exists
		System.out.println(file.canRead());//returns if file is readable
		System.out.println(file.mkdir());//creates folder and returns if folder is created
		System.out.println(file.isDirectory()); //returns if path is folder or not
		System.out.println(file.delete()); // deletes path and returns if it is deleted
		
		File file2 = new File("C:\\Users\\sanke\\OneDrive\\Desktop\\Example.txt");
		System.out.println(file2.exists());
		try {
			FileWriter fw = new FileWriter(file2,true);
//			fw.write("ccc");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader fd = new FileReader(file2);
			BufferedReader bff = new BufferedReader(fd);
			int count = 0;
			int b = bff.read();
			while(b!= -1) {
				count++;
				b = bff.read();
			}
			System.out.println(count);
			int a = fd.read();
			while(a!=-1) {
				System.out.println((char)a + " " + a);
				a = fd.read();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
