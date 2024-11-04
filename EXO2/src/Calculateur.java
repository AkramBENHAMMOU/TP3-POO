public class Calculateur {
    public Calculateur() {
    }

   void testRacineCarree(int i) throws RacineCarreeException {
        if(i<0){
            throw new RacineCarreeException(i);
        }
   }

    public static void main(String[] args) throws RacineCarreeException {
        Calculateur c = new Calculateur();
        try {
            c.testRacineCarree(-5);
            c.testRacineCarree(25);
            System.out.println("Pas d'exception");
        }
        catch (RacineCarreeException e){
            e.printStackTrace();
        }
    }
}
