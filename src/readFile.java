import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class readFile {
    public static void main(String[] args) throws Exception {
        File file = new File("./data/records.csv");
        List<String> lines = Files.readAllLines(file.toPath(), Charset.defaultCharset());
        for (String line : lines) {
            String[] array = line.split(",");
            Gender g = array[2].contains("Fe") ? Gender.Female : Gender.Male;
            Person eachPerson = new Person(array[0], array[1], g, array[3], array[4], array[5], array[6]);
            System.out.println(eachPerson.getFirstNameFirstAndCountry());
            System.out.println(eachPerson.getLastNameFirstAndCountry());
        }
    }
}
