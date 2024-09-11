// Exibe raízes quadradas de 1 a 99 e o erro de arredondamentos.

class SqrRoot {
public static void main (String args []) {
	double num, sroot, rerr;

for(num = 1.0; num < 100; num++) {
	sroot = Math.sqrt (num);
	System.out.println("Square root of " + num + " is " + sroot);

// calcula o erro de arredondamento
rerr = num - (sroot * sroot);
System.out.println("Rouding error is " + rerr);
System.out.println();
}
}
}