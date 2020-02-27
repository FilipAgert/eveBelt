package orepaste;

import java.util.ArrayList;

public class PasteHandler {
    public ArrayList<Ore> ores;

    public PasteHandler() {
        ores = new ArrayList<>();
    }

    public void paste(String data) {
        String[] rows = separateRows(data);

        //Removes unneccessary part of input.
        for (int i = 0; i < rows.length; i++) {
            rows[i] = rows[i].split("m3")[0];
        }
    }

    private String[] separateRows(String data) {
        return data.split("\\r?\\n");
    }


}
