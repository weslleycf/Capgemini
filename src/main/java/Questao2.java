import java.util.Arrays;

public class Questao2 {
 public static Integer totalPares(int[] arr, int x){
  if (x <= 0 || arr.length < 2 ) {
   return null;
  }
  int total = 0;
  Arrays.sort(arr);
  for (int i = 0; i < arr.length; i++) {
    for (int j=0; j < arr.length; j++){
     if ((arr[j] - arr[i]) == x) {
      total++;
    }

   }
  }
  return total;
 }
}
