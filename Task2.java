public class Task2 {
    public static void main(String[] args) {
        int inputNum = 3;
        int [] beforeField = {2, 3, 2, 1, 3, 5, 7, 8, 7, 8, 2, 6, 3};
        int [] newarray = removeInputNum(beforeField,inputNum);
        printarray(newarray);
    }
    public static int [] removeInputNum (int [] beforeField, int inputNum){
        int count = 0;
        for(int a : beforeField){
            if (a != inputNum) count++;
        }
        int[] array = new int[count];
        count = 0;
        for (int i = 0; i<beforeField.length; i++ ){
            if (beforeField[i] != inputNum ) {
                array[count] = beforeField[i];
                count++;
            }
        }
        return array;
    }
    public static void printarray(int[] a){
        for(int b : a){
            System.out.print(b + " ");
        }
    }
}



//    внутри метода removeInputNum напишите реализацию,
//        которая будет удалять из массива все что равно inputNum и возвращает нам новый массив.
//        проверочный метод  который выводит на печать новый массив тоже напишите
