import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
Создать программу для чтения номеров контрактов из файла.
Неповторяющиеся номера контрактов следует сохранить в структуру
данных ключ-значение, где ключ - это номер контракта, а значение -
это объекты класса Document со всей контекстной информацией
(номер документа, дата создания и другая информация).
Структуру данных ключ-значение вывести на экран. Использовать коллекции
Set и Map.
* */

public class Main {
    public static void main(String[] args) throws IOException {
//        List<Document> documents = new ArrayList<>();
        Map<String, Document> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Document.txt"))) {
            String array;
            while ((array = br.readLine()) != null) {
                String[] infPerson = array.split(",");
                map.put((infPerson[0]), new Document(infPerson[1], infPerson[2], infPerson[3]));
                Set<HashMap> set = new HashSet<>();
                for(Map.Entry<String, Document> entry : map.entrySet())
                {
                    System.out.println(entry.getKey()+" - "+entry.getValue());
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Не верный путь!");
        }
    }
}