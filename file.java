import java.io.File;

public class file {

    public static void main(String[] args) {
        File file = new File("secret.txt");

        if(file.exists()) {
            System.out.println("File exists!");
        }
        else {
            System.out.println("File does not exist!");
        }
    }
}