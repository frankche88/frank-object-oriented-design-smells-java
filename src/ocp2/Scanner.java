package ocp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scanner {

    public static String read() throws IOException {
        Util.outputInLine("Scanner - Enter String:");
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

}