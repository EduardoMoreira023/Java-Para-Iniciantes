// Testes do Capítulo 2


1. R= Os tipos de dados são importantes em Java pq essa é uma liguagem fortemente tipada, todas as operações têm a compatibilidade de seus tipos verificada pelo compilador. Operações inválidas não serão complidadas. Logo, a verificação minuciosa dos tipos ajuda a impedir a verificação cuidadosa dos tipos, todas as variáveis, expressões e valores têm um tipo.


2. R= O tipo de caractere usando em java é o char, e ele é diferente do tipo caractere de outras linguagens por não ser de 8 bits, ao invés disso java usa Unicode.


3. R= Verdadeiro


4. R= System.out.println("One\nTwo\nThree");


5. R= A variável sum não pode ser usada fora do laço for, pois a mesca foi declarada dentro dele.


6. R= A forma prefixada atribuí o valor antes de receber o valor do operando, já a posfixada incrementa o valor após ler o valor do operando.


7. R= class SCops {
public static void main (String args []) {
int n, d, q;

n = 10;
d = 2;
if(d != 0 && (n % d) == 0)
System.out.println(d + " is a factor of " + n);

d = 0;

if(d !=  0 && (n % d) == 0)
System.out.println(d + " is a factor of " + n);

if(d !=  0 & (n % d) == 0)
System.out.println(d + " is a factor of " + n);

}
}


8. R= São promovidos a inteiros (int).


9. R= Quando queremos realizar uma conversão de maneira explicita, mesmo que podendo ter perda de informações.


10. R= public static void main(String[] args) {
		
	
		int RestoDivisao; //ele vai pegar o modulo
		int primo= 0;//ele inicializa a variavel primo
		
	
		for (int i = 1; i <= 100 ; i++) {
			for (int j = 2; j < i ; j++) {
				
				RestoDivisao = i % j; // pegando o modulo(resto)
				
				if (RestoDivisao == 0) {
					primo++; //se o resto for igual a 0 add 1 no numero primo
				}
			}
			
			if (primo == 2) { //quando sair do 2 laço for ele vai ser igual a 2 e se for igual a 2 ele vai imprimir o primo
				System.out.println(i);
				
			}
			primo = 0; //aqui é quando sair do if ele vai voltar pro laço com o a inicilização de 2 no primo até o laço acabar
		}
		
		

	}
 

11. R= Não, mais pode haver uma pequena queda de performance. Por que o java vai tentar executar uma expressão dentro dos parenteses.


12. R= Sim, em Java, um bloco define um escopo. Um bloco é uma seção de código delimitada por chaves {} e é usado para agrupar declarações e instruções. Os blocos podem ser usados em várias estruturas de controle, como loops (for, while), condicionais (if, else), e em métodos, classes e inicializadores estáticos.