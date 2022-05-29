package withi_ide;

public class Q3 {
    public static void main(String[] args) {

        int [] a={23,24,12,78,62};
        int large=a[4];
        for (int i = 0; i < a.length; i++) {
            //System.out.print(a[i]+"\t");
            if (large<a[i]){
                System.out.println(a[i]);
            }

        }

    }
}
