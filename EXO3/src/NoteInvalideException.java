public class NoteInvalideException extends  Exception{
    public NoteInvalideException(int f) {
        super("Exception de type NoteInvalideException. Note invalide : " + f);
    }

}
