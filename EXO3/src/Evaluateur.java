public class Evaluateur {
    public Evaluateur() {
    }

    void verifierNote(int note) throws NoteInvalideException{
        if(note>20 || note<0){
            throw new NoteInvalideException(note);
        }
    }

    public static void main(String[] args) {
        Evaluateur e = new Evaluateur();
        try {
            e.verifierNote(15);
            System.out.println("Pas d'exception");
            e.verifierNote(25);
        }catch (NoteInvalideException j){
            j.printStackTrace();
        }

    }
}
