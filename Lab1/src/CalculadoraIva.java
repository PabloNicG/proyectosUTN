import java.util.Scanner;

public class CalculadoraIva {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        double producto;
        int opc;
        double resultProd;
        boolean opcBool,productoBool;
        boolean terminarCalculadora=false;
        do{
            System.out.println("Ingrese que opciones desea con el producto");
            System.out.println("1)SUMAR IVA DEL PRODUCTO ");
            System.out.println("2)RESTAR IVA DEL PRODUCTO ");
            System.out.println("3)MULTIPLICAR IVA CON  EL PRODUCTO ");
            System.out.println("4)DIVIDIR EL  IVA DEL PRODUCTO ");
            System.out.println("5)SALIR ");

            do{
                opcBool=true;
                System.out.print("Ingrese que operacion desea realizar: ");
                opc=src.nextInt();
                if (opc<0 || opc>6){
                    System.out.println("La opcion ingresada es incorrecta ");
                    opcBool=false;
                }
                if (opc==5){
                    terminarCalculadora=true;
                    break;
                }
            }while(!opcBool);
            if(terminarCalculadora){


                System.out.println("-----------------------------------------------");
                System.out.println("Saliendo.....");
                System.out.println("-----------------------------------------------");
                break;
            }

            else{
                do{
                    System.out.print("Ingrese el precio del producto ");
                    System.out.println("Si ingresa [0] se termina el programa");
                    producto=src.nextDouble();
                    productoBool=true;
                    if (producto<0){
                        System.out.println("No puede Ingresar un producto con precion negativo");
                        productoBool=false;
                    }else if(producto==0){
                        productoBool=true;
                        terminarCalculadora=true;
                    }
                }while(!productoBool);

                if(!terminarCalculadora){
                    switch(opc){
                        case 1: resultProd=sumaIva(producto);
                            System.out.println("El resultado del producto + el iva es "+ resultProd);
                            break;
                        case 2: resultProd=restaIva(producto);
                            System.out.println("El resultado del producto - el iva es "+ resultProd);
                            break;
                        case 3: resultProd=multiplicaciónIva(producto);
                            System.out.println("El resultado del producto * el iva es "+ resultProd);
                            break;
                        case 4: resultProd=división(producto);
                            System.out.println("El resultado del producto / el iva es  "+ resultProd);
                            break;
                        case 5: terminarCalculadora=true;
                            break;
                    }
                }else{

                    System.out.println("-----------------------------------------------");
                    System.out.println("Saliendo.....");
                    System.out.println("-----------------------------------------------");
                    break;
                }

            }

            System.out.println("-----------------------------------------------");
            System.out.println("      ");
        }while(producto==0);

    }
    public static double sumaIva(double producto){
        double iva=producto*0.21;
        double productoConIva=producto+iva;
        return productoConIva;
    }
    public static double restaIva (double producto){
        double iva=producto*0.21;
        double restarIva=producto-iva;
        return restarIva;
    }
    public static double multiplicaciónIva(double producto){
        double iva=producto*0.21;
        double multIvaProducto=producto*iva;
        return multIvaProducto;
    }
    public static double división(double producto){
        double iva=producto*0.21;
        double divIva=producto/iva;
        return divIva;
    }

}
