package Black_Belt.t_11_Other.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<String> set = new TreeSet<>(); // упорядоченная коллекция неповторяющихся String

        try{
            scanner = new Scanner(new FileReader(
                    new File("C:\\Users\\Andrey\\Desktop\\RG.txt"))); // Читать из файла
            scanner.useDelimiter("\\W"); // \W – Соответствует одному символу, который НЕ буква, НЕ цифра и НЕ «_»
            while (scanner.hasNext()){ // пока есть что читать
                String word = scanner.next(); // присвоить word значение кадого прочитанного слова
                set.add(word); // добавить слово в set
            }
            for (String s : set){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Есть проблема");
        } finally {
            scanner.close();
        }


    }
}
