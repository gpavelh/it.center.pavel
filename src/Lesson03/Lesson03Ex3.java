package Lesson03;//Ряд Фибонначчи

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson03Ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длинну ряда Фибонначчи: ");
        int a = Integer.parseInt(reader.readLine());
        for (int i = 0; i < a; i++) {
            System.out.print(fiban(i) + " ");
        }
    }
    public static int fiban(int a){
        if (a == 0)
        {
            return 0;
        }
        if (a == 1)
        {
            return 1;
        }
        return fiban(a - 1)  + fiban(a - 2);
    }
}
