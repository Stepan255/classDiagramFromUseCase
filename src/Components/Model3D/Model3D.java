package Components.Model3D;

import Components.Primitive.Point;

import java.util.List;

public class Model3D {
    private List<Polygon> polygons;
    private Texture texture;
    private Skeleton skeleton;

    public Model3D(List<Polygon> polygons, Texture texture, Skeleton skeleton) {
        this.polygons = polygons;
        this.texture = texture;
        this.skeleton = skeleton;
    }

    public void changePolygon(Polygon polygonToChange, Point[] newPoints3D){
        int index = polygons.indexOf(polygonToChange);
        if (index != -1){
            polygons.get(index).setPoints3D(newPoints3D);
        }else{
            System.out.println("the polygon does not exist");
        }
    }

    public void addPolygon(Polygon polygon){
        polygons.add(polygon);
    }

    public void removePolygon(Polygon polygon){
        if (!polygons.remove(polygon)){
            System.out.println("the polygon does not exist");
        }
    }

    public void changeTexture(Texture newTexture){
        texture = newTexture;
    }
}
