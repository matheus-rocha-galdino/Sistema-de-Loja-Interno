/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author mathr
 */
public class ViaCep {

    public static JSONObject buscarCep(String CEP) {
        JSONObject endereco = new JSONObject();
        try {
            URL url = new URL("https://viacep.com.br/ws/" + CEP + "/json/");
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            InputStreamReader in = new InputStreamReader(conexao.getInputStream());
            BufferedReader br = new BufferedReader(in);
            StringBuilder sb = new StringBuilder();
            String output;
            while ((output = br.readLine()) != null) {
                sb.append(output);
            }
            endereco = new JSONObject(sb.toString());
            conexao.disconnect();
        } catch (IOException | JSONException e) {
            JOptionPane.showMessageDialog(null, "Problema na recuperação \n " + e);
        }
        return endereco;

    }
}
