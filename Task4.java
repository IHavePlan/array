public class Task4 {
    public static void main(String[] args) {
        int[] array = {0,1,2,4,5,7};
        int count = 0;

        System.out.print("[");
        for (int i = 0; i < array.length-1; i++){
            if (array[i] == array[i+1]-1){
                count++;
            }
            if ((array[i] != array[i+1]-1)&&(count != 0)){
                System.out.print("\"" + (array[i]-count) + "\"" + "->" + "\"" + array[i] + "\",");
                count = 0;
            }
            else if ((array[i] != array[i+1]-1)&&(count == 0)){
                System.out.print("\"" + array[i]+ "\",");
            }
            if ((i==array.length-2)&&(array[i] != array[i+1]-1)&&(count == 0)){
                System.out.print("\"" + array[array.length-1]+ "\"]");
            }
            else if ((i==array.length-2)&&(array[i] == array[i+1]-1)&&(count != 0)){
                System.out.print("\"" + (array[i+1]-count) + "\"" + "->" + "\"" + array[i+1] + "\"]");
            }
        }
    }

}
