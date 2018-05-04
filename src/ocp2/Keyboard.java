package ocp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {

    public static String read() throws IOException {
        Util.outputInLine("Keyboard - Enter String:");
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

}