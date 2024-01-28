package src.ders.ders8.akis001;

public class User {
    private String name;
    public static int sayac = 10;

/*    {
        System.out.println("Nesne olusturuldu!");
    }*/

    static{
        System.out.println("Nesne olusturuldu!");
    }

    static{
        System.out.println("Nesne olusturuldu2!");
    }

    public User(String name) {
        this.name = name;
        sayac++;
    }

    public static void print(){
        System.out.println(":DDDDDDDDD");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
