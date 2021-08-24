
import java.util.Random;
import javax.swing.JOptionPane;

public class Roleta extends javax.swing.JFrame {
    Random dado = new Random();
    int numAleatorio;
    String sorteio;
    int premio;
    String nome;
    int jorges;
    int aposta;
    int dinheiro;
    public Roleta() {
        initComponents();
    }
    
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
    
    public int dado(int n){
        numAleatorio = dado.nextInt(n);
        return(numAleatorio);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apostador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apostaLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jorgesLabel = new javax.swing.JLabel();
        boxCor = new javax.swing.JComboBox<>();
        apostaCor = new javax.swing.JButton();
        boxNum = new javax.swing.JComboBox<>();
        apostaNum = new javax.swing.JButton();
        instrucoes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        apostador.setText("Apostador");
        apostador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apostadorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Roleta");

        jLabel2.setText("Aposta:");

        apostaLabel.setText("a");

        jLabel3.setText("Jorges:");

        jorgesLabel.setText("a");

        boxCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Verde", "Vermelho", "Preto" }));
        boxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCorActionPerformed(evt);
            }
        });

        apostaCor.setText("Apostar!");
        apostaCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apostaCorActionPerformed(evt);
            }
        });

        boxNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Par", "Ímpar", "1 - 12", "13 - 24", "25 - 36", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36" }));
        boxNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNumActionPerformed(evt);
            }
        });

        apostaNum.setText("Apostar!");
        apostaNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apostaNumActionPerformed(evt);
            }
        });

        instrucoes.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        instrucoes.setText("i");
        instrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrucoesActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apostar por Cor");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Apostar por Num");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jorgesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(apostaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apostador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instrucoes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(apostaCor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxCor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(apostaNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxNum, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(voltar)
                    .addComponent(instrucoes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apostaCor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apostaNum)))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apostadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apostadorActionPerformed
        Apostador a = new Apostador();
        a.coletor(jorges, 3, nome, dinheiro);
        a.setVisible(true);
    }//GEN-LAST:event_apostadorActionPerformed

    private void instrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrucoesActionPerformed
        JOptionPane.showMessageDialog(this, "Apostando em uma Cor:\n\n > Após ter definido sua aposta em Apostador, selecione a cor desejada, lembrando quê:\n  - Vermelho: 200% da Aposta;\n  - Preto: 200% da Aposta;\n  - Verde: 700% da Aposta;\n > Com sua cor escolhida, pressione o botão Apostar! abaixo de Apostar por Cor;\n > Um painel será exibido com o resultado, e você poderá coletar seus Jorges.\n\nApostando em um Número:\n\n > Após ter definido sua aposta em Apostador, selecione a aposta desejada, lembrando quê:\n  - Ímpar/Par: 200% da Aposta;\n  - Coluna: 500% da Aposta;\n  - Pleno: 3000% da Aposta;\n > Com suaa aposta escolhida, pressione o botão Apostar! abaixo de Apostar por Num;\n > Um painel será exibido com o resultado, e você poderá coletar seus Jorges.\n\nPS: \n - Pleno: número único, de 0 à 36\n - Coluna: sequência de 1 à 12, de 13 à 24 ou 25 à 36\n - Ímpar/Par: qualquer número que seja ímpar ou par", "Regras de jogo - Roleta", 1);
    }//GEN-LAST:event_instrucoesActionPerformed

    private void boxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCorActionPerformed

    private void apostaCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apostaCorActionPerformed
        dado(101);
        String cor = boxCor.getSelectedItem().toString();
        if(numAleatorio <= 10){
            sorteio = "Verde";
            premio = aposta * 7;
        }else if(numAleatorio >= 11 && numAleatorio <= 45){
            sorteio = "Preto";
            premio = aposta * 2;
        }else if(numAleatorio >= 46 && numAleatorio <= 100){
            sorteio = "Vermelho";
            premio = aposta * 2;
        }
        if(cor.equals("-")){
            JOptionPane.showMessageDialog(null, nome + ", você deve escolher uma cor para jogar!", "AVISO!", 0);
            return;
        }else if(cor.equals(sorteio)){
            jorges += premio;
        }else{
            premio = 0;
        }
        JOptionPane.showMessageDialog(this, "O resultado foi " + sorteio + ", e sua aposta foi no " + cor + ". " + nome + ", seu prêmio é de J$" + premio);
            premio = 0;
            aposta = 0;
            jorgesLabel.setText(Integer.toString(jorges));
            apostaLabel.setText(Integer.toString(aposta));
    }//GEN-LAST:event_apostaCorActionPerformed

    private void apostaNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apostaNumActionPerformed
        dado(37);
        String numS = boxNum.getSelectedItem().toString();
        if(numS.equals("-")){
            JOptionPane.showMessageDialog(null, nome + ", você deve escolher uma opção para jogar!", "AVISO!", 0);
            return;
        }else if(numS.equals("Par")){
            if(numAleatorio%2 == 0){
                premio = aposta * 2;
            }
        }else if(numS.equals("Ímpar")){
            if(numAleatorio%2 == 1){
                premio = aposta * 2;
            }
        }else if(numS.equals("1 - 12")){
            if(numAleatorio >= 1 && numAleatorio <=12){
                premio = aposta * 5; 
            }
        }else if(numS.equals("13 - 24")){
            if(numAleatorio >= 13 && numAleatorio <= 24){
                premio = aposta * 5;
            }
        }else if(numS.equals("25 - 36")){
            if(numAleatorio >= 25 && numAleatorio <= 36){
                premio = aposta * 5;
            }
        }else{
        int numI = Integer.parseInt(numS);
            if(numAleatorio == numI){
                premio = aposta * 30;
            }
        }
        JOptionPane.showMessageDialog(this, "O resultado foi " + numAleatorio + ", e sua aposta foi " + numS + ". " + nome + ", seu prêmio é de J$" + premio);
        jorges += premio;
        premio = 0;
        aposta = 0;
        jorgesLabel.setText(Integer.toString(jorges));
        apostaLabel.setText(Integer.toString(aposta));
    }//GEN-LAST:event_apostaNumActionPerformed

    private void boxNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxNumActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        MenuJogos a = new MenuJogos();
        a.coletor(nome, jorges, dinheiro);
        a.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Roleta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apostaCor;
    private javax.swing.JLabel apostaLabel;
    private javax.swing.JButton apostaNum;
    private javax.swing.JButton apostador;
    private javax.swing.JComboBox<String> boxCor;
    private javax.swing.JComboBox<String> boxNum;
    private javax.swing.JButton instrucoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jorgesLabel;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}