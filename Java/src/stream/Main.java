package stream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        try (
                FileInputStream in = new FileInputStream("Java/src/resources/Hello.txt");
                FileOutputStream out = new FileOutputStream("Java/src/resources/Goodbye.txt");
        )
            {
                int data;
                while ((data = in.read()) != -1) {
                    out.write(data);
                }
            }
        System.out.println("Đã xong");
    }
}
