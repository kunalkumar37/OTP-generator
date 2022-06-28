import java.util.*;
public class NewClass{
    public static void main(String[] args){
        int length=10;
        System.out.println(geek_password(length));

    }
    static char[] geek_password(int len){
        System.out.println("generating password using random ();");
        System.out.println("Your new password is :");

        String capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_chars="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String symbols="!@#$%^&*_=+-/.?<>)";
        String values=capital_chars+small_chars+numbers+symbols;
        Random rndm_metRandom=new Random();
        char[] password=new char[len];
        for(int i=0;i<len;i++){
            password[i]=values.charAt(rndm_metRandom.nextInt(values.length()));

        }
        return password;

        
    }
}