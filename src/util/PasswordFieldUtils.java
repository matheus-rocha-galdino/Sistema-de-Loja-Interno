/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author mathr
 */
public class PasswordFieldUtils {

    public static boolean confirmaSenhaIguais(char[] senha1, char[] senha2) {
        String textoSenha1 = new String(senha1);
        String textoSenha2 = new String(senha2);

        if (textoSenha1.equals(textoSenha2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean confirmaSenhaIguais(String senha1, char[] senha2) {
        String textoSenha2 = new String(senha2);
        if (senha1.equals(textoSenha2)) {
            return true;
        } else {
            return false;
        }
    }

}
