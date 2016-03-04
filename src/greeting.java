import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class Greeting {
    private String fileName;
    private String countryName = null;

    public Greeting(String[] args){
        if(args.length == 1) {
            this.fileName = args[0];
        }
        else {
            this.fileName = args[0];
            this.countryName = args[1];
        }
    }

    private List<String> getList(){
        File file = new File(fileName);
        List<String> lines = null;
        try {
            lines = Files.readAllLines(file.toPath(), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public void representData() {
        List<String> lines = getList();
        if(countryName == null) {
            for (String line : lines) {
                String[] array = line.split(",");
                Gender g = array[2].contains("Female") ? Gender.Female : Gender.Male;
                Person eachPerson = new Person(array[0], array[1], g, array[3], array[4], array[5], array[6]);
                System.out.println(eachPerson.getFirstNameFirstAndCountry());
                System.out.println(eachPerson.getLastNameFirstAndCountry());
            }
        }
        else{
            for (String line : lines) {
                String[] array = line.split(",");
                Gender g = array[2].contains("Female") ? Gender.Female : Gender.Male;
                if(array[6].contains(countryName)) {
                    Person eachPerson = new Person(array[0], array[1], g, array[3], array[4], array[5], array[6]);
                    System.out.println(eachPerson.getFirstNameFirstAndCountry());
                    System.out.println(eachPerson.getLastNameFirstAndCountry());
                }
            }
        }
    }
}
