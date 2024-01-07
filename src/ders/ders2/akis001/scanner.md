Iste Java'nin `Scanner` sinifini kullanarak farkli veri tiplerinden giris almak kullanilan metodlar:

Scanner scanner = new Scanner(System.in);

        // 1. String girisi almak icin
        System.out.print("Adinizi girin: ");
        String ad = scanner.next();

        // 9. Bir satir metin girisi almak icin
        System.out.print("Bir satir metin girin: ");
        scanner.nextLine(); // Onceki girisi temizle
        String metin = scanner.nextLine();

        // 2. Byte girisi almak icin
        System.out.print("Bir byte degeri girin: ");
        byte byteDeger = scanner.nextByte();

        // 3. Short girisi almak icin
        System.out.print("Bir short degeri girin: ");
        short shortDeger = scanner.nextShort();

        // 4. Int girisi almak icin
        System.out.print("Bir tamsayi degeri girin: ");
        int intDeger = scanner.nextInt();

        // 5. Long girisi almak icin
        System.out.print("Bir long degeri girin: ");
        long longDeger = scanner.nextLong();

        // 6. Float girisi almak icin
        System.out.print("Bir ondalik sayi (float) girin: ");
        float floatDeger = scanner.nextFloat();

        // 7. Double girisi almak icin
        System.out.print("Bir ondalik sayi (double) girin: ");
        double doubleDeger = scanner.nextDouble();

        // 8. Boolean girisi almak icin
        System.out.print("Mantiksal bir deger (true/false) girin: ");
        boolean booleanDeger = scanner.nextBoolean();

        // 10. Char girisi almak icin
        System.out.print("Bir karakter girin: ");
        char karakter = scanner.next().charAt(0);

        // Kullanilan degerleri kullanarak islemler yapabilirsiniz

        // Scanner'i kapat
        scanner.close();


