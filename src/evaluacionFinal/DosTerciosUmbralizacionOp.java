/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evaluacionFinal;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;

/**
 * Operación sobre imágenes propia, lo que hace es que a la imagen que le pasamos le aplica una umbralizacion a dos tercios de la imagen 
 * dejando la parte central de la imagen con el color normal, ya que sobre ella no se opera, y umbralizando las otras dos partes.
 * @author Alvaro Maximino Linares Herrera
 */
public class DosTerciosUmbralizacionOp extends BufferedImageOpAdapter{
    private int umbral;
    
    /**
     * Constructor, al cual se le pasará mediante el parámetro el grado de umbralización que queremos.
     * @param umb int
     */
    public DosTerciosUmbralizacionOp(int umb){
        umbral = umb;
    }

    /**
     * Aplica la umbralización a dos tercios de la imagen, de forma vertical, se quedaría pues con la primera parte 
     * la imagen umbralizada, la parte del medio normal, y la ultima parte quedaría umbralizada.
     * @param src BufferedImage, de donde se coje la imagen y sus valores.
     * @param dest BufferedImage, imagen de destino, donde se guardará la imagen ya cambiada.
     * @return BufferedImage con la umbralización ya realizada.
     */
    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if (dest == null) {
            dest = createCompatibleDestImage(src, null);
        }
        
        WritableRaster srcRaster = src.getRaster();
        WritableRaster destRaster = dest.getRaster();
        int x = srcRaster.getWidth();
        for (int row = 0; row < srcRaster.getHeight(); row++) {
            for (int col = 0; col < (x/3); col++) {
                for (int band = 0; band < srcRaster.getNumBands(); band++) {
                    int sample = srcRaster.getSample(col, row, band);
                    if(sample>=umbral){
                        sample=255;
                    }else{
                        sample=0;
                    }    
                    destRaster.setSample(col, row, band, sample);
                }   
            }
            for (int col = x/3; col < ((2*x)/3); col++) {
                for (int band = 0; band < srcRaster.getNumBands(); band++) {
                    int sample = srcRaster.getSample(col, row, band);   
                    destRaster.setSample(col, row, band, sample);
                }   
            }
            for (int col = ((2*x)/3); col < x; col++) {
                for (int band = 0; band < srcRaster.getNumBands(); band++) {
                    int sample = srcRaster.getSample(col, row, band);
                    if(sample>=umbral){
                        sample=255;
                    }else{
                        sample=0;
                    }   
                    destRaster.setSample(col, row, band, sample);
                }   
            }  
        }
        return dest;
    }
}