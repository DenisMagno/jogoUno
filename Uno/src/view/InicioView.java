package view;

import dataTransferObject.CartaDto;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.Jogo;

public class InicioView extends javax.swing.JFrame {
     Jogo jogo;
     ButtonGroup grupo;

    public InicioView() {
       initComponents();

        String nome1 = JOptionPane.showInputDialog(null, "Digite o nome do primeiro jogador: ");
        String nome2 = JOptionPane.showInputDialog(null, "Digite o nome do segundo jogador: ");

        this.jogo = new Jogo();
        this.jogo.iniciaJogo(nome1, nome2);

        grupo = new ButtonGroup();
        grupo.add(this.rbVerde0);
        grupo.add(this.rbVermelho0);
        grupo.add(this.rbAmarelo0);
        grupo.add(this.rbAzul0);
        grupo.add(this.rbVermelho1);
        grupo.add(this.rbAmarelo1);
        grupo.add(this.rbAzul1);
        grupo.add(this.rbVerde1);
        grupo.add(this.rbVermelho2);
        grupo.add(this.rbAmarelo2);
        grupo.add(this.rbAzul2);
        grupo.add(this.rbVerde2);
        grupo.add(this.rbVermelho3);
        grupo.add(this.rbAmarelo3);
        grupo.add(this.rbAzul3);
        grupo.add(this.rbVerde3);
        grupo.add(this.rbVermelho4);
        grupo.add(this.rbAmarelo4);
        grupo.add(this.rbAzul4);
        grupo.add(this.rbVerde4);
        grupo.add(this.rbVermelho5);
        grupo.add(this.rbAmarelo5);
        grupo.add(this.rbAzul5);
        grupo.add(this.rbVerde5);
        grupo.add(this.rbVermelho6);
        grupo.add(this.rbAmarelo6);
        grupo.add(this.rbAzul6);
        grupo.add(this.rbVerde6);
        grupo.add(this.rbVermelho7);
        grupo.add(this.rbAmarelo7);
        grupo.add(this.rbAzul7);
        grupo.add(this.rbVerde7);
        grupo.add(this.rbVermelho8);
        grupo.add(this.rbAmarelo8);
        grupo.add(this.rbAzul8);
        grupo.add(this.rbVerde8);
        grupo.add(this.rbVermelho9);
        grupo.add(this.rbAmarelo9);
        grupo.add(this.rbAzul9);
        grupo.add(this.rbVerde9);
        grupo.add(this.rbVermelhoBloqueio);
        grupo.add(this.rbAmareloBloqueio);
        grupo.add(this.rbAzulBloqueio);
        grupo.add(this.rbVerdeBloqueio);
        grupo.add(this.rbVermelhoInverte);
        grupo.add(this.rbAzulInverte);
        grupo.add(this.rbVerdeInverte);
        grupo.add(this.rbAmareloInverte);
        grupo.add(this.rbAmareloMaisDois);   
        grupo.add(this.rbVermelhoMaisDois);   
        grupo.add(this.rbAzulMaisDois);   
        grupo.add(this.rbVerdeMaisDois);

        //Define nome dos jogadores na view
        this.jlNomeJ1.setText(this.jogo.jogador1.getNome());
        this.jlNomeJ2.setText(this.jogo.jogador2.getNome());
        
        this.montaRadioButtons();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlMsgVezJ1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlNomeJ1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jlNomeJ2 = new javax.swing.JLabel();
        jlMsgVezJ2 = new javax.swing.JLabel();
        jbJogar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jlMonteDescarte = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbComprar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        rbVerde4 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        rbAzul6 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rbAzulMaisDois = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        rbAzul0 = new javax.swing.JRadioButton();
        rbAzulInverte = new javax.swing.JRadioButton();
        rbVermelho4 = new javax.swing.JRadioButton();
        rbAmarelo9 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        rbAmarelo8 = new javax.swing.JRadioButton();
        rbAzul4 = new javax.swing.JRadioButton();
        rbAmarelo6 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        rbVerde0 = new javax.swing.JRadioButton();
        rbAmarelo7 = new javax.swing.JRadioButton();
        rbAmarelo2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        rbVerde1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbVermelho7 = new javax.swing.JRadioButton();
        rbAzul1 = new javax.swing.JRadioButton();
        rbVerdeBloqueio = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rbVermelho8 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rbVermelho0 = new javax.swing.JRadioButton();
        rbAmarelo0 = new javax.swing.JRadioButton();
        rbVerde8 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rbVerde9 = new javax.swing.JRadioButton();
        rbAzul5 = new javax.swing.JRadioButton();
        rbAzul2 = new javax.swing.JRadioButton();
        rbVermelho6 = new javax.swing.JRadioButton();
        rbVermelhoMaisDois = new javax.swing.JRadioButton();
        rbAzul3 = new javax.swing.JRadioButton();
        rbVerde2 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        rbVermelhoInverte = new javax.swing.JRadioButton();
        rbAzul7 = new javax.swing.JRadioButton();
        rbVermelho9 = new javax.swing.JRadioButton();
        rbVerde5 = new javax.swing.JRadioButton();
        rbVermelho2 = new javax.swing.JRadioButton();
        rbAmareloInverte = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        rbVermelho1 = new javax.swing.JRadioButton();
        rbVerdeMaisDois = new javax.swing.JRadioButton();
        rbAzul9 = new javax.swing.JRadioButton();
        rbVermelho5 = new javax.swing.JRadioButton();
        rbAmareloBloqueio = new javax.swing.JRadioButton();
        rbAmareloMaisDois = new javax.swing.JRadioButton();
        rbAmarelo1 = new javax.swing.JRadioButton();
        rbVerde7 = new javax.swing.JRadioButton();
        rbAmarelo3 = new javax.swing.JRadioButton();
        rbAmarelo4 = new javax.swing.JRadioButton();
        rbVermelhoBloqueio = new javax.swing.JRadioButton();
        rbAzulBloqueio = new javax.swing.JRadioButton();
        rbVerde3 = new javax.swing.JRadioButton();
        rbVerdeInverte = new javax.swing.JRadioButton();
        rbVerde6 = new javax.swing.JRadioButton();
        rbAmarelo5 = new javax.swing.JRadioButton();
        rbAzul8 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbVermelho3 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        rbCoringa1 = new javax.swing.JRadioButton();
        rbCoringa2 = new javax.swing.JRadioButton();
        rbCoringa3 = new javax.swing.JRadioButton();
        rbCoringa4 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        rbCoringaQuatro1 = new javax.swing.JRadioButton();
        rbCoringaQuatro2 = new javax.swing.JRadioButton();
        rbCoringaQuatro3 = new javax.swing.JRadioButton();
        rbCoringaQuatro4 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setModalExclusionType(null);

        jLabel1.setFont(new java.awt.Font("Alegreya Sans Light", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\uno\\jogoUno\\Uno\\src\\view\\imagem\\oie_transparent.png")); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jogador    1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Alegreya Sans Light", 0, 14))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(190, 120));
        jPanel1.setMinimumSize(new java.awt.Dimension(190, 120));

