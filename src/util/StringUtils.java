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
public class StringUtils {

    public static String converteDataParaOBanco(String dataCampo) {
        //26/04/2001
        String data[] = dataCampo.split("/");
        String dataBD = (data[2] + "-" + data[1] + "-" + data[0]);
        //2001-04-26
        return dataBD;
    }
    
    public static String converteDataParaOPrograma(String dataBD) {

        //2001-04-26
        String data[] = dataBD.split("-");
        String dataCampo = (data[2] +""+ data[1] + "" + data[0]);
        //26042001
        return dataCampo;
    }

    public static String limpaValorParaOBanco(String valor) {
        valor = valor.replaceAll("[^0-9]+", "");
        return valor;
    }
}
