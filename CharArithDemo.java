// Variáveis de caracteres podem ser tratadas como inteiros.


class CharArithDemo {
public static void main (String args []) {

char ch;

ch = 'X';

System.out.println("ch contains " + ch);

ch++;  // incrementa ch <-------------------- Um char pode ser incrementado.

System.out.println("ch is now " + ch);

ch = 90; // dá a ch o valor Z <---------- Um char pode receber um valor inteiro.

System.out.println("ch is now " + ch);

}
}