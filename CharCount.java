import java.io.*;
    public class CharCount {
        public static void main(String[] args) throws Exception {
            File file = new File("C:\\siddiq\\ladaf.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
                String line;
                int wordCount = 0;
                int characterCount = 0;
                int sentenceCount = 0;
                int linecount = 0;
                while ((line = br.readLine()) != null) {
                    characterCount += line.length();
                    String words[] = line.split("\\s+");
                    wordCount += words.length;
                    String sentence[] = line.split("[!?.:]+");
                    sentenceCount += sentence.length;
                    System.out.println(++linecount +" "+line);
        }
                System.out.println("Total word count = "+ wordCount);
                System.out.println("Total number of sentences = "+ sentenceCount);
                System.out.println("Total number of characters = "+ characterCount);
    }
}
