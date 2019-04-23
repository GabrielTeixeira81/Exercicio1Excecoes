package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> animal = new ArrayList<>();
        animal.add("Pato");
        animal.add("Cachorro");
        animal.add("Gato");

        try {

            System.out.println(animal.get(3));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
