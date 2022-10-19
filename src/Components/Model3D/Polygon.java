package Components.Model3D;


import Components.Primitive.Point;

public class Polygon {
    private Point[] points3D;

    public Polygon(Point a, Point b, Point c) {
        points3D = new Point[]{a, b, c};
    }

    public void setPoints3D(Point a, Point b, Point c){
        setPoints3D(new Point[]{a, b, c});
    }

    public void setPoints3D(Point[] points3D) {
        this.points3D = points3D;
    }
}
