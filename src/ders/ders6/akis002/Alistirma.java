package src.ders.ders6.akis002;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Alistirma {
    /*    public static void main(String[] args) {
     *//* Soru: Il Ilce Listesi
    Bir ilce rehberi uygulamasi yazin. Her ilin ilcelerini bir HashMap kullanarak saklayin.
    Kullanicidan bir il secmesini ve o ilin ilcelerini listelemesini isteyen bir program yapin.
*//*
        Scanner scanner = new Scanner(System.in);
        Map<String, String[]> ilceler = new HashMap<>();

        ilceler.put("Ankara", new String[]{"Cankaya", "Etimesgut", "Kizilay" });
        ilceler.put("Istanbul", new String[]{"Besiktas", "Kadikoy", "Uskudar" });

        System.out.println("Bir il secin (Ankara veya Istanbul)");
        String secilenIl = scanner.nextLine();

        if (ilceler.containsKey(secilenIl)) {
            String[] secilenIlceler = ilceler.get(secilenIl);

            for (String ilce : secilenIlceler) {
                System.out.println(ilce);
            }
        } else {
            System.out.println("Sectiginiz il sistemde bulunmuyor!");
        }
    }*/

    /*    public static void main(String[] args) {
     *//*      Soru: Urun Listesi

        Bir magaza uygulamasi yazin. Her urunun adini ve fiyatini iceren bir HashMap kullanarak,
         kullaniciya urun eklemesini ve her urun eklendikten sonra ekrana urun listesini yazdirsin.*//*

        Scanner scan = new Scanner(System.in);
        Map<String, Double> productPrices = new HashMap<>();

        while (true) {
            System.out.println("Eklemek istediginiz urunun adini giriniz: (Cikmak icin exit yazin)");
            String productName = scan.nextLine();

            if (productName.equals("exit")) {
                System.out.println("================");
                System.out.println("Urun Listesini Sonlandiriliyor....");
                break;
            }

            System.out.println("Urunun fiyatini giriniz: ");
            double prices = scan.nextDouble();
            scan.nextLine();//hata durumundan kacmak icin kullaniyoruz

            productPrices.put(productName, prices);
        }


        System.out.println("--------------");
        System.out.println("Urun Listesi: ");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("--------------");
    }*/

    public static void main(String[] args) {
/*        Soru: Kelime Frekansi

        Bir metindeki kelimelerin frekansini hesaplayan bir program yazin. Her kelimenin kac kez gectigini bir HashMap kullanarak saklayin.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Metin giriniz: ");
        String text = scan.nextLine();

        String[] words = text.split("\\s+");//spacelere gore parcalama yapar

        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            Integer value = wordFrequency.getOrDefault(word, 0);
            wordFrequency.put(word, value + 1);
        }

        System.out.println("Kelime Frekansalari: ");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }


}









