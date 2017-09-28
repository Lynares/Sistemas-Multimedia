/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evaluacionFinal;


import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Clase que hereda de FiguraGeometrica y crea un punto.
 * @author Alvaro Maximino Linares Herrera
 */
public class Punto extends FiguraGeometrica{
    private Line2D fig;
    /**
     * Contructor
     * @param p1 double, primer punto.
     * @param p2 double, segundo punto.
     * @param p3 double, tercer punto.
     * @param p4 double, cuarto punto.
     */
    public Punto(double p1, double p2, double p3, double p4){
            fig = new Line2D.Double(p1, p2,p3,p4);
    }
    public Punto(Point2D p1, Point2D p2){
            fig = new Line2D.Float(p1, p2);
    }
    @Override
    public Rectangle getBounds() {
        return fig.getBounds();
        
    }

    @Override
    public Rectangle2D getBounds2D() {
        return fig.getBounds2D();
    }

    @Override
    public boolean contains(double d, double d1) {
        return fig.contains(d, d1);
    }

    @Override
    public boolean contains(Point2D pd) {
        return fig.contains(pd);
    }

    @Override
    public boolean intersects(double d, double d1, double d2, double d3) {
        return fig.intersects(d, d1, d2, d3);
    }

    @Override
    public boolean intersects(Rectangle2D rd) {
        return fig.intersects(rd);
    }

    @Override
    public boolean contains(double d, double d1, double d2, double d3) {
        return fig.contains(d, d1, d2, d3);
    }

    @Override
    public boolean contains(Rectangle2D rd) {
        return fig.contains(rd);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return fig.getPathIterator(at);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double d) {
        return fig.getPathIterator(at);
    }
    public void setLine(Point2D p1, Point2D p2){
        fig.setLine(p2, p2);
    }
    public double ptSegDist(Point2D p1){
        return fig.ptSegDist(p1);
    }
    public double getX1(){
        return fig.getX1();
    }
    public double getX2(){
        return fig.getX2();
    }
    public double getY1(){
        return fig.getY1();
    }
    public double getY2(){
        return fig.getY2();
    }
    /**
     * 
     * @return int con valor 0, que es el número asignado a la forma punto.
     */
    @Override
    public int getForma() {
        return 0;
    }
}
