import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception 
    {
        FileWriter fW = new FileWriter("Usuario.txt");
        FileReader fR = new FileReader("Usuario.txt");
        BufferedWriter bW = new BufferedWriter(fW);
        BufferedReader bR = new BufferedReader(fR);

        Usuario u1 = new Usuario();
        u1.cadastrar("123", "Jo", "sla@mail", "123321");

        Usuario u2 = new Usuario();
        u2.cadastrar("321", "Ze", "algo@mail", "321123");

        bW.write(u1.status());
        bW.write(u2.status());
        bW.close();

        String linha;

        while((linha = bR.readLine()) != null)
        {
            String[] dados = linha.split(",");
            Usuario usuario = new Usuario();
            System.out.println(usuario);
        }
    }
}
