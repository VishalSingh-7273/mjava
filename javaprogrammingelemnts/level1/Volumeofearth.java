package javaprogrammingelemnts.level1;

public class Volumeofearth {
    public static void main(String[] args) {
        double radiusKm = 6378;  // radius in kilometers
        double kmToMiles = 0.621371;
        double radiusMiles = radiusKm * kmToMiles;

        // Volume of sphere = 4/3 * π * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}

