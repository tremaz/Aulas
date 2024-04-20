import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Usuario u1 = new Usuario();

        u1.cadastrar("123", "Jo", "sla@mail", "123321");

        FileWriter fW = new FileWriter("Usuario.txt");
        FileReader fR = new FileReader("Usuario.txt");
        BufferedWriter bW = new BufferedWriter(fW);
        BufferedReader bR = new BufferedReader(fR);

        bW.write(u1.status());
        bW.close();

        System.out.println(bR.readLine());
    }
}
