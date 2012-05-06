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

import java.util.Enumeration;
import java.util.Properties;
import javax.swing.JOptionPane;
import sngforge.panther.Globals;

/**
 * The Look and Feel Panel
 * @author Sankha
 */
public class LFPanel extends javax.swing.JPanel {

    Properties p;
    
    /**
     * Creates new form LFPanel
     */
    public LFPanel() {
        initComponents();
        loadLAFs();
    }
    
    final void loadLAFs(){
        p=new Properties();
        String curr="";
        try{
            p.loadFromXML(getClass().getResourceAsStream("/sngforge/panther/resources/lafs.xml"));
            Enumeration e=p.propertyNames();
            for(;e.hasMoreElements();){
                String name=(String)e.nextElement();
                lafList.addItem(name);
                if(p.getProperty(name).equals(Globals.prefs.getProperty("laf")))
                    curr=name;
            }
            lafList.setSelectedItem(curr);
            
        }catch(Exception e){
            e.printStackTrace(System.err);
            JOptionPane.showMessageDialog(null, e, "Panther - Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void savePrefs(){
        Globals.prefs.put("laf", p.getProperty(lafList.getSelectedItem().toString()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lafList = new javax.swing.JComboBox();

        jLabel1.setText("Select a theme from the available theme to set Panther's Look and Feel accordingly.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lafList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lafList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox lafList;
    // End of variables declaration//GEN-END:variables
}
