import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileMethods {
    public  static List<String> beolvas(String filename) throws IOException {
        List<String> outout = new ArrayList<>();

        String line;
        BufferedReader br = new BufferedReader(new FileReader(filename));
        while ((line = br.readLine()) != null)
        {
            outout.add(line);
        }
        br.close();

        return outout;
    }

    public static void beir(List<Prisoner> lista,String filname) throws IOException{
        PrintWriter writer = new PrintWriter(filname, "utf-8");
        for (Prisoner s: lista) writer.println(s.toString());
        writer.close();
    }




}
