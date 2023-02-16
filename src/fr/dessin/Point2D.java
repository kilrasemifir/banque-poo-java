package fr.dessin;

public class Point2D {
    private static int compteur = 0;
    private int x;
    private int y;

    public Point2D(){
        this(0,0);
    }

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
        compteur++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getCompteur(){
        return compteur;
    }

    public void translater(int dX, int dY){
        this.x += dX;
        this.y += dY;
    }

    public void afficher(){
        System.out.println("["+this+"]");
    }

    @Override
    public String toString() {
        return x+", "+y;
    }
}
