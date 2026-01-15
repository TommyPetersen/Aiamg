package Aiamg;

import java.awt.*;

public class RasterPoint{

    public int a, b;
    public double distance;
    public Color color;

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
	color = _color;
    }

    public boolean equals(RasterPoint otherRasterPoint){
	return (a == otherRasterPoint.a) && (b == otherRasterPoint.b);
    }

    public boolean verticallyStrictlyLessThan(RasterPoint otherPoint){
	return (b < otherPoint.b) || ((b == otherPoint.b) && (a < otherPoint.a));
    }

    public String toString(){
	return "(" + a + ", " + b + ")";
    }
}
