/* 
Este programa tenta declarar uma vari�vel em um escopo interno com o mesmo nome de uma definida em um escopo externo.

*** Esse programa n�o ser� compilado. ***

class NestVar{
public static void main(String args []) {
int count; //  <-------------------------- Declarando count!

for (count = 0; count < 10; count = count +1) {
System.out.println("This is count: " + count);

int count; // inv�lido!!!   < ----------------- N�o pode declarar count novamente pq ela j� foi declarada.
for (count = 0; count < 2; count ++)
System.out.println("This is program is in error!");
}
}
}