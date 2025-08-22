public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2023);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        Notebook oldNotebook = new Notebook(1200, 500, 2015);
        Notebook newNotebook = new Notebook(450, 2569, 2025);

        notebookParameters(notebook);

        notebookParameters(heavyNotebook);

        notebookParameters(oldNotebook);

        notebookParameters(newNotebook);
    }

    private static void notebookParameters(Notebook object) {
        System.out.println("object.weight: " + object.weight + ", object.price: " + object.price + ", year of release: " + object.year);
        object.checkPrice();
        object.checkWeight();
        object.bestOption();
    }
}
