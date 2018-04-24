import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Start start = new Start();
        start.go();

        ArrayList list = new ArrayList(); //массив для хранения кораблей

        for (int i = 0; i < 10; i++) {
            Ship ship = new Ship();
        }
        System.out.println("Корабли созданы!");
    }
}
