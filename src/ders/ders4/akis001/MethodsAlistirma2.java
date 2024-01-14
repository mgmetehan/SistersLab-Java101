package src.ders.ders4.akis001;

public class MethodsAlistirma2 {
    //Art?k y?l hesaplamak i?in, y?l?n 4'e tam b?l?nmesi ve ayn? zamanda 100'e tam b?l?nmemesi veya 400'e tam b?l?nmesi gerekmektedir.


    public static String artikYil(int years) {
        if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0) {
            return "Artikyildir";
        } else {
            return "Artik yil degildir!!!!";
        }
    }

    public static void main(String[] args) {
        int years = 2024;

        System.out.println(artikYil(years));
    }

}
