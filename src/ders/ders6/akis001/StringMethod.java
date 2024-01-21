package src.ders.ders6.akis001;


public class StringMethod {
    public static void main(String[] args) {
        String str = "Merhaba, Dunya!";
        System.out.println(str.length());
        System.out.println(str.charAt(5));

        String str1 = "Java";
        String str3 = "Java";
        String str2 = "Akedemisi";

        String text = str1.concat(str2);
        System.out.println(text);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println(str.indexOf("!"));
        System.out.println(str.indexOf("Merhaba"));

        System.out.println(str.substring(5));
        System.out.println(str.substring(0, 5));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String ad = "       Metehan     ";
        System.out.println(ad);
        System.out.println(ad.trim());

        String str5 = "G?LTEKIN";
        System.out.println(str5.replace("?", "U"));

        System.out.println(str.startsWith("Mer"));
        System.out.println(str.startsWith("Selam"));

        System.out.println(str.endsWith("!"));

        System.out.println(str.contains("!"));
        System.out.println(str.contains("Mete"));
        System.out.println(str.contains("er"));

        System.out.println(str.isEmpty());
        String str6 = "";
        System.out.println(str6.isEmpty());

    }

}
