import java.util.Scanner;
import java.util.Stack;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    // 🔹 Llenar pila
    public void llenarPila(PilaDatos pd) {
        boolean seguir = true;

        while (seguir) {
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();

            pd.getPila().push(num);

            System.out.print("¿Desea continuar? (1=Sí / 0=No): ");
            int op = sc.nextInt();

            if (op == 0) {
                seguir = false;
            }
        }
    }

    // 🔹 Procesar pila
    public void procesarPila(PilaDatos pd) {

        Stack<Integer> pila = pd.getPila();
        Stack<Integer> aux = new Stack<>();

        int contadorRango = 0;
        int contadorPositivos = 0;
        int suma80_200 = 0;

        while (!pila.isEmpty()) {
            int num = pila.pop();

            // 1️⃣ Cubo si es negativo
            if (num < 0) {
                num = num * num * num;
            }

            // 2️⃣ Entre 20 y 80
            if (num >= 20 && num <= 80) {
                contadorRango++;
            }

            // 3️⃣ Positivos
            if (num > 0) {
                contadorPositivos++;
            }

            // 4️⃣ Suma entre 80 y 200
            if (num >= 80 && num <= 200) {
                suma80_200 += num;
            }

            aux.push(num);
        }

        // Restaurar pila
        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        }

        System.out.println("Cantidad entre 20 y 80: " + contadorRango);
        System.out.println("Cantidad de positivos: " + contadorPositivos);
        System.out.println("Suma entre 80 y 200: " + suma80_200);
    }
}