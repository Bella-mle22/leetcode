/**
 * Created by Mia on 6/15/17.
 */
public class StrStringMia {
    public static int strStr (String source, String target) {
        if ( source == null || target == null ) {
            return -1;
        }
        int ct = 0;
        for ( int i = 0; i < source.length() - target.length() + 1; i++ ) {
            int j = 0;
            for ( j = 0; j < target.length(); j++ ) {
                if (source.charAt( i + j ) != target.charAt(j)) {
                    break;
                }
            }
            if ( j == target.length()) {
                ct++ ;
            }
        }
        return ct;
    }

   /* public static void main (String arg[]) {
        String source = "abcdefdefdefgh";
        String target = "def";
        StrStringMia ssm = new StrStringMia();
        System.out.println(ssm.strStr(source, target));
    }*/

}
