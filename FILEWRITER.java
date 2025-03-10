import java.io.*;
import java.util.Scanner;
public class FILEWRITER {
    public static void main(String args[]) throws Exception {
        String essays = "This is the data in the output file\nThis is the data in the output file\n This is the data in the output file\n";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter file name and folder name");
             String filename=sc.next();
             String foldername=sc.next();
        File f = new File("C:\\" + foldername + "\\" + filename + ".txt");
        FileWriter out= new FileWriter(f);
        System.out.println("file created");
        out.write(essays);
        System.out.println("file written");
        out.close();
    }
}
