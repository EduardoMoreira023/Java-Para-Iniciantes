// Demostra o tempo de vida de uma vari�vel.

class VarInitDemo{
public static void main(String args []) {
int x;

for (x = 0; x < 3; x++) {
int y =  -1; // y ser� inicializada sempre que entrarmos no bloco
System.out.println("y is: " + y); // essa 
y = 100;
System.out.println("y is now: " + y);
}
}
}