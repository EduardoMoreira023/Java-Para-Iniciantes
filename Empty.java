// Partes de for podem estar vazias.

class Empty {
public static void main (String args []){
int i;

for(i = 0; i < 10;) {   //<=========== a expressão de iteração está faltando.
System.out.println("Pass #" + i);
i++;
}
}
}