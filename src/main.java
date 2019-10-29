import java.util.ArrayList;

public class main {
    public static void main  (String[]args){
//        method1 =  devide by 10
//        --------------
//        int a = 123;
//
//        ArrayList<Integer> array = new ArrayList<Integer>();
//        do{
//            array.add(a % 10);
//            a /= 10;
//        } while  (a > 0);
//        System.out.println(array);
//        -----------------
//        method2
        int num = 1234567;

        int[]digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
        for(int d : digits)
            System.out.print(d + " ");
//        -----------------
        System.out.println();
        Reverse.reverse(digits, digits.length);

    }
}