        jlMsgVezJ1.setFont(new java.awt.Font("Alegreya Sans Light", 1, 24)); // NOI18N
        jlMsgVezJ1.setForeground(java.awt.Color.orange);
        jlMsgVezJ1.setText("mensagem");

        jLabel2.setFont(new java.awt.Font("Alegreya Sans Light", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jlNomeJ1.setFont(new java.awt.Font("Alegreya Sans Light", 0, 14)); // NOI18N
        jlNomeJ1.setText("nome_j1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMsgVezJ1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlNomeJ1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlNomeJ1))
                .addGap(18, 18, 18)
                .addComponent(jlMsgVezJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jogador    2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Alegreya Sans Light", 0, 14))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(190, 120));
        jPanel2.setMinimumSize(new java.awt.Dimension(190, 120));

        jLabel4.setFont(new java.awt.Font("Alegreya Sans Light", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");

        jlNomeJ2.setFont(new java.awt.Font("Alegreya Sans Light", 0, 14)); // NOI18N
        jlNomeJ2.setText("nome_j2");

        jlMsgVezJ2.setFont(new java.awt.Font("Alegreya Sans Light", 1, 24)); // NOI18N
        jlMsgVezJ2.setForeground(java.awt.Color.orange);
        jlMsgVezJ2.setText("mensagem");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMsgVezJ2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlNomeJ2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlNomeJ2))
                .addGap(35, 35, 35)
                .addComponent(jlMsgVezJ2))
        );

        jbJogar.setFont(new java.awt.Font("Alegreya Sans Light", 1, 24)); // NOI18N
        jbJogar.setText("Jogar");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monte de Descarte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Alegreya Sans Light", 0, 14))); // NOI18N

        jlMonteDescarte.setFont(new java.awt.Font("Alegreya Sans Light", 1, 24)); // NOI18N
        jlMonteDescarte.setText("Coringa / Compra + 4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlMonteDescarte)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jlMonteDescarte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comprar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Alegreya Sans Light", 0, 14))); // NOI18N

