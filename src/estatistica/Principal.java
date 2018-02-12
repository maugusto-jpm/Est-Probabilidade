package estatistica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                    exitForm(evt);
                }
            });
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        precisao = new javax.swing.JComboBox<>();
        painel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        n = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        k = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        P_T = new javax.swing.JTextField();
        P_M = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        P_X = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pn_desvio = new javax.swing.JSpinner();
        pn_media = new javax.swing.JSpinner();
        pn_tipo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        pn_a = new javax.swing.JSpinner();
        pn_b = new javax.swing.JSpinner();
        pn_e = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Probabilidade");
        setLocationByPlatform(true);
        setResizable(false);

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        resultado.setEditable(false);
        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        jLabel4.setText("Precisão (em casas decimais à direita da vírgula):");

        precisao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        precisao.setSelectedIndex(4);

        n.setModel(new javax.swing.SpinnerNumberModel(10, 0, null, 1));

        jLabel1.setText("Número de provas (n):");

        jLabel2.setText("Probabilidade de sucesso (p):");

        p.setText("2/3");

        jLabel5.setText("Ex: 20% ou 5/3");

        jLabel3.setText("Vezes de ocorrência do evento (k):");

        k.setText("1 2 3");

        jLabel6.setText("Ex 1 3 6-9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        painel.addTab("Distribuição binomial", jPanel1);

        jLabel7.setText("Número de ocorrências (X):");

        jLabel8.setText("Taxa média por unidade de tempo (λ):");

        jLabel9.setText("Número de unidades de tempo ou de outra unidade (T):");

        P_T.setText("4");

        P_M.setText("1");

        jLabel10.setText("Os valores de λ e T devem estar na mesma proporção");

        P_X.setText("1 2 3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_M, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_X, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_T, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(P_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(P_T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(P_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(38, 38, 38))
        );

        painel.addTab("Distribuição de Poisson", jPanel2);

        jLabel11.setText("Média:");

        jLabel12.setText("Desvio padrão:");

        pn_desvio.setModel(new javax.swing.SpinnerNumberModel(1.0f, 0.0f, null, 0.25f));

        pn_media.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 25.0f));

        pn_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estar entre", "Ser maior que", "Ser menor que" }));
        pn_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pn_tipoActionPerformed(evt);
            }
        });

        jLabel13.setText("Probabilidade de:");

        pn_a.setModel(new javax.swing.SpinnerNumberModel(-1.25f, null, null, 0.25f));

        pn_b.setModel(new javax.swing.SpinnerNumberModel(2.0f, null, null, 0.25f));

        pn_e.setText("e");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_desvio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_media, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_a, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_e)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_b, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 326, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(pn_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(pn_desvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pn_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(pn_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_e))))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        painel.addTab("Distribuição normal", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precisao, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painel, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(precisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        if (painel.getSelectedIndex() == 0){
            int n = Integer.valueOf(this.n.getValue().toString());
            String p = this.p.getText();
            Fracao sucesso, fracasso;
            try {
                if (p.isEmpty()) throw new UnsupportedOperationException();
                if (p.contains("%")){
                    int porc = Integer.parseInt(p.replaceAll(" |\\%", ""));
                    sucesso = new Fracao(porc, 100);
                    fracasso = new Fracao(100 - porc, 100);
                } else if (p.contains("/")){
                    String[] g = p.replace(" ", "").split("/");
                    sucesso = new Fracao(Integer.parseInt(g[0]), Integer.parseInt(g[1]));
                    fracasso = new Fracao(Integer.parseInt(g[1]) - Integer.parseInt(g[0]), Integer.parseInt(g[1]));
                } else {
                    throw new UnsupportedOperationException();
                }
            } catch (Exception e) {
                System.out.println("P inválido");
                JOptionPane.showMessageDialog(this.getComponent(0), "Valor para sucesso (P) não é válido", "P inválido", JOptionPane.WARNING_MESSAGE);
                return;
            }


            ArrayList<Integer> kd = new ArrayList<>(), kk = new ArrayList<>();
            try {
                String k = this.k.getText();
                if (k.isEmpty()) throw new UnsupportedOperationException("Pelo menos um valor de K deve ser fornecido");
                String[] ks = k.split(",|;| ");
                for (String k1 : ks) {
                    if (k1.isEmpty()) continue;
                    if (k1.contains("-")){
                        String[] kg = k1.split("-");
                        int a = Integer.parseInt(kg[0]);
                        int b = Integer.parseInt(kg[1]);
                        if (a > n || b > n) throw new UnsupportedOperationException("Nenhum dos valores de K pode ser maior que N");
                        if (a < b) for (int i = a; i <= b; i++) kd.add(i);
                        else for (int i = a; i >= b; i--) kd.add(i);
                    } else {
                        int a = Integer.parseInt(k1);
                        if (a > n) throw new UnsupportedOperationException("Nenhum dos valores de K pode ser maior que N");
                        kd.add(a);
                    }
                }
                if (kd.stream().distinct().count() < kd.size()) throw new UnsupportedOperationException("Não podem haver números de K repetidos");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this.getComponent(0), e.getMessage(), "Erro no K", JOptionPane.WARNING_MESSAGE);
                return;
            }

            for (int i = 0; i <= n; i++) if (!kd.contains(i)) kk.add(i);

            resultado.setText("");
            new CalculoBinomial(sucesso, fracasso, n, kd.toArray(new Integer[kd.size()]), kk.toArray(new Integer[kk.size()]), precisao.getSelectedIndex());
        } else if (painel.getSelectedIndex() == 1){
            String p = this.P_M.getText();
            Fracao m, t;
            try {
                if (p.isEmpty()) throw new UnsupportedOperationException();
                if (p.contains("%")){
                    double porc = Double.parseDouble(p.replaceAll(" |\\%", "").replace(",", "."));
                    m = new Fracao(porc, 100);
                } else {
                    String[] g = p.replace(" ", "").replace(",", ".").split("/");
                    double num = Double.parseDouble(g[0]);
                    int den = g.length == 2 ? Integer.parseInt(g[1]) : 1;
                    while(num != (int)num){
                        num *= 10;
                        den *= 10;
                    }
                    m = new Fracao((int)num, den);
                }
            } catch (Exception e) {
                System.out.println("λ inválido");
                JOptionPane.showMessageDialog(this.getComponent(0),
                        "Valor para taxa média (λ) não é válido", "λ inválido", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            p = this.P_T.getText();
            try {
                if (p.isEmpty()) throw new UnsupportedOperationException();
                if (p.contains("%")){
                    int porc = Integer.parseInt(p.replaceAll(" |\\%", ""));
                    t = new Fracao(porc, 100);
                } else if (p.contains("/")){
                    String[] g = p.replace(" ", "").split("/");
                    double num = Double.parseDouble(g[0]);
                    int den = g.length == 2 ? Integer.parseInt(g[1]) : 1;
                    while(num != (int)num){
                        num *= 10;
                        den *= 10;
                    }
                    t = new Fracao(num, den);
                } else {
                    t = new Fracao(Integer.parseInt(p), 1);
                }
            } catch (Exception e) {
                System.out.println("T inválido");
                JOptionPane.showMessageDialog(this.getComponent(0),
                        "Valor para unidade (T) não é válido", "T inválido", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            double h = t.multiplicar(m).emDecimal(precisao.getSelectedIndex());
            int x = (int)h;
//            if (h != (int)h) x++;
            
            ArrayList<Integer> kd = new ArrayList<>(), kk = new ArrayList<>();
            try {
                String k = this.P_X.getText();
                if (k.isEmpty()) throw new UnsupportedOperationException("Pelo menos um valor de X deve ser fornecido");
                String[] ks = k.split(",|;| ");
                for (String k1 : ks) {
                    if (k1.isEmpty()) continue;
                    if (k1.contains("-")){
                        String[] kg = k1.split("-");
                        int a = Integer.parseInt(kg[0]);
                        int b;
                        if (kg.length == 1) b = x;
                        else b = Integer.parseInt(kg[1]);
                        if (a < b) for (int i = a; i <= b; i++) kd.add(i);
                        else for (int i = a; i >= b; i--) kd.add(i);
                    } else {
                        int a = Integer.parseInt(k1);
                        kd.add(a);
                    }
                }
                if (kd.stream().distinct().count() < kd.size()) throw new UnsupportedOperationException("Não podem haver números de X repetidos");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this.getComponent(0), e.getMessage(), "Erro no X", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            resultado.setText("");
            ArrayList<Integer> nx = new ArrayList<>();
            
            for (int i = 0; i <= x; i++) if (!kd.contains(i)) nx.add(i);
            
            new CalculoPoisson(kd.toArray(new Integer[kd.size()]), nx.toArray(new Integer[nx.size()]), m, t, precisao.getSelectedIndex());
        } else if (painel.getSelectedIndex() == 2) {
            resultado.setText("");
            CalculoNormal cn = new CalculoNormal(Double.parseDouble(pn_media.getValue().toString()),
                    Double.parseDouble(pn_desvio.getValue().toString()), precisao.getSelectedIndex());
            
            switch (pn_tipo.getSelectedIndex()) {
                case 0:
                    cn.deAaB(Double.valueOf(pn_a.getValue().toString()), Double.valueOf(pn_b.getValue().toString()));
                    break;
                case 1:
                    cn.acimaDeX(Double.valueOf(pn_a.getValue().toString()));
                    break;
                default:
                    cn.ateX(Double.valueOf(pn_a.getValue().toString()));
            }
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void pn_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pn_tipoActionPerformed
        if (pn_tipo.getSelectedIndex() == 0){
            pn_e.setVisible(true);
            pn_b.setVisible(true);
        } else {
            pn_e.setVisible(false);
            pn_b.setVisible(false);
        }
    }//GEN-LAST:event_pn_tipoActionPerformed

    public static void escrever(String texto){
        resultado.append(texto);
        System.out.print(texto);
    }
    
    public static void escreverPular(String texto){
        resultado.append(texto + "\n");
        System.out.println(texto);
    }
    
    private void exitForm(java.awt.event.WindowEvent evt) {                          
        System.exit(0);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal();
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variables">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField P_M;
    private javax.swing.JTextField P_T;
    private javax.swing.JTextField P_X;
    private javax.swing.JButton calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField k;
    private javax.swing.JSpinner n;
    private javax.swing.JTextField p;
    private javax.swing.JTabbedPane painel;
    private javax.swing.JSpinner pn_a;
    private javax.swing.JSpinner pn_b;
    private javax.swing.JSpinner pn_desvio;
    private javax.swing.JLabel pn_e;
    private javax.swing.JSpinner pn_media;
    private javax.swing.JComboBox<String> pn_tipo;
    private javax.swing.JComboBox<String> precisao;
    private static final javax.swing.JTextArea resultado = new javax.swing.JTextArea();
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
