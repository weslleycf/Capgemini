
public class Questao3 {
    public static String encriptar(String textoOriginal){
        int contador = 0;
        String resultado = "";
        textoOriginal = textoOriginal.replace(" ", "");
        int tamanhoMatriz =  (int) Math.ceil(Math.sqrt(textoOriginal.length()));
        String[][] grid = new String[tamanhoMatriz][tamanhoMatriz];
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                if (contador < textoOriginal.length()){
                    grid[i][j] = Character.toString(textoOriginal.charAt(contador));
                    contador++;
                }

            }
        }
        for (int i = 0; i < tamanhoMatriz; i++) {

            for (int j = 0; j < tamanhoMatriz; j++) {
                if (grid[j][i] != null){
                    resultado = resultado.concat(grid[j][i]);
                }

            }
            resultado = resultado.concat(" ");
        }
        return resultado.trim();
    }
}
