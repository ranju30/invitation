package com;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class ReadFile {

    public List<String> getList(String fileName) throws IOException {
        File file = new File(fileName);
        List<String> lines;
        lines = Files.readAllLines(file.toPath(), Charset.defaultCharset());
        return lines;
    }
}
