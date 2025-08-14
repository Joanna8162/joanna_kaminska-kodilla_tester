public class User {

    String name;
    int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {

        User anna = new User("Anna", 28);
        User tomasz = new User("Tomasz", 35);
        User beata = new User("Beata", 19);
        User klaudia = new User("Klaudia", 54);
        User przemysław = new User("Przemysław", 23);
        User sławomir = new User("Sławomir", 61);
        User teresa = new User("Teresa", 40);
        User michal = new User("Michał", 38);
        User lukasz = new User("Łukasz", 15);
        User monika = new User("Monika", 49);

        User[] users = {anna, tomasz, beata, klaudia, przemysław, sławomir, teresa, michal, lukasz, monika};

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum += users[i].getAge();
        }
        double average = sum;
        average = average / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < average) {
                System.out.println(users[i].getName());
            }

        }
    }
}

