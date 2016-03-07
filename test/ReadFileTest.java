import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReadFileTest {
    @Test
    public void test_reafFile_it_can_read_a_given_csv_file() throws Exception {
        ReadFile readFile = new ReadFile("./data/sample.csv");
        assertEquals("Ranju,Karmakar,Male,22,Hooghly,WB,India", readFile.getList().get(0));
    }
}