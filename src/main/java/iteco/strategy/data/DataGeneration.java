package iteco.strategy.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataGeneration {

    public int[] dataGeneration() throws IOException {
        System.out.print("Введите число, большее нуля: ");
        int length = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int[] array;
        array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * length);
        }
        return array;
    }
}
