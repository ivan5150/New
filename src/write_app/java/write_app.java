
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class write_app{
	public static void main(String[] args)

throws IOException
{

String str;


Scanner sc = new Scanner(System.in);
        
PrintWriter pw = new PrintWriter(new File("newFile.txt"));
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
pw.println("Enter something ");

do{

str = br.readLine(); 
pw.append(str);
pw.println();



str = sc.next();
}

while(!str.equals("-stop"));

pw.close();


}
}

