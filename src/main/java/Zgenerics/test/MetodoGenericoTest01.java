package Zgenerics.test;

import Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class MetodogenericoTest01 {
    public static void main(String[] args) {


        imprimirListaGenerica(new List<);
    }
    private static <T> void imprimirListaGenerica(T t){

        List<T> list =  List.of(t);
        System.out.println(list);

    }
}

class Generico<T,X,I>{

    private X x;
    private I i;
    private T t;

    public Generico(X x, I i, T t) {
        this.x = x;
        this.i = i;
        this.t = t;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public I getI() {
        return i;
    }

    public void setI(I i) {
        this.i = i;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

