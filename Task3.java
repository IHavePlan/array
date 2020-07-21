public class Task3 {
    public static void main(String[] args) {
        String st = "Задача1";
        char[] ch  = st.toCharArray();
        char b = 0;
        for (int i = 0; i < ch.length/2; i++ ){
            b = ch[i];
            ch[i] = ch[ch.length -1-i];
            ch[ch.length -1-i] = b;
        }
        System.out.println(new String(ch));
    }
}

// разверните задом наперед строку String st = "Задача1";
// без использования методов  класса стринг и циклов - см кое какой другой мутабельный класс