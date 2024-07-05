//Demonstra o escopo de bloco.


class ScopeDemo {
public static void main (String args []) {

int x; // conhecida pelo c�digo dentro do main()

x = 10;
if (x == 10) { // inicia novo escopo
    int y = 20; // conhecida apenas nesse bloco

// tanto "x" quanto "y" s�o conhecidas aqui.

System.out.println("x and y: " + x + " " + y);
x = y * 2;
}

// y = 100; // Erro! Y n�o � conhecida aqui <-- aqui y est� fora do seu escopo.

// x ainda � conhecida aqui.
System.out.println("x is " + x);
}
}