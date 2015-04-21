package br.edu.facensa.dojo.media;

public class MediaNotas {

	public static void main(String[] args) {
		
		String nome  = args[0];
	
		String n1 = args[1];
		String n2 = args[2];
		
		System.out.println("O aluno " + nome + " tirou notas:");
		System.out.println("G1: " + n1);
		System.out.println("G2: " + n2);
		
		Float n1Float = Float.valueOf(n1);
		Float n2Float = Float.valueOf(n2);
		float media = (n1Float  + n2Float)/2;
		System.out.println(media);
		
        boolean aprovado = (media>=70);
        System.out.println("O aluno está aprovado?"+ aprovado);
		int inteiroDeString = Integer.valueOf("10");
		System.out.println(inteiroDeString);
		
		
	}
}
