/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author mathr
 */
public final class Singleton {

    private static Singleton instance;
    public int value;

    private Singleton(int value) {
        this.value = value;
    }

    public static Singleton getInstance(int value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
