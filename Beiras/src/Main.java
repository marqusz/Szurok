import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> rabok = new ArrayList<>(FileMethods.beolvas("record.txt"));

        List<Prisoner> prisoners = new ArrayList<>(CRUDMethods.readPrisoners("record.txt"));



        prisoners.forEach(System.out::println);



    }
}
