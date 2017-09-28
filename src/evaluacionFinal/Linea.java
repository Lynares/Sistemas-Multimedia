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
 * Clase que hereda de FiguraGeometrica y crea una linea.
 * @author Alvaro Maximino Linares Herrera
 */
public class Linea extends FiguraGeometrica {
    private Line2D fig;   
    /**
     * Constructor
     * @param p1 Point2D, primer punto de la Linea.
     * @param p2 Point2D, segundo punto de la Linea.
     */
    public Linea(Point2D p1, Point2D p2){
            fig = new Line2D.Float(p1, p2);
    }
    
    /**
     * Returns an integer Rectangle that completely encloses the Shape. 
     * @return an integer Rectangle that completely encloses the Shape.
     */
    @Override
    public Rectangle getBounds() {
        return fig.getBounds();
        
    }

    /**
     * Returns a high precision and more accurate bounding box of the Shape than the getBounds method. 
     * @return an instance of Rectangle2D that is a high-precision bounding box of the Shape.
     */
    @Override
    public Rectangle2D getBounds2D() {
        return fig.getBounds2D();
    }

    /**
     *
     * @param d the X coordinate of the specified point to be tested
     * @param d1 the Y coordinate of the specified point to be tested
     * @return false because a Line2D contains no area.
     */
    @Override
    public boolean contains(double d, double d1) {
        return fig.contains(d, d1);
    }

    /**
     *
     * @param pd the specified Point2D to be tested
     * @return false because a Line2D contains no area.
     */
    @Override
    public boolean contains(Point2D pd) {
        return fig.contains(pd);
    }

    /**
     *
     * @param d the X coordinate of the upper-left corner of the specified rectangular area
     * @param d1 the Y coordinate of the upper-left corner of the specified rectangular area
     * @param d2 the width of the specified rectangular area
     * @param d3 the height of the specified rectangular area
     * @return true if the interior of the Shape and the interior of the rectangular area intersect, or are both highly likely to intersect and intersection calculations would be too expensive to perform; false otherwise.
     */
    @Override
    public boolean intersects(double d, double d1, double d2, double d3) {
        return fig.intersects(d, d1, d2, d3);
    }

    /**
     *
     * @param rd the specified Rectangle2D
     * @return true if the interior of the Shape and the interior of the specified Rectangle2D intersect, or are both highly likely to intersect and intersection calculations would be too expensive to perform; false otherwise.
     */
    @Override
    public boolean intersects(Rectangle2D rd) {
        return fig.intersects(rd);
    }

    /**
     *
     * @param d the X coordinate of the upper-left corner of the specified rectangular area
     * @param d1 the Y coordinate of the upper-left corner of the specified rectangular area
     * @param d2 the width of the specified rectangular area
     * @param d3 the height of the specified rectangular area
     * @return false because a Line2D contains no area.
     */
    @Override
    public boolean contains(double d, double d1, double d2, double d3) {
        return fig.contains(d, d1, d2, d3);
    }

    /**
     *
     * @param rd the specified Rectangle2D to be tested
     * @return false because a Line2D contains no area.
     */
    @Override
    public boolean contains(Rectangle2D rd) {
        return fig.contains(rd);
    }

    /**
     * Returns an iteration object that defines the boundary of this Line2D. The iterator for this class is not multi-threaded safe, which means that this Line2D class does not guarantee that modifications to the geometry of this Line2D object do not affect any iterations of that geometry that are already in process.
     * @param at the specified AffineTransform
     * @return a PathIterator that defines the boundary of this Line2D.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return fig.getPathIterator(at);
    }

    /**
     *
     * @param at the specified AffineTransform
     * @param d the maximum amount that the control points for a given curve can vary from colinear before a subdivided curve is replaced by a straight line connecting the end points. Since a Line2D object is always flat, this parameter is ignored.
     * @return a PathIterator that defines the boundary of the flattened Line2D
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at, double d) {
        return fig.getPathIterator(at);
    }

    /**
     * Sets the location of the end points of this Line2D to the specified Point2D coordinates.
     * @param p1 the start Point2D of the line segment
     * @param p2 the end Point2D of the line segment
     */
    public void setLine(Point2D p1, Point2D p2){
        fig.setLine(p1, p2);
    }

    /**
     * Returns the square of the distance from a Point2D to this line segment. The distance measured is the distance between the specified point and the closest point between the current line's end points. If the specified point intersects the line segment in between the end points, this method returns 0.0.
     * @param p1 the specified Point2D being measured against this line segment.
     * @return a double value that is the square of the distance from the specified Point2D to the current line segment.
     */
    public double ptSegDist(Point2D p1){
        return fig.ptSegDist(p1);
    }

    /**
     *
     * @return the X coordinate of the start point of this Line2D object.
     */
    public double getX1(){
        return fig.getX1();
    }
    /**
     *
     * @return the X coordinate of the end point of this Line2D object.
     */
    public double getX2(){
        return fig.getX2();
    }
    /**
     *
     * @return the Y coordinate of the start point of this Line2D object.
     */
    public double getY1(){
        return fig.getY1();
    }
    /**
     *
     * @return the Y coordinate of the end point of this Line2D object.
     */
    public double getY2(){
        return fig.getY2();
    }
    /**
     * 
     * @return int con valor 1, que es el número asignado a la forma linea.
     */
    @Override
    public int getForma() {
      return 1;
    }
}
