package com.jscoder.Streams;

import com.jscoder.Streams.modesl.Ususario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPrincipal {


    public static void main(String[] args) {

        List<Ususario> listUsers = new ArrayList<>();
        listUsers.add( new Ususario("test1","test2","jasc@correo.com", "123456789") );
        listUsers.add( new Ususario("test2","test2","jasc@correo.com", "123456789") );
        listUsers.add( new Ususario("test3","test2","jasc@correo.com", "123456789") );
        Stream <Ususario> stream = listUsers.stream();
        stream
                .filter(p->p.getUsername().equals("test1"))

                .forEach(st-> System.out.println("st = " + st));









    }
}
