package orepaste;

import java.util.ArrayList;

public class PasteHandler {
    public ArrayList<Ore> ores;

    public PasteHandler() {

    }

    public void paste(String data) {

    }

    private String[] separateRows(String data) {
        return data.split("\\r?\\n");
    }
}
