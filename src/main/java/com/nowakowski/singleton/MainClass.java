package com.nowakowski.singleton;

import com.nowakowski.singleton.service.BookService;
import com.nowakowski.singleton.service.UserService;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) throws IOException {

        System.out.println("Initial read from users");
        UserService userService = new UserService();
        userService.readUserData();

        System.out.println("Initial read from books");
        BookService bookService = new BookService();
        bookService.readBookData();

        System.out.println("Adding new User and Book");
        userService.writeUserData();
        bookService.writeBookData();

        System.out.println("Read from users after adding");
        userService.readUserData();
        System.out.println("Read from books after adding");
        bookService.readBookData();

        System.out.println("Deleting added users");
        userService.deleteUserData();
        bookService.deleteBookData();

        System.out.println("Read from users after deleting");
        userService.readUserData();
        System.out.println("Read from books after deleting");
        bookService.readBookData();

    }
}
