
package evaluacionFinal;

import java.awt.image.Kernel;

/**
 *
 * @author Jesus Chamorro
 */

public class KernelProducer {
    
    //Tipos de máscaras
    final static int TYPE_MEDIA_3x3 = 0;
    final static int TYPE_BINOMIAL_3x3 = 1;
    final static int TYPE_ENFOQUE_3x3 = 2;
    final static int TYPE_RELIEVE_3x3 = 3;
    final static int TYPE_LAPLACIANA_3x3 = 4;
    final static int TYPE_SOBELX_3x3 = 5;
    final static int TYPE_SOBELY_3x3 = 6;
    /**
     * Crea objetos Kernel a partir de máscaras predefinidas
     */
    static Kernel createKernel(int type){
        switch(type){
            case TYPE_MEDIA_3x3:
                 return new Kernel(3,3,MASCARA_MEDIA_3x3); 
            case TYPE_BINOMIAL_3x3:
                 return new Kernel(3,3,MASCARA_BINOMIAL_3x3);    
            case TYPE_ENFOQUE_3x3:
                 return new Kernel(3,3,MASCARA_ENFOQUE_3x3);     
            case TYPE_RELIEVE_3x3:
                 return new Kernel(3,3,MASCARA_RELIEVE_3x3);     
            case TYPE_LAPLACIANA_3x3:
                 return new Kernel(3,3,MASCARA_LAPLACIANA_3x3);    
            case TYPE_SOBELX_3x3:
                 return new Kernel(3,3,MASCARA_SOBELX_3x3);    
            case TYPE_SOBELY_3x3:
                 return new Kernel(3,3,MASCARA_SOBELY_3x3);    
            default:
                 return null;
        }
    }
    
    /**
     * Constructor privado 
     */
    private KernelProducer(){}
    
   // Máscaras de convolución
    static float MASCARA_MEDIA_3x3[] = {
      0.1f, 0.1f, 0.1f,
      0.1f, 0.2f, 0.1f,
      0.1f, 0.1f, 0.1f
    };
    static float MASCARA_BINOMIAL_3x3[] = {
      0.0625f, 0.125f, 0.0625f,
      0.125f, 0.25f, 0.125f,
      0.0625f, 0.125f, 0.0625f
    };
    static float MASCARA_ENFOQUE_3x3[] = {  
      0.0f, -1.0f, 0.0f,
      -1.0f, 5.0f, -1.0f,
      0.0f, -1.0f, 0.0f
    };
    static float MASCARA_LAPLACIANA_3x3[] = {
      1.0f, 1.0f, 1.0f,
      1.0f, -8.0f, 1.0f,
      1.0f, 1.0f, 1.0f
    };
    static float MASCARA_RELIEVE_3x3[] = {   
      -2.0f, -1.0f, 0.0f,
      -1.0f, 1.0f, 1.0f,
      0.0f, 1.0f, 2.0f
    };
    static float MASCARA_SOBELX_3x3[] = {   
        -1f, 0f, 1f, 
        -2f, 0f, 2f, 
        -1f, 0f, 1f
    };
    static float MASCARA_SOBELY_3x3[] = {   
        1f, 2f, 1f, 
        0f, 0f, 0f, 
        -1f, -2f, -1f
    };
    // Fin máscaras de convolución 
}
 
