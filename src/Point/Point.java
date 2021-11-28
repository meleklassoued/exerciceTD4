package Point;

public class Point {
    private float absicisses;
    private float ordonnées;

    public final Point(float x, float y) {
        this.absicisses = x;
        ordonnées = y;

    }

    public void deplacer(float a, float b) {
        absicisses = absicisses + a;
        ordonnées = ordonnées + b;

    }

    public void afficher() {
        System.out.println("l absciesses est " + absicisses + "lordonne est " + ordonnées);
    }

    /*
     * ! --------------------------- constructeur ekher ---------------------------
     */
    public Point() {

    }

    public void setabsicces(float Z) {
        this.absicisses = Z;

    }

    public float getAbsicces() {
        return absicisses;
    }
    // public boolean compareTo()

}
