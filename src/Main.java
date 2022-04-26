public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1 ");

        int i = 0;
        while ( i < 10 ) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();


        //Задание 2
        System.out.println("Задание 2 ");

        int friday = 1;
        while (friday < 31) {
            System.out.println("Сегодня пятница "+ friday + " число");
            friday = friday + 7;

            }


        //Задание 3
        System.out.println("Задание 3 ");

        int comet = 0;
        while (comet < 2122) {
            if (comet > 1822) {
                System.out.println(comet);
            }
            comet = comet + 79;

        }
        }





    }
