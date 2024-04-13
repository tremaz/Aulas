public class Conta implements Seguranca{

    public String cpf;
    public String senha;
    public double saldo;
    

    public Conta(String cpf, String senha, double saldo) 
    {
        this.cpf = cpf;
        this.senha = senha;
        this.saldo = saldo;
    }

    @Override
    public String verificarSenha(String senha) 
    {
        if (this.senha == senha)
        {
            return mensagemSucesso();
        }
        else
        {
            return mensagemFracasso();
        }
    }

    public String mensagemSucesso()
    {
        return "Correto!";
    }

    public String mensagemFracasso()
    {
        return "Incorreto!";
    }

    public void sacar(double val, String senha)
    {
        if(verificarSenha(senha) == mensagemSucesso())
        {
            this.saldo = this.saldo - val;
        }
        else
        {
            mensagemFracasso();
        }
    }
}
