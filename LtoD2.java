// *** Esse programa n�o ser� compilado. ***
class LtoD {
public static void main(String args){
long L;
double D;
D = 100123285.0;
L = D; // Inv�lido <------- N�o h� convers�o autom�tica de double para long
System.out.println("L and D: " + L + " " + D);
}
}
