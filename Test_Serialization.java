import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;




class Student implements Serializable{
    String name;
    String regdno;
    double cgpa;

}

public class Test_Serialization {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student();
        s1.name = "Siddiq";
        s1.regdno = "20231CSE0475";
        s1.cgpa = 7.5;
        FileOutputStream fileOut = new FileOutputStream("C:\\siddiq\\ladaf.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(s1);
        out.close();
        fileOut.close();
        System.out.println("serialized data is saved in C:\\siddiq\\ladaf.ser");

    }
}
