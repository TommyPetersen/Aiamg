package Aiamg;
import Aiamg.Utils.*;

public class Line3D{

    public Point3D P0, P1;

    public Line3D(Point3D _P0, Point3D _P1){
	P0 = new Point3D(_P0);
	P1 = new Point3D(_P1);
    }

    public double length(){
        return length(DistanceType.EUCLIDEAN);
    }

    public double length(DistanceType distanceType){
	return Util3d.distance3D(new Point3D(P1.x - P0.x, P1.y - P0.y, P1.z - P0.z), distanceType);
    }

    public String toString(){
	return P0.toString() + ", " + P1.toString();
    }
}
