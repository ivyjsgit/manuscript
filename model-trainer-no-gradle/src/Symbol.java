import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.valueOf;

public class Symbol {
    public Symbol(String filename) throws IOException {
        this.filename = filename;
        Charset charset = Charset.forName("ISO-8859-1");
        List<String> result = Files.readAllLines(Paths.get(filename), charset);
        this.name=result.remove(0);
        System.out.println(name);

        this.lines=turnTextIntoLines(result);

    }

    private ArrayList<Line> turnTextIntoLines(List<String> textLines){
        ArrayList<Line> lines = new ArrayList<>();
        for(String lineOfText:textLines){
            String[] splittedBySemiColon = lineOfText.split(";");
            for (int i=0; i< splittedBySemiColon.length-1; i++){
                String[] currentPair = splittedBySemiColon[i].split(",");
                String[] nextPair = splittedBySemiColon[i + 1].split(",");
                Line line = new Line(new Point(valueOf(currentPair[0].trim()), valueOf(currentPair[1].trim())), new Point(valueOf(nextPair[0].trim()),valueOf(nextPair[1].trim())));

                lines.add(line);
            }
        }

        return lines;
    }

    public String getName() {
        return name;
    }

    public String getFilename() {
        return filename;
    }

    private String name;
    private String filename;

    public ArrayList<Line> getLines() {
        return lines;
    }

    private ArrayList<Line> lines;


}
