import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int[] field = new int[25];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < field.length; i++ ) {
            field[i] = Integer.parseInt(reader.readLine());
        }
        chet(field);
    }

    public static void chet(int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i]%2!=0) a[i]=1;
            if (i == a.length-1) System.out.print("Index " + i + ": " + a[i]);
            else System.out.print("Index " + i + ": " + a[i] +", ");
        }
    }
}
//    у данного массива выведите на печать все индексы четных элементов .
//    если элементы нечетные - вместо них на печать выведите 1.
//    под элементами имеются числа которые лежат в массиве
//    например Index 0: 0 , Index 1: 1 , Index 2: 2, Index 3: 1 , Index 4: 4,  Index 5: 1
