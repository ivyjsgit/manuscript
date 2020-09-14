import java.io.IOException;

public class model_trainer {
    public static void main(String[] args) throws IOException {
       Symbol ourSymbol = new Symbol("/Users/ivy/Desktop/Senior_Seminar/manuscript/note-viewer/test-note.txt");

        System.out.println(ourSymbol.getFilename());
       for (Line line:ourSymbol.getLines()){
           String message = String.format("A: %s, B: %s", line.getPoint_1(), line.getPoint_2());
           System.out.println(message);
       }
    }
}
