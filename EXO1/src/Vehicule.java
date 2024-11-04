public class Vehicule {

    public Vehicule() {
    }
    void testVitesse(int i) throws TropViteException {
        if (i > 90) {
            throw new TropViteException(i);
        }
    }

    public static void main(String[] args) {
        Vehicule vehicule = new Vehicule();
        try {
            vehicule.testVitesse(69);
            System.out.println("Pas d'exception");
            vehicule.testVitesse(120);
        } catch (TropViteException e) {
            e.printStackTrace();
        }
    }
}
