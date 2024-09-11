// retira mais uma parte do laço for.

class Empty2 {
public static void main (String args []) {
int i;

i = 0;
for(; i < 10; ) { //<== A empressão de inicialização é retirada do laço.
System.out.println("Pass #" + i);
i++;
}

}
}