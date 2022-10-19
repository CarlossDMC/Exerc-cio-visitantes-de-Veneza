package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Visitante;

public class Program {
	
	public static void main(String[] args) {
	
	List<Visitante> visitante = new ArrayList<>();
	List<String> cidades = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	int qntdMulheres = 0;
	int qntdHomens = 0;
	int dimenor = 0;
	int op = 1;
	
	while(op == 1) {
		System.out.println("----Cadastro-----");
		System.out.print("Nome: ");
		String nome = sc.next();
		
		System.out.print("Fone: ");
		int fone = sc.nextInt();
		
		System.out.print("Cidade: ");
		String cidade = sc.next();
		if(cidades.contains(cidade)) {
			;
		}
		else {
			cidades.add(cidade);
		}
		
		System.out.print("Sexo (M ou F): ");
		String sexo = sc.next();
		
		System.out.print("Digite seu ano de nascimento: ");
		int nascimento = sc.nextInt();
		
		Visitante vs = new Visitante(nome, fone, cidade, sexo, nascimento);
		
		visitante.add(vs);
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("Para cadastrar um novo visitante digite 1 ou qualquer numero para sair: ");
		op = sc.nextInt();
		
		
		if(op == 1) {
			continue;
		}
		
		else {
			break;
		}
		
	}
	
	for(int i = 0; i<visitante.size(); i++) {
		if (visitante.get(i).getSexo().equals("M")) {
			qntdHomens ++;
		}
		
		else if (visitante.get(i).getSexo().equals("F")) {
			qntdMulheres ++;
		}
		
		if(visitante.get(i).getNascimento() > 2005) {
			dimenor ++;
			
		}
		
	}
		

	
	
	
	System.out.println("-------------------------------------------------------------");
	
		System.out.println("Numero de visitantes: " + visitante.size());
		System.out.println("Numero de homens: " +  qntdHomens);
		System.out.println("Numero de mulheres: " +  qntdMulheres);
		System.out.println("Porcentagem de homens: " + (qntdHomens*100)/visitante.size());
		System.out.println("Porcentagem de mulheres: " + (qntdMulheres*100)/visitante.size());
		System.out.println("Numero de visitantes com menos de 18 anos: " +  dimenor);
		System.out.println("Numero de cidades: " +  cidades.size());
		
	System.out.println("-------------------------------------------------------------");
		
	
}
}
