package com.jscoder.lambdas.ejercicio1;

import java.util.logging.Logger;

public class LambdasPractice {
    static Logger logger = Logger.getLogger("MyLog");
    public static void main(String[] args) {
        IFuntionTest ft = ()->logger.info("hola javier");
        ft.saludar();

        LambdasPractice s = new LambdasPractice();
        s.mimetodos(ft);




    }
     public void mimetodos(IFuntionTest ft) {
        ft.saludar();

     }

}
