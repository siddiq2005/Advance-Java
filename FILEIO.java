import java.io.*;
import java.util.Scanner;

public class FILEIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the folder name: ");
        String folderName = sc.next();
            File f = new File("C:\\" +folderName);
                if (f.exists()==true) {
                    System.out.println("Folder  Already  exists");
                }   else if (f.mkdir()==true) {
                     System.out.println("Folder Created");
            }
                    else {
                         System.out.println("Folder Not Created");
        }

    }
}
