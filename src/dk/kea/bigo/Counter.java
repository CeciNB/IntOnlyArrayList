package dk.kea.bigo;

import dk.kea.IntOnlyArrayList;

public class Counter {
    public Counter() {
    }
    public long loopAdd(int n, int x){
        long result = 0;
        for (int i = 0; i < x; i++)
            result = result + testAdd(n);
        return result/x;
    }
    public long testAdd(int n){
        IntOnlyArrayList list = new IntOnlyArrayList();
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < n; i++)
            list.add(n);
        long end = System.currentTimeMillis();
        return end-start;
    }
    public long loopRemove(int n, int x){
        long result = 0;
        for (int i = 0; i < x; i++)
            result = result + testRemove(n);
        return result/x;
    }
    public long testRemove(int n){
        IntOnlyArrayList list = new IntOnlyArrayList();
        for(int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < n; j++)
                list.add(n);
        }
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < n; i++)
            list.remove(n);
        long end = System.currentTimeMillis();
        return end-start;
    }
}
