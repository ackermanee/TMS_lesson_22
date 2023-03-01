import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
        Map<String, Document> documentMap = new HashMap<>();
        Set<String> contractSet = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Document.txt"))) {
            String string;
            while ((string = br.readLine()) != null) {
                String[] infDocument = string.split(",");
                String number = infDocument[0].trim();
                if (!contractSet.contains(number)) {
                    contractSet.add(number);
                    Document doc = new Document();
                    doc.setTitle(infDocument[1]);
                    doc.setDate(infDocument[2]);
                    doc.setAuthor(infDocument[3]);
                    documentMap.put(number, doc);
                }
            }
            } catch(FileNotFoundException ex){
                System.err.println("Не верный путь!");
            }
        for (Map.Entry<String, Document> entry : documentMap.entrySet()) {
            System.out.println("["+entry.getKey() + " -> " + entry.getValue()+"]");
        }
    }
}