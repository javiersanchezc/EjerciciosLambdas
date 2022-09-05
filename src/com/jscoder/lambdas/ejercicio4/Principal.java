package com.jscoder.lambdas.ejercicio4;

import com.jscoder.lambdas.ejercio3.LambdasPractice3;

import java.util.logging.Logger;

public class Principal {
    static Logger log = Logger.getLogger(LambdasPractice3.class.getName());
    public static void main(String[] args) {
     engine((Long x,Long y)->x+y);
     engine((int x,int y)->x+y);


    }
   public static  void engine(CalculadorInt cal){
  cal.getcalcular(3,7);
  log.info("Calcular: " + cal.getcalcular(2,3));


   }
   public static void engine(CalculadorLong calc){
        calc.getcalcular(1L,3L);
   }
}
