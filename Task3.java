public class Task3 {
    public static void main(String[] args) {
        String st = "Задача1";
        StringBuilder st_b = new StringBuilder(st);
        st = st_b.reverse().toString();
        System.out.println(st);
    }
}

// разверните задом наперед строку String st = "Задача1";
// без использования методов  класса стринг и циклов - см кое какой другой мутабельный класс