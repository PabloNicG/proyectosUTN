import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {

    public static void main(String[] args) {

        String variable = "";
        //Parametros para validar
        /* --------------------------

        //validaciones de letras
        \\w
        //validacion de espacio
        \\s
        //validacion de digitos
        \\d

        //validacion de carecteres especiales  TOMAR POR SEPARADO
        \\°\\-\\ñ\\Ñ\\á\\Á\\é\\É\\í\\Í\\ó\\Ó\\ú\\Ú

                À-ÿ\\ñ\\Ñ\\s
        -------------------------- */

        //Ejemplo String patronOrden = "[\\w\\s\\d]{1,3}"; validacion de letras y numeros con espacios

        //Validaciones
        String patronOrden = "[0-9]{1,3}"; // compara numero de 0-9 y tiene una entrada de 1 o tres caracteres
        String orden = variable; // obtiene el el valor de la variable. Cambiar comp_TXT_bdOrden por la variable
        Pattern patternOrden = Pattern.compile(patronOrden);//modificar nombre
        Matcher matcherOrden = patternOrden.matcher(orden);//modificar nombre


        //funcion para comparar. Es una variable booleana
        matcherOrden.matches();

        /* La voy a utilizar para el ejemplo

        //Validacion de CUIL
        String patroncuil = "[0-9]{11}";
        String cuil = variable;
        Pattern patternCUIL = Pattern.compile(patroncuil);
        Matcher matcherCUIL = patternCUIL.matcher(cuit);
        */

        //Validacion de TELEFONO
        String patrontel = "[0-9]{7,10}";
        String tel = variable;
        Pattern patternTEL = Pattern.compile(patrontel);
        Matcher matcherTEL = patternTEL.matcher(tel);


        //Validacion solo Letras
        String patronletras = "[A-Za-z]{7,10}"; //a-z minusculas A-Z Mayusculas
        String let = variable;
        Pattern patternLET = Pattern.compile(patronletras);
        Matcher matcherLET = patternLET.matcher(let);

        //validacion de correo
        String patronmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String mail = variable;
        Pattern patternMAIL = Pattern.compile(patronmail);
        Matcher matcherMAIL = patternMAIL.matcher(mail);

        //matcherMAIL es un booleano (true o false)
        String patronNomencla = "[0-9]{22}";
        String nomencla = variable;
        Pattern patternNomencla = Pattern.compile(patronNomencla);
        Matcher matcherNomencla = patternNomencla.matcher(nomencla);

        //DOMINIO PATENTE XXX 000 - XX 000 XX - - X 000 XXX EN LA MISMA EXPRESION INCLUYO A LOS DOS FORMATOS DE PATENTE DE AUTO Y MOTO
        String patronDominio = "[A-Z]{3}\\d{3}|[A-Z]{2}\\d{3}[A-Z]{2}|[A-Z]\\d{3}[A-Z]{3}"; // compara numero de 0-9 y tiene una entrada de 8 a 10 caracteres
        String dominio = variable;
        Pattern patternDominio = Pattern.compile(patronDominio);
        Matcher matcherDominio = patternDominio.matcher(dominio);


        // Ejemplo - Comprobar la validacion
        if (matcherMAIL.matches()) {
            //Messagebox.show("Todo bien");
        } else {
            //Messagebox.show("Por favor ingresar el correo correctamente");
        }


        /// Ejemplo practico
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un CUIT: ");
        String cuit = scanner.nextLine();


        String patroncuil = "[0-9]{11}";
        String cuil = cuit;

        Pattern patternCUIL = Pattern.compile(patroncuil);
        Matcher matcherCUIL = patternCUIL.matcher(cuit);

        if (matcherCUIL.matches()) {
            System.out.println("Es valido");
        } else {
            System.out.println("Es invalido, ingrese la CUIT nuevamente.");

        }
    }
}
