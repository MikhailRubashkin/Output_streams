import java.io.*;

//Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.

public class Main {

    public static void main(String[] args) throws IOException {

        File f = new File("Filetxt.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null) System.out.println(line);
    }
}



