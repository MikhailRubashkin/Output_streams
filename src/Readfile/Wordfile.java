package Readfile;

import java.io.*;
import java.util.ArrayList;


//Задан файл с текстом, найти и вывести в консоль все слова,  для которых последняя буква одного слова совпадает с первой буквой следующего слова


public class Wordfile {

    private static final String FILE_NAME_INPUT = "Filetxt2.txt";

    public static StringBuilder getLine2(String...words) {

        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder sb2 = new StringBuilder();
        for (String word : words)
            arrayList.add(word);
        for (int j = 0; j < arrayList.size() - 1; j++) {
            if (arrayList.get(j).charAt(arrayList.get(j).length() - 1) == arrayList.get(j + 1).charAt(0))
                sb2.append(arrayList.get(j)).append(" ");
        }
        return sb2;
    }

    public static void main(String[] args) throws Exception {


        System.out.println(readFromFile(FILE_NAME_INPUT));
        System.out.println();
        String start = readFromFile(FILE_NAME_INPUT);
         Wordfile so = new Wordfile();
        StringBuilder sb2 = new Wordfile().getLine2(readFromFile(FILE_NAME_INPUT));
        System.out.println(sb2);

    }





    public static String readFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        String str = null;
        StringBuilder sb = new StringBuilder();
        while ((str = br.readLine()) != null) {
            String[] arrayWords = str.split("\\s+");
            for (String s : arrayWords) {
                sb.append(s + "\n");
            }
        }

        return sb.toString();
    }
}









