package P_iopackage;
import  java.io.*;
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:/Documents/Full-Stack-Develaper/Core Java/src/P_iopackage/file3.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        String s= "Hibernate is an ORM Framework";
        bw.write(s);
        System.out.println("File created");
        bw.close();
        fw.close();
    }
}
