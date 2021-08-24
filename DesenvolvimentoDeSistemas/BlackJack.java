
import javax.swing.JOptionPane;

public class BlackJack extends javax.swing.JFrame {
    String nome;
    int jorges;
    int aposta;
    int dinheiro;
    public BlackJack() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        apostador = new javax.swing.JButton();
        jorgesLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apostaLabel = new javax.swing.JLabel();
        instrucoes = new javax.swing.JButton();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Jorges:");

        apostador.setText("Apostador");
        apostador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apostadorActionPerformed(evt);
            }
        });

        jorgesLabel.setText("a");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BlackJack");

        jLabel2.setText("Aposta:");

        apostaLabel.setText("a");

        instrucoes.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        instrucoes.setText("i");
        instrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrucoesActionPerformed(evt);
            }
        });

        voltar.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        voltar.setText("⇦");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instrucoes))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jorgesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apostador, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(instrucoes)
                    .addComponent(voltar))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jorgesLabel))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(apostaLabel)))
                    .addComponent(apostador, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apostadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apostadorActionPerformed
        Apostador a = new Apostador();
        a.coletor(jorges, 1, nome, dinheiro);
        a.setVisible(true);
    }//GEN-LAST:event_apostadorActionPerformed

    private void instrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrucoesActionPerformed
        JOptionPane.showMessageDialog(this, "Texto", "Título", 1);
    }//GEN-LAST:event_instrucoesActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        MenuJogos a = new MenuJogos();
        a.coletor(nome, jorges, dinheiro);
        a.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed
    
    public void coletor(String nome, int jorges, int dinheiro){
        this.nome = nome;
        this.jorges = jorges;
        this.dinheiro = dinheiro;
        jorgesLabel.setText(Integer.toString(jorges));
        apostaLabel.setText(Integer.toString(aposta));
    }
    
    public void aposta(int jorges, int aposta, String nome){
        this.jorges = jorges;
        this.aposta = aposta;
        this.nome = nome;
        jorgesLabel.setText(Integer.toString(jorges));
        apostaLabel.setText(Integer.toString(aposta));
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlackJack().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apostaLabel;
    private javax.swing.JButton apostador;
    private javax.swing.JButton instrucoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jorgesLabel;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}