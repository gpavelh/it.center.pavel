import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()), arf = 1, geo = 1;
        for (int i = 0; i < a; i++){
            if (i == 0) {
                System.out.print("Арифметическая прогрессия: " + arf + " ");
                arf += 2;
            }
            else {
                System.out.print(arf + " ");
                arf += 2;
            }
        }
        for (int i = 0; i < a; i++){
            if (i == 0) {
                System.out.println("");
                System.out.print("Геометрическая прогрессия: " + geo + " ");
                geo = geo * 2;
            }
            else {
                System.out.print(geo + " ");
                geo = geo * 2;
            }
        }
    }

}
