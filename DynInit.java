// Demosntra a inicializa��o din�mica.

class DynInit {
public static void main (String args []) {
double radius = 4, height = 5;

double volume = 3.1416 * radius * radius * height; /* <--- volume � inicializada dinamicamente no tempo de execu��o. */

System.out.println("Volume is " + volume);
}
}