import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл,
// обработайте исключения.

public class ex2 {
    public static void main(String[] args) {
        String str = "Test ";
        String repeated = str.repeat(100);
        System.out.println(repeated);
        toFileWriter(repeated);
    }


    private static void toFileWriter(String data) {
        File file = new File("file.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
