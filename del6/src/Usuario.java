
public class Usuario {
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private boolean logado;

    /* public Usuario(String cpf, String nome, String email, String senha)
    {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    } */

    public void cadastrar(String cpf, String nome, String email, String senha)
    {
        
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha; 

        System.out.println("Usuario " + nome + " cadastrado!");
    }

    public void login(String email, String senha)
    {
        if(this.email == email && this.senha == senha)
        {
            System.out.println("Login realizado!");
            this.logado = true;
        }
        else
        {
            System.err.println("Erro no login!");
        }
    }

    public void sair()
    {
        this.logado = false;
    }

    public String status()
    {
        return this.cpf + "," +  this.nome + "," +  this.email + "," +  this.senha + "\n";
    }
}