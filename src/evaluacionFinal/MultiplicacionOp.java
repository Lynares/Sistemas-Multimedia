/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evaluacionFinal;

import java.awt.image.BufferedImage;
import sm.image.BinaryOp;

/**
 * Clase que implementa la multiplicación de dos imágenes pixel a pixel.
 * @author Alvaro Maximino Linares Herrera
 */
public class MultiplicacionOp extends BinaryOp{
    /**
     * Constructor, se le pasa una imagen a la cual se le aplicará la operación.
     * @param img BufferedImage
     */
    public MultiplicacionOp(BufferedImage img) {
        super(img);
    }
    /**
     * Coge un pixel de cada imagen y lo multiplica, devolviendonos el valor normalizado de esta multiplicación en 
     * caso de que se pase de los valores comprendidos entre 0 y 255.
     * @param i int
     * @param i1 int
     * @return Devuelve el valor normalizado de la multiplicación.
     */    
    @Override
    public int binaryOp(int i, int i1) {
        int valor=i*i1;
        if(valor<=0)        
            valor=0;
        else
            valor=valor/255;
        return valor;
    }
    
}
