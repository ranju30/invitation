package com;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class ReadFile {
    private String fileName;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    public List<String> getList() throws IOException {
        File file = new File(this.fileName);
        List<String> lines;
        lines = Files.readAllLines(file.toPath(), Charset.defaultCharset());
        return lines;
    }
}
