
import javax.swing.JOptionPane;

public class Apostador extends javax.swing.JFrame {
    int jorges;
    int aposta;
    int jogo;
    int dinheiro;
    String nome;
    public Apostador() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        ficha_100 = new javax.swing.JButton();
        ficha_500 = new javax.swing.JButton();
        apostar = new javax.swing.JButton();
        ficha_1000 = new javax.swing.JButton();
        ficha_5000 = new javax.swing.JButton();
        ficha_10 = new javax.swing.JButton();
        ficha_50 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        apostaLabel = new javax.swing.JLabel();
        jorgesLabel = new javax.swing.JLabel();
        instrucoes = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ficha_100.setText("J$100");
        ficha_100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficha_100ActionPerformed(evt);
            }
        });

        ficha_500.setText("J$500");
        ficha_500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficha_500ActionPerformed(evt);
            }
        });

        apostar.setText("Apostar");
        apostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apostarActionPerformed(evt);
            }
        });

        ficha_1000.setText("J$1000");
        ficha_1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficha_1000ActionPerformed(evt);
            }
        });

        ficha_5000.setText("J$5000");
        ficha_5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficha_5000ActionPerformed(evt);
            }
        });

        ficha_10.setText("J$10");
        ficha_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficha_10ActionPerformed(evt);
            }
        });

        ficha_50.setText("J$50");
        ficha_50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficha_50ActionPerformed(evt);
            }
        });

        jLabel3.setText("Jorges:");

        jLabel4.setText("Aposta:");

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apostador");

        instrucoes.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        instrucoes.setText("i");
        instrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrucoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(apostar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jorgesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(0, 0, 0)
                            .addComponent(instrucoes))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ficha_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ficha_500, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ficha_50, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ficha_1000, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ficha_5000, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ficha_100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(instrucoes))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jorgesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(apostaLabel))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ficha_50, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ficha_100, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ficha_10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ficha_1000, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ficha_5000, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ficha_500, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apostar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void coletor(int jorges, int jogo, String nome, int dinheiro){
        this.jorges = jorges;
        this.jogo = jogo;
        this.nome = nome;
        this.dinheiro = dinheiro;
        grava();
    }
    
    public void grava(){
        apostaLabel.setText(Integer.toString(aposta));
        jorgesLabel.setText(Integer.toString(jorges));
    }
    
    private void ficha_100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha_100ActionPerformed
        aposta += 100;
        jorges -= 100;
        grava();
    }//GEN-LAST:event_ficha_100ActionPerformed

    private void ficha_500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha_500ActionPerformed
        aposta += 500;
        jorges -= 500;
        grava();
    }//GEN-LAST:event_ficha_500ActionPerformed

    private void apostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apostarActionPerformed
        grava();
        if(jorges < dinheiro){
            JOptionPane.showMessageDialog(null, nome + ", faça uma aposta ou cancele", "AVISO!", 0);
        }else if(jorges > 0){
            if(jogo == 1){
                BlackJack jogos = new BlackJack();
                jogos.aposta(jorges, aposta, nome);
                jogos.setVisible(true);
                jogo = 0;
            }else if(jogo == 2){
                SomaDados jogos = new SomaDados();
                jogos.aposta(jorges, aposta, nome);
                jogos.setVisible(true);
                jogo = 0;
            }else if(jogo == 3){
                Roleta jogos = new Roleta();
                jogos.aposta(jorges, aposta, nome);
                jogos.setVisible(true);
                jogo = 0;
            }else{
                Beskar jogos = new Beskar();
                jogos.aposta(jorges, aposta, nome);
                jogos.setVisible(true);
                jogo = 0;
            }
        }else{
            JOptionPane.showMessageDialog(null, nome + ", você não tem essa bufunfa, seu pilantra!", "AVISO!", 0);
        }
    }//GEN-LAST:event_apostarActionPerformed

    private void ficha_1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha_1000ActionPerformed
        aposta += 1000;
        jorges -= 1000;
        grava();
    }//GEN-LAST:event_ficha_1000ActionPerformed

    private void ficha_5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha_5000ActionPerformed
        aposta += 5000;
        jorges -= 5000;
        grava();
    }//GEN-LAST:event_ficha_5000ActionPerformed

    private void ficha_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha_10ActionPerformed
        aposta += 10;
        jorges -= 10;
        grava();
    }//GEN-LAST:event_ficha_10ActionPerformed

    private void ficha_50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha_50ActionPerformed
        aposta += 50;
        jorges -= 50;
        grava();
    }//GEN-LAST:event_ficha_50ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        if(aposta != 0){
            jorges += aposta;
            aposta = 0;
            grava();
        }else{
            MenuJogos jogos = new MenuJogos();
            jogos.coletor(nome, jorges, dinheiro);
            jogos.setVisible(true);
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void instrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrucoesActionPerformed
        JOptionPane.showMessageDialog(this, "O apostador estará presente em todos os jogos. É aqui que você define suas apostas\n\nCada botão pressionado soma Jorges à sua Aposta. Quando estiver satisfeito, Aposte!\nCaso erre e coloque mais J$ do que queria, pressione Cancelar para zerar sua aposta,\nmas se sua aposta já for zero, Cancelar o levará de volta ao Saguão.", "Apostador", 1);
    }//GEN-LAST:event_instrucoesActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apostador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apostaLabel;
    private javax.swing.JButton apostar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton ficha_10;
    private javax.swing.JButton ficha_100;
    private javax.swing.JButton ficha_1000;
    private javax.swing.JButton ficha_50;
    private javax.swing.JButton ficha_500;
    private javax.swing.JButton ficha_5000;
    private javax.swing.JButton instrucoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jorgesLabel;
    // End of variables declaration//GEN-END:variables
}