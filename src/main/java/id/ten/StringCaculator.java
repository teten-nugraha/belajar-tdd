package id.ten;


/**
 * Package: id.ten
 * <p>
 * User: TetenNugraha
 * Date: 7/9/2021
 * Time: 9:46 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class StringCaculator {

    public static String add(int a, int b) {
        return String.valueOf(a+b);
    }

    public static String hapus(int a, int b) {
        return String.valueOf(a-b);
    }

    public static String kali(int i, int i1) {
        return String.valueOf(i*i1);
    }

    public static String bagi(int i, int i1) {
        if(i1 == 0) {
            return "Cannot divided by Zero";
        }
        return String.valueOf((i/i1));
    }
}
