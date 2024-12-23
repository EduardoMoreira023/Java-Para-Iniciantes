// Lê a entrada até um q ser recebido.
class Break2 {

public static void main (String args[]) 
throws java.io.IOException {

char ch;

for( ; ; ) { // Esse é um laço infinito que é encerrado pelo break quando o 'q' é digitado.
	ch = (char) System.in.read();
	if(ch == 'q') break;
}
System.out.println("You pressed q!");
}
}