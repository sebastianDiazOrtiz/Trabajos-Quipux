 import java.util.Scanner;
    public class SistemaEstudiantiljava {

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            String usuario;
            String contrasena;

            double nota = 3.0;
            boolean continuar = true;

            while (continuar) {

                System.out.println("SISTEMA ESTUDIANTIL UCO");

                System.out.print("Usuario:");
                usuario = teclado.nextLine();

                if (usuario.equalsIgnoreCase("salir")) {
                    continuar = false;
                    break;
                }

                System.out.print("Contrasena: ");
                contrasena = teclado.nextLine();

                if (usuario.equals("profesor")
                        && contrasena.equals("12345")) {


                    System.out.println("Bienvenido profesor");
                    System.out.println("1. Ver nota");
                    System.out.println("2. Cambiar nota");

                    int opcion = teclado.nextInt();
                    teclado.nextLine(); // Limpiar el buffer de entrada

                    if (opcion == 1) {

                        System.out.println("La nota es: " + nota);

                    } else if (opcion == 2) {

                        System.out.print("Ingrese la nueva nota: ");
                        nota = teclado.nextDouble();
                        teclado.nextLine(); // Limpiar el buffer de entrada

                        System.out.println("¡Nota actualizada con éxito a: " + nota + "!");
                    }

                } else if (usuario.equals("estudiante")
                        && contrasena.equals("12345")) {

                    System.out.println("\n--- PERFIL ESTUDIANTE ---");
                    // Muestra siempre la nota más reciente almacenada en la variable 'nota'
                    System.out.println("Tu nota actualizada en el sistema es: " + nota);

                } else {
                    System.out.println("\nUsuario o contraseña incorrectos.");
                }
            }
        }
    }

