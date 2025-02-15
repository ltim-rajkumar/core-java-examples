import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesDemo {

    public static void main(String[] args) throws IOException, InterruptedException {

        String FILE_PATH = "E:\\learnings\\java\\codebase\\";
        String FILE_NAME = "temp.txt";

//        Path path = Path.of(FILE_PATH + FILE_NAME);
        Path path = Paths.get(FILE_PATH + FILE_NAME);
        Path createFilePath = null;

        try {
            createFilePath = Files.createFile(path);
            System.out.println("File created at path: " + createFilePath);

            String fileContent = """
                    Hello nio files
                    """;

            System.out.println("----- Writing file content from path: " + createFilePath + " -----");
            Files.writeString(createFilePath, fileContent);
            System.out.println("----- Writing file completed -----");

            // Read file
            System.out.println("----- Read file content -----");

            Stream<String> lines = Files.lines(createFilePath);
            lines.forEach(System.out::println);
            lines.close();
            System.out.println("----- Reading file content is completed -----");

            System.out.println("------ Reading file using Files.readString() ------");
            System.out.println(Files.readString(createFilePath));
            System.out.println("----- Reading file content using Files.readString() is completed -----");


        } catch (IOException e) {
            System.out.println("File exception: " + e);
        } finally {
            System.out.println("-------- Finally block executed --------");
            if(createFilePath != null) {
                // Comment below code if you want to see file at location <createFilePath>
                Files.delete(createFilePath);
                System.out.println("File deleted from path: " + createFilePath);
            }
        }

    }
}