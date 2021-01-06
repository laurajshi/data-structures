public class Cereal {
    int numMarshmallows;
    static double crunchiness;

    public Cereal() {
        numMarshmallows = 100;
        crunchiness = 1.0;
    }

    static void pour() {
        crunchiness -= 0.1;
    }

    void eat (int quantity) {
        numMarshmallows -= quantity;
        if(quantity > 10) {
            crunchiness -= 0.05;
        }
    }
    static double devour() {
        crunchiness = 0.4;
        return crunchiness;
    }

    public static void main(String[] args) {
        Cereal c = new Cereal();
        System.out.println(c.devour());
        Cereal.devour();
    }
}
