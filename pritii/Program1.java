import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Program1 {
public static void main(String[] args) throws IOException {
// Create a BufferedReader from a FileReader.
BufferedReader reader = new BufferedReader(new FileReader(
"C:\\Users\\vijayabaskar.p\\Documents\\vb\\haii.txt"));
// Loop over lines in the file and print them.
while (true) {
String line = reader.readLine();
if (line == null) {
break;
}
System.out.println(line);
}
// Close the BufferedReader.
//reader.close();
}
}