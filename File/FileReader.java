import java.util.*;
import java.io.*;
public class example{
	public static void main(String[] args){
		File file = new File("textfile.txt");
		if(!file.exists()){
			System.out.println("file does not exist!");
		}
		try{
			FileReader f = new FileReader(file);
			int ch;
			while((ch=f.read())!=-1){
				System.out.println((char)ch);
			}
		}
		catch(IOException e){
			System.out.print(e.getMessage());
		}
	}
}
