package com.nowakowski.singleton.service;

import com.nowakowski.singleton.entity.BookEntity;
import com.nowakowski.singleton.repository.Deletor;
import com.nowakowski.singleton.repository.Reader;
import com.nowakowski.singleton.repository.Writer;
import java.io.IOException;

public class BookService {

    public void readBookData() throws IOException {
        new Reader().read("books.csv", new BookEntity());
    }

    public void writeBookData() throws IOException {
        Writer writer = Writer.getInstance();
        writer.write("books.csv", new BookEntity("2", "Test", "Testowski", "2"));
    }

    public void deleteBookData() throws IOException {
        Deletor deletor = new Deletor();
        deletor.delete("books.csv", "2");
    }
}
