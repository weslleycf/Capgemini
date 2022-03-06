import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesafioCapgeminiTest {

    @Test
    @DisplayName("Questao 1: mediana de [9, 2, 1, 4, 6] é 4")
    void testQuestao1(){
        int[] array = {9, 2, 1, 4, 6};
        assertEquals(4, Questao1.mediana(array));
    }

    @Test
    @DisplayName("Questão 2: total de 3 pares com diferença de de 2 na lista [1, 5, 3, 4, 2]")
    void testQuestao2(){
        int[] array = {1, 5, 3, 4, 2};
        assertEquals(3, Questao2.totalPares(array, 2), "Total de 3 pares com diferença de de 2 na lista [1, 5, 3, 4, 2]");
    }

    @Test
    @DisplayName("Questão 3 - Teste 1: Encriptar 'tenha um bom dia' para 'taoa eum nmd hbi'")
    void test1Questao3(){
        String s = "tenha um bom dia";
        assertEquals("taoa eum nmd hbi", Questao3.encriptar(s), "Encriptar 'tenha um bom dia' para 'taoa eum nmd hbi'");
    }

    @Test
    @DisplayName("Questão 3 - Teste 2: Encriptar '' para 'omd luo an'")
    void test2Questao3(){
        String s = "ola mundo";
        assertEquals("omd luo an", Questao3.encriptar(s), "Encriptar 'tenha um bom dia' para 'taoa eum nmd hbi'");
    }

}
