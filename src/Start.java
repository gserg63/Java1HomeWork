import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int countOneDeckShip = 4;
    int countTwoDeckShip = 3;
    int countThreeDeckShip = 2;
    int countFourDeckShip = 1;


    public void go() throws IOException {
        System.out.println("Представьтесь!");
        System.out.println("Привет! " + br.readLine() + "!");
    }
}
