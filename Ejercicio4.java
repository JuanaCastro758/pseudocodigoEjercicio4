import java.util.*;
public class Ejercicio4{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		int edad, mayor=0,menor=100;
		System.out.println("Ingresar las 20 edades: ");
		for (int i=0;i<20;i++){
            edad=scanner.nextInt();
            if (edad>=mayor){
            	mayor=edad;
            }
            if (edad<=menor){
            	menor=edad;
            }
		}
        System.out.println("mayor: "+mayor);
        System.out.println("menor: "+menor);
	}
}