package Aqil.Bootcamp3.Projects.project3.project3;

public class FindPoint {

    private double distancex;
    private double distancey;


    public FindPoint(double distancex, double distancey){
        this.distancex = distancex;
        this.distancey = distancey;
        if(distancex>0) distancex= 0;
        if(distancey>0) distancey= 0;

    }

    public double getDistance() {
        return Math.sqrt((distancex*distancex + distancey*distancey));
    }
}
