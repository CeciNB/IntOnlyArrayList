package dk.kea;

import dk.kea.bigo.Counter;

public class Main {

    public static void main(String[] args) {
        int[] N = {1, 10, 50, 100, 200, 500, 1000, 1500, 2000, 2500, 3000, 3500, 4000, 5000, 7000, 10000, 15000, 20000, 25000, 35000, 40000};
        Counter c = new Counter();
        for (int n : N){
            System.out.println("n = " + n + " The average is: " + loopAdd(n,20) + "millisec");
        }
    }
    public static long loopAdd(int n, int x){
        long result = 0;
        for (int i = 0; i < x; i++) {
            result = result + testAdd(n);
        }
        return result/x;
    }
    public static long testAdd(int n){
        IntOnlyArrayList list = new IntOnlyArrayList();
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < n; i++) {
            list.add(n);
        }
        long end = System.currentTimeMillis();
        return end-start;
    }


}