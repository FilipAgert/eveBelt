package orepaste;

public class OrePaster {
    public static void main(String[] args) {
        PasterWindow window = new PasterWindow("Paster", 500, 500);

        String[] rows = new String[2];
        rows[0] = "hej";
        rows[1] = "då";
        for (String row : rows) {
            row = "test";
        }
        System.out.println(rows[0]);
    }
}
