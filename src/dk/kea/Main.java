package dk.kea;

public class Main {

    public static void main(String[] args) {

        //instantier
        IntOnlyArrayList il = new IntOnlyArrayList();

        //Tilføj nogle tal
        il.add(1);
        il.add(17);
        il.add(42);

        //udskriv
        System.out.println(il);

        System.out.println("size: " + il.size());

        System.out.println("index 1: " + il.get(1));

        //fjern et element
        il.remove(1);

        //udskriv
        System.out.println(il);
        System.out.println("size: " + il.size());

    }

}