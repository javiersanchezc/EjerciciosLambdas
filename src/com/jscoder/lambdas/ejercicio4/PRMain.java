package com.jscoder.lambdas.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PRMain {
    public static void main(String[] args) {
        PRMain main = new PRMain();

    }
    public void ejevutar(){
        List<String> list = new ArrayList<>();
        list.add("Ejevutar");
        list.add("Ejevutar");
        list.add("Ejevutar");
        list.add("Ejevutar");
        Stream<String> stream = list.stream()
                .filter(p -> p.startsWith("E"));
    }
}
