
import java.util.Arrays;

public class Questao1 {

    public static Integer mediana(int[] arr){
        //Ordena o vetor
        Arrays.sort(arr);

        //Se o resto da divisão do vetor por 2 for igual a 1
        if ((arr.length % 2) == 1){
            //Retorna a mediana do vetor
            return arr[((arr.length - 1)/2)];
        }
        return null;
    }
}
