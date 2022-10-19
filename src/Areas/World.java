package Areas;

import Components.Model3D.Model3D;
import Components.Vectorial.Camera.Camera;
import Components.Vectorial.Light.Light;

import java.util.List;

public class World {
    private Scene scene;
    private List<Model3D> models3D;
    private List<Camera> cameras;
    private List<Light> lights;
    private Camera activeCamera;

    public World(Scene scene, List<Model3D> models3D, List<Camera> cameras, List<Light> lights, Camera activeCamera) {
        this.scene = scene;
        this.models3D = models3D;
        this.cameras = cameras;
        this.lights = lights;
        this.activeCamera = activeCamera;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void setActiveCamera(Camera activeCamera) {
        this.activeCamera = activeCamera;
    }

    public void addLight(Light light){
        lights.add(light);
    }

    public void removeLight(Light light){
        if (!lights.remove(light)){
            System.out.println("the light does not exist");
        }
    }

    public void addCamera(Camera camera){
        cameras.add(camera);
    }

    public void removeCamera(Camera camera){
        if (!cameras.remove(camera)){
            System.out.println("the camera does not exist");
        }
    }

    public void addModel3D(Model3D model3D){
        models3D.add(model3D);
    }

    public void removeModels3D(Model3D model3D){
        if (!models3D.remove(model3D)){
            System.out.println("the model3D does not exist");
        }
    }
}
