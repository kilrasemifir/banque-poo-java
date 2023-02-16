package fr.exemple;

public interface Translatable extends BaseObject {
    default void move(double x, double y){
        getMatrix(new Object[]{x, y});
    }
    default void moveX(double x){
        getMatrix(new Object[]{x});
    }
    default void moveY(double y){
        getMatrix(new Object[]{y});
    }
}
