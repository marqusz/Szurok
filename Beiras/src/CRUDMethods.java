import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CRUDMethods {
    //CRUD ==> Create Read Update Delete
    public static void addPrisoner(Prisoner p) throws IOException {
        List<String> rabok = new ArrayList<>(FileMethods.beolvas("record.txt"));

        List<Prisoner> prisoners = new ArrayList<>();

        for (String s : rabok) {
            prisoners.add(new Prisoner(s));
        }

        prisoners.add(p);

        FileMethods.beir(prisoners,"record.txt");
    }

    public static void deletePrisoner(String id) throws  IOException{
        List<String> rabok = new ArrayList<>(FileMethods.beolvas("record.txt"));

        List<Prisoner> prisoners = new ArrayList<>();

        for (String s : rabok) {
            prisoners.add(new Prisoner(s));
        }
        int i = 0;
        for (Prisoner p: prisoners) {
            if (p.getId().equals(id)){
                break;
            }

            i++;
        }

        prisoners.remove(i);

        FileMethods.beir(prisoners,"record.txt");
    }

    public static List<Prisoner> readPrisoners(String filename) throws  IOException{
        List<String> rabok = new ArrayList<>(FileMethods.beolvas("record.txt"));
        List<Prisoner> prisoners = new ArrayList<>();

        for (String s : rabok) prisoners.add(new Prisoner(s));


        return prisoners;
    }
}
