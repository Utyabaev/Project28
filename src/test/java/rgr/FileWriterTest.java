package rgr;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class FileWriterTest {

@Test
public void test() {
try {
FileWriter writer = new FileWriter("����.txt");
writer.write("����");
writer.close();

String actual = null;
FileReader reader = new FileReader("����.txt");
char [] a = new char[4];
reader.read(a);

actual = String.valueOf(a);

String expected = "����";

assertEquals(actual, expected);

} catch(IOException ex) {
ex.printStackTrace();
}



}

}