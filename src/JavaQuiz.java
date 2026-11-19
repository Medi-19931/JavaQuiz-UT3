import java.util.Scanner;

public class JavaQuiz {
    public static void main(String[] args) {
        int aciertos=0;
        int opcionMenu;
        char respuesta;
        int correcta;
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

                    
                    System.out.println("--------------------------- RONDA 1 -----------------------------------------------");
                    System.out.println("Pregunta 1. ¿Qué tipo de dato en Java se utiliza principalmente para almacenar números con decimales?");
                    System.out.println("A) int B) float C) boolean");
                    System.out.println("Respuesta: ");
                    respuesta=sc.next().toUpperCase().charAt(0); // Lee la letra y la pasa a mayúscula automáticamente
                    switch (respuesta) {
                        case 'A':
                            System.out.println(ROJO+"¡Incorrecto!"+RESET);
                            break;
                        case 'B':
                            correcta=1;
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
                    System.out.println("Pregunta 2. ¿Cuál de las siguientes palabras reservadas se utiliza en Java para declarar una constante (un valor que no puede cambiar)?");
                    System.out.println("A) constant B) static C) final");
                    System.out.println("Respuesta: ");
                    respuesta=sc.next().toUpperCase().charAt(0); // Lee la letra y la pasa a mayúscula automáticamente
                    switch (respuesta) {
                        case 'A':
                            System.out.println(ROJO+"¡Incorrecto!"+RESET);
                            break;
                        case 'B':
                            
                            System.out.println(ROJO+"¡Incorrecto!"+RESET);
                            break;
                        case 'C':
                            correcta=1;
                            aciertos=aciertos+correcta;
                            System.out.println(VERDE+"¡Correcto!"+RESET);
                            
                            break;
                    
                        default:
                            System.out.println("Solo se acepta A-B-C,no ganas ningun punto");
                            break;
                    }
                    System.out.println("Pregunta 3. ¿Qué operador se utiliza en Java para evaluar si dos valores son estrictamente iguales en una condición?");
                    System.out.println("A) == B) = C) !=");
                    System.out.println("Respuesta: ");
                    respuesta=sc.next().toUpperCase().charAt(0); // Lee la letra y la pasa a mayúscula automáticamente
                    switch (respuesta) {
                        case 'A':
                            correcta=1;
                            aciertos=aciertos+correcta;
                            System.out.println(VERDE+"¡Correcto!"+RESET);
                            break;
                        case 'B':
                             System.out.println(ROJO+"¡Incorrecto!"+RESET);
                            break;
                        case 'C':
                            System.out.println(ROJO+"¡Incorrecto!"+RESET);
                            
                            break;
                    
                        default:
                            System.out.println("Solo se acepta A-B-C,no ganas ningun punto");
                            break;
                    }

                    System.out.println("--------------------------- RONDA 2 -----------------------------------------------");
        
                    System.out.println("Pregunta 4. ¿Qué estructura de bucle en Java se utiliza principalmente cuando sabemos exactamente cuántas veces queremos repetir un bloque de código?");
                    System.out.println("A) while B) for C) do-while");
                    System.out.println("Respuesta: ");
                    respuesta=sc.next().toUpperCase().charAt(0); // Lee la letra y la pasa a mayúscula automáticamente
                    switch (respuesta) {
                        case 'A':
                            System.out.println(ROJO+"¡Incorrecto!"+RESET);
                            break;
                        case 'B':
                            correcta=1;
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
                    System.out.println("Pregunta 5. ¿Cómo se denomina en Java a una estructura de datos estática que permite almacenar múltiples elementos del mismo tipo de forma secuencial?");
                    System.out.println("A) Array B) Scanner C) switch");
                    System.out.println("Respuesta: ");
                    respuesta=sc.next().toUpperCase().charAt(0); // Lee la letra y la pasa a mayúscula automáticamente
                    switch (respuesta) {
                        case 'A':
                            correcta=1;
                            aciertos=aciertos+correcta;
                            System.out.println(VERDE+"¡Correcto!"+RESET);
                            
                            break;
                        case 'B':
                            System.out.println(ROJO+"¡Incorrecto!"+RESET);
                            
                            break;
                        case 'C':
                            System.out.println(ROJO+"¡Incorrecto!"+RESET);
                            
                            break;
                    
                        default:
                            System.out.println("Solo se acepta A-B-C,no ganas ningun punto");
                            break;
                    }
                    System.out.println("Pregunta 6. ¿Qué palabra clave se utiliza en la cabecera de un método en Java para indicar que este pertenece a la clase en sí y no necesita una instancia o bjeto para ser ejecutado?");
                    System.out.println("A) void B) private C) static");
                    System.out.println("Respuesta: ");
                    respuesta=sc.next().toUpperCase().charAt(0); // Lee la letra y la pasa a mayúscula automáticamente
                    switch (respuesta) {
                        case 'A':
                            System.out.println(ROJO+"¡Incorrecto!"+RESET);
                            break;
                        case 'B':
                            System.out.println(ROJO+"¡Incorrecto!"+RESET);
                            break;
                        case 'C':
                            
                            correcta=1;
                            aciertos=aciertos+correcta;
                            System.out.println(VERDE+"¡Correcto!"+RESET);
                            break;
                    
                        default:
                            System.out.println("Solo se acepta A-B-C,no ganas ningun punto");
                            break;
                    }

                    System.out.println("============= RESULTADO ==============");
                    System.out.println("Respuesta correcta: "+aciertos+" de 6.");
                    System.out.println("Fin del curso.");


                    


                    
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
