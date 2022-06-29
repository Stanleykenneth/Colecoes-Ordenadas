package ordenados;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Character> alfabeto = new TreeSet<>();// Processo de ordenação feito automaticamente pelo java
		alfabeto.add('F');
		alfabeto.add('E');
		alfabeto.add('A');
		alfabeto.add('C');
		alfabeto.add('B');
		alfabeto.add('D');
		
		System.out.println(alfabeto);
		
		Mes m1 = new Mes("Janeiro", 1);
		Mes m2 = new Mes("Abril", 4);
		Mes m3 = new Mes("Fevereiro", 2);
		Mes m4 = new Mes("Março", 3);
		
		Set<Mes> meses = new TreeSet<>();
		meses.add(m1);
		meses.add(m2);
		meses.add(m3);
		meses.add(m4);
		
		System.out.println(meses);
		
		// Alfabeto invertido.
		
		Set<Character> alfabetoInv = new TreeSet<>(new InversoComparater());// Processo de ordenação feito automaticamente pelo java
		alfabeto.add('F');
		alfabeto.add('E');
		alfabeto.add('A');
		alfabeto.add('C');
		alfabeto.add('B');
		alfabeto.add('D');		
		System.out.println(alfabetoInv);

	}

}
