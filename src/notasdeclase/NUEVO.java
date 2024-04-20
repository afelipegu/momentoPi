package notasdeclase;

import java.util.Scanner;

public class NUEVO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

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

        if (usera.equals(d)|| userb.equals(e) && userf == f){
            System.out.println("bienvenido");
        }else{
            System.out.println("usuario bloqueado");
        }

    }
}