/*
 *  Panther is a program to encode your media files from one format to the other.
 *  Copyright (C) 2012  Sankha Narayan Guria
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package sngforge.panther.gui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import sngforge.panther.Globals;
import sngforge.panther.modules.audio.AudioEncoderWorkingPanel;
import sngforge.panther.modules.audio.AudioEntry;

public class SimpleAudioPanel extends javax.swing.JPanel {

    /** Creates new form SimpleAudioPanel */
    public SimpleAudioPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputFile = new javax.swing.JTextField();
        outputFile = new javax.swing.JTextField();
        formatList = new javax.swing.JComboBox();
        browseOutput = new javax.swing.JButton();
        browseInput = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        encode = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        advanced = new javax.swing.JButton();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/dialog-information.png"))); // NOI18N
        jLabel2.setText("You can convert audio files from one format to another by just simply selecting the input file and the output file and format.");

        jLabel1.setText("Input File:");

        jLabel3.setText("Output File:");

        jLabel4.setText("Output Format:");

        formatList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MP3 File (.mp3)", "Wave Audio File (.wav)", "MP4 Audio File (.mp4)", "AU File (.au)", "AIFF File (.aif, .aifc, .aiff)", "MP2 File (.mp2)", "ADTS File (.adt, .adts)", "Creative Voice file format (.voc)", "RealMedia format (.rm)", "OGG file format (.ogg)", "3GPP AMR file format (.amr)" }));

        browseOutput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/document-open.png"))); // NOI18N
        browseOutput.setText("Browse...");
        browseOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseOutputActionPerformed(evt);
            }
        });

        browseInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/document-open.png"))); // NOI18N
        browseInput.setText("Browse...");
        browseInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseInputActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/emblem-important.png"))); // NOI18N
        jLabel5.setText("If you want to change the advanced parameters of the encoding process then click the \"Advanced >>\" button.");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/emblem-important.png"))); // NOI18N
        jLabel6.setText("The extension of the output file will be set automatically!");

        encode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/go-jump.png"))); // NOI18N
        encode.setText("Encode");
        encode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeActionPerformed(evt);
            }
        });

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/process-stop.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        advanced.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/preferences-desktop.png"))); // NOI18N
        advanced.setText("Advanced >>");
        advanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputFile, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputFile, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(browseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(browseOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(advanced)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                        .addComponent(encode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formatList, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(outputFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseOutput))
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(formatList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(encode)
                    .addComponent(advanced))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
     * the following 2 methods are for browsing the input and output files
     */
    private void browseInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseInputActionPerformed
        JFileChooser jfc=new JFileChooser();
        jfc.showOpenDialog(this);
        File f=jfc.getSelectedFile();
        if(f!=null)
            inputFile.setText(f.getAbsolutePath());
    }//GEN-LAST:event_browseInputActionPerformed

    private void browseOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseOutputActionPerformed
        JFileChooser jfc=new JFileChooser();
        jfc.showSaveDialog(this);
        File f=jfc.getSelectedFile();
        if(f!=null)
            outputFile.setText(f.getAbsolutePath());
    }//GEN-LAST:event_browseOutputActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(new MainPanel());
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    /*
     * starts the encoding process
     */
    private void encodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeActionPerformed
        AudioEntry sae=new AudioEntry();
        sae.saveSet(inputFile.getText(), outputFile.getText(), (String)formatList.getSelectedItem());
        Globals.ee=sae;
        AudioEncoderWorkingPanel saewp=new AudioEncoderWorkingPanel();
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(saewp);
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
        saewp.processSimple();
    }//GEN-LAST:event_encodeActionPerformed

    /*
     * launches the advancedaudio actions panel
     */
    private void advancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(new AdvancedAudioPanel());
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_advancedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton advanced;
    private javax.swing.JButton browseInput;
    private javax.swing.JButton browseOutput;
    private javax.swing.JButton cancel;
    private javax.swing.JButton encode;
    private javax.swing.JComboBox formatList;
    private javax.swing.JTextField inputFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField outputFile;
    // End of variables declaration//GEN-END:variables

}
