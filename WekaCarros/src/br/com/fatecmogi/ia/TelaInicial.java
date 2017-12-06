/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecmogi.ia;

import java.text.NumberFormat;
import java.util.Locale;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Locale brasil = new Locale("pt", "br");

        comboBoxMarca = new javax.swing.JComboBox<>();
        comboBoxModelo = new javax.swing.JComboBox<>();
        comboBoxCarroceria = new javax.swing.JComboBox<>();
        comboBoxCor = new javax.swing.JComboBox<>();
        comboBoxCambio = new javax.swing.JComboBox<>();
        comboBoxPortas = new javax.swing.JComboBox<>();
        comboBoxLugares = new javax.swing.JComboBox<>();
        comboBoxCombustivel = new javax.swing.JComboBox<>();
        comboBoxLitrosTanque = new javax.swing.JComboBox<>();
        checkBoxArCondicionado = new javax.swing.JCheckBox();
        comboBoxAirBags = new javax.swing.JComboBox<>();
        comboBoxLitrosPortaMalas = new javax.swing.JComboBox<>();
        comboBoxMotor = new javax.swing.JComboBox<>();
        comboBoxAno = new javax.swing.JComboBox<>();
        comboBoxPais = new javax.swing.JComboBox<>();
        labelMarca = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        labelCarroceria = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        labelCambio = new javax.swing.JLabel();
        labelPortas = new javax.swing.JLabel();
        labelLugares = new javax.swing.JLabel();
        labelCombustivel = new javax.swing.JLabel();
        labelLitrosTanque = new javax.swing.JLabel();
        labelAirBags = new javax.swing.JLabel();
        labelLitrosPortaMalas = new javax.swing.JLabel();
        labelMotor = new javax.swing.JLabel();
        labelAno = new javax.swing.JLabel();
        labelPais = new javax.swing.JLabel();
        labelArCondicionado = new javax.swing.JLabel();
        buttonCalcularValor = new javax.swing.JButton();
        textFieldValor = new javax.swing.JFormattedTextField(NumberFormat.getCurrencyInstance(brasil));


        textFieldValor.setEnabled(false);
        textFieldValor.setValue(0);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weka Frontend");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelArCondicionado.setText("Ar condicionado");
        checkBoxArCondicionado.setText("Sim");
        checkBoxArCondicionado.setActionCommand("Sim");

        labelMarca.setText("Marca");
        comboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "Bentley", "BMW", "Chevrolet",
                "Fiat", "Ford", "Honda", "JAC", "Nissan", "Peugeot", "Porsche", "Renault", "Toyota", "Volkswagen"}));

        labelModelo.setText("Modelo");
        comboBoxModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "308 CC","911 GT3 RS", "A1", "A3",
                "A5 Turbo", "Argo", "Camaro SS", "Continental GT", "Corolla", "Cruse", "Doblô", "Duster", "EcoSport",
                "Fiorino", "Fit DX", "Kombi", "Logan", "Maverick GT", "S10 100 Anos", "Sandero", "Saveiro", "Sentra SL",
                "Spin", "T40", "Toro", "Voyage", "Z4 Roadster"}));

        labelCarroceria.setText("Carroceria");
        comboBoxCarroceria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conversível", "Cupê", "Hatch",
                "Monovolume", "Picape", "Sedan", "Sportback", "Utilitário", "Van"}));

        labelCor.setText("Cor");
        comboBoxCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Branco", "Cinza", "Laranja",
                "Marrom", "Prata", "Preto", "Verde", "Vermelho"}));

        labelCambio.setText("Câmbio");
        comboBoxCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automático", "Manual"}));

        labelPortas.setText("Portas");
        comboBoxPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4"}));

        labelLugares.setText("Lugares");
        comboBoxLugares.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "5", "7", "9"}));

        labelCombustivel.setText("Combustível");
        comboBoxCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diesel", "Flex", "Gasolina"}));

        labelLitrosTanque.setText("Volume do tanque");
        comboBoxLitrosTanque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "40", "50", "60", "70", "80", "90"}));

        labelAirBags.setText("Air Bags");
        comboBoxAirBags.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "2", "4", "6", "7"}));

        labelLitrosPortaMalas.setText("Volume do porta malas");
        comboBoxLitrosPortaMalas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "60", "125", "180", "208", "226",
                "270", "300", "320", "362", "363", "380", "440", "450", "470", "475", "480", "490", "500", "503", "510", "710",
                "750", "923", "980", "1000", "1061"}));

        labelMotor.setText("Motor");
        comboBoxMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "1.4", "1.5", "1.6", "1.7", "1.8",
                "2.0", "2.8", "4.0", "5.0", "6.2"}));

        labelAno.setText("Ano de fabricação");
        comboBoxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1975", "2007", "2008", "2009", "2010", "2011",
                "2012", "2013", "2014", "2015", "2016", "2017", "2018"}));

        labelPais.setText("País de origem");
        comboBoxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alemanha", "China", "EUA", "França",
                "Inglaterra", "Itália", "Japão"}));


        buttonCalcularValor.setText("Calcular Valor");
        buttonCalcularValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularValorActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCalcularValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLitrosTanque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelArCondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAirBags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLitrosPortaMalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxLitrosTanque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBoxArCondicionado)
                            .addComponent(comboBoxAirBags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxLitrosPortaMalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGap(23, 23, 23))
            )
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLitrosTanque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxLitrosTanque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelArCondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxArCondicionado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelAirBags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxAirBags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelLitrosPortaMalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxLitrosPortaMalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCalcularValor)
                    .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void buttonCalcularValorActionPerformed(java.awt.event.ActionEvent evt) {
        double[] vals = new double[15];
        String retorno = "";

        vals[0] = comboBoxMarca.getSelectedIndex();
        vals[1] = comboBoxModelo.getSelectedIndex();
        System.out.println(comboBoxModelo.getSelectedIndex());
        vals[2] = comboBoxCarroceria.getSelectedIndex();
        vals[3] = comboBoxCor.getSelectedIndex();
        vals[4] = comboBoxCambio.getSelectedIndex();
        vals[5] = comboBoxPortas.getSelectedIndex();
        vals[6] = comboBoxLugares.getSelectedIndex();
        vals[7] = comboBoxCombustivel.getSelectedIndex();
        vals[8] = comboBoxLitrosTanque.getSelectedIndex();
        if(checkBoxArCondicionado.isSelected())
            vals[9] = 1;
        vals[10] = comboBoxAirBags.getSelectedIndex();
        vals[11] = comboBoxLitrosPortaMalas.getSelectedIndex();
        vals[12] = comboBoxMotor.getSelectedIndex();
        vals[13] = comboBoxAno.getSelectedIndex();
        vals[14] = comboBoxPais.getSelectedIndex();



        Classificacao classificacao = new Classificacao();
        retorno = classificacao.classificar(vals);
        if("".equals(retorno))
            textFieldValor.setText("Não consegui classificar");
        else
            textFieldValor.setValue(Double.parseDouble(retorno));
    }


    // @param args the command line arguments

    public static void main(String args[]) {
        // Set the Nimbus look and feel
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        // If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        // For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the form

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcularValor;
    private javax.swing.JComboBox<String> comboBoxMarca;
    private javax.swing.JComboBox<String> comboBoxModelo;
    private javax.swing.JComboBox<String> comboBoxCarroceria;
    private javax.swing.JComboBox<String> comboBoxCor;
    private javax.swing.JComboBox<String> comboBoxCambio;
    private javax.swing.JComboBox<String> comboBoxPortas;
    private javax.swing.JComboBox<String> comboBoxLugares;
    private javax.swing.JComboBox<String> comboBoxCombustivel;
    private javax.swing.JComboBox<String> comboBoxLitrosTanque;
    private javax.swing.JComboBox<String> comboBoxAirBags;
    private javax.swing.JComboBox<String> comboBoxLitrosPortaMalas;
    private javax.swing.JComboBox<String> comboBoxMotor;
    private javax.swing.JComboBox<String> comboBoxAno;
    private javax.swing.JComboBox<String> comboBoxPais;
    private javax.swing.JCheckBox checkBoxArCondicionado;
    private javax.swing.JFormattedTextField textFieldValor;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelCarroceria;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelCambio;
    private javax.swing.JLabel labelPortas;
    private javax.swing.JLabel labelLugares;
    private javax.swing.JLabel labelCombustivel;
    private javax.swing.JLabel labelLitrosTanque;
    private javax.swing.JLabel labelAirBags;
    private javax.swing.JLabel labelLitrosPortaMalas;
    private javax.swing.JLabel labelMotor;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelPais;
    private javax.swing.JLabel labelArCondicionado;
    // End of variables declaration//GEN-END:variables
}
