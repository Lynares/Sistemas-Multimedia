/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evaluacionFinal;

import java.awt.image.BufferedImage;
import sm.image.BinaryOp;

/**
 * Clase que implementa la resta de dos imágenes pixel a pixel.
 * @author Alvaro Maximino Linares Herrera
 */
public class RestaOp extends BinaryOp{
    /**
     * Constructor, se le pasa una imagen a la cual se le aplicará la operación.
     * @param img BufferedImage
     */
    public RestaOp(BufferedImage img) {
        super(img);
    }
    
    /**
     * Coge un pixel de cada imagen y lo resta, devolviendonos el valor absoluto de esta operación.
     * @param i int
     * @param i1 int
     * @return Devuelve el valor absoluto de la resta.
     */
    @Override
    public int binaryOp(int i, int i1) {
        int valor=i-i1;
        return Math.abs(valor);
    }
}
