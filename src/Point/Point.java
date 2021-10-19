package Point;

public class Point {
    private float abscisse;
    private float ordonée;

    public Point(float abscisse, float ordonée) {
        this.abscisse = abscisse;
        this.ordonée = ordonée;
    }

    public void deplacer(float x, float y) {

        abscisse += x;
        ordonée += y;
        System.out.println("l'abscisse est " + abscisse + "et L'ordonnee est " + ordonée);
    }

}
