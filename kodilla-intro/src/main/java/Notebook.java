public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if(this.price < 600){
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight() {
        if(this.weight < 800){
            System.out.println("This notebook is light.");
        } else if (this.weight >= 800 && this.weight <= 1800) {
            System.out.println("This notebook is not very heavy.");
        } else {
            System.out.println("This notebook is quite heavy.");
        }
    }

    public void bestOption() {
        if(this.price < 1200 && this.year > 2022){
            System.out.println("This notebook is the best option.");
        } else if (this.price >= 1200 && this.price <= 2000 && this.year >= 2000) {
            System.out.println("This notebook is a good option.");
        } else {
            System.out.println("This notebook is not a very good option.");
        }
    }

    }
