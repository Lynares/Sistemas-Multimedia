/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evaluacionFinal;


/**
 * Ventana para operar sobre imágenes o para dibujar.
 * @author Alvaro Maximino Linares Herrera
 */
public class VentanaInterna extends javax.swing.JInternalFrame {

    /**
     * Constructor
     */
    public VentanaInterna() {
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

        barrasScroll = new javax.swing.JScrollPane();
        lienzoDeImagen = new evaluacionFinal.LienzoImagen();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(350, 350));

        javax.swing.GroupLayout lienzoDeImagenLayout = new javax.swing.GroupLayout(lienzoDeImagen);
        lienzoDeImagen.setLayout(lienzoDeImagenLayout);
        lienzoDeImagenLayout.setHorizontalGroup(
            lienzoDeImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );
        lienzoDeImagenLayout.setVerticalGroup(
            lienzoDeImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        barrasScroll.setViewportView(lienzoDeImagen);

        getContentPane().add(barrasScroll, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Con este método obtendremos el LienzoImagen de la ventana seleccionada para poder aplicarle operaciones.
     * @return LienzoImagen.
     */
    public LienzoImagen getLienzo(){
        return lienzoDeImagen;  
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane barrasScroll;
    private evaluacionFinal.LienzoImagen lienzoDeImagen;
    // End of variables declaration//GEN-END:variables
}
