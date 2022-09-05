package com.jscoder.lambdas.ejercio3;

import java.util.logging.Logger;

public class LambdasPractice3 {
    static Logger log = Logger.getLogger(LambdasPractice3.class.getName());
    public static void main(String[] args) {
        engine((x,y)->x+y);
        engine((x,y)->x-y);
        engine((x,y)->x*y);
        engine((x,y)->x/y);


    }

    private static void engine(IOperaciones op){
        int x=4;
        int y=4;

     int rta=   op.calcular(x,y);
     log.info("RTA: " + rta);

    }
}
