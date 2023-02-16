package fr.exemple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Personnage implements BaseObject, Translatable{

    @Override
    public void getMatrix(Object params) {
        System.out.println("getMatrix");
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.forEach(str -> System.out.println(str));

        Consumer<String> callBack = str -> System.out.println(str);
        BiConsumer<String, Integer> callBack2 = (str, i) -> System.out.println(str + i);

    }

}
