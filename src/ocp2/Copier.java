package ocp2;

public class Copier {

    // remember to reset these flags
    public static boolean scannerFlag = true;
    public static boolean databaseFlag = true;

    public static void copy() throws Exception {
        String inputValue = "";
        while (!(inputValue = (scannerFlag ? Scanner.read() : Keyboard.read()))
                .equals("-1")) {
            if (databaseFlag) {
                Database.write(inputValue);
            } else {
                Printer.write(inputValue);
            }
        }
    }
}