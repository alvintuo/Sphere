package Sphere;

public class Sphere {

    private double diameter, volume, surfaceArea;

    public Sphere(double diameter) {
        this.diameter = diameter;
        setSphereVolume();
        setSurfaceArea();
    }



    public void setSphereDiameter(double diameter) {
        this.diameter = diameter;

    }

    public double getSphereDiameter() {
        return diameter;
    }



    public void setSphereVolume() {
        volume = (4.0/3.0) * Math.PI * Math.pow(((double) diameter/2.0), 3);
    }

    public double getSphereVolume() {
        return volume;
    }



    public void setSurfaceArea() {
        surfaceArea = 4 * Math.PI * Math.pow(((double) diameter/2.0), 2);
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }



    public String toString() {
        String ts1 = Double.toString(diameter);
        String ts2 = Double.toString(volume);
        String ts3 = Double.toString(surfaceArea);
        return "Diameter: " + ts1 + ", Volume: " + ts2 + ", Surface Area: " + ts3;
    }

    public static void main(String[] args) {
        Sphere sphere = new Sphere(10.0);
        System.out.println(sphere);
        System.out.println("");
        sphere.setSphereDiameter(8.0);
        sphere.setSurfaceArea();
        sphere.setSphereVolume();
        System.out.println(sphere.getSphereDiameter());
        System.out.println(sphere.getSphereVolume());
        System.out.println(sphere.getSurfaceArea());
    }
}
