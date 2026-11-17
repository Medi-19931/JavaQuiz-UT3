import java.util.Scanner;

public class JavaQuiz {
    public static void main(String[] args) {
        int aciertos=0;
        int opcionMenu;
        char respuesta;
        int i=0;
        Scanner sc =new Scanner(System.in);
        final String ROJO = "\u001B[31m";
        final String VERDE = "\u001B[32m";
        final String RESET = "\u001B[0m";
        
        
        
        do {
            
            System.out.println("========== JAVAQUIZ ============");
            System.out.println("Concurso de preguntas sobre Java");
            System.out.println("Responde escribiendo A, B o C.");
            System.out.println("================================");
            System.out.println("1. INICIAR");
            System.out.println("2. SALIR");
            System.out.println("================================");
            System.out.println("Ingrese la opcion que desee realizar 1 o 2: ");
            opcionMenu=sc.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("PREGUNTAS");
                    System.out.println("========== JAVAQUIZ ==========");
                    System.out.println("Concurso de preguntas sobre Java");

                    
                    System.out.println("--------------------------- RONDA "+(i+1)+" -----------------------------------------------");
                    System.out.println("Pregunta 1. ¿Qué tipo de dato en Java se utiliza principalmente para almacenar números con decimales?");
                    System.out.println("A) int B) float C) boolean");
                    System.out.println("Respuesta: ");
                    respuesta=sc.next().toUpperCase().charAt(0); // Lee la letra y la pasa a mayúscula automáticamente
                    switch (respuesta) {
                        case 'A':
                            System.out.println(ROJO+"¡Incorrecto!"+RESET);
                            break;
                        case 'B':
                            int correcta=1;
                            aciertos=aciertos+correcta;
                            System.out.println(VERDE+"¡Correcto!"+RESET);
                            break;
                        case 'C':
                            System.out.println(ROJO+"¡Incorrecto!"+RESET);
                            
                            break;
                    
                        default:
                            System.out.println("Solo se acepta A-B-C,no ganas ningun punto");
                            break;















                    }


                    
                    break;
                case 2:
                    
                    break;
            
                default:
                    System.out.println("INGRESE SOLO 1 SI QUIERE INICIAR EL QUIZ Y 2 PARA SALIR ");
                    break;
            }
            

            
        } while (opcionMenu!=2);
        
        System.out.println("USTED ABANDONO EL JUEGO");
        sc.close();
    }
}