        jbComprar.setIcon(new javax.swing.ImageIcon("D:\\Área de Trabalho\\uno\\jogoUno\\Uno\\src\\view\\imagem\\compra.png")); // NOI18N
        jbComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbComprar)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbComprar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cartas do jogador da vez", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Alegreya Sans Light", 0, 14))); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cartas Coloridas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Alegreya Sans Light", 0, 14))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Alegreya Sans Light", 0, 15)); // NOI18N
        jLabel20.setText("Amarelo");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("+2");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/inverte.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("8");

        rbVerde0.setForeground(new java.awt.Color(255, 255, 255));
        rbVerde0.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        rbVerde0.setContentAreaFilled(false);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("5");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("3");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("4");

        rbVerdeBloqueio.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("1");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("6");

        jLabel21.setFont(new java.awt.Font("Alegreya Sans Light", 0, 15)); // NOI18N
        jLabel21.setText("Azul");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/bloqueia.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Alegreya Sans Light", 0, 15)); // NOI18N
        jLabel5.setText("Vermelho");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("7");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("9");

        jLabel3.setFont(new java.awt.Font("Alegreya Sans Light", 0, 15)); // NOI18N
        jLabel3.setText("Verde");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel20))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbVerde0)
                    .addComponent(rbVermelho0)
                    .addComponent(rbAmarelo0)
                    .addComponent(rbAzul0)
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbVermelho1, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbAmarelo1, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbAzul1, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbVerde1))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbVerde2)
                    .addComponent(rbAzul2)
                    .addComponent(rbAmarelo2)
                    .addComponent(rbVermelho2)
                    .addComponent(jLabel8))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbVerde3)
                    .addComponent(rbAzul3)
                    .addComponent(rbAmarelo3)
                    .addComponent(rbVermelho3)
                    .addComponent(jLabel9))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbVerde4)
                    .addComponent(rbAzul4)
                    .addComponent(rbAmarelo4)
                    .addComponent(rbVermelho4)
                    .addComponent(jLabel10))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbVerde5)
                    .addComponent(rbAzul5)
                    .addComponent(rbAmarelo5)
                    .addComponent(rbVermelho5)
                    .addComponent(jLabel11))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbVerde6)
                    .addComponent(rbAzul6)
                    .addComponent(rbAmarelo6)
                    .addComponent(rbVermelho6)
                    .addComponent(jLabel12))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbVerde7)
                    .addComponent(rbAzul7)
                    .addComponent(rbAmarelo7)
                    .addComponent(rbVermelho7)
                    .addComponent(jLabel14))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel15)
                    .addComponent(rbVermelho8)
                    .addComponent(rbAmarelo8)
                    .addComponent(rbAzul8)
                    .addComponent(rbVerde8))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(rbVermelho9)
                    .addComponent(rbAmarelo9)
                    .addComponent(rbAzul9)
                    .addComponent(rbVerde9))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel17)
                    .addComponent(rbVermelhoBloqueio)
                    .addComponent(rbAmareloBloqueio)
                    .addComponent(rbAzulBloqueio)
                    .addComponent(rbVerdeBloqueio))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18)
                    .addComponent(rbVermelhoInverte)
                    .addComponent(rbAzulInverte)
                    .addComponent(rbVerdeInverte)
                    .addComponent(rbAmareloInverte))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel19)
                    .addComponent(rbAmareloMaisDois)
                    .addComponent(rbVermelhoMaisDois)
                    .addComponent(rbAzulMaisDois)
                    .addComponent(rbVerdeMaisDois))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel19, jLabel6, jLabel7, jLabel8, jLabel9, rbAmarelo0, rbAmarelo1, rbAmarelo2, rbAmarelo3, rbAmarelo4, rbAmarelo5, rbAmarelo6, rbAmarelo7, rbAmarelo8, rbAmarelo9, rbAmareloBloqueio, rbAmareloInverte, rbAmareloMaisDois, rbAzul0, rbAzul1, rbAzul2, rbAzul3, rbAzul4, rbAzul5, rbAzul6, rbAzul7, rbAzul8, rbAzul9, rbAzulBloqueio, rbAzulInverte, rbAzulMaisDois, rbVerde0, rbVerde1, rbVerde2, rbVerde3, rbVerde4, rbVerde5, rbVerde6, rbVerde7, rbVerde8, rbVerde9, rbVerdeBloqueio, rbVerdeInverte, rbVerdeMaisDois, rbVermelho0, rbVermelho1, rbVermelho2, rbVermelho3, rbVermelho4, rbVermelho5, rbVermelho6, rbVermelho7, rbVermelho8, rbVermelho9, rbVermelhoBloqueio, rbVermelhoInverte, rbVermelhoMaisDois});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbVerde3)
                    .addComponent(rbVerde4)
                    .addComponent(rbVerde5)
                    .addComponent(rbVerde6)
                    .addComponent(rbVerde7)
                    .addComponent(jLabel3)
                    .addComponent(rbVerde8)
                    .addComponent(rbVerde9)
                    .addComponent(rbVerdeBloqueio)
                    .addComponent(rbVerde0)
                    .addComponent(rbVerdeInverte)
                    .addComponent(rbVerde1)
                    .addComponent(rbVerdeMaisDois)
                    .addComponent(rbVerde2))
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbVermelho4)
                    .addComponent(rbVermelho5)
                    .addComponent(rbVermelho6)
                    .addComponent(rbVermelho7)
                    .addComponent(rbVermelho8)
                    .addComponent(jLabel5)
                    .addComponent(rbVermelho9)
                    .addComponent(rbVermelhoBloqueio)
                    .addComponent(rbVermelhoInverte)
                    .addComponent(rbVermelho0)
                    .addComponent(rbVermelho1)
                    .addComponent(rbVermelhoMaisDois)
                    .addComponent(rbVermelho2)
                    .addComponent(rbVermelho3))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbAmarelo4)
                    .addComponent(rbAmarelo5)
                    .addComponent(rbAmarelo6)
                    .addComponent(rbAmarelo7)
                    .addComponent(rbAmarelo8)
                    .addComponent(jLabel20)
                    .addComponent(rbAmarelo9)
                    .addComponent(rbAmareloBloqueio)
                    .addComponent(rbAmarelo0)
                    .addComponent(rbAmareloInverte)
                    .addComponent(rbAmareloMaisDois)
                    .addComponent(rbAmarelo1)
                    .addComponent(rbAmarelo2)
                    .addComponent(rbAmarelo3))
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbAzul4)
                    .addComponent(rbAzul5)
                    .addComponent(rbAzul6)
                    .addComponent(rbAzul7)
                    .addComponent(rbAzul8)
                    .addComponent(jLabel21)
                    .addComponent(rbAzul9)
                    .addComponent(rbAzulBloqueio)
                    .addComponent(rbAzul0)
                    .addComponent(rbAzulInverte)
                    .addComponent(rbAzulMaisDois)
                    .addComponent(rbAzul1)
                    .addComponent(rbAzul2)
                    .addComponent(rbAzul3))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel19, jLabel6, jLabel7, jLabel8, jLabel9, rbAmarelo0, rbAmarelo1, rbAmarelo2, rbAmarelo3, rbAmarelo4, rbAmarelo5, rbAmarelo6, rbAmarelo7, rbAmarelo8, rbAmarelo9, rbAmareloBloqueio, rbAmareloInverte, rbAmareloMaisDois, rbAzul0, rbAzul1, rbAzul2, rbAzul3, rbAzul4, rbAzul5, rbAzul6, rbAzul7, rbAzul8, rbAzul9, rbAzulBloqueio, rbAzulInverte, rbAzulMaisDois, rbVerde0, rbVerde1, rbVerde2, rbVerde3, rbVerde4, rbVerde5, rbVerde6, rbVerde7, rbVerde8, rbVerde9, rbVerdeBloqueio, rbVerdeInverte, rbVerdeMaisDois, rbVermelho0, rbVermelho1, rbVermelho2, rbVermelho3, rbVermelho4, rbVermelho5, rbVermelho6, rbVermelho7, rbVermelho8, rbVermelho9, rbVermelhoBloqueio, rbVermelhoInverte, rbVermelhoMaisDois});

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cartas Coringa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Alegreya Sans Light", 0, 14))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Alegreya Sans Light", 0, 15)); // NOI18N
        jLabel13.setText("Troca Cor");

        jLabel22.setFont(new java.awt.Font("Alegreya Sans Light", 0, 15)); // NOI18N
        jLabel22.setText("Troca Cor +4");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(rbCoringaQuatro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCoringaQuatro2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCoringaQuatro3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCoringaQuatro4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCoringa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCoringa2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCoringa3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCoringa4)))
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13)
                    .addComponent(rbCoringa1)
                    .addComponent(rbCoringa2)
                    .addComponent(rbCoringa3)
                    .addComponent(rbCoringa4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbCoringaQuatro2)
                    .addComponent(rbCoringaQuatro3)
                    .addComponent(rbCoringaQuatro4)
                    .addComponent(jLabel22)
                    .addComponent(rbCoringaQuatro1))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbJogar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbComprarActionPerformed
    private void montaRadioButtons(){
        //Desabilita todos os rádio buttons
        Enumeration<AbstractButton> enumeration = grupo.getElements();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement().setEnabled(false);
        }
        
        //Habilita apenas os radio buttons onde o jogador possui carta.
        int i = 0;
        if(Jogo.getTurno() == 1){
            while(i < this.jogo.jogador1.getMao().getListaCartas().size()){
                if(this.jogo.jogador1.getMao().leCarta(i).getCor() == 1){
                    switch (this.jogo.jogador1.getMao().leCarta(i).getNumero()) {
                        case 0:
                            this.rbAmarelo0.setEnabled(true);
                            this.rbAmarelo0.setSelected(true);
                            break;
                        case 1:
                            this.rbAmarelo1.setEnabled(true);
                            this.rbAmarelo1.setSelected(true);
                            break;
                        case 2:
                            this.rbAmarelo2.setEnabled(true);
                            this.rbAmarelo2.setSelected(true);
                            break;
                        case 3:
                            this.rbAmarelo3.setEnabled(true);
                            this.rbAmarelo3.setSelected(true);
                            break;
                        case 4:
                            this.rbAmarelo4.setEnabled(true);
                            this.rbAmarelo4.setSelected(true);
                            break;
                        case 5:
                            this.rbAmarelo5.setEnabled(true);
                            this.rbAmarelo5.setSelected(true);
                            break;
                        case 6:
                            this.rbAmarelo6.setEnabled(true);
                            this.rbAmarelo6.setSelected(true);
                            break;
                        case 7:
                            this.rbAmarelo7.setEnabled(true);
                            this.rbAmarelo7.setSelected(true);
                            break;
                        case 8:
                            this.rbAmarelo8.setEnabled(true);
                            this.rbAmarelo8.setSelected(true);
                            break;
                        case 9:
                            this.rbAmarelo9.setEnabled(true);
                            this.rbAmarelo9.setSelected(true);
                            break;
                        case 10:
                            this.rbAmareloBloqueio.setEnabled(true);
                            this.rbAmareloBloqueio.setSelected(true);
                            break;
                        case 11:
                            this.rbAmareloInverte.setEnabled(true);
                            this.rbAmareloInverte.setSelected(true);
                            break;
                        case 12:
                            this.rbAmareloMaisDois.setEnabled(true);
                            this.rbAmareloMaisDois.setSelected(true);
                            break;
                        default:
                            break;
                    }
                }else if(this.jogo.jogador1.getMao().leCarta(i).getCor() == 2){
                    switch (this.jogo.jogador1.getMao().leCarta(i).getNumero()) {
                        case 0:
                            this.rbAzul0.setEnabled(true);
                            this.rbAzul0.setSelected(true);
                            break;
                        case 1:
                            this.rbAzul1.setEnabled(true);
                            this.rbAzul1.setSelected(true);
                            break;
                        case 2:
                            this.rbAzul2.setEnabled(true);
                            this.rbAzul2.setSelected(true);
                            break;
                        case 3:
                            this.rbAzul3.setEnabled(true);
                            this.rbAzul3.setSelected(true);
                            break;
                        case 4:
                            this.rbAzul4.setEnabled(true);
                            this.rbAzul4.setSelected(true);
                            break;
                        case 5:
                            this.rbAzul5.setEnabled(true);
                            this.rbAzul5.setSelected(true);
                            break;
                        case 6:
                            this.rbAzul6.setEnabled(true);
                            this.rbAzul6.setSelected(true);
                            break;
                        case 7:
                            this.rbAzul7.setEnabled(true);
                            this.rbAzul7.setSelected(true);
                            break;
                        case 8:
                            this.rbAzul8.setEnabled(true);
                            this.rbAzul8.setSelected(true);
                            break;
                        case 9:
                            this.rbAzul9.setEnabled(true);
                            this.rbAzul9.setSelected(true);
                            break;
                        case 10:
                            this.rbAzulBloqueio.setEnabled(true);
                            this.rbAzulBloqueio.setSelected(true);
                            break;
                        case 11:
                            this.rbAzulInverte.setEnabled(true);
                            this.rbAzulInverte.setSelected(true);
                            break;
                        case 12:
                            this.rbAzulMaisDois.setEnabled(true);
                            this.rbAzulMaisDois.setSelected(true);
                            break;
                        default:
                            break;
                    }
                }else if(this.jogo.jogador1.getMao().leCarta(i).getCor() == 3){
                    switch (this.jogo.jogador1.getMao().leCarta(i).getNumero()) {
                        case 0:
                            this.rbVerde0.setEnabled(true);
                            this.rbVerde0.setSelected(true);
                            break;
                        case 1:
                            this.rbVerde1.setEnabled(true);
                            this.rbVerde1.setSelected(true);
                            break;
                        case 2:
                            this.rbVerde2.setEnabled(true);
                            this.rbVerde2.setSelected(true);
                            break;
                        case 3:
                            this.rbVerde3.setEnabled(true);
                            this.rbVerde3.setSelected(true);
                            break;
                        case 4:
                            this.rbVerde4.setEnabled(true);
                            this.rbVerde4.setSelected(true);
                            break;
                        case 5:
                            this.rbVerde5.setEnabled(true);
                            this.rbVerde5.setSelected(true);
                            break;
                        case 6:
                            this.rbVerde6.setEnabled(true);
                            this.rbVerde6.setSelected(true);
                            break;
                        case 7:
                            this.rbVerde7.setEnabled(true);
                            this.rbVerde7.setSelected(true);
                            break;
                        case 8:
                            this.rbVerde8.setEnabled(true);
                            this.rbVerde8.setSelected(true);
                            break;
                        case 9:
                            this.rbVerde9.setEnabled(true);
                            this.rbVerde9.setSelected(true);
                            break;
                        case 10:
                            this.rbVerdeBloqueio.setEnabled(true);
                            this.rbVerdeBloqueio.setSelected(true);
                            break;
                        case 11:
                            this.rbVerdeInverte.setEnabled(true);
                            this.rbVerdeInverte.setSelected(true);
                            break;
                        case 12:
                            this.rbVerdeMaisDois.setEnabled(true);
                            this.rbVerdeMaisDois.setSelected(true);
                            break;
                        default:
                            break;
                    }
                }else if(this.jogo.jogador1.getMao().leCarta(i).getCor() == 4){
                    switch (this.jogo.jogador1.getMao().leCarta(i).getNumero()) {
                        case 0:
                            this.rbVermelho0.setEnabled(true);
                            this.rbVermelho0.setSelected(true);
                            break;
                        case 1:
                            this.rbVermelho1.setEnabled(true);
                            this.rbVermelho1.setSelected(true);
                            break;
                        case 2:
                            this.rbVermelho2.setEnabled(true);
                            this.rbVermelho2.setSelected(true);
                            break;
                        case 3:
                            this.rbVermelho3.setEnabled(true);
                            this.rbVermelho3.setSelected(true);
                            break;
                        case 4:
                            this.rbVermelho4.setEnabled(true);
                            this.rbVermelho4.setSelected(true);
                            break;
                        case 5:
                            this.rbVermelho5.setEnabled(true);
                            this.rbVermelho5.setSelected(true);
                            break;
                        case 6:
                            this.rbVermelho6.setEnabled(true);
                            this.rbVermelho6.setSelected(true);
                            break;
                        case 7:
                            this.rbVermelho7.setEnabled(true);
                            this.rbVermelho7.setSelected(true);
                            break;
                        case 8:
                            this.rbVermelho8.setEnabled(true);
                            this.rbVermelho8.setSelected(true);
                            break;
                        case 9:
                            this.rbVermelho9.setEnabled(true);
                            this.rbVermelho9.setSelected(true);
                            break;
                        case 10:
                            this.rbVermelhoBloqueio.setEnabled(true);
                            this.rbVermelhoBloqueio.setSelected(true);
                            break;
                        case 11:
                            this.rbVermelhoInverte.setEnabled(true);
                            this.rbVermelhoInverte.setSelected(true);
                            break;
                        case 12:
                            this.rbVermelhoMaisDois.setEnabled(true);
                            this.rbVermelhoMaisDois.setSelected(true);
                            break;
                        default:
                            break;
                    }
                }
                i++;
            }
        }else{
            while(i < this.jogo.jogador2.getMao().getListaCartas().size()){
                if(this.jogo.jogador2.getMao().leCarta(i).getCor() == 1){
                    switch (this.jogo.jogador2.getMao().leCarta(i).getNumero()) {
                        case 0:
                            this.rbAmarelo0.setEnabled(true);
                            this.rbAmarelo0.setSelected(true);
                            break;
                        case 1:
                            this.rbAmarelo1.setEnabled(true);
                            this.rbAmarelo1.setSelected(true);
                            break;
                        case 2:
                            this.rbAmarelo2.setEnabled(true);
                            this.rbAmarelo2.setSelected(true);
                            break;
                        case 3:
                            this.rbAmarelo3.setEnabled(true);
                            this.rbAmarelo3.setSelected(true);
                            break;
                        case 4:
                            this.rbAmarelo4.setEnabled(true);
                            this.rbAmarelo4.setSelected(true);
                            break;
                        case 5:
                            this.rbAmarelo5.setEnabled(true);
                            this.rbAmarelo5.setSelected(true);
                            break;
                        case 6:
                            this.rbAmarelo6.setEnabled(true);
                            this.rbAmarelo6.setSelected(true);
                            break;
                        case 7:
                            this.rbAmarelo7.setEnabled(true);
                            this.rbAmarelo7.setSelected(true);
                            break;
                        case 8:
                            this.rbAmarelo8.setEnabled(true);
                            this.rbAmarelo8.setSelected(true);
                            break;
                        case 9:
                            this.rbAmarelo9.setEnabled(true);
                            this.rbAmarelo9.setSelected(true);
                            break;
                        case 10:
                            this.rbAmareloBloqueio.setEnabled(true);
                            this.rbAmareloBloqueio.setSelected(true);
                            break;
                        case 11:
                            this.rbAmareloInverte.setEnabled(true);
                            this.rbAmareloInverte.setSelected(true);
                            break;
                        case 12:
                            this.rbAmareloMaisDois.setEnabled(true);
                            this.rbAmareloMaisDois.setSelected(true);
                            break;
                        default:
                            break;
                    }
                }else if(this.jogo.jogador2.getMao().leCarta(i).getCor() == 2){
                    switch (this.jogo.jogador2.getMao().leCarta(i).getNumero()) {
                        case 0:
                            this.rbAzul0.setEnabled(true);
                            this.rbAzul0.setSelected(true);
                            break;
                        case 1:
                            this.rbAzul1.setEnabled(true);
                            this.rbAzul1.setSelected(true);
                            break;
                        case 2:
                            this.rbAzul2.setEnabled(true);
                            this.rbAzul2.setSelected(true);
                            break;
                        case 3:
                            this.rbAzul3.setEnabled(true);
                            this.rbAzul3.setSelected(true);
                            break;
                        case 4:
                            this.rbAzul4.setEnabled(true);
                            this.rbAzul4.setSelected(true);
                            break;
                        case 5:
                            this.rbAzul5.setEnabled(true);
                            this.rbAzul5.setSelected(true);
                            break;
                        case 6:
                            this.rbAzul6.setEnabled(true);
                            this.rbAzul6.setSelected(true);
                            break;
                        case 7:
                            this.rbAzul7.setEnabled(true);
                            this.rbAzul7.setSelected(true);
                            break;
                        case 8:
                            this.rbAzul8.setEnabled(true);
                            this.rbAzul8.setSelected(true);
                            break;
                        case 9:
                            this.rbAzul9.setEnabled(true);
                            this.rbAzul9.setSelected(true);
                            break;
                        case 10:
                            this.rbAzulBloqueio.setEnabled(true);
                            this.rbAzulBloqueio.setSelected(true);
                            break;
                        case 11:
                            this.rbAzulInverte.setEnabled(true);
                            this.rbAzulInverte.setSelected(true);
                            break;
                        case 12:
                            this.rbAzulMaisDois.setEnabled(true);
                            this.rbAzulMaisDois.setSelected(true);
                            break;
                        default:
                            break;
                    }
                }else if(this.jogo.jogador2.getMao().leCarta(i).getCor() == 3){
                    switch (this.jogo.jogador2.getMao().leCarta(i).getNumero()) {
                        case 0:
                            this.rbVerde0.setEnabled(true);
                            this.rbVerde0.setSelected(true);
                            break;
                        case 1:
                            this.rbVerde1.setEnabled(true);
                            this.rbVerde1.setSelected(true);
                            break;
                        case 2:
                            this.rbVerde2.setEnabled(true);
                            this.rbVerde2.setSelected(true);
                            break;
                        case 3:
                            this.rbVerde3.setEnabled(true);
                            this.rbVerde3.setSelected(true);
                            break;
                        case 4:
                            this.rbVerde4.setEnabled(true);
                            this.rbVerde4.setSelected(true);
                            break;
                        case 5:
                            this.rbVerde5.setEnabled(true);
                            this.rbVerde5.setSelected(true);
                            break;
                        case 6:
                            this.rbVerde6.setEnabled(true);
                            this.rbVerde6.setSelected(true);
                            break;
                        case 7:
                            this.rbVerde7.setEnabled(true);
                            this.rbVerde7.setSelected(true);
                            break;
                        case 8:
                            this.rbVerde8.setEnabled(true);
                            this.rbVerde8.setSelected(true);
                            break;
                        case 9:
                            this.rbVerde9.setEnabled(true);
                            this.rbVerde9.setSelected(true);
                            break;
                        case 10:
                            this.rbVerdeBloqueio.setEnabled(true);
                            this.rbVerdeBloqueio.setSelected(true);
                            break;
                        case 11:
                            this.rbVerdeInverte.setEnabled(true);
                            this.rbVerdeInverte.setSelected(true);
                            break;
                        case 12:
                            this.rbVerdeMaisDois.setEnabled(true);
                            this.rbVerdeMaisDois.setSelected(true);
                            break;
                        default:
                            break;
                    }
                }else if(this.jogo.jogador2.getMao().leCarta(i).getCor() == 4){
                    switch (this.jogo.jogador2.getMao().leCarta(i).getNumero()) {
                        case 0:
                            this.rbVermelho0.setEnabled(true);
                            this.rbVermelho0.setSelected(true);
                            break;
                        case 1:
                            this.rbVermelho1.setEnabled(true);
                            this.rbVermelho1.setSelected(true);
                            break;
                        case 2:
                            this.rbVermelho2.setEnabled(true);
                            this.rbVermelho2.setSelected(true);
                            break;
                        case 3:
                            this.rbVermelho3.setEnabled(true);
                            this.rbVermelho3.setSelected(true);
                            break;
                        case 4:
                            this.rbVermelho4.setEnabled(true);
                            this.rbVermelho4.setSelected(true);
                            break;
                        case 5:
                            this.rbVermelho5.setEnabled(true);
                            this.rbVermelho5.setSelected(true);
                            break;
                        case 6:
                            this.rbVermelho6.setEnabled(true);
                            this.rbVermelho6.setSelected(true);
                            break;
                        case 7:
                            this.rbVermelho7.setEnabled(true);
                            this.rbVermelho7.setSelected(true);
                            break;
                        case 8:
                            this.rbVermelho8.setEnabled(true);
                            this.rbVermelho8.setSelected(true);
                            break;
                        case 9:
                            this.rbVermelho9.setEnabled(true);
                            this.rbVermelho9.setSelected(true);
                            break;
                        case 10:
                            this.rbVermelhoBloqueio.setEnabled(true);
                            this.rbVermelhoBloqueio.setSelected(true);
                            break;
                        case 11:
                            this.rbVermelhoInverte.setEnabled(true);
                            this.rbVermelhoInverte.setSelected(true);
                            break;
                        case 12:
                            this.rbVermelhoMaisDois.setEnabled(true);
                            this.rbVermelhoMaisDois.setSelected(true);
                            break;
                        default:
                            break;
                    }
                }
                i++;
            }
        }
    }

    //Verifica qual radio button foi clicado e retorna objeto com cor e numero da carta escolhida.
    private CartaDto verificaRadioButton(){
        if(this.rbAmarelo0.isSelected()){
            return new CartaDto(1, 0);
        }else if(this.rbAmarelo1.isSelected()){
            return new CartaDto(1, 1);
        }else if(this.rbAmarelo2.isSelected()){
            return new CartaDto(1, 2);
        }else if(this.rbAmarelo3.isSelected()){
            return new CartaDto(1, 3);
        }else if(this.rbAmarelo4.isSelected()){
            return new CartaDto(1, 4);
        }else if(this.rbAmarelo5.isSelected()){
            return new CartaDto(1, 5);
        }else if(this.rbAmarelo6.isSelected()){
            return new CartaDto(1, 6);
        }else if(this.rbAmarelo7.isSelected()){
            return new CartaDto(1, 7);
        }else if(this.rbAmarelo8.isSelected()){
            return new CartaDto(1, 8);
        }else if(this.rbAmarelo9.isSelected()){
            return new CartaDto(1, 9);
        }else if(this.rbAmareloBloqueio.isSelected()){
            return new CartaDto(1, 10);
        }else if(this.rbAmareloInverte.isSelected()){
            return new CartaDto(1, 11);
        }else if(this.rbAmareloMaisDois.isSelected()){
            return new CartaDto(1, 12);
        }else if(this.rbAzul0.isSelected()){
            return new CartaDto(2,0);
        }else if(this.rbAzul1.isSelected()){
            return new CartaDto(2,1);
        }else if(this.rbAzul2.isSelected()){
            return new CartaDto(2,2);
        }else if(this.rbAzul3.isSelected()){
            return new CartaDto(2,3);
        }else if(this.rbAzul4.isSelected()){
            return new CartaDto(2,4);
        }else if(this.rbAzul5.isSelected()){
            return new CartaDto(2,5);
        }else if(this.rbAzul6.isSelected()){
            return new CartaDto(2,6);
        }else if(this.rbAzul7.isSelected()){
            return new CartaDto(2,7);
        }else if(this.rbAzul8.isSelected()){
            return new CartaDto(2,8);
        }else if(this.rbAzul9.isSelected()){
            return new CartaDto(2,9);
        }else if(this.rbAzulBloqueio.isSelected()){
            return new CartaDto(2,10);
        }else if(this.rbAzulInverte.isSelected()){
            return new CartaDto(2,11);
        }else if(this.rbAzulMaisDois.isSelected()){
            return new CartaDto(2,12);
        }else if(this.rbVerde0.isSelected()){
            return new CartaDto(3,0);
        }else if(this.rbVerde1.isSelected()){
            return new CartaDto(3,1);
        }else if(this.rbVerde2.isSelected()){
            return new CartaDto(3,2);
        }else if(this.rbVerde3.isSelected()){
            return new CartaDto(3,3);
        }else if(this.rbVerde4.isSelected()){
            return new CartaDto(3,4);
        }else if(this.rbVerde5.isSelected()){
            return new CartaDto(3,5);
        }else if(this.rbVerde6.isSelected()){
            return new CartaDto(3,6);
        }else if(this.rbVerde7.isSelected()){
            return new CartaDto(3,7);
        }else if(this.rbVerde8.isSelected()){
            return new CartaDto(3,8);
        }else if(this.rbVerde9.isSelected()){
            return new CartaDto(3,9);
        }else if(this.rbVerdeBloqueio.isSelected()){
            return new CartaDto(3,10);
        }else if(this.rbVerdeInverte.isSelected()){
            return new CartaDto(3,11);
        }else if(this.rbVerdeMaisDois.isSelected()){
            return new CartaDto(3,12);
        }else if(this.rbVermelho0.isSelected()){
            return new CartaDto(4,0);
        }else if(this.rbVermelho1.isSelected()){
            return new CartaDto(4,1);
        }else if(this.rbVermelho2.isSelected()){
            return new CartaDto(4,2);
        }else if(this.rbVermelho3.isSelected()){
            return new CartaDto(4,3);
        }else if(this.rbVermelho4.isSelected()){
            return new CartaDto(4,4);
        }else if(this.rbVermelho5.isSelected()){
            return new CartaDto(4,5);
        }else if(this.rbVermelho6.isSelected()){
            return new CartaDto(4,6);
        }else if(this.rbVermelho7.isSelected()){
            return new CartaDto(4,7);
        }else if(this.rbVermelho8.isSelected()){
            return new CartaDto(4,8);
        }else if(this.rbVermelho9.isSelected()){
            return new CartaDto(4,9);
        }else if(this.rbVermelhoBloqueio.isSelected()){
            return new CartaDto(4,10);
        }else if(this.rbVermelhoInverte.isSelected()){
            return new CartaDto(4,11);
        }else if(this.rbVermelhoMaisDois.isSelected()){
            return new CartaDto(4,12);
        }
        return new CartaDto(0,0);
    }
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
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbComprar;
    private javax.swing.JButton jbJogar;
    private javax.swing.JLabel jlMonteDescarte;
    private javax.swing.JLabel jlMsgVezJ1;
    private javax.swing.JLabel jlMsgVezJ2;
    private javax.swing.JLabel jlNomeJ1;
    private javax.swing.JLabel jlNomeJ2;
    private javax.swing.JRadioButton rbAmarelo0;
    private javax.swing.JRadioButton rbAmarelo1;
    private javax.swing.JRadioButton rbAmarelo2;
    private javax.swing.JRadioButton rbAmarelo3;
    private javax.swing.JRadioButton rbAmarelo4;
    private javax.swing.JRadioButton rbAmarelo5;
    private javax.swing.JRadioButton rbAmarelo6;
    private javax.swing.JRadioButton rbAmarelo7;
    private javax.swing.JRadioButton rbAmarelo8;
    private javax.swing.JRadioButton rbAmarelo9;
    private javax.swing.JRadioButton rbAmareloBloqueio;
    private javax.swing.JRadioButton rbAmareloInverte;
    private javax.swing.JRadioButton rbAmareloMaisDois;
    private javax.swing.JRadioButton rbAzul0;
    private javax.swing.JRadioButton rbAzul1;
    private javax.swing.JRadioButton rbAzul2;
    private javax.swing.JRadioButton rbAzul3;
    private javax.swing.JRadioButton rbAzul4;
    private javax.swing.JRadioButton rbAzul5;
    private javax.swing.JRadioButton rbAzul6;
    private javax.swing.JRadioButton rbAzul7;
    private javax.swing.JRadioButton rbAzul8;
    private javax.swing.JRadioButton rbAzul9;
    private javax.swing.JRadioButton rbAzulBloqueio;
    private javax.swing.JRadioButton rbAzulInverte;
    private javax.swing.JRadioButton rbAzulMaisDois;
    private javax.swing.JRadioButton rbCoringa1;
    private javax.swing.JRadioButton rbCoringa2;
    private javax.swing.JRadioButton rbCoringa3;
    private javax.swing.JRadioButton rbCoringa4;
    private javax.swing.JRadioButton rbCoringaQuatro1;
    private javax.swing.JRadioButton rbCoringaQuatro2;
    private javax.swing.JRadioButton rbCoringaQuatro3;
    private javax.swing.JRadioButton rbCoringaQuatro4;
    private javax.swing.JRadioButton rbVerde0;
    private javax.swing.JRadioButton rbVerde1;
    private javax.swing.JRadioButton rbVerde2;
    private javax.swing.JRadioButton rbVerde3;
    private javax.swing.JRadioButton rbVerde4;
    private javax.swing.JRadioButton rbVerde5;
    private javax.swing.JRadioButton rbVerde6;
    private javax.swing.JRadioButton rbVerde7;
    private javax.swing.JRadioButton rbVerde8;
    private javax.swing.JRadioButton rbVerde9;
    private javax.swing.JRadioButton rbVerdeBloqueio;
    private javax.swing.JRadioButton rbVerdeInverte;
    private javax.swing.JRadioButton rbVerdeMaisDois;
    private javax.swing.JRadioButton rbVermelho0;
    private javax.swing.JRadioButton rbVermelho1;
    private javax.swing.JRadioButton rbVermelho2;
    private javax.swing.JRadioButton rbVermelho3;
    private javax.swing.JRadioButton rbVermelho4;
    private javax.swing.JRadioButton rbVermelho5;
    private javax.swing.JRadioButton rbVermelho6;
    private javax.swing.JRadioButton rbVermelho7;
    private javax.swing.JRadioButton rbVermelho8;
    private javax.swing.JRadioButton rbVermelho9;
    private javax.swing.JRadioButton rbVermelhoBloqueio;
    private javax.swing.JRadioButton rbVermelhoInverte;
    private javax.swing.JRadioButton rbVermelhoMaisDois;
    // End of variables declaration//GEN-END:variables
}
