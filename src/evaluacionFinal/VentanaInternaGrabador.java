/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evaluacionFinal;

import java.io.File;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import sm.sound.SMSoundPlayerRecorder;

/**
 * Ventana de grabación de sonido.
 * @author Alvaro Maximino Linares Herrera
 */
public class VentanaInternaGrabador extends javax.swing.JInternalFrame {
    
    SMSoundPlayerRecorder recorder;
    /**
     * Constructor de VentanaInternaGrabador
     * @param f File, archivo en el que grabaremos.
     */
    public VentanaInternaGrabador(File f) {
        initComponents();
        this.setSize(420, 90);
        recorder = new SMSoundPlayerRecorder(f);
        LineListener lineListener = new LineListener(){
            @Override
            public void update(LineEvent event) {
                if(event.getType()==LineEvent.Type.START) {
                    recorder.record();
                    
                }
                if(event.getType()==LineEvent.Type.STOP) {
                    recorder.stop();
                }
            }
        };
        ((SMSoundPlayerRecorder)recorder).setLineListener(lineListener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRecord = new javax.swing.ButtonGroup();
        grabarToggleButton = new javax.swing.JToggleButton();
        stopToggleButton = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        grupoRecord.add(grabarToggleButton);
        grabarToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPractica11/iconos/RecordDisabled_48x48.png"))); // NOI18N
        grabarToggleButton.setPreferredSize(new java.awt.Dimension(200, 90));
        grabarToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarToggleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(grabarToggleButton, java.awt.BorderLayout.LINE_START);

        grupoRecord.add(stopToggleButton);
        stopToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosPractica11/iconos/StopNormalRed_48x48.png"))); // NOI18N
        stopToggleButton.setSelected(true);
        stopToggleButton.setPreferredSize(new java.awt.Dimension(200, 90));
        stopToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopToggleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(stopToggleButton, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grabarToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarToggleButtonActionPerformed
        ((SMSoundPlayerRecorder)recorder).setLineListener(null);
        if(recorder!=null) recorder.record();
        grabarToggleButton.setIcon(new javax.swing.ImageIcon("src/iconosPractica11/iconos/RecordPressed_48x48.png"));//Ruta
        stopToggleButton.setIcon(new javax.swing.ImageIcon("src/iconosPractica11/iconos/StopDisabled_48x48.png"));
    }//GEN-LAST:event_grabarToggleButtonActionPerformed

    private void stopToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopToggleButtonActionPerformed
        ((SMSoundPlayerRecorder)recorder).setLineListener(null);
        if(recorder!=null) recorder.stop();
        grabarToggleButton.setIcon(new javax.swing.ImageIcon("src/iconosPractica11/iconos/RecordDisabled_48x48.png"));//Ruta
        stopToggleButton.setIcon(new javax.swing.ImageIcon("src/iconosPractica11/iconos/StopNormalRed_48x48.png"));
    }//GEN-LAST:event_stopToggleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton grabarToggleButton;
    private javax.swing.ButtonGroup grupoRecord;
    private javax.swing.JToggleButton stopToggleButton;
    // End of variables declaration//GEN-END:variables
}