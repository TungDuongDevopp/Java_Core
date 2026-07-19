package files;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) throws IOException {
        Path source = Path.of("Java/src/resources/Hello.txt");
        Path target = Path.of("Java/src/resources/Goodbye.txt");
        System.out.println(Files.exists(source)); // Kiểm tra tồn tại

        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);

    }
}
