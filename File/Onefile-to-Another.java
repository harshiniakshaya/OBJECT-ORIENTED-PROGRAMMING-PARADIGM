/*
To copy the content from one file to another and display the number of words, characters, and 
white spaces in the source file
*/
//input file : textfile.txt
//output file: Outputfile.txt
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

			FileWriter w = new FileWriter("Outputfile.txt");
			BufferedWriter wb = new BufferedWriter(w);

			String line;
			StringBuffer sb = new StringBuffer();
			while((line=b.readLine())!=null){
				wb.write(line);
				wb.newLine();
				sb.append(line);
				sb.append(" ");
			}
			wb.close();
			w.close();
			System.out.println(sb);
			String[] a = (sb.toString()).split(" ");
			System.out.println("Total number of words: "+ a.length);
			System.out.println("Total number of spaces: "+ ((a.length)-1));
			int c =0;
			for(String i: a){
				c+=i.length();
			}
			System.out.println("Total number of characters: "+c);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
