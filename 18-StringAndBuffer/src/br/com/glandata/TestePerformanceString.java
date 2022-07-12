package br.com.glandata;
public class TestePerformanceString {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
        /*
         * ###########################################
         * INICIO BLOCO CONCATENA��O COM OPERADOR '+'
         * ###########################################
         * */
        String strFinal = "";
        long tStart = System.currentTimeMillis();
        /*
         * Vamos concatenar 65536 vezes o caractere 'a',
         * ent�o entenda que cada vez que passarmos no la�o
         * a JVM ir� criar um novo objeto em mem�ria.
         * */
        for(int i = 0; i < 100000; i ++){
               strFinal += "a";
        }

        long tEnd = System.currentTimeMillis();
        long tResult = tEnd - tStart;

        System.out.println("Tempo de Execu��o com operador'+' = "+tResult+" ms");

        /*
         * ###########################################
         * FIM BLOCO CONCATENA��O COM OPERADOR '+'
         * ###########################################
         * */



        /*
         * ###########################################
         * INICIO BLOCO CONCATENA��O COM StringBuilder
         * ###########################################
         * */
        StringBuilder strBuilder = new StringBuilder();
        tStart = System.currentTimeMillis();
        for(int i = 0; i < 100000; i ++){
               strBuilder.append("a");
        }
        tEnd = System.currentTimeMillis();
        tResult = tEnd - tStart;
        System.out.println("Tempo de Execu��o com StringBuilder= "+tResult+" ms");
  }

}
