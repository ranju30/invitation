import com.ReadFile;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ReadFileTest {
    @Test
    public void test_reafFile_it_can_read_a_given_csv_file() throws Exception {
        ReadFile readFile = new ReadFile();
        assertEquals("Ranju,Karmakar,Male,22,Hooghly,WB,India", readFile.getList("./data/sample.csv").get(0));
    }

    @Test
    public void test_when_wrong_fileName_is_given() throws Exception {
        ReadFile readFile = new ReadFile();
        try {
            List<String> list = readFile.getList("./data/wrong.txt");
        }catch (IOException e){
            new AssertionError(e);
        }
    }
}