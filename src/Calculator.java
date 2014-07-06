/**
 * Created by Анка on 06.07.2014.
 */
public class Calculator {
    public static int max(Integer[] arr) throws NullPointerException {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
//            if (arr[i - 1] == null) {
//                break;
//            } else {
                if (arr[i] > arr[i - 1]) {
                    max = arr[i];
                }
//            }
            System.out.println(max);
        }
        return max;
    }
}
