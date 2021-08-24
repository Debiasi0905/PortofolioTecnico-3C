import javax.swing.JOptionPane;

public class Carteira extends javax.swing.JFrame {
        String nome;
        int dinheiro;
        int jorges;
        int operacao;
        
    public Carteira() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jorgesLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ficha_10 = new javax.swing.JButton();
        ficha_50 = new javax.swing.JButton();
        ficha_100 = new javax.swing.JButton();
        ficha_500 = new javax.swing.JButton();
        ficha_1000 = new javax.swing.JButton();
        ficha_5000 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dinheiroLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        operacaoLabel = new javax.swing.JLabel();
        comprar = new javax.swing.JButton();
        vender = new javax.swing.JButton();
        zerar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        instrucoes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Minha Carteira");

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

        jLabel2.setText("Dinheiro:");

        jLabel3.setText("Jorges:");

        jLabel4.setText("Operação:");

        comprar.setText("Comprar");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        vender.setText("Vender");
        vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderActionPerformed(evt);
            }
        });

        zerar.setText("Zerar");
        zerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zerarActionPerformed(evt);
            }
        });

        jButton1.setText("Jogar!");
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

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jorgesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(dinheiroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(operacaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(0, 0, 0)
                            .addComponent(instrucoes))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ficha_10, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(ficha_500, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ficha_50, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ficha_1000, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ficha_5000, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ficha_100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(zerar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(vender, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(instrucoes))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dinheiroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jorgesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(operacaoLabel))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar)
                    .addComponent(vender)
                    .addComponent(zerar))
                .addGap(10, 10, 10)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void coletor(String nome, int jorges, int dinheiro){
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.jorges = jorges;
        jLabel1.setText("Carteira do(a) " + nome);
        dinheiroLabel.setText(Integer.toString(dinheiro));
        jorgesLabel.setText(Integer.toString(jorges));
        operacaoLabel.setText(Integer.toString(operacao));
    }
    
    private void ficha_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha_10ActionPerformed
        operacao += 10;
        operacaoLabel.setText(Integer.toString(operacao));
    }//GEN-LAST:event_ficha_10ActionPerformed

    private void ficha_50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha_50ActionPerformed
        operacao += 50;
        operacaoLabel.setText(Integer.toString(operacao));
    }//GEN-LAST:event_ficha_50ActionPerformed

    private void ficha_100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha_100ActionPerformed
        operacao += 100;
        operacaoLabel.setText(Integer.toString(operacao));
    }//GEN-LAST:event_ficha_100ActionPerformed

    private void ficha_500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha_500ActionPerformed
        operacao += 500;
        operacaoLabel.setText(Integer.toString(operacao));
    }//GEN-LAST:event_ficha_500ActionPerformed

    private void ficha_1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha_1000ActionPerformed
        operacao += 1000;
        operacaoLabel.setText(Integer.toString(operacao));
    }//GEN-LAST:event_ficha_1000ActionPerformed

    private void ficha_5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha_5000ActionPerformed
        operacao += 5000;
        operacaoLabel.setText(Integer.toString(operacao));
    }//GEN-LAST:event_ficha_5000ActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        if(dinheiro >= operacao){
            dinheiroLabel.setText(Integer.toString(dinheiro -= operacao));
            jorgesLabel.setText(Integer.toString(jorges += operacao));
            operacaoLabel.setText(Integer.toString(operacao = 0));
        }else{
            JOptionPane.showMessageDialog(this, "Você não tem tantos R$!", "AVISO!", 0);
        }
    }//GEN-LAST:event_comprarActionPerformed

    private void venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderActionPerformed
        if(operacao <= jorges){
            dinheiroLabel.setText(Integer.toString(dinheiro += operacao));
            jorgesLabel.setText(Integer.toString(jorges -= operacao));
            operacaoLabel.setText(Integer.toString(operacao = 0));
        }else{
            JOptionPane.showMessageDialog(this, "Você não tem tantos J$!", "AVISO!", 0);
        }
    }//GEN-LAST:event_venderActionPerformed

    private void zerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zerarActionPerformed
        operacaoLabel.setText(Integer.toString(operacao = 0));
    }//GEN-LAST:event_zerarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuJogos jogos = new MenuJogos();
        jogos.coletor(nome, jorges, dinheiro);
        jogos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void instrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrucoesActionPerformed
        JOptionPane.showMessageDialog(this, "Na carteira você pode controlar seus lucros, com acesso à Dinheiro e Jorges\nJorges(J$) é a moeda proprietária da casa, você apostará com eles\nCada botão pressionado soma Jorges à sua operação, indo de J$10 até J$5.000.\n\n >Comprar: Compra o valor de operação em Jorges;\n >Vender: Vende valor de operação em Jorges;\n >Zerar: reinicia sua operação;\n\nPS: 1R$ = 1J$", "CARTEIRA", 1);
    }//GEN-LAST:event_instrucoesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do Cassino Jorge´s e levar R$" + dinheiro + " para casa?");
        if(r == 0){
            MenuPrincipal a = new MenuPrincipal();
            a.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carteira().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprar;
    private javax.swing.JLabel dinheiroLabel;
    private javax.swing.JButton ficha_10;
    private javax.swing.JButton ficha_100;
    private javax.swing.JButton ficha_1000;
    private javax.swing.JButton ficha_50;
    private javax.swing.JButton ficha_500;
    private javax.swing.JButton ficha_5000;
    private javax.swing.JButton instrucoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jorgesLabel;
    private javax.swing.JLabel operacaoLabel;
    private javax.swing.JButton vender;
    private javax.swing.JButton zerar;
    // End of variables declaration//GEN-END:variables
}