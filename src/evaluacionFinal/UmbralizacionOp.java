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
 * Clase que implementa la umbralización sobre imágenes.
 * @author Alvaro Maximino Linares Herrera
 */
public class UmbralizacionOp extends BufferedImageOpAdapter{
    private int umbral; 
 
    public UmbralizacionOp(int umbral) { 
        this.umbral = umbral; 
    } 
 
    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest){ 
 
        //Código de umbralización 
        if (dest == null) {
            dest = createCompatibleDestImage(src, null);
        }
        
        WritableRaster srcRaster = src.getRaster();
        WritableRaster destRaster = dest.getRaster();
        for (int row = 0; row < srcRaster.getHeight(); row++) {
            for (int col = 0; col < srcRaster.getWidth(); col++) {
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
    
    
    

