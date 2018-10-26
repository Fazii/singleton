package com.nowakowski.singleton.repository;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.nowakowski.singleton.entity.Entity;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public void read(String fileName, Entity entity) throws IOException {
        File file = new File(fileName);

        CsvMapper mapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        ObjectReader oReader = mapper.reader(entity.getClass()).with(schema);

        try (java.io.Reader reader = new FileReader(file)) {
            MappingIterator<Entity> mi = oReader.readValues(reader);
            while (mi.hasNext()) {
                System.out.println(mi.next());
            }
        }
    }
}
