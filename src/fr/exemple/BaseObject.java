package fr.exemple;

public interface BaseObject {
    void getMatrix(Object params);

    default void move(double x, double y){
        getMatrix(new Object[]{x, y});
    }
}
