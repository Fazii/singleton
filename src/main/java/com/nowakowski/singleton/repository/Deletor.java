package com.nowakowski.singleton.repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Deletor {

    public void delete(String fileName, String id_) throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter("tmp.csv"));
        BufferedReader freader = new BufferedReader(new FileReader(fileName));
        String s;
        while ((s = freader.readLine()) != null) {
            String tokens[] = s.split(",");
            String id = tokens[0];
            if (fileName.equals("books.csv")) {
                id = tokens[1];
            }
            if (!id.equals(id_)) {
                output.write(s + "\n");
            }
        }
        freader.close();
        output.close();

        try (FileReader fr = new FileReader("tmp.csv");
            FileWriter fw = new FileWriter(fileName)) {
            int c = fr.read();
            while (c != -1) {
                fw.write(c);
                c = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("tmp.csv");
        file.delete();
    }

}