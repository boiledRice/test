package com.boiledRice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * It's the Main class of the Hello World project created to test functionality of Git and GitHub.
 * @version 0.2
 * @since 0.1
 * @author boiledRice
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println(reader.readLine());
    }
}
