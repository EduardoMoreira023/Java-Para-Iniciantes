// Demosntra a inicialização dinâmica.

class DynInit {
public static void main (String args []) {
double radius = 4, height = 5;

double volume = 3.1416 * radius * radius * height; /* <--- volume é inicializada dinamicamente no tempo de execução. */

System.out.println("Volume is " + volume);
}
}