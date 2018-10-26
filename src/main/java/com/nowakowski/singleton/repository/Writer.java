package com.nowakowski.singleton.repository;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.nowakowski.singleton.entity.Entity;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Writer {

    private static Writer ourInstance = new Writer();

    private Writer() {
    }

    public static Writer getInstance() {
        return ourInstance;
    }

    public void write(String fileName, Entity entity) throws IOException {
        File outputFile = new File(fileName);

        CsvMapper mapper = new CsvMapper();
        CsvSchema schema = mapper.schemaFor(entity.getClass());

        ObjectWriter myObjectWriter = mapper.writer(schema);

        FileOutputStream tempFileOutputStream = new FileOutputStream(outputFile, true);
        BufferedOutputStream bufferedOutputStream =
            new BufferedOutputStream(tempFileOutputStream, 1024);
        OutputStreamWriter writerOutputStream = new OutputStreamWriter(bufferedOutputStream,
            StandardCharsets.UTF_8);
        myObjectWriter.writeValue(writerOutputStream, entity);

        writerOutputStream.close();
    }
}
