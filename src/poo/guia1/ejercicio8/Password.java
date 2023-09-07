package poo.guia1.ejercicio8;
import java.util.Random;

public class Password {
    private StringBuilder password;


    public StringBuilder setPassword(int longitud){
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        if (longitud < 8){
            longitud = 8;  //por defecto sea 8
        }

        for (int i = 0; i < longitud; i++){
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            password.append(caracterAleatorio);
        }

        this.password = password;

        return password;
    }

    public StringBuilder getPassword(){
        return this.password;
    }

    public String seguridadPassword(){
        int contMayus = 0;
        int contMinus = 0;
        int contNum = 0;
        for (int i = 0; i < password.length(); i++){
            char caracter = password.charAt(i);

            if (Character.isDigit(caracter)){
                contNum++;
            } else if(Character.isUpperCase(caracter)){
                contMayus++;
            } else contMinus++;
        }

        if (contNum >= 2 && contMayus >= 2 && contMinus > 1){
            return "Fuerte";
        } else return "Debil";

    }


}
