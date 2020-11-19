package projetotdaepoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author jotap
 */
public class VerificarCarteira extends javax.swing.JFrame {

    
    ArrayList<Pessoa> pessoas = new ArrayList();
    ArrayList<Enfermeira> enfermeiras = new ArrayList();
    
    public VerificarCarteira() {
        initComponents();
    }
    
 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl_nomepaciente = new javax.swing.JLabel();
        jtf_nomepaciente = new javax.swing.JTextField();
        jl_receitarvacina = new javax.swing.JLabel();
        jftf_receitarvacina = new javax.swing.JFormattedTextField();
        lj_codigoautorizacao = new javax.swing.JLabel();
        jftf_codigoautorizacao = new javax.swing.JFormattedTextField();
        jb_solicitarvacina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(10, 162, 255));

        jl_nomepaciente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jl_nomepaciente.setForeground(new java.awt.Color(255, 255, 255));
        jl_nomepaciente.setText("Nome Paciente:");

        jtf_nomepaciente.setBackground(new java.awt.Color(255, 204, 0));
        jtf_nomepaciente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtf_nomepaciente.setForeground(new java.awt.Color(0, 0, 0));
        jtf_nomepaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nomepacienteActionPerformed(evt);
            }
        });

        jl_receitarvacina.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jl_receitarvacina.setForeground(new java.awt.Color(255, 255, 255));
        jl_receitarvacina.setText("Receitar Vacina(s):");

        jftf_receitarvacina.setBackground(new java.awt.Color(255, 204, 0));
        jftf_receitarvacina.setForeground(new java.awt.Color(0, 0, 0));
        jftf_receitarvacina.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jftf_receitarvacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftf_receitarvacinaActionPerformed(evt);
            }
        });

        lj_codigoautorizacao.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lj_codigoautorizacao.setForeground(new java.awt.Color(255, 255, 255));
        lj_codigoautorizacao.setText("Código de autorização:");

        jftf_codigoautorizacao.setBackground(new java.awt.Color(255, 204, 0));
        jftf_codigoautorizacao.setForeground(new java.awt.Color(0, 0, 0));
        jftf_codigoautorizacao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jftf_codigoautorizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftf_codigoautorizacaoActionPerformed(evt);
            }
        });

        jb_solicitarvacina.setBackground(new java.awt.Color(255, 204, 0));
        jb_solicitarvacina.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jb_solicitarvacina.setForeground(new java.awt.Color(255, 255, 255));
        jb_solicitarvacina.setText("Solicitar");
        jb_solicitarvacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_solicitarvacinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lj_codigoautorizacao)
                        .addGap(93, 93, 93)
                        .addComponent(jftf_codigoautorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jl_receitarvacina, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jftf_receitarvacina, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jl_nomepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jtf_nomepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 219, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jb_solicitarvacina, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nomepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nomepaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_receitarvacina, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftf_receitarvacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lj_codigoautorizacao)
                    .addComponent(jftf_codigoautorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(jb_solicitarvacina, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_nomepacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nomepacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nomepacienteActionPerformed

    private void jftf_receitarvacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftf_receitarvacinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftf_receitarvacinaActionPerformed

    private void jb_solicitarvacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_solicitarvacinaActionPerformed
       
        String nomePaciente = jtf_nomepaciente.getText();
        String receitarVacina = jftf_receitarvacina.getText();
        String codaut = jftf_codigoautorizacao.getText();
        
        if(codaut.equals("1973")){
          
            
 
                AplicarVacina apv = new AplicarVacina();
                apv.setVisible(true); 
                apv.setLocationRelativeTo(null); 
                JOptionPane.showMessageDialog(null,"Nome do Paciente: " + nomePaciente + "\nNome da(s) Vacina(s): " + receitarVacina 
                ,"INFORMAÇÕES PACIENTE" , JOptionPane.INFORMATION_MESSAGE);
                dispose(); 
                
            }

            else{

                JOptionPane.showMessageDialog(null, " Código de Verificação Errado, tente novamente" , "Sistema de Vacina", JOptionPane.ERROR_MESSAGE);
                
            }
                
          
          

            

            
    }//GEN-LAST:event_jb_solicitarvacinaActionPerformed

    private void jftf_codigoautorizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftf_codigoautorizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftf_codigoautorizacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerificarCarteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerificarCarteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerificarCarteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerificarCarteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerificarCarteira().setVisible(true);
            }
        });
    }

    
 
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_solicitarvacina;
    private javax.swing.JFormattedTextField jftf_codigoautorizacao;
    private javax.swing.JFormattedTextField jftf_receitarvacina;
    private javax.swing.JLabel jl_nomepaciente;
    private javax.swing.JLabel jl_receitarvacina;
    private javax.swing.JTextField jtf_nomepaciente;
    private javax.swing.JLabel lj_codigoautorizacao;
    // End of variables declaration//GEN-END:variables
}

