import jdk.jshell.execution.Util;

import java.util.ArrayList;

public class Utilit {


    public static void sumArrayList (){


        for( int i=0 ; i < Main.integers2.size(); i++){

            Main.integers3.add(Main.integers.get(i) * Main.integers1.get(i));

        }
        System.out.println(Main.integers3);
    }

}







