package src.ders.ders7.akis002;

public class Product {
    private String productName;
    private double price;
    private int stock;
    private int yearOfPrudaction;

    public Product() {
    }

    public Product(String productName, double price, int stock, int yearOfPrudaction) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.yearOfPrudaction = yearOfPrudaction;
    }

    public double kdvHesapla() {
        return price * 0.18;
    }

    public void stockKontrol() {
        if (stock > 0) {
            System.out.println("Urun stokta mevcut");
        } else {
            System.out.println("Urun stokta yok. Gelmesi icin siparis ediliyor....");
        }
    }

    public double indirim() {
        int currentYear = 2024;
        int result = currentYear - this.yearOfPrudaction;

        if (result < 1) {
            return 0;
        } else if (result > 1 && result < 5) {
            return price * 0.05;
        } else {
            return price * 0.10;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", yearOfPrudaction=" + yearOfPrudaction +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getYearOfPrudaction() {
        return yearOfPrudaction;
    }

    public void setYearOfPrudaction(int yearOfPrudaction) {
        this.yearOfPrudaction = yearOfPrudaction;
    }
}
