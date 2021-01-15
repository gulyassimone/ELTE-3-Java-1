package compol.utils;
/**
 * Fok <-> radián konverzió.
 */
 
public class Angle{

	// Fok -> radián konverzió
    public static double degreeToRadian(double theta) {
        return Math.toRadians(theta);
    }

    // Radián -> fok konverzió
    public static double radianToDegree(double theta) {
        return Math.toDegrees(theta);
    }
}