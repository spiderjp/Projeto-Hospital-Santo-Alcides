/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotdaepoo;

import javax.swing.JOptionPane;

/**
 *
 * @author jotap
 */
public class MarcarConsulta extends javax.swing.JFrame {

    /**
     * Creates new form MarcarConsulta
     */
    public MarcarConsulta() {
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

        jp_marcarconsulta = new javax.swing.JPanel();
        jl_dataconsulta = new javax.swing.JLabel();
        jl_medicoconsulta = new javax.swing.JLabel();
        jftf_dataconsulta = new javax.swing.JFormattedTextField();
        jb_marcarconsulta = new javax.swing.JButton();
        jscp_nomesmedico = new javax.swing.JScrollPane();
        jta_nomesmedico = new javax.swing.JTextArea();
        jl_medicoconsulta1 = new javax.swing.JLabel();
        jtf_nomemedicoconsulta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_marcarconsulta.setBackground(new java.awt.Color(10, 162, 255));
        jp_marcarconsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 51, 255)));
        jp_marcarconsulta.setForeground(new java.awt.Color(255, 255, 255));

        jl_dataconsulta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jl_dataconsulta.setForeground(new java.awt.Color(255, 255, 255));
        jl_dataconsulta.setText("Data:");

        jl_medicoconsulta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jl_medicoconsulta.setForeground(new java.awt.Color(255, 255, 255));
        jl_medicoconsulta.setText("Lista de Médico:");

        jftf_dataconsulta.setBackground(new java.awt.Color(255, 204, 0));
        jftf_dataconsulta.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jftf_dataconsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftf_dataconsulta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jb_marcarconsulta.setBackground(new java.awt.Color(255, 204, 0));
        jb_marcarconsulta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jb_marcarconsulta.setForeground(new java.awt.Color(255, 255, 255));
        jb_marcarconsulta.setText("Marcar");
        jb_marcarconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_marcarconsultaActionPerformed(evt);
            }
        });

        jta_nomesmedico.setEditable(false);
        jta_nomesmedico.setBackground(new java.awt.Color(255, 204, 0));
        jta_nomesmedico.setColumns(20);
        jta_nomesmedico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jta_nomesmedico.setForeground(new java.awt.Color(0, 0, 0));
        jta_nomesmedico.setRows(5);
        jta_nomesmedico.setText("Aline\nCléber\nGeovanna\nJoão Pedro\nLucas\nMarco Antonio");
        jscp_nomesmedico.setViewportView(jta_nomesmedico);

        jl_medicoconsulta1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jl_medicoconsulta1.setForeground(new java.awt.Color(255, 255, 255));
        jl_medicoconsulta1.setText("Nome do médico:");

        jtf_nomemedicoconsulta.setBackground(new java.awt.Color(255, 204, 0));
        jtf_nomemedicoconsulta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtf_nomemedicoconsulta.setForeground(new java.awt.Color(0, 0, 0));
        jtf_nomemedicoconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nomemedicoconsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_marcarconsultaLayout = new javax.swing.GroupLayout(jp_marcarconsulta);
        jp_marcarconsulta.setLayout(jp_marcarconsultaLayout);
        jp_marcarconsultaLayout.setHorizontalGroup(
            jp_marcarconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_marcarconsultaLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jp_marcarconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_medicoconsulta1)
                    .addComponent(jl_dataconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_medicoconsulta))
                .addGroup(jp_marcarconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_marcarconsultaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jp_marcarconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jscp_nomesmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jftf_dataconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_marcarconsultaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_marcarconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_marcarconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_nomemedicoconsulta))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jp_marcarconsultaLayout.setVerticalGroup(
            jp_marcarconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_marcarconsultaLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jp_marcarconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_dataconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftf_dataconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_marcarconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_marcarconsultaLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jl_medicoconsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_marcarconsultaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(jscp_nomesmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)))
                .addGroup(jp_marcarconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_medicoconsulta1)
                    .addComponent(jtf_nomemedicoconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addComponent(jb_marcarconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_marcarconsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_marcarconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_marcarconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_marcarconsultaActionPerformed

        String data = this.jftf_dataconsulta.getText();

        String nome_medico = this.jtf_nomemedicoconsulta.getText();

        JOptionPane.showMessageDialog(null, "Data: " + data + "\nMédico: " + nome_medico);

        LoginMedicos lm = new LoginMedicos();

        lm.setVisible(true);
        lm.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jb_marcarconsultaActionPerformed

    private void jtf_nomemedicoconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nomemedicoconsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nomemedicoconsultaActionPerformed

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
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_marcarconsulta;
    private javax.swing.JFormattedTextField jftf_dataconsulta;
    private javax.swing.JLabel jl_dataconsulta;
    private javax.swing.JLabel jl_medicoconsulta;
    private javax.swing.JLabel jl_medicoconsulta1;
    private javax.swing.JPanel jp_marcarconsulta;
    private javax.swing.JScrollPane jscp_nomesmedico;
    private javax.swing.JTextArea jta_nomesmedico;
    private javax.swing.JTextField jtf_nomemedicoconsulta;
    // End of variables declaration//GEN-END:variables
}
