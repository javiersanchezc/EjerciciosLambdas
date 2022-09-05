package com.jscoder.lambdas.ejercicio2;

import java.util.logging.Logger;

public class LamdaTest2 {
    static Logger logger = Logger.getLogger("MyLog");
    public static void main(String[] args) {

        IOperations ope = (num1,num2)->logger.info(String.valueOf(num1+num2));
        ope.imprimeSuma(5,6);
        LamdaTest2 ld = new LamdaTest2();
        ld.mimetodos(ope,6,6);
    }
    public void  mimetodos(IOperations op,int num1,int num2){
     op.imprimeSuma(num1,num2);

    }

}
