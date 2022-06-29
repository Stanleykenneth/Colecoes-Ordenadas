package ordenados;

import java.util.Objects;

public class Mes implements Comparable<Mes>{

	private String nome;
	private int numero;

	public Mes(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return numero + "-" + nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mes other = (Mes) obj;
		return numero == other.numero;
	}

	@Override
	public int compareTo(Mes o) { // Esse método compara se mês é =, < ou > que o outro mês.
		if(this.numero < o.numero) {
			return -1;
		} else if(this.numero > o.numero){
			return 1;
		}
		return 0;
	}
	
	
}
