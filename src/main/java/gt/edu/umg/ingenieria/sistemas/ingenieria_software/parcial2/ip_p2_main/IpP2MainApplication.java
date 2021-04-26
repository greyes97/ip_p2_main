package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.ip_p2_main;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.ip_p2_main.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class IpP2MainApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IpP2MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        OrderMethods order = new OrderMethods();
        Scanner scanner = new Scanner(System.in);
        if(args.length == 0) {
            System.out.println("Ingresa un vector");
        }else{
            try {
                System.out.println("Elige un metodo");
                System.out.println("Metodo bubble (vector String)\t 1");
                System.out.println("Metodo Circle (vector de numeros)\t 2");
                System.out.println("Metodo Comb (vector de numeros)\t 3");
                System.out.println("Metodo head (vector de numeros)\t 4");
                System.out.println("Metodo Shell (vector de numeros)\t 5");
                System.out.println("Para salir \t 0");
                String opc = scanner.nextLine();
                if(opc.equals("1")){
                    order.order(new BubbleMethod(),args);
                }else if(opc.equals("2")){
                    order.order(new CircleMethod(),args);
                }else if(opc.equals("3")){
                    order.order(new CombMethod(),args);
                }else if(opc.equals("4")){
                    System.out.println("Metodo Head Shell");
                    printArry(args);
                    order.order(new HeadMethod(),args);
                }else if(opc.equals("5")){
                    System.out.println("Metodo Head Sort");
                    printArry(args);
                    order.order(new ShellMethod(),args);
                }else if(opc.equals("0")){
                    System.exit(0);
                }else{
                    System.out.println("Ha elegido una opcion incorrecta");
                }
            }catch (Exception ex){
                System.out.println("El array no es el correcto para esta opcion");
            }
        }
    }

    public void printArry(String[] args){
        for (String items : args){
            System.out.println(items);
        }
    }
}
