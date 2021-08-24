
import java.util.Random;
import javax.swing.JOptionPane;

public class Beskar extends javax.swing.JFrame {
    Random dado = new Random();
    String nome;
    int pontos;
    int numA;
    int num1;
    int num2;
    int jorges;
    int aposta;
    int dinheiro;
    int premio;
    String emote;
    public Beskar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        apostaLabel = new javax.swing.JLabel();
        boxEmote = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        instrucoes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        apostador = new javax.swing.JButton();
        jorgesLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Aposta:");

        apostaLabel.setText("a");

        boxEmote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "(^_^)", "(T_T)", "(¬‿¬)", "(•_•)", "(ˉ﹃ˉ)" }));
        boxEmote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEmoteActionPerformed(evt);
            }
        });

        jButton1.setText("Sortear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        instrucoes.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        instrucoes.setText("i");
        instrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrucoesActionPerformed(evt);
            }
        });

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
        jLabel1.setText("Caça Beskar");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jorgesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(boxEmote, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apostador, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEmote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void coletor(String nome, int jorges, int dinheiro){
        this.nome = nome;
        this.jorges = jorges;
        this.dinheiro = dinheiro;
        jorgesLabel.setText(Integer.toString(jorges));
        apostaLabel.setText(Integer.toString(aposta));
    }
    
    public int dado(int n){
        numA = dado.nextInt(n);
        return(numA);
    }
    
    public void aposta(int jorges, int aposta, String nome){
        this.jorges = jorges;
        this.aposta = aposta;
        this.nome = nome;
        jorgesLabel.setText(Integer.toString(jorges));
        apostaLabel.setText(Integer.toString(aposta));
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dado(5);
        sorteiaEmote(numA);
        String emote1 = emote;
        dado(5);
        sorteiaEmote(numA);
        String emote2 = emote;
        dado(5);
        sorteiaEmote(numA);
        String emote3 = emote;
        String emoteJ = boxEmote.getSelectedItem().toString();
        if(emoteJ.equals("-")){
            JOptionPane.showMessageDialog(null, nome + ", você deve escolher um emotecon para jogar!", "AVISO!", 0);
            return;
        }
        if(emoteJ.equals(emote1)){
            pontos++;
        }if(emoteJ.equals(emote2)){
            pontos++;
        }if(emoteJ.equals(emote3)){
            pontos++;
        }
        premio = aposta * pontos;
        JOptionPane.showMessageDialog(this, "O resultado foi " + emote1 + " " + emote2 + " " + emote3 + " " + ", e sua aposta foi no " + emoteJ + ". " + nome + ", seu prêmio é de J$" + premio);
        jorges += premio;
        premio = 0;
        aposta = 0;
        jorgesLabel.setText(Integer.toString(jorges));
        apostaLabel.setText(Integer.toString(aposta));
    }//GEN-LAST:event_jButton1ActionPerformed

    public String sorteiaEmote(int j){
        if(j == 0){
            emote = "(^_^)";
        }if(j == 1){
            emote = "(T_T)";
        }if(j == 2){
            emote = "(¬‿¬)";
        }if(j == 3){
            emote = "(•_•)";
        }if(j == 4){
            emote = "(ˉ﹃ˉ)";
        }return(emote);
    }
    
    private void instrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrucoesActionPerformed
        JOptionPane.showMessageDialog(this, " > Após ter definido sua aposta em Apostador, selecione o Emoticon desejado\n > Com seu emote escolhido, pressione o botão Sortear;\n > Seu lucro será definido pela quantidade de vezes que seu Emote aparecer (de 1x à 3x);\n > Um painel será exibido com o resultado, e você poderá coletar seus Jorges.", "Regras de Jogo - Caça Beskar", 1);
    }//GEN-LAST:event_instrucoesActionPerformed

    private void apostadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apostadorActionPerformed
        Apostador a = new Apostador();
        a.coletor(jorges, 4, nome, dinheiro);
        a.setVisible(true);
    }//GEN-LAST:event_apostadorActionPerformed

    private void boxEmoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEmoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEmoteActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        MenuJogos a = new MenuJogos();
        a.coletor(nome, jorges, dinheiro);
        a.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beskar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apostaLabel;
    private javax.swing.JButton apostador;
    private javax.swing.JComboBox<String> boxEmote;
    private javax.swing.JButton instrucoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jorgesLabel;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}