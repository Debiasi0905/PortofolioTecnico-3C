
import java.util.Random;
import javax.swing.JOptionPane;

public class SomaDados extends javax.swing.JFrame {
    Random dado = new Random();
    int numA;
    int numS;
    String nome;
    int jorges;
    int aposta;
    int dinheiro;
    int premio;
    public SomaDados() {
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
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
        jLabel1.setText("Soma Dados");

        jLabel2.setText("Aposta:");

        apostaLabel.setText("a");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
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
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apostadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apostadorActionPerformed
        Apostador a = new Apostador();
        a.coletor(jorges, 2, nome, dinheiro);
        a.setVisible(true);
    }//GEN-LAST:event_apostadorActionPerformed

    public int dado(int n){
        numA = dado.nextInt(n);
        return(numA);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            dado(5);
            numA += 1;
            numS = numA;
            dado(5);
            numA += 1 + numS;
            int num = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            if(num == numA && numA == 2 || numA == 12){
                premio = aposta * 10;
            }else if(num == numA){
                premio = aposta * 5;
            }
            JOptionPane.showMessageDialog(this, "O resultado foi " + numA + ", e sua aposta foi no " + num + ". " + nome + ", seu prêmio é de J$" + premio);
            premio = 0;
            aposta = 0;
            jorgesLabel.setText(Integer.toString(jorges));
            apostaLabel.setText(Integer.toString(aposta));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, nome + ", você deve escolher uma soma para jogar!", "AVISO!", 0);
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void instrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrucoesActionPerformed
        JOptionPane.showMessageDialog(this, " > Após ter definido sua aposta em Apostador, selecione o número desejado, de 2 (1+1), até 12 (6+6);\n > Saiba quê:\n  - Se a soma for 2 ou 12, e corresponder à sua aposta, o prêmio é de 3000%\n  - Se a soma for de 3 à 11, e corresponder à sua aposta, o prêmio é de 500%\n > Com seu número escolhido, pressione o botão Sortear;\n > Um painel será exibido com o resultado, e você poderá coletar seus Jorges.", "Regras de Jogo - Soma Dados", 1);
    }//GEN-LAST:event_instrucoesActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        MenuJogos a = new MenuJogos();
        a.coletor(nome, jorges, dinheiro);
        a.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
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
                new SomaDados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apostaLabel;
    private javax.swing.JButton apostador;
    private javax.swing.JButton instrucoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jorgesLabel;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}