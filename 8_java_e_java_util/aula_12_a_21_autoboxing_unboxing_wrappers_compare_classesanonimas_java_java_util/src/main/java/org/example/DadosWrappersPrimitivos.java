package org.example;

import java.util.*;

public class DadosWrappersPrimitivos {

    public static void main(String[] args) {
        //como são estendidos pelo Number - do Integer ao Byte - podem ser inicializados com: Number integerRef = Integer.valueOf(20);
        Integer integerRef = Integer.valueOf(20);
        System.out.println(integerRef.doubleValue());
        System.out.println(integerRef.longValue());
        System.out.println(integerRef.floatValue());
        System.out.println();
        Double doubleRef = Double.valueOf(21.1);
        System.out.println(doubleRef.intValue());
        System.out.println(doubleRef.longValue());
        System.out.println(doubleRef.floatValue());
        System.out.println();
        Float floatRef = Float.valueOf(22.2f);
        System.out.println(floatRef.doubleValue());
        System.out.println(floatRef.longValue());
        System.out.println(floatRef.intValue());
        System.out.println();
        Long longRef = Long.valueOf(23);
        System.out.println(longRef.doubleValue());
        System.out.println(longRef.intValue());
        System.out.println(longRef.floatValue());
        System.out.println();
        Short shortRef = Short.valueOf((short) 23);
        System.out.println(shortRef.doubleValue());
        System.out.println(shortRef.intValue());
        System.out.println(shortRef.floatValue());
        System.out.println();
        Byte byteRef = Byte.valueOf("23");
        System.out.println(byteRef.doubleValue());
        System.out.println(byteRef.intValue());
        System.out.println(byteRef.floatValue());
        System.out.println();

        List<Number> numerosVariados = new ArrayList<Number>();
        numerosVariados.add(1);
        numerosVariados.add(2.2);
        numerosVariados.add(23658992);
        numerosVariados.add(024586.6f);
        numerosVariados.add(526);
        numerosVariados.add(-159762);
        numerosVariados.add(146);
        numerosVariados.add(-71.3);
        System.out.println(numerosVariados.size());

        System.out.println();

        Character charRef = Character.valueOf('3');
        System.out.println((double) charRef.charValue());
        System.out.println((int) charRef.charValue());
        System.out.println((float) charRef.charValue());
        System.out.println();
        Boolean boolRefF = Boolean.FALSE;
        System.out.println(boolRefF.booleanValue());
        Boolean boolRefT = Boolean.TRUE;
        System.out.println(boolRefT.booleanValue());
    }
}
