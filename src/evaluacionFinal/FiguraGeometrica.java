/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evaluacionFinal;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Shape;
import java.awt.Stroke;

/**
 * Clase abstracta de la que heredarán todas las demás Figuras.
 * @author Alvaro Maximino Linares Herrera
 */
public abstract class FiguraGeometrica implements Shape {
    
    private Color color = Color.BLACK;
    private Color colorRelleno = Color.BLACK;
    private Stroke stroke = new BasicStroke(1.0f);
    private boolean relleno = false;
    private boolean degradadoH = false;
    private boolean degradadoV = false;
    private boolean discontinuo = false;
    /**
     * Cambia el tipo de color de la figura.
     *@param c objeto de tipo Color.
     */
    public void setColor(Color c){
        this.color=c;
    }
    
    /**
     *@return Nos devuelve el color que tenemos asignado en la figura.
     */  
    public Color getColor(){
        return this.color;
    };
    /**
     * Cambia el tipo de color de relleno de la figura.
     *@param c objeto de tipo Color.
     */
    public void setColorRelleno(Color c){
        this.colorRelleno=c;
    }
    /**
     * 
     *@return Nos devuelve el color de relleno que tenemos asignado en la figura.
     */  
    public Color getColorRelleno(){
        return this.colorRelleno;
    };
    /**
     * Cambia el tipo de trazo de la figura.
     *@param str objeto de tipo float.
     */
    public void setStroke(float str){
        this.stroke=new BasicStroke(str);
    }
    /**
     * 
     *@return Nos devuelve el tipo de Stroke que tenemos asignado en la figura.
     */
    public Stroke getStroke(){
        return stroke;
    }
    /**
     * Cambia el tipo de trazo de la figura.
     *@param str objeto de tipo Stroke.
     */
    public void setStroke(Stroke str){
        stroke=str;
    }
    /**
     * Modifica el parametro de relleno de la figura.
     *@param r objeto de tipo boolean.
     */
    public void setRelleno(boolean r){
        this.relleno=r;
    }
    /**
     * 
     *@return Nos devuelve un tipo boolean que nos indica si tenemos asignado el relleno de la figura.
     */
    public boolean getRelleno(){
        return relleno;
    }
    /**
     * Modifica el parametro de relleno degradado horizontal de la figura.
     *@param d objeto de tipo boolean.
     */
    public void setDegradadoH(boolean d){
        this.degradadoH=d;
    }
    /**
     * 
     *@return Nos devuelve un tipo boolean que nos indica si tenemos asignado el relleno con degradado horizontal de la figura.
     */
    public boolean getDegradadoH(){
        return degradadoH;
    }
    /**
     * Modifica el parametro de relleno degradado vertical de la figura.
     *@param d objeto de tipo boolean.
     */
    public void setDegradadoV(boolean d){
        this.degradadoV=d;
    }
    /**
     * 
     *@return Nos devuelve un tipo boolean que nos indica si tenemos asignado el relleno con degradado vertical de la figura.
     */
    public boolean getDegradadoV(){
        return degradadoV;
    }
    /**
     * Nos devuelve la forma a la cual pertenece la figura.
     * @return int, entre 0 y 4
     */
    public abstract int getForma();
    
    public void setDiscontinuo(boolean d){
        this.discontinuo=d;
    }
}
