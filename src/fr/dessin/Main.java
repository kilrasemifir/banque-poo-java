package fr.dessin;

public class Main {
    public static void main(String[] args) {
        System.out.println(Point2D.getCompteur());
        Point2D p1 = new Point2D(0,1);
        System.out.println(Point2D.getCompteur());
        p1.afficher();
        Point3D point3D = new Point3D();
        point3D.translater(1,-1,1);
        point3D.translater(1,1);
        point3D.afficher();
        System.out.println(Point2D.getCompteur());
        Point3DBis point3DBis = new Point3DBis(0,1,2);
        point3DBis.translater(1,-1,1);
        point3DBis.afficher();
    }
}
