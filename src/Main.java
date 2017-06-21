/**
 * Created by Mia on 6/21/17.
 */
public class Main {

    public static void main (String arg[]) {
       //callStrStringMia();
       callStrString();
       callSearchRotatedSortedArray();
    }

    public static void callStrStringMia() {
        String source = "abcdefdefdefgh";
        String target = "def";
        StrStringMia ssm = new StrStringMia();
        System.out.println(ssm.strStr(source, target));
    }

    public static void callStrString() {

        String source = "abcdefgh";
        String target = "cde";
        //StrString s = new StrString();
        System.out.println(StrString.strStr(source, target));
    }

    public static void callSearchRotatedSortedArray() {
        int[] A = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 4;
        System.out.println(SearchRotatedSortedArray.searchRotatedArray(A,target));
    }
}
