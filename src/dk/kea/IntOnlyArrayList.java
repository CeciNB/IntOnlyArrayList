package dk.kea;

public class IntOnlyArrayList {
    private int[] intArray;

    public IntOnlyArrayList(){}

    public int get(int index){
        return intArray[index];
    }

    public void add(int value){
        int[] list;
        if (intArray == null){
            list = new int[]{value};
        } else {
            list = new int[intArray.length + 1];
            for (int i = 0; i < intArray.length; i++){
                list[i] = intArray[i];
            }
            list[intArray.length] = value;
        }
        intArray = list;
    }

    public void remove(int index){
        if (intArray == null || intArray.length == 0){
            System.out.println("no intArrayList");
        } else if (index >= intArray.length) {
            System.out.println("no index: " + index);
        } else {
            int[] list = new int[intArray.length-1];
            int j = 0;
            for (int i = 0; i < intArray.length; i++){
                if (i == index){
                    i++;
                }
                if (list.length != 0) {
                    list[j] = intArray[i];
                    j++;
                }
            }
            intArray = list;
        }
    }

    public int size(){
        if (intArray == null){
            return 0;
        } else {
            return intArray.length;
        }
    }

    public void add(int index, int value){

    }

    @Override
    public String toString(){
        if (intArray == null || intArray.length == 0) {
            return "no intArrayList";
        } else {
            String result = "IntArrayList = {";
            for (int i = 0; i < intArray.length; i++) {
                result = result + intArray[i] + ", ";
            }
            result = result.substring(0, result.length() - 2);
            result = result + "}";
            return result;
        }
    }
}