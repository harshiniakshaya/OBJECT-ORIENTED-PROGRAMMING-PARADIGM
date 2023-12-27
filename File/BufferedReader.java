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
			BufferedReader b = new BufferedReader(f);
			String line;
			while((line=b.readLine())!=null){
				System.out.println(line);
			}
		}
		catch(IOException e){
			System.out.print(e.getMessage());
		}
	}
}
