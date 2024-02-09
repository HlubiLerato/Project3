import java.util.ArrayList;
import java.util.List;

public class Project3 {
    public static void main(String [] args){
        int[] num1 = {11, 22, 33, 45};
        int[] num2 = {1, 2, 3};
        int[] total = combine(num1, num2);
        for (int num : total) {
            System.out.println("The number of arrays is "   +  num);

        }
    }

    public static int[] combine(int[] num1, int[]num2) {
        List<Integer> elements = new ArrayList();
        int i = 0, x = 0;


        while (i < num1.length || x < num2.length) {

            if (i < num1.length) {
                elements.add(num1[i]);
                i++;
            }

            if (x < num2.length) {
                elements.add(num2[x]);
                x++;
            }
        }

        int[] totArray = new int[elements.size()];
        for (int y = 0; y < elements.size(); y++) {
            totArray[y] =elements.get(y);
        }

        return totArray;
    }



}












































