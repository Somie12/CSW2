import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java FileReader <file_path>");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);

        try {
            validateFile(file);
            readFile(file);
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + e.getMessage());
        } catch (FileReadPermissionException e) {
            System.err.println("Error: Insufficient permission to read file - " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: Problem reading file - " + e.getMessage());
        }
    }

    private static void validateFile(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new FileNotFoundException("File not found: " + file.getAbsolutePath());
        } else if (!file.isFile() || !file.canRead()) {
            throw new FileReadPermissionException("No read permission for file: " + file.getAbsolutePath());
        }
    }

    private static void readFile(File file) throws IOException {
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                String content = new String(buffer, 0, bytesRead);
                System.out.print(content);
            }
        }
    }
}

class FileNotFoundException extends Exception {
    public FileNotFoundException(String message) {
        super(message);
    }
}

class FileReadPermissionException extends Exception {
    public FileReadPermissionException(String message) {
        super(message);
    }
}