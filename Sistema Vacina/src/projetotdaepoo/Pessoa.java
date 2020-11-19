package projetotdaepoo;


/**
 *
 * @author jotap
 */
public abstract class Pessoa{
   
    private String nome;
    private int idade;
    private String CPF;
    private String email;
    private String usuario;
    private String senha;
    private String endereco;

    public Pessoa(){}
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }

    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public String getCPF() {
        return CPF;
    }
    
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    public String getEmail() {
      
        return email;
    }
    
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }
    
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getSenha() {
        return senha;
    }
    
     public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }
    
    

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

 

    
   
    
    
}
