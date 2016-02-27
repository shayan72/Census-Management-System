/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.JFileChooser;

/**
 *
 * @author amir
 */
public class ExportData extends javax.swing.JPanel {

    /**
     * Creates new form ExportData
     */
    public ExportData() {
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

        exportGroup = new javax.swing.ButtonGroup();
        radio_export_population = new javax.swing.JRadioButton();
        radio_export_forecast = new javax.swing.JRadioButton();
        panel_export_forecast = new javax.swing.JPanel();
        combo_export_forecast_type = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combo_export_forecast_country = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txt_export_outputAddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panel_export_population = new javax.swing.JPanel();
        combo_export_population_country = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        combo_export_population_type = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        exportGroup.add(radio_export_population);
        radio_export_population.setText("Country Population Chart");
        radio_export_population.setName("radio_population"); // NOI18N
        radio_export_population.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_export_populationActionPerformed(evt);
            }
        });

        exportGroup.add(radio_export_forecast);
        radio_export_forecast.setText("Forecast ");
        radio_export_forecast.setName("radio_forecast"); // NOI18N
        radio_export_forecast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_export_forecastActionPerformed(evt);
            }
        });

        panel_export_forecast.setBorder(javax.swing.BorderFactory.createTitledBorder("Forecast"));
        panel_export_forecast.setName("panel_forecast"); // NOI18N

        combo_export_forecast_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Men" , "Woemen" , "All" }));
        combo_export_forecast_type.setName("combo_country"); // NOI18N

        jLabel4.setText("Type:");

        jLabel5.setText("Country:");

        combo_export_forecast_country.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        combo_export_forecast_country.setName("combo_country"); // NOI18N

        javax.swing.GroupLayout panel_export_forecastLayout = new javax.swing.GroupLayout(panel_export_forecast);
        panel_export_forecast.setLayout(panel_export_forecastLayout);
        panel_export_forecastLayout.setHorizontalGroup(
            panel_export_forecastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_export_forecastLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_export_forecastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_export_forecastLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_export_forecast_country, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_export_forecastLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combo_export_forecast_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(54, 54, 54))
        );
        panel_export_forecastLayout.setVerticalGroup(
            panel_export_forecastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_export_forecastLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel_export_forecastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_export_forecast_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46)
                .addGroup(panel_export_forecastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_export_forecast_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Output: ");

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generate Output");

        panel_export_population.setBorder(javax.swing.BorderFactory.createTitledBorder("Country Poulation Chart"));
        panel_export_population.setName("panel_population"); // NOI18N

        combo_export_population_country.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        combo_export_population_country.setName("combo_country"); // NOI18N

        jLabel2.setText("Country:");

        combo_export_population_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Men" , "Woemen" , "All" }));
        combo_export_population_type.setName("combo_country"); // NOI18N

        jLabel3.setText("Type:");

        javax.swing.GroupLayout panel_export_populationLayout = new javax.swing.GroupLayout(panel_export_population);
        panel_export_population.setLayout(panel_export_populationLayout);
        panel_export_populationLayout.setHorizontalGroup(
            panel_export_populationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_export_populationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_export_populationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_export_populationLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_export_population_country, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_export_populationLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combo_export_population_type, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        panel_export_populationLayout.setVerticalGroup(
            panel_export_populationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_export_populationLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel_export_populationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_export_population_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(panel_export_populationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_export_population_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio_export_population)
                            .addComponent(panel_export_population, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_export_forecast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radio_export_forecast)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_export_outputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_export_population)
                    .addComponent(radio_export_forecast))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_export_forecast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_export_population, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_export_outputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = chooser.showOpenDialog(this);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radio_export_forecastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_export_forecastActionPerformed
        // TODO add your handling code here:
        panel_export_forecast.setEnabled(true);
        panel_export_population.setEnabled(false);
    }//GEN-LAST:event_radio_export_forecastActionPerformed

    private void radio_export_populationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_export_populationActionPerformed
        // TODO add your handling code here:
        panel_export_forecast.setEnabled(false);
        panel_export_population.setEnabled(true);
    }//GEN-LAST:event_radio_export_populationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_export_forecast_country;
    private javax.swing.JComboBox combo_export_forecast_type;
    private javax.swing.JComboBox combo_export_population_country;
    private javax.swing.JComboBox combo_export_population_type;
    private javax.swing.ButtonGroup exportGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_export_forecast;
    private javax.swing.JPanel panel_export_population;
    private javax.swing.JRadioButton radio_export_forecast;
    private javax.swing.JRadioButton radio_export_population;
    private javax.swing.JTextField txt_export_outputAddress;
    // End of variables declaration//GEN-END:variables
}