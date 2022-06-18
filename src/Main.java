public class Main {

        public static int Suma (int a, int b, int c) {

        int result;

        result = a + b + c;

        return result;

        }



        public static class Coche {
                public int doors = 0;

                public void AñadirPuerta(){
                        this.doors++;
                }
        }

        public static void main (String[] args) {
                int a, b, c;

                a = 10;
                b = 10;
                c = 10;
                System.out.println("El resultado de la suma es: " + Suma(a,b,c));

                Coche miCoche = new Coche();
                miCoche.AñadirPuerta();
                miCoche.AñadirPuerta();
                miCoche.AñadirPuerta();

                System.out.println("Mi Coche tiene" + " " + miCoche.doors + " puertas");
        }
}