package Files;
import java.io.File; 
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class CreateReadAppendFile {
	  public static void main(String[] args) {
		  try {
		         String data = " Hello the text is appended to the file";
		         File f1 = new File("C:\\MY WORK\\abc.txt");
		         if(!f1.exists()) {
		            f1.createNewFile();
		         }
		         FileWriter fileWritter = new FileWriter(f1.getName(),true);
		         BufferedWriter bw = new BufferedWriter(fileWritter);
		         bw.write(data);
		         bw.close();
		         System.out.println("File Created and Appended Successfully");
		    } 
		         catch(IOException e){
		         e.printStackTrace();
            }
	  }
}