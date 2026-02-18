import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReaderExample {
public static void main(String[] args) {
try {
FileReader fr = new FileReader("sample1.txt");
int i;
while((i = fr.read()) != -1) {
System.out.print((char)i);
}
fr.close();
FileWriter fw = new FileWriter("sample1.txt");
fw.write("Learning to do file handling in java");
fw.close();
System.out.println("File written successfully.");
FileReader fre = new FileReader("sample1.txt");
int s;
while((s = fre.read()) != -1) {
System.out.print((char)s);
}
fr.close();
} catch (IOException e) {
System.out.println(e);
}
}}