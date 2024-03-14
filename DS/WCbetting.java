import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class WCbetting{
    public static void main(String[] var0) {

        ArrayList<Double> values;
        //values: {win, draw, lose} of left team, then {left team current bets, right team current bets}
        try {
            values = readFile(var0[0]);
        } catch (Exception var3) {
            values = readFile("input.txt");
        }
        double win = values.get(0);
        double draw = values.get(1);
        double lose = values.get(2);
        double left = values.get(3);
        double right = values.get(4);


        //goal to return EV of betting
        double pool = (left + right + 1)*5;
        double leftEV = win*pool/(left + 1) + draw*pool/(2*(left + 1)) - 5;
        double rightEV = lose*pool/(right + 1) + draw*pool/(2*(right + 1)) - 5;

        System.out.println("Left EV: " + leftEV);
        System.out.println("Right EV: " + rightEV);

    }

    public static ArrayList<Double> readFile(String var0) {
        File var1 = new File(var0);
        Scanner var2 = null;

        try {
            var2 = new Scanner(var1);
        } catch (FileNotFoundException var5) {
            System.out.println("Cannot open " + var0);
            System.exit(1);
        }

        ArrayList<Double> var3 = new ArrayList<>();

        while(var2.hasNextLine()) {
            Double var4 = Double.parseDouble(var2.nextLine());
            var3.add(var4);
        }

        return var3;
    }


}