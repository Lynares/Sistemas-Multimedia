/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evaluacionFinal;

import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;

/**
 * Clase que hereda de FiguraGeometrica y crea una curva con un punto de control.
 * @author Alvaro Maximino Linares Herrera.
 */
public class Curva extends FiguraGeometrica {
    private QuadCurve2D fig;
    /**
     * Constructor
     * @param p1 Point2D, primer punto de la curva.
     * @param p2 Point2D, segundo punto de la curva.
     * @param p3 Point2D, punto de control de la curva.
     */
    public Curva(Point2D p1, Point2D p2, Point2D p3){
        //p3 punto de control
            fig = new QuadCurve2D.Double(p1.getX(), p1.getY(), p3.getX(), p3.getY(), p2.getX(), p2.getY());
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
     * Tests if the specified coordinates are inside the boundary of the Shape, as described by the definition of insideness.
     * @param d  the specified X coordinate to be tested
     * @param d1  the specified Y coordinate to be tested
     * @return true if the specified coordinates are inside the Shape boundary; false otherwise.
     */
    @Override
    public boolean contains(double d, double d1) {
        return fig.contains(d, d1);
    }

    /**
     * Tests if a specified Point2D is inside the boundary of the Shape, as described by the definition of insideness.
     * @param pd the specified Point2D to be tested
     * @return true if the specified Point2D is inside the boundary of the Shape; false otherwise.
     */
    @Override
    public boolean contains(Point2D pd) {
        return fig.contains(pd);
    }

    /**
     * Tests if the interior of the Shape intersects the interior of a specified rectangular area. The rectangular area is considered to intersect the Shape if any point is contained in both the interior of the Shape and the specified rectangular area.
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
     * Tests if the interior of the Shape intersects the interior of a specified Rectangle2D. The Shape.intersects() method allows a Shape implementation to conservatively return true when:
    there is a high probability that the Rectangle2D and the Shape intersect, but
    the calculations to accurately determine this intersection are prohibitively expensive.
     * @param rd the specified Rectangle2D
     * @return true if the interior of the Shape and the interior of the specified Rectangle2D intersect, or are both highly likely to intersect and intersection calculations would be too expensive to perform; false otherwise.
     */
    @Override
    public boolean intersects(Rectangle2D rd) {
        return fig.intersects(rd);
    }

    /**
     * ests if the interior of the Shape entirely contains the specified rectangular area. All coordinates that lie inside the rectangular area must lie within the Shape for the entire rectanglar area to be considered contained within the Shape.
     * @param d the X coordinate of the upper-left corner of the specified rectangular area
     * @param d1  the Y coordinate of the upper-left corner of the specified rectangular area
     * @param d2  the width of the specified rectangular area
     * @param d3 the height of the specified rectangular area
     * @return true if the interior of the Shape entirely contains the specified rectangular area; false otherwise or, if the Shape contains the rectangular area and the intersects method returns true and the containment calculations would be too expensive to perform.
     */
    @Override
    public boolean contains(double d, double d1, double d2, double d3) {
        return fig.contains(d, d1, d2, d3);
    }

    /**
     * Tests if the interior of the Shape entirely contains the specified Rectangle2D. The Shape.contains() method allows a Shape implementation to conservatively return false when:
    the intersect method returns true and
    the calculations to determine whether or not the Shape entirely contains the Rectangle2D are prohibitively expensive.
     * @param rd The specified Rectangle2D
     * @return true if the interior of the Shape entirely contains the Rectangle2D; false otherwise or, if the Shape contains the Rectangle2D and the intersects method returns true and the containment calculations would be too expensive to perform.
     */
    @Override
    public boolean contains(Rectangle2D rd) {
        return fig.contains(rd);
    }

    /**
     * Returns an iteration object that defines the boundary of the shape of this QuadCurve2D. The iterator for this class is not multi-threaded safe, which means that this QuadCurve2D class does not guarantee that modifications to the geometry of this QuadCurve2D object do not affect any iterations of that geometry that are already in process.
     * @param at an optional AffineTransform to apply to the shape boundary
     * @return a PathIterator object that defines the boundary of the shape.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return fig.getPathIterator(at);
    }

    /**
     * Returns an iteration object that defines the boundary of the flattened shape of this QuadCurve2D. The iterator for this class is not multi-threaded safe, which means that this QuadCurve2D class does not guarantee that modifications to the geometry of this QuadCurve2D object do not affect any iterations of that geometry that are already in process.
     * @param at an optional AffineTransform to apply to the boundary of the shape
     * @param d the maximum distance that the control points for a subdivided curve can be with respect to a line connecting the end points of this curve before this curve is replaced by a straight line connecting the end points.
     * @return a PathIterator object that defines the flattened boundary of the shape.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at, double d) {
        return fig.getPathIterator(at);
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
     * Sets the location of the end points and control point of this QuadCurve2D to the specified Point2D coordinates.
     * @param p1 the start point
     * @param p2 the control point
     * @param p3 the end point
     */
    public void setCurve(Point2D p1, Point2D p2, Point2D p3){
        fig.setCurve(p1, p2, p3);
    }

    /**
     * Sets the location of the end points and control point of this curve to the specified double coordinates.
     * @param d the X coordinate of the start point
     * @param d1 the Y coordinate of the start point
     * @param d2 the X coordinate of the control point
     * @param d3 the Y coordinate of the control point
     * @param d4 the X coordinate of the end point
     * @param d5 the Y coordinate of the end point
     */
    public void setCurve(double d, double d1,double d2,double d3,double d4,double d5){
        fig.setCurve(d, d1, d2, d3, d4, d5);
    }

    /**
     * 
     * @return int con valor 4, que es el número asignado a la forma curva.
     */
    @Override
    public int getForma() {
        return 4;
    }
}
