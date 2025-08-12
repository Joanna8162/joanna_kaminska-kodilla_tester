public class FirstClass {
    public static void main(String[] args) {


       Notebook notebook = new Notebook(600, 1000, 2023);
        System.out.println("notebook.weight: " + notebook.weight + ", notebook.price: " + notebook.price + ", year of release: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.bestOption();
       Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println("notebook.weight: " + heavyNotebook.weight + ", notebook.price: " + heavyNotebook.price + ", year of release: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.bestOption();
       Notebook oldNotebook = new Notebook(1200, 500, 2015);
        System.out.println("notebook.weight: " + oldNotebook.weight + ", notebook.price: " + oldNotebook.price + ", year of release: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.bestOption();
        Notebook newNotebook = new Notebook(450, 2569, 2025);
        System.out.println("notebook.weight: " + newNotebook.weight + ", notebook.price: " + newNotebook.price + ", year of release: " + newNotebook.year);
        newNotebook.checkPrice();
        newNotebook.checkWeight();
        newNotebook.bestOption();



    }
}
