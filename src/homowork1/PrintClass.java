package homowork1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PrintClass {

    public static void main(String[] args) {

        try {
            printClass();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void printClass() throws IOException {

        File file = new File("/home/igor/Programming/workspace/HomeworkItea/src/homowork1/LisenseEncrypt.class");

        int result;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((result = bufferedReader.read()) != -1) {
                System.out.println(bufferedReader.readLine());
            }
        }
    }
}
