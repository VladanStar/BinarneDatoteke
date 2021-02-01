package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Kreiranje izlaznog strima za datoteku
        FileOutputStream output = null;
        try {
            output = new FileOutputStream("temp.dat");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Izlazne vrednosti za datoteku
        for (int i = 1; i <= 10; i++) {
            try {
                output.write(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Zatvara izlazni strim
        try {
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Kreiranje ulaznog strima za datoteku
        FileInputStream input = null;
        try {
            input = new FileInputStream("temp.dat");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Čitaanje vrednosti iz datoteke
        int value;
        while ((value = input.read() ) != -1)
            System.out.print(value + " ");

        // Zatvaranje izlaznog strima
        input.close();
    }
}
