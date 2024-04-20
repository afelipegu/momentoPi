package notasdeclase;

import java.util.Scanner;

public class tarea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("seleccione \n" +
                "1. registro \n" +
                "2. inicio de sesion \n" +
                "3. salir");
        int opc = sc.nextInt();
        String opc2 = sc.nextLine();
        String nombre = "luis";
        String cc = "1234567";


        switch (opc) {
            case 1:
                System.out.println("registro");
                break;
            case 2:
                System.out.println("inicio de sesion");
                break;
            case 3:
                System.out.println("CHAO LOLA");
                break;
        }

        String usuario1 = "andresf";
        String apellido = "guti";
        int clave = 1234;

        System.out.println("ingrese su usuario");
        String user= sc.nextLine();

        System.out.println("ingrese su apellido");
        String userapellido= sc.nextLine();

        System.out.println("ingrese la clave");
        int userclave = sc.nextInt();

        if (user.equals(usuario1)||userapellido.equals(apellido) && userclave == clave){
            System.out.println("bienvenidos");
            System.out.println("BIENVENIDOS AL INDICE DE MASA CORPORAL "  +
                    "ingrese su peso");
            double peso = sc.nextDouble();
            System.out.println("ingrese su estatura");
            double estatura = sc.nextDouble();

            double imc = Math.round(peso / (estatura * estatura));

            System.out.println(imc);

            if (imc < 18) {
                System.out.println("su imc corresponde a bajo peso ");
            } else if (imc >= 18 && imc < 25) {
                System.out.println("su imc corresponde a un nivel de peso normal");
            } else if (imc >= 25 && imc < 30) {
                System.out.println("su imc corresponde a sobrepeso");
            } else if (imc >= 30) {
                System.out.println("su imc corresponde a obesidad");
            }else{
                System.out.println("valide credenciales");
            }
            System.out.println("seleccione cual es su IMC para recibir las recomendaciones\n" +
                    "1. bajo peso \n" +
                    "2. peso normal \n" +
                    "3. sobrepeso \n" +
                    "4. obesidad");

            int opp = sc.nextInt();

            switch (opp){
                case 1:
                    System.out.println("recomendaciones para aumentar el imc");
                    break;
                case 2:
                    System.out.println("recomendaciones medicas para mantener el imc normal");
                    break;
                case 3:
                    System.out.println("recomendaciones medicas para dismunuir el imc ");
                    break;
                case 4:
                    System.out.println("recomendaciones medicas para tratar la obesidad");
                    break;
                default:
                    System.out.println("ingrese una opcion valida ");
                    break;
            }

        }else{
            System.out.println("intente de nuevo");
        }
        Scanner ss = new Scanner(System.in);

        String a = "andresf";
        String b = "guti";
        int c =1234;

        System.out.println("ingrese su usuario");
        String usera = ss.nextLine();

        System.out.println("ingrese apellido");
        String userb = ss.nextLine();

        System.out.println("ingrese la clave");
        int userc= ss.nextInt();

        if (usera.equals(a)|| userb.equals(b) && userc == c){
            System.out.println("bienvenido");
            System.out.println("BIENVENIDOS AL INDICE DE MASA CORPORAL"  +
                    "ingrese su peso");
            double peso = sc.nextDouble();
            System.out.println("ingrese su estatura");
            double estatura = sc.nextDouble();

            double imc = Math.round(peso / (estatura * estatura));

            System.out.println(imc);

            if (imc < 18) {
                System.out.println("su imc corresponde a bajo peso ");
            } else if (imc >= 18 && imc < 25) {
                System.out.println("su imc corresponde a un nivel de peso normal");
            } else if (imc >= 25 && imc < 30) {
                System.out.println("su imc corresponde a sobrepeso");
            } else if (imc >= 30) {
                System.out.println("su imc corresponde a obesidad");
            }else{
                System.out.println("valide credenciales");
            }
            System.out.println("seleccione cual es su IMC para recibir las recomendaciones\n" +
                    "1. bajo peso \n" +
                    "2. peso normal \n" +
                    "3. sobrepeso \n" +
                    "4. obesidad");

            int opp = sc.nextInt();

            switch (opp){
                case 1:
                    System.out.println("recomendaciones para aumentar el imc");
                    break;
                case 2:
                    System.out.println("recomendaciones medicas para mantener el imc normal");
                    break;
                case 3:
                    System.out.println("recomendaciones medicas para dismunuir el imc ");
                    break;
                case 4:
                    System.out.println("recomendaciones medicas para tratar la obesidad");
                    break;
                default:
                    System.out.println("ingrese una opcion valida ");
                    break;
            }

        }else{
            System.out.println("intente de nuevo");
        }
        Scanner se = new Scanner(System.in);

        String d = "andresf";
        String e = "guti";
        int f =1234;

        System.out.println("ingrese su usuario");
        String userd = se.nextLine();

        System.out.println("ingrese apellido");
        String usere = se.nextLine();

        System.out.println("ingrese la clave");
        int userf= se.nextInt();

        if (userd.equals(d)|| usere.equals(e) && userf == f){
            System.out.println("bienvenido");
            System.out.println("BIENVENIDOS AL INDICE DE MASA CORPORAL"  +
                    "ingrese su peso");
            double peso = sc.nextDouble();
            System.out.println("ingrese su estatura");
            double estatura = sc.nextDouble();

            double imc = Math.round(peso / (estatura * estatura));

            System.out.println(imc);

            if (imc < 18) {
                System.out.println("su imc corresponde a bajo peso ");
            } else if (imc >= 18 && imc < 25) {
                System.out.println("su imc corresponde a un nivel de peso normal");
            } else if (imc >= 25 && imc < 30) {
                System.out.println("su imc corresponde a sobrepeso");
            } else if (imc >= 30) {
                System.out.println("su imc corresponde a obesidad");
            }else{
                System.out.println("valide credenciales");
            }
            System.out.println("seleccione cual es su IMC para recibir las recomendaciones\n" +
                    "1. bajo peso \n" +
                    "2. peso normal \n" +
                    "3. sobrepeso \n" +
                    "4. obesidad");

            int opp = sc.nextInt();

            switch (opp){
                case 1:
                    System.out.println("recomendaciones para aumentar el imc");
                    break;
                case 2:
                    System.out.println("recomendaciones medicas para mantener el imc normal");
                    break;
                case 3:
                    System.out.println("recomendaciones medicas para dismunuir el imc ");
                    break;
                case 4:
                    System.out.println("recomendaciones medicas para tratar la obesidad");
                    break;
                default:
                    System.out.println("ingrese una opcion valida ");
                    break;
            }
        }else{
            System.out.println("usuario bloqueado");
        }


    }
}


