package orepaste;

import static org.junit.jupiter.api.Assertions.*;

class PasteHandlerTest {

    @org.junit.jupiter.api.Test
    void paste() {
        String data = "hejm3två\nförstam3andra";
        PasteHandler handler = new PasteHandler();
        handler.paste(data);

    }
}