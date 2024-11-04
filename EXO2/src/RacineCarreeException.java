public class RacineCarreeException extends Exception {

    public RacineCarreeException(int m) {
        super("C'est une exception de type RacineCarreeException. Nombre négatif : " + m);
    }

}
