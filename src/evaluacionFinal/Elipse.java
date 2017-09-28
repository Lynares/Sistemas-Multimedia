/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evaluacionFinal;

import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Clase que hereda de FiguraGeometrica y crea una elipse.
 * @author Alvaro Maximino Linares Herrera
 */
public class Elipse extends FiguraGeometrica {
    private Ellipse2D elip;
    /**
     * Constructor
     * @param p1 double, primer punto de la elipse.
     * @param p2 double, segundo punto de la elipse.
     * @param p3 double, tercer punto de la elipse.
     * @param p4 double, cuarto punto de la elipse.
     */
    public Elipse(double p1, double p2, double p3, double p4){
        elip=new Ellipse2D.Double(p1, p2, p3, p4);
    }
    /**
     * Returns an integer Rectangle that completely encloses the Shape. 
     * @return an integer Rectangle that completely encloses the Shape.
     */
    @Override
    public Rectangle getBounds() {
        return elip.getBounds();
    }
    /**
     * Returns a high precision and more accurate bounding box of the Shape than the getBounds method. 
     * @return an instance of Rectangle2D that is a high-precision bounding box of the Shape.
     */
    @Override
    public Rectangle2D getBounds2D() {
        return elip.getBounds2D();
    }
    /**
     * Tests if the specified coordinates are inside the boundary of the Shape, as described by the definition of insideness.
     * @param d  the specified X coordinate to be tested
     * @param d1  the specified Y coordinate to be tested
     * @return true if the specified coordinates are inside the Shape boundary; false otherwise.
     */
    @Override
    public boolean contains(double d, double d1) {
        return elip.contains(d, d1);
    }
    /**
     * Tests if a specified Point2D is inside the boundary of the Shape, as described by the definition of insideness.
     * @param pd the specified Point2D to be tested
     * @return true if the specified Point2D is inside the boundary of the Shape; false otherwise.
     */
    @Override
    public boolean contains(Point2D pd) {
        return elip.contains(pd);
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
        return elip.intersects(d, d1, d2, d3);
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
        return elip.intersects(rd);
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
        return elip.contains(d, d1, d2, d3);
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
        return elip.contains(rd);
    }

    /**
     * Returns an iterator object that iterates along the Shape boundary and provides access to the geometry of the Shape outline. If an optional AffineTransform is specified, the coordinates returned in the iteration are transformed accordingly.
     * @param at an optional AffineTransform to be applied to the coordinates as they are returned in the iteration, or null if untransformed coordinates are desired
     * @return a new PathIterator object, which independently traverses the geometry of the Shape.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return elip.getPathIterator(at);
    }

    /**
     * Returns an iterator object that iterates along the Shape object's boundary and provides access to a flattened view of the outline of the Shape object's geometry.
     * @param at an optional AffineTransform to be applied to the coordinates as they are returned in the iteration, or null if untransformed coordinates are desired.
     * @param d the maximum distance that the line segments used to approximate the curved segments are allowed to deviate from any point on the original curve
     * @return a PathIterator object that provides access to the Shape object's flattened geometry.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at, double d) {
        return elip.getPathIterator(at);
    }

    /**
     * Sets the diagonal of the framing rectangle of this Shape based on two specified Point2D objects. The framing rectangle is used by the subclasses of RectangularShape to define their geometry.
     * @param p1 the start Point2D of the specified diagonal
     * @param p2 the end Point2D of the specified diagonal
     */
    public void setFrameFromDiagonal(Point2D p1, Point2D p2){
        elip.setFrameFromDiagonal(p1, p2);
    }

    /**
     * Returns the smallest X coordinate of the framing rectangle of the Shape in double precision.
     * @return the smallest X coordinate of the framing rectangle of the Shape.
     */
    public double getMinX(){
        return elip.getMinX();
    }

    /**
     * Returns the smallest Y coordinate of the framing rectangle of the Shape in double precision.
     * @return the smallest Y coordinate of the framing rectangle of the Shape.
     */
    public double getMinY(){
        return elip.getMinY();
    }

    /**
     * Returns the largest X coordinate of the framing rectangle of the Shape in double precision.
     * @return the largest X coordinate of the framing rectangle of the Shape.
     */
    public double getMaxX(){
        return elip.getMaxX();
    }

    /**
     * Returns the largest Y coordinate of the framing rectangle of the Shape in double precision.
     * @return the largest Y coordinate of the framing rectangle of the Shape.
     */
    public double getMaxY(){
        return elip.getMaxY();
    }

    /**
     * Returns the X coordinate of the center of the framing rectangle of the Shape in double precision.
     * @return the X coordinate of the center of the framing rectangle of the Shape.
     */
    public double getCenterX(){
        return elip.getCenterX();
    }

    /**
     * Returns the Y coordinate of the center of the framing rectangle of the Shape in double precision.
     * @return the Y coordinate of the center of the framing rectangle of the Shape.
     */
    public double getCenterY(){
        return elip.getCenterY();
    }
    /**
     * 
     * @return int con valor 3, que es el número asignado a la forma elipse.
     */
    @Override
    public int getForma() {
        return 3;
    }

}
