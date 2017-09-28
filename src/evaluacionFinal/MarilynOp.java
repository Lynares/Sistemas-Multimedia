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
 * Operación sobre imágenes propia, lo que hace es que a la imagen que le pasamos la copia cuatro veces más pequeña, 
 * y a cada imagen se le aplica una modificación del color quedando cada una con un color diferente.
 * @author Alvaro Maximino Linares Herrera
 */
public class MarilynOp extends BufferedImageOpAdapter{
    /**
     * Constructor
     */
    public MarilynOp(){
      
    }

    /**
     * Crea una imagen que sea la mitad de alta y la mitad de ancha que la original, y sobre la de destino la va 
     * copiando mediante la asignación del sample y la modificación del mismo dependiendo de en que banda estemos operando.
     * @param src BufferedImage, de donde se coje la imagen original y sus valores.
     * @param dest BufferedImage, donde se van almacenando los resultados.
     * @return Nos devuelve un BufferedImage con la operación realizada.
     */
    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if (dest == null) {
            dest = createCompatibleDestImage(src, null);
        }
        //Creo lienzoImagen y le asigno la imagen fuente para cambiarle el tamaño.
        BufferedImage img = src;
        
        VentanaInterna vi = new VentanaInterna();
        vi.getLienzo().setImagen(img, img.getWidth()/2, img.getHeight()/2);
        src = vi.getLienzo().getImagen();
        
        WritableRaster srcRaster = src.getRaster();
        WritableRaster destRaster = dest.getRaster();
        
        
        int x = srcRaster.getWidth();
        int y = srcRaster.getHeight();
        
        for (int row = 0; row < y; row++) {
            for (int col = 0; col < (x/2); col++) {
                for (int band = 0; band < srcRaster.getNumBands(); band++) {
                    int sample = srcRaster.getSample(col,row,band);   
                    int sample2=sample, sample3=sample, sample4=sample;
                         
                    if(band==0){
                        sample/=255;
                        sample2/=255;
                    }
                    if(band==1){
                        sample4/=255;
                    }
                    if(band==2){
                        sample3/=255;
                        sample2/=255;
                    }
                         
                    destRaster.setSample(col, row, band, sample);
                    destRaster.setSample(col+(x), row, band, sample2);
                    destRaster.setSample(col, row+(y), band, sample3);
                    destRaster.setSample(col+(x), row+(y), band, sample4);
                }   
            }
            for (int col = x/2; col < x; col++) {
                for (int band = 0; band < srcRaster.getNumBands(); band++) {
                    int sample = srcRaster.getSample(col,row,band);
                    int sample2=sample, sample3=sample, sample4=sample;
                          
                    if(band==0){
                        sample/=255;
                        sample2/=255;
                    }
                    if(band==1){
                        sample4/=255;
                    }
                    if(band==2){
                        sample3/=255;
                        sample2/=255;
                    }
                    destRaster.setSample(col, row, band, sample);
                    destRaster.setSample(col+(x), row, band, sample2);
                    destRaster.setSample(col, row+(y), band, sample3);
                    destRaster.setSample(col+(x), row+(y), band, sample4);
                }   
            }
        }
        return dest;
    }
    
}