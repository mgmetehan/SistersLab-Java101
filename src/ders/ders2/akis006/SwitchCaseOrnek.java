package src.ders.ders2.akis006;

public class SwitchCaseOrnek {


    public static void main(String[] args) {
/*       int not= 60;
        switch (not){
            case 80:
                System.out.println("Notumuz AA");
                break;
            case 60:
                System.out.println("Notumuz BB");
                break;
            default:
                System.out.println("Notumuz FF");
        }*/

            String gun = "Persembe";

            switch (gun) {
                case "Sali":
                    System.out.println("Sali");
                    break;
                case "Pazar":
                    System.out.println("Pazar");
                    break;
                case "Carsamba":
                    System.out.println("Carsamba");
                    break;
                case "Persembe":
                    System.out.println("Persembe");
                    break;
                case "Cuma":
                    System.out.println("Cuma");
                    break;
                case "Cumartesi":
                    System.out.println("Cumartesi");
                    break;
                case "Pazartesi":
                    System.out.println("Pazartesi");
                    break;
                default:
                    System.out.println("Gecersiz gun");
            }
        }




}
