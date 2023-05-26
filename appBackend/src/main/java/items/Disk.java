package items;

public class Disk {
    private String title;
    private String artist;
    private double price;
    private String barcode;

    public Disk(String title, String artist, double price, String barcode) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.barcode = barcode;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    // Override toString() to provide a string representation of the Disk object

    @Override
    public String toString() {
        return "Title: " + title +
                ", Artist: " + artist +
                ", Price: " + price +
                ", Barcode: " + barcode;
    }
}
