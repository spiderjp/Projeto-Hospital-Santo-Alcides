package projetotdaepoo;

/**
 *
 * @author jotap
 */
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Paciente extends Pessoa{
        
        
	private int telefone;
        private String agendamentoConsulta;
        private ArrayList [][] dadoscarteira;

   
        

        public Paciente(){}

	public Paciente(int tel){

	
	this.telefone = tel;
	
}

    public String getAgendamentoConsulta() {
        return agendamentoConsulta;
    }
    
     public void setAgendamentoConsulta(String agendamentoConsulta) {
        this.agendamentoConsulta = agendamentoConsulta;
    }
          
        public int getTelefone() {
        return telefone;
    }

        public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

      public ArrayList[][] getDadoscarteira() {
        return dadoscarteira;
    }

    public void setDadoscarteira(ArrayList[][] dadoscarteira) {
        this.dadoscarteira = dadoscarteira;
    }

    void setDadoscarteira(JTable jt_carteiravacinacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
