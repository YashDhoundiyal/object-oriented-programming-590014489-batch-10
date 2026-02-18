import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergedFile {
public static void main(String[] args) {

try {

FileReader fr = new FileReader("file1.txt");
FileWriter fw = new FileWriter("file2.txt", true);

int i;
while((i = fr.read()) != -1) {
fw.write((char)i);
}

fr.close();
fw.close();

System.out.println("File merged successfully.");

FileReader fre = new FileReader("file2.txt");
int s;
while((s = fre.read()) != -1) {
System.out.print((char)s);
}
fre.close();

} catch (IOException e) {
System.out.println(e);}}}