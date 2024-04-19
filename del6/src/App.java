import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Usuario u1 = new Usuario();

        u1.cadastrar("123", "Jo", "sla@mail", "123321");

        FileWriter fileWriter = new FileWriter("Usuario.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(u1.status());
        
        bufferedWriter.close();
        
    }
}
