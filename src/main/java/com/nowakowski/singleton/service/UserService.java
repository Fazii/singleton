package com.nowakowski.singleton.service;

import com.nowakowski.singleton.entity.UserEntity;
import com.nowakowski.singleton.repository.Deletor;
import com.nowakowski.singleton.repository.Reader;
import com.nowakowski.singleton.repository.Writer;
import java.io.IOException;

public class UserService {

    public void readUserData() throws IOException {
        Reader reader = new Reader();
        reader.read("users.csv", new UserEntity());
    }

    public void writeUserData() throws IOException {
        Writer writer = Writer.getInstance();
        writer.write("users.csv", new UserEntity("2", "Adam", "Małysz", "1987", "0"));
    }

    public void deleteUserData() throws IOException {
        Deletor deletor = new Deletor();
        deletor.delete("users.csv", "2");
    }
}
