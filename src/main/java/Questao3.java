
public class Questao3 {
    public static String encriptar(String textoOriginal){
        int contador = 0;
        String resultado = "";

        //Remove todos os espaços do texto
        textoOriginal = textoOriginal.replace(" ", "");

        //Calcula a quantidade de linhas e colunas arredondando par cima o valor da raiz quadrada do tamanho do texto sem espaços,
        //garantindo que o tamanho da matriz sempre será maior ou igual a quantidade de caracteres no texto.
        int tamanhoMatriz =  (int) Math.ceil(Math.sqrt(textoOriginal.length()));
        //Cria a matriz vazia
        String[][] grid = new String[tamanhoMatriz][tamanhoMatriz];
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {

                if (contador < textoOriginal.length()){
                    //Preenche todas as linhas e colunas da matriz com o caracter correto com o auxilio de um contador de referencia
                    grid[i][j] = Character.toString(textoOriginal.charAt(contador));
                    contador++;
                }

            }
        }
        for (int i = 0; i < tamanhoMatriz; i++) {

            for (int j = 0; j < tamanhoMatriz; j++) {
                if (grid[j][i] != null){
                    //Percorre a matriz por colunas e linhas concatenando o valor das strings para contruir o texto encriptado
                    resultado = resultado.concat(grid[j][i]);
                }

            }
            //Adiciona um espaço ao final de cada coluna percorrida
            resultado = resultado.concat(" ");
        }
        //Retorna o texto encriptado sem espaços no inicio e no final do texto.
        return resultado.trim();
    }
}
