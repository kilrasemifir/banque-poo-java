package fr.dessin;

public class Point3DBis {

    private Point2D point2D;
    private int z;

    public Point3DBis(int x, int y, int z){
        this.point2D = new Point2D(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return point2D.getX();
    }

    public void setX(int x) {
        point2D.setX(x);
    }

    public int getY() {
        return point2D.getY();
    }

    public void setY(int y) {
        point2D.setY(y);
    }

    public void translater(int dX, int dY, int dZ){
        this.point2D.translater(dX, dY);
        this.z += dZ;
    }

    public void afficher() {
        System.out.println("["+this+"]");
    }

    @Override
    public String toString() {
        return point2D.toString() + ", "+this.z;
    }
}
