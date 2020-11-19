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
public class Medico extends LoginMedicos implements Login{
    
       
 	
	private String areaAtuante;
	private int crm;
        private boolean residente;
        
	public Medico(String ar, int crm, int t){

	
	this.areaAtuante = ar;
	this.crm = crm;
}

    public Medico() {
    }

    public int getcrm() {
        return crm;
    }

    public void setcrm(int crm) {
        this.crm = crm;
    }

    public String getareaAtuante() {
        return areaAtuante;
    }

    public void setareaAtuante(String areaAtuante) {
        this.areaAtuante = areaAtuante;
    }

    public boolean isResidente() {
        return residente;
    }

    public void setResidente(boolean residente) {
        this.residente = residente;
    } 

    
    public void fazerLogin(String usuario, String senha, int telefone, int crm, int coren) {
        
        System.out.println("Nome do médico: " + usuario);
        System.out.println("CRM do médico: " + crm);
        System.out.println("Senha do médico: " + senha);
        System.out.println("Área atuante: " + "Médico");
    
   
    }

    
    
	
}
