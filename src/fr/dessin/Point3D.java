package fr.dessin;

public class Point3D extends Point2D{
    private int z;

    public Point3D(){
        this(0,0,0);
    }

    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void translater(int dX, int dY, int dZ){
        this.translater(dX, dY);
        this.z += dZ;
    }

    @Override
    public String toString() {
        return super.toString() +", "+this.z;
    }
}
