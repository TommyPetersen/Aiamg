package Aiamg;

import java.awt.*;

public class RasterPoint{

    public int a, b;
    public double distance;
    public Color originalColor, fadedColor;
    public double zBeforeProjection;
    public Point3D fromPoint;

    public RasterPoint(){
    }

    public RasterPoint(int _a,
		       int _b,
		       double _distance,
		       Color _color
		       ){
	a = _a;
	b = _b;
 	distance = _distance;
	originalColor = _color;
	fadedColor = _color;
	zBeforeProjection = Double.NaN;
        fromPoint = null;
    }

    public RasterPoint(int _a,
		       int _b,
		       double _distance,
		       Color _originalColor,
		       Color _fadedColor,
		       double _zBeforeProjection
		       ){
	a = _a;
	b = _b;
 	distance = _distance;
	originalColor = _originalColor;
	fadedColor = _fadedColor;
	zBeforeProjection = _zBeforeProjection;
        fromPoint = null;
    }

    public RasterPoint(int _a,
		       int _b,
		       double _distance,
		       Color _originalColor,
		       Color _fadedColor,
		       double _zBeforeProjection,
                       Point3D _fromPoint
		       ){
	a = _a;
	b = _b;
  distance = _distance;
	originalColor = _originalColor;
	fadedColor = _fadedColor;
	zBeforeProjection = _zBeforeProjection;
        fromPoint = _fromPoint;
    }

    public boolean equals(RasterPoint otherRasterPoint){
	return
	    (a == otherRasterPoint.a) && (b == otherRasterPoint.b);
    }

    public boolean verticallyStrictlyLessThan(RasterPoint otherPoint){
	return (b < otherPoint.b) || ((b == otherPoint.b) && (a < otherPoint.a));
    }

    public String toString(){
	return "(" + a + ", " + b + ")";
    }
}
