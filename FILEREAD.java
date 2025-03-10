import java.io.BufferedReader;
import  java.io.File;
import java.io.FileReader;
public class FILEREAD {
    public static void main(String args[]) throws Exception {
        File fileob = new File("C:\\siddiq\\ladaf.txt");
        FileReader fr = new FileReader(fileob);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

}
