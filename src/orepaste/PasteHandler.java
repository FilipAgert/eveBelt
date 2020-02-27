package orepaste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PasteHandler {
    public ArrayList<Ore> ores;

    public PasteHandler() {
        ores = new ArrayList<>();
    }

    public void paste(String data) {
        String[] rows = sepRows(data);

        //Removes distance to asteroid from data.
        for (int i = 0; i < rows.length; i++) {
            rows[i] = rows[i].split("m3")[0];
        }




    }

    /**
     *
     * @param input
     * @param ratio - Ratio between volume of stack and count of stack. (Volume of one unit of ore)
     * @return
     */

    public int[] sepCountVol(String input, Double ratio) {
        input = input.replaceAll("[^0-9]","");
        int temp = Integer.parseInt(input);
        ArrayList<Integer> digitArray = new ArrayList<Integer>();
        do{
            digitArray.add(temp % 10);
            temp /= 10;
        } while  (temp > 0);
        Collections.reverse(digitArray);

        return bestRatio(digitArray, ratio);
    }

    private int[] bestRatio(List<Integer> digits, double ratio) {
        double best = Double.MAX_VALUE;
        int[] bestNums = new int[2];
        for(int i = 0; i < digits.size(); i++) {
            double num1 = concatNumberList(digits.subList(0, i));
            double num2 = concatNumberList(digits.subList(i, digits.size()));
            double ratioCloseness = Math.abs(ratio - (num2 / num1));
            if(ratioCloseness < best) {
                best = ratioCloseness;
                bestNums[0] = (int)num1;
                bestNums[1] = (int)num2;
            }
        }
        return bestNums;
    }

    private int concatNumberList(List<Integer> list) {
        int res = 0;
        for(int i = 0; i < list.size(); i++) {
            res += Math.pow(10,i) * list.get(list.size() - i - 1);
        }
        return res;
    }

    private String[] sepRows(String data) {
        return data.split("\\r?\\n");
    }




}
