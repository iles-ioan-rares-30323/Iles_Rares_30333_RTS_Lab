import java.util.Random;

public class Main {

    static void sort(int[] array)
    {
        boolean change;
        int i,swap;
        do
        {
            change = false;
            for (i = 0; i < array.length-1; i++) {
                if (array[i]>array[i+1]){change = true; swap = array[i+1]; array[i+1] = array[i];array[i] = swap;}
            }
        }
        while(change);
    }
    public static void main(String[] args) {



        int[] s = new int[10];
        Random r = new Random();
        for(int i = 0; i<10;i++) s[i] = r.nextInt(20);

        System.out.println("Unsorted array: ");
        for(int i = 0; i<s.length;i++) System.out.print(s[i] + " ");

        sort(s);

        System.out.println();
        System.out.println("Sorted array: ");
        for(int i = 0; i<s.length;i++) System.out.print(s[i] + " ");

    }
}