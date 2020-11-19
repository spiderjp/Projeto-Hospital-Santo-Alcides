package projetotdaepoo;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotap
 */
public class Enfermeira extends Pessoa implements Login{
        
        
	
	private int telefone;
        private int coren;
        private String aplicarVacina;

        
        public Enfermeira(){}
        
	public Enfermeira(int c, int tl){

	this.coren = c;
	this.telefone = tl;
	
}
        

    public int getTelefone() {
        return telefone;
    }
    
     public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCoren() {
        return coren;
    }

    public void setCoren(int coren) {
        this.coren = coren;
    }

    
    public String getAplicarVacina() {
        return aplicarVacina;
    }

    public void setAplicarVacina(String aplicarVacina) {
        this.aplicarVacina = aplicarVacina;
    }
    
    @Override
    public void fazerLogin(String usuario, String senha, int telefone, int crm, int coren) {
        
        System.out.println("Nome da Enfermeira: " + usuario);
        System.out.println("Senha da Enfermeira: " + senha);
        System.out.println("COREN da Enfermeira: " + coren);
        
        if(usuario.equalsIgnoreCase("Alline") && coren == 31122001){
            
            
            JOptionPane.showMessageDialog(null, " Logado com sucesso!" , "Bem-vindo(a) Enfermeira(o)", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Sistema de Aplicação da vacinação");

            
        }
        else if(usuario.equalsIgnoreCase("") && senha == "senhadaenfermeira1"){
            
            JOptionPane.showMessageDialog(null, " Logado com sucesso!" , "Bem-vindo(a) Doutor(a)", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Sistema de Aplicação da vacinação");
        }
        else{
            
             JOptionPane.showMessageDialog(null, " Usuário ou Senha inválidos, tente novamente" , "Hospital Santo Alcides", JOptionPane.ERROR_MESSAGE);
        }

    }
        
        
/*Na classe Enfermeira, você deve desenvolver o método aplicarVacina(), que recebe
como parâmetro um objeto da classe vacina. Todavia, a dose da vacina é aplicada conforme a
idade do paciência. Para desenvolver este método considere a tabela1 a seguir:*/

}
