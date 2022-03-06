import java.util.Arrays;

public class Questao2 {
 public static Integer totalPares(int[] arr, int x){
  //Verifica se os argumentos passados são válidos, caso negativo acorre o early return
  if (x <= 0 || arr.length < 2 ) {
   return null;
  }
  int total = 0;
  //Ordena o vetor para evitar falhas na contagem de pares
  Arrays.sort(arr);
  for (int i = 0; i < arr.length; i++) {
    for (int j=0; j < arr.length; j++){
     //Compara cada valor com todos os outros valores do vetor e caso a distancia seja valida, acrescenta-se 1 no total
     if ((arr[j] - arr[i]) == x) {
      total++;
    }

   }
  }
  return total;
 }
}
