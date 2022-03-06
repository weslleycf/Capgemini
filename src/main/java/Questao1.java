
import java.util.Arrays;

public class Questao1 {

    public static Integer mediana(int[] arr){
        Arrays.sort(arr);
        if ((arr.length % 2) == 1){
            return arr[((arr.length - 1)/2)];
        }
        return null;
    }
}
