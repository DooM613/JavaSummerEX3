import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {


 static ArrayList<Integer> integers = new ArrayList<>();
  static ArrayList<Integer> integers1 = new ArrayList<>();

   static ArrayList<Integer> integers2 = new ArrayList<>();

   static ArrayList<Integer> integers3 = new ArrayList<>();



    public void generateLists(int num) {
        for (  int i = 0; i < num; i++) {

            integers.add(new Random().nextInt(0, 10));
            integers1.add(new Random().nextInt(0, 10));

            integers2.add(integers1.get(i) + integers.get(i));

        }
    }

    public void print(){
        System.out.println(integers );
        System.out.println(integers1);
        /*
        integers2.addAll(integers);
        integers2.addAll(integers1);

         */
        System.out.println("Adunarea array-listului"+ integers2);
       // System.out.println("Inmultirea array-listului" +integers3);


    }

    public static void main(String[] args) {
        Main main = new Main();
        main.generateLists(3);
        main.print();

        Utilit.sumArrayList();

    }

}