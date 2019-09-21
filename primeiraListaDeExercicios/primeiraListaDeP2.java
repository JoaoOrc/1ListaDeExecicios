package exercicios;

import java.util.Scanner;


public class lista_exercicios {
	public static void main(String[] args){
	    //q1();
		//q2();
		//q3();
		//q4();
		//q5();
		//q6();
		//q7();
		//q8();
		//q9();
		//q10();
		//q11();
		//q12();
		//q13();
		//q14();
		//q15();
		//q16();
		//q17();
		//q18();
		//q19();
		//q20();
		//q21();
		//q22();
		//q23();
		//q24();
		//q25();
		//q26();
		//q27();
		//q28();
		//q29();
		//q30();
		//q31();
		//q32();
		//q33();
		//q34();
		//q35();
		//q36();
		//q37();
		//q38();
		//q39();
		//q40();
		//q41();
		//q42();
		//q43();
		//q44();
		//q45();
		//q46();
		//q47();
		//q48();
		//q49();
		//q50();
		//q51();
		//q52();
		//q53();
		//q54();
		//q55();
	}

	static Scanner sc = new Scanner(System.in);
	
	
	
	static void q1(){
		System.out.println("Informe um valor: ");
		double n1 = sc.nextDouble();
		System.out.println("Informe outro valor: ");
                double n2 = sc.nextDouble();
		
		System.out.println("soma: "+(n1+n2));
		System.out.println("subtração: "+(n1-n2));
		System.out.println("divisão: "+(n1/n2));
		System.out.println("multiplição: "+(n1*n2));
	}
	
	static void q2(){
		System.out.println("Kilometros percorridos: ");
		double km = sc.nextDouble();
		System.out.println("combustivel em L: ");
		double litros = sc.nextDouble();
		System.out.println("seu carro tem um custo médio de :"+(km/litros));
	}
	
	static void q3(){
        String nome;
        double salarioFixo;
        double vendas;
        double salarioFinal;
        
        System.out.println("Digite Nome: ");
        nome = sc.nextLine();
        System.out.println("Digite Salario: ");
        salarioFixo = sc.nextDouble();
        System.out.println("Digite o numero de Vendas: ");
        vendas = sc.nextDouble();
    
        salarioFinal = salarioFixo+(vendas*0.15);
        
        System.out.println("Nome "+nome);
        System.out.println("Salario Fixo: "+salarioFixo);
        System.out.println("Salario Final: "+salarioFinal);
    }
	
	static void q4(){
        System.out.println("Informe a Temperatura: ");
        double celsius = sc.nextDouble();
        
        System.out.println("Temperatura em F: "+ (9*celsius+160)/5);
    }
    
    static void q5(){
        System.out.println("Informe a contação: ");
        double cotacao = sc.nextDouble();
        System.out.println("Informe o valor em dolar: ");
        double dolar = sc.nextDouble();
        System.out.println("Valor em Reais: "+(cotacao*dolar));
    }
    
    static void q6(){

    System.out.println("Valor depositado: ");
    double valorPolp = sc.nextDouble();
    System.out.println("Seu rendimento foi: "+(valorPolp * 0.07));
    
    
}
    
    static void q7(){
        System.out.println("Valor da compra: ");
        double prestao =sc.nextDouble();
        System.out.println("Valor da prestação: "+prestao/5);
    }
    
    static void q8(){
        System.out.println("Custo do produto");
        double custo = sc.nextDouble();
        System.out.println("Percentual: ");
        double percentual = sc.nextDouble();
        System.out.println("Valor do produto é: "+(custo*percentual));
}
    
    static void q9(){
        System.out.println("Custo de fabrica: ");
        double custoFabrica = sc.nextDouble();
        double consumidor = (custoFabrica+((custoFabrica * 0.45)+custoFabrica) * 0.28);
        System.out.println("Valor final :"+ consumidor);
}
    
    static void q10(){
        int A = 10;
        int B = 20;
        int aux;
        aux = A;
        A = B;
        B = aux;
              
        System.out.println("A: "+A+"\nB: "+B);
}
    
    static void q11(){
        int a = 100;
        int b = 120;
        
        System.out.println("B: "+ b);
        b = 234;
        System.out.println("A: "+a+"\n"+ "B: "+b);
        
        int A = 23;
        int B = 56;
        int C = A+B;
        B = 34;
        A = 67;
        System.out.println("\nA: "+ A+"\nB: "+ B+"\nC: "+ C);
        
        int A1 = 300;
        int B1 = 200;
        int C1 = A1 + B1;
        System.out.println("C: "+C1);
        B1 = 140;
        System.out.println("B: "+B1+"C"+C1);
        C1 = A1 + B1;
        System.out.println("\nA: "+A1+"\nB: "+B1+"\nC: "+C1);
    }
	
	static void q12(){
		double a =(4/2)+(2/4);
		double A = 4/2+2/4;
		double b = 4/(2+2)/4;
		double B = 4/2+2/4;
		double c = (4+2)*2-4;
		double C = 4+2*2-4;
		
		System.out.println("a "+a+" = A "+A);
		System.out.println("b "+b+" = B "+B);
		System.out.println("c "+c+" = C "+C);
	}
	
	static void q13(){

		double a = 6*(3+2);
		double b = 2+(6*(3+2)); 
		double c = 2+(3*6)/(2+4);
		double d = 2*(8/(3+1));
		double e = 3+(16-2)/(2*(9-2));
		double f = (6/3)+(8/2);
		double g = ((3+(8/2))*4)+(3*2);
		double h = (6*(3*3)+6)-10; 
		double i = (((10*8)+3)*9); 
		double j = ((-12)*(-4))+(3*(-4));
		
		
		System.out.println("na = " +a);
		System.out.println("b = " +b);
		System.out.println("c = " +c);
		System.out.println("d = " +d);
		System.out.println("e = " +e);
		System.out.println("f = " +f);
		System.out.println("g = " +g);
		System.out.println("h = " +h);
		System.out.println("i = " +i);
		System.out.println("j = " +j);
	}
	
	static void q14(){
		
		System.out.println("Informe um numero: ");
		int num = sc.nextInt(); 
		System.out.println("Antecessor :"+(num-1)+" sucessor :"+(num+1));
		
	}
	
	static void q15(){
		
		System.out.println("Valor da base: ");
		double base = sc.nextDouble();
		System.out.println("Valor da altura: ");
		double altura = sc.nextDouble();
		System.out.println("Area do retangulo:"+(base*altura));
		
	}

	static void q16(){
		
		System.out.println("Anos:");
		int anos = sc.nextInt();
		System.out.println("Meses:");
		int meses = sc.nextInt();
		System.out.println("Dias:");
		int dias = sc.nextInt();
		
		int dias_anos = (anos *365);
		int dias_meses = (meses *30);
		System.out.println("Você tem:"+(dias_anos+dias_meses+dias)+" dias de vida");
		
	}
	
	static void q17(){

		
		System.out.println("Eleitores: ");
		int eleitores = sc.nextInt();
		System.out.println("Votos brancos: ");
		int votosBrancos = sc.nextInt();
		System.out.println("votoas nulos:");
		int nulos = sc.nextInt();
		int porBrancos = ((100*votosBrancos)/eleitores);
		int porNulos = ((100*nulos)/eleitores);
		
		System.out.println("em uma cidade com"+eleitores);
                System.out.println("teve"+porBrancos+"% de votos brancos");
                System.out.println("Votos Nulos"+porNulos+"%");
	}

	static void q18(){
		
		System.out.println("Salario atual:");
		double salario = sc.nextInt();
		System.out.println("Reajuste: ");
		double reajuste = sc.nextDouble();
		System.out.println("Seu novo salario é: "+(salario +(salario *reajuste)));
		
	}
	
	static void q19(){
		 System.out.println("Custo de fabrica: ");
	        double custoFabrica = sc.nextDouble();
	        System.out.println ("Valor final :"+ ((custoFabrica+((custoFabrica * 0.45)+custoFabrica) * 0.28)));
	}
	
	static void q20(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Salrio fixo:");
		double salario = sc.nextDouble();
		System.out.println("Total de vendas em reais: ");
		double vendas = sc.nextDouble();
		System.out.println("Carros vendidos: ");
		double carrosVendidos = sc.nextDouble();
		System.out.println("Comissão em reais: ");
		double comissao = sc.nextDouble();
		
		System.out.println("Terar um salario final e: "+((((carrosVendidos*comissao)+(vendas*0.05))+salario)));
	}
	
	static void q21(){
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		if(valor>10){
			System.out.println("Valor maior que 10");
		}else{
			System.out.println("Valor menor que 10");
		}
	}

	static void q22(){
		System.out.println("Informe um valor: ");
		int valor = sc.nextInt();
		if(valor>=0){
			System.out.println("valor possitivo");
		}else{
			System.out.println("valor negativo");
		}


	}

	static void q23(){
		System.out.println("Numero de maçãs compradas:");
		double maca = sc.nextDouble();
		if(maca <12){
			System.out.println("total a pagar"+(maca*1.30));
		}else{
			System.out.println("total a pagar"+(maca*1.00));
		}
	}

	static void q24(){
		System.out.println("Informe a nota_1: ");
		double nota1 = sc.nextDouble();
                System.out.println("Informe a nota_2: ");
		double nota2 = sc.nextDouble();
		double media =((nota1+nota2)/2);
		if(media >=6){
			System.out.println("Aprovado com media: "+media);
		}else{
			System.out.println("Reprovado com media: "+media);
		}
	}
	
	static void q25(){
		System.out.println("Ano atual: ");
		int anoAtual = sc.nextInt();
		System.out.println("Ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		int idade = (anoAtual-anoNascimento);
		if(idade >=16){
			System.out.println("Pode votar nesse ano: ");
		}else{
			System.out.println("Não pode votar nesse ano: ");
		}
		
	}
	
	static void q26(){
		System.out.println("Informe um numero: ");
		double n1 = sc.nextDouble();
                System.out.println("Informe um numero: ");
		double n2 = sc.nextDouble();
		if(n1>n2){
			System.out.println(n1);
		}else{
			System.out.println(n2);
		}
	}

	static void q27(){
		System.out.println("Informe um numero: ");
		double n1 = sc.nextDouble();
                System.out.println("Informe um numero: ");
		double n2 = sc.nextDouble();
		if(n1>n2){
			System.out.println(n2+"\n"+n1);
		}else{
			System.out.println(n1+"\n"+n2);
		}
	}
	
	static void q28(){
		System.out.println("Inicio do jogo:");
		int inicio = sc.nextInt();
		System.out.println("Final do jogo:");
		int finalJ = sc.nextInt();
		
		int horas = (finalJ-inicio);
		if(horas <24){
			System.out.println("o jogo esta no tempo, com "+horas+"horas");
		}else{
			System.out.println("limite de 24h exercido, o jogo esta com "+horas+"horas");
		}
		
	}
	
	static void q29(){
		double salarioHora, horasTrabalhadas, horasExtras, salarioHoraExtra;
		double salarioExtra, salarioFinal;
		System.out.println("Horas trabalhadas");
		horasTrabalhadas =sc.nextDouble();
		System.out.println("Salario por hora de trabalho:");
		salarioHora =sc.nextDouble();
		
		horasExtras =(horasTrabalhadas-160);
		salarioHoraExtra = (salarioHora+(salarioHora*0.5));
		salarioExtra = (salarioHoraExtra*horasExtras);
		salarioFinal = ((salarioHoraExtra * horasExtras)+(160*salarioHora));
		
		System.out.println("Salario: "+(160*salarioHora));
		System.out.println("Salario das horas extras: "+salarioExtra);
		System.out.println("Salario final "+salarioFinal);
		
	}
	
	static void q30(){
		System.out.println("Seu nome:");
		String nome = sc.nextLine();
		System.out.println("Sua altura:");
		double altura = sc.nextDouble();
		System.out.println("Seu sexo:");
		String sexo = sc.nextLine();
		
		if(sexo == "m"|| sexo == "M" ){
			System.out.println("Seu peso ideal: "+((72.7*altura)-58));
		}if (sexo == "f"|| sexo == "F"){
			System.out.println("Seu peso ideal: "+((62.1*altura)-44.7));
		}
	}

	static void q31(){
		System.out.println("Salario fixo:");
		double salario = sc.nextDouble();
		System.out.println("Valor das vendas :");
		double valorVendas = sc.nextDouble();
		if(valorVendas <=1500){
			System.out.println("Salario final de: "+(salario+(valorVendas*0.3)));
		}else{
			System.out.println("Salario final de : "+(salario+(valorVendas*0.5)));
		}
	}

	static void q32(){
		System.out.println("Numero da conta: ");
		double conta = sc.nextDouble();
		System.out.println("Seu saldo: ");
		double saldo = sc.nextDouble();
		System.out.println("Seu debito: ");
		double debito= sc.nextDouble();
		System.out.println("Seu credito: ");
		double credito = sc.nextDouble();
		
		double saldoAtual = ((saldo-debito)+credito);
		if(saldoAtual>0){
			System.out.println("Saldo positivo de :"+saldoAtual);
		}else{
			System.out.println("Saldo negativo de :"+saldoAtual);
		}
		
	}
	
	static void q33(){
		System.out.println("Estoque atual: ");
		int atual = sc.nextInt();
		System.out.println("Estoque maximo: ");
		double maxima = sc.nextDouble();
		System.out.println("Estoque minimo: ");
		double minima = sc.nextDouble();
		
		double media = ((maxima+minima)/2);
		if(atual>=media){
			System.out.println("Nao efetuar compra: ");			
		}else{
			System.out.println("Efetuar compra: ");
		}
	}
	
	static void q34(){
		System.out.println("Informe um valor: ");
		double valor = sc.nextDouble();
		
		if(valor>=0){
			System.out.println("Valor positivo: "+valor);
		}else{
			System.out.println("Valor negativo: "+valor);
		}
		
	}
	
	static void q35(){
		System.out.println("Informe um numero: ");
		int n1 = sc.nextInt();
                System.out.println("Informe um numero: ");
		int n2 = sc.nextInt();
                System.out.println("Informe um numero: ");
		int n3 = sc.nextInt();
		
		if(n1>n2 && n1>n3){
			System.out.println("Maior: "+n1);
		}if(n1<n2 && n2>n3){
			System.out.println("Maior: "+n2);
		}else{
			System.out.println("Maior "+n3);
		}
		
	}
	
	static void q36(){
		System.out.println("Informe um numero: ");
		int n1 = sc.nextInt();
                System.out.println("Informe um numero: ");
		int n2 = sc.nextInt();
                System.out.println("Informe um numero: ");
		int n3 = sc.nextInt();
		
		if(n1>n2 && n2>n3){
			System.out.println("Soma: "+(n1+n2));
		}if(n1>n2 && n3>n2){
			System.out.println("Soma: "+(n1+n3));
		}if(n2>n1 && n3>n1){
			System.out.println("Soma: "+(n2+n3));
		}
	}
	
	static void q37(){
		System.out.println("Informe um numero: ");
		int n1 = sc.nextInt();
                System.out.println("Informe um numero: ");
		int n2 = sc.nextInt();
                System.out.println("Informe um numero: ");
		int n3 = sc.nextInt();
		
		if(n1>n2 && n2>n3){
			System.out.println(n3+" "+ n2+" "+ n1);
		}if(n1>n2 && n3>n2){
			System.out.println(n2+" "+n3+" "+n1);
		}if(n2>n1 && n3>n1){
			System.out.println(n1+" "+n3+" "+n2);
		}
		
	}
	
	static void q38(){
		System.out.println("Informe o valor do lado: ");
		double lado1 = sc.nextDouble();
                System.out.println("Informe o valor do lado: ");
		double lado2 = sc.nextDouble();
                System.out.println("Informe o valor do lado: ");
		double lado3 = sc.nextDouble();
		
		if((lado1<(lado2+lado3))&&(lado2<(lado1+lado3))&&(lado3<(lado1+lado2))){
			System.out.println("E um triangulo valido ");
		}else{
			System.out.println("Nao é um triangulo valido ");
		}
		
	}
	
	static void q39(){
		System.out.println("Casa: ");
		String time1 = sc.nextLine();
		System.out.println("Fora: ");
		String time2 = sc.nextLine();
		System.out.println("Gols da casa: ");
		int gols1 = sc.nextInt();
		
		
		System.out.println("Gols do visitante: ");
		int gols2 = sc.nextInt();
		
		if(gols1>gols2){
			System.out.println("O time "+time1+" ganhou");
		}if(gols1==gols2){
			System.out.println("EMPATOU");
		}else{
			System.out.println("O time "+time2+" ganhou");
		}
	}
	
	static void q40(){
		System.out.println("Informe um numero: ");
		int n1 = sc.nextInt();
                System.out.println("Informe um numero: ");
		int n2 = sc.nextInt();
		
		if(n1>n2){
			System.out.println("Primeiro maior que o segundo");
		}if(n2>n1){
			System.out.println("Segundo maior que o primeiro");
		}if(n1 == n2){
			System.out.println("Numeros iguais");
		}
	}
	
	static void q41(){
		char resposta;
		System.out.println("x");
		double x = sc.nextDouble();
		System.out.println("y");
		double y = sc.nextDouble();
		
		double z =((x*y)+5);
		if(z<=0){
			resposta = 'A';
		}if(z>=100){
			resposta = 'B';
		}else{
			resposta = 'C';
		}
		System.out.println(z+" "+resposta);
	}
	
	static void q42(){
		double desconto;
		int combustivel;
		System.out.print("Número de Litros vendidos: ");
		int litro = sc.nextInt();

		System.out.print("Combustível [1]-A [2]-G: ");
		combustivel = sc.nextInt();

		if (litro <= 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.03);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.05);
			System.out.println("Desconto: " + desconto);
		} else if (litro <= 20 && combustivel == 1) {
			desconto = 2.90 + (2.90 * 0.04);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 2.90 + (2.90 * 0.06);
			System.out.println("Desconto: " + desconto);
		}
	}
	
	static void q43(){
		System.out.println("Homem: ");
		int homem1 = sc.nextInt();
                System.out.println("Homem: ");
		int homem2 = sc.nextInt();
		System.out.println("mulhere ");
		int mulher1 = sc.nextInt();
                System.out.println("mulhere ");
		int mulher2 = sc.nextInt();
		
		if(homem1>homem2 && mulher1>mulher2){
			System.out.println("Soma "+(homem1+mulher2)+" Soma "+(homem2+mulher1));
		}if(homem1<homem2 && mulher1<mulher2){
			System.out.println("Soma"+(homem2+mulher1)+" Soma "+(homem1+mulher2));
		}if(homem1<homem2 && mulher1>mulher2){
			System.out.println("Soma"+(homem2+mulher2)+" Soma "+(homem1+mulher1));
		}if(homem1>homem2 && mulher1<mulher2){
			System.out.println("Soma"+(homem1+mulher1)+" Soma "+(homem2+mulher2));
		}
		
		
	}
	
	static void q44(){
		double precoMa = 1.80;
		double precoMo = 2.50;
		double pesoMa;
		double pesoMo;
		double totalMo;
		double totalMa;
		double precoFinal;

		System.out.print("Quantos Kilos de morango: ");
		pesoMo = sc.nextDouble();

		System.out.print("Quantos Kilos de maçã: ");
		pesoMa = sc.nextDouble();

		if (pesoMo > 5) {
			totalMo = (precoMo - 0.3) * pesoMo;
		} else {
			totalMo = precoMo * pesoMo;
		}

		if (pesoMa > 5) {
			totalMa = (precoMa - 0.3) * pesoMa;
		} else {
			totalMa = precoMa * pesoMa;
		}
		if ((totalMo + totalMa) > 25 || (pesoMo + pesoMa) > 8) {
			precoFinal = (totalMo + totalMa) * 0.9;
		} else {
			precoFinal = totalMo + totalMa;
		}

		System.out.println("Preço finl da compra: R$" + precoFinal);
	}
	
	
	static void q45(){ 
		int codigo = 1234;
		int senha = 9999;
		System.out.println("Codigo: ");
		int usuario = sc.nextInt();
		while(usuario !=1234){
			System.out.println("Codigo invalido");
			usuario = sc.nextInt();
		}
		System.out.println("Senha: ");
		int senhaUsu = sc.nextInt();
		while(senhaUsu!=9999){
			System.out.println("Senha incorreta");
			senhaUsu = sc.nextInt();
		}
		System.out.println("Acesso permitido");
	}
	
	static void q46(){
		boolean a=true;
		boolean b=true;
		boolean c=false;
		
		System.out.println("A e B: "+(a&b)+" A ou B: "+(a|b));
		System.out.println("A ou B: "+(a|b)+" A e C: "+(a&c));
		System.out.println("A ou C e B ou A e não B: "+(a|c&(b|a&(!b))));
	}
	
	
	static void q47(){
		System.out.println("Produto: ");
		String produto =sc.next();
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		
		double total = (quantidade *preco);
		if(quantidade <=5){
			double totalPagar = (total-(total*0.2));
			System.out.println("Total a pagar: "+totalPagar);
		}
		if(quantidade >5 && quantidade <=10){
			double totalPagar = (total-(total*0.3));
			System.out.println("Total a pagar: "+totalPagar);
		}
		if(quantidade >10){
			double totalPagar = (total-(total*0.5));
			System.out.println("Total a pagar: "+totalPagar);
		}
	}

	static void q48(){
		System.out.println("Codigo :");
		int cogido = sc.nextInt();
		System.out.println("Nasceu em: ");
		int nasceu = sc.nextInt();
		System.out.println("Ingresso na empressa :");
		int entrou = sc.nextInt();
		
		int idade = (2019-nasceu);
		int tempoEmpregado = (2019-entrou);
		
		if(idade>=65){
			System.out.println("Requerer aposentadoria ");
		}if(tempoEmpregado >=30){
			System.out.println("Requerer aposentadoria ");
		}if(idade ==60 && tempoEmpregado ==25){
			System.out.println("Requerer aposentadoria ");
		}if(idade <65 || tempoEmpregado<25){
			System.out.println("Não requer ");
		}
		
	}

	static void q49(){
		String mem;
		System.out.println("a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		if((a<(b+c))&&(b<(a+c))&&(c<(a+b))){
			if((a==b)&&(b==c)){
				 mem = "Triangulo isósceles"; 
			}else{
				 mem = "Triangulo escaleno";
			}
		}else{
			 mem = "Não é possivel"; 
		}
		System.out.println(mem);
	}

	static void q50(){
		double valor1,valor2;
		System.out.println("Valor um: ");
		 valor1 = sc.nextDouble();
		System.out.println("Valor dois: ");
		 valor2 = sc.nextDouble();
		if(valor2 == 0){
			System.out.println("Insira o valor dois !0: ");
			valor2 = sc.nextDouble();
		}
		System.out.println("Divisão: "+valor1+"/"+valor2+" = "+(valor1/valor2));
	}

	static void q51(){
		double valor1,valor2;
		System.out.println("Valor um: ");
		 valor1 = sc.nextDouble();
		System.out.println("Valor dois: ");
		 valor2 = sc.nextDouble();
		while(valor2 == 0){
			System.out.println("Insira o valor dois !0: ");
			valor2 = sc.nextDouble();
		}
		System.out.println("Divisão: "+valor1+"/"+valor2+" = "+(valor1/valor2));
	
	}

	static void q52(){
		char resposta;
		System.out.println("x");
		double x = sc.nextDouble();
		System.out.println("y");
		double y = sc.nextDouble();
		if(y==0){
			System.out.println("VALOR NÃO VALIDO!!");
		}else{
		
		double z =((x*y)+5);
		if(z<=0){
			resposta = 'A';
		}if(z>=100){
			resposta = 'B';
		}else{
			resposta = 'C';
		}
		System.out.println(z+" "+resposta);
		}
		
	}
	
	static void q53(){

		double desconto;
		int combustivel;
		System.out.print("Número de Litros vendidos: ");
		int litro = sc.nextInt();

		System.out.print("Combustível [1]-A [2]-G: ");
		combustivel = sc.nextInt();

		if (litro <= 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.03);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.05);
			System.out.println("Desconto: " + desconto);
		} else if (litro <= 20 && combustivel == 1) {
			desconto = 2.90 + (2.90 * 0.04);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 2.90 + (2.90 * 0.06);
			System.out.println("Desconto: " + desconto);
		}
	}
	
	static void q54(){
		System.out.println("Nota1 :");
		double nota1 = sc.nextDouble();
		while(nota1<0 || nota1>10){
			System.out.println("Valor invalido");
			nota1 = sc.nextDouble();
		}
		System.out.println("Nota2 :");
		double nota2 = sc.nextDouble();
		while(nota2<0 || nota2>10){
			System.out.println("Valor invalido");
			nota2 = sc.nextDouble();
		}
		System.out.println("Media do aluno: "+((nota1+nota2)/2));
	}
	
	static void q55(){
	
	int codigo = 1234;
	int senha = 9999;
	int opc = 1;
	while(opc != 0){
	System.out.println("Codigo: ");
	int usuario = sc.nextInt();
	while(usuario !=1234){
		System.out.println("Codigo invalido");
		usuario = sc.nextInt();
	}
	System.out.println("Senha: ");
	int senhaUsu = sc.nextInt();
	while(senhaUsu!=9999){
		System.out.println("Senha incorreta");
		senhaUsu = sc.nextInt();
	}
	System.out.println("Acesso permitido");
	
	System.out.println("Novo acesso: S{1}/N{0} ");
	opc = sc.nextInt();
	}
}


}