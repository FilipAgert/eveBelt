package orepaste;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PasteHandlerTest {
    PasteHandler handler;
    @BeforeEach
    void setup() {
        handler = new PasteHandler();
    }

    @org.junit.jupiter.api.Test
    void paste() {
        String data = "hejm3två\nförstam3andra";
        handler.paste(data);

    }

    @org.junit.jupiter.api.Test
    void sepCountVol() {
        String input = "13 183 1 977";
        double ratio = 0.15;
        assertEquals(13183, handler.sepCountVol(input, ratio)[0]);
        assertEquals(1977, handler.sepCountVol(input, ratio)[1]);
    }
}