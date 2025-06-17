class HelloWorldClass {
    //main метод
    // Комбинации: main, psvm
    public static void main(String[] args) {
        //Комбинации: sout
        //Целочисленные:
        //byte
        //short
        //int*
        //long
        int age = 100; //Переменная(Характеристика)

        //Дробные:
        //float
        //double*
        double pi = 3.14;

        //boolean
        boolean isAdult = true; // true/false

        //char
        char simbol = 'a';

        //Обьектный/Ссылочный тип String!
        String name = "Dima";

        //Комбинация: sout
        System.out.println(simbol);

        //Преобразование:
        //Явное
        double weightDouble = 100.999;
        int weight = (int) weightDouble;
        System.out.println(weight);

        //Неявное
        int height = 186;
        String info = height + " рост";
        System.out.println(info);

        //Арифметические операторы:
        int a = 11;
        int b = 2;
        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a/b);
        // System.out.println(a*b);
        // System.out.println(a%b);  //остаток от деления
        // System.out.println(++a); //преинкремент
        // System.out.println(--a); //предекремент
        // System.out.println(a++); //постдекремент
        // System.out.println(a--); //постдекремент

        //Операторы сравнения:
        System.out.println(a > b); //boolean(true/false)
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //Логические операторы
        System.out.println((a > b) && (1 == 2)); //&& - логическое И
        System.out.println((b > a) || (1 == 1)); //|| - логическое ИЛИ
        System.out.println(!false);
        a *= 2; //возьми а, умож на 2 и запиши в а
        a += 2; //возьми а, плюс на 2 и запиши в а
        a -= 2; //возьми а, минус на 2 и запиши в а
        a /= 2; //возьми а, раздели на 2 и запиши в а
        System.out.println(a);

        //Тернарный оператор (3)
        //(условие)?(true):(false);
        System.out.println(1 == 1 ? "Yes" : "No");

        //CTRL+ALT+L - форматирование кода JavaCodeConvention
    }
}
