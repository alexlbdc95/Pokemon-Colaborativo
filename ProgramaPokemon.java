/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package programapokemon;

/**
 *
 * @author Alex
 */
import java.util.Scanner;
public class ProgramaPokemon {
public static void main(String[] args) {
      Scanner s = new Scanner(System.in);


        
        
        Pokemon pikachu = new Pokemon("Pikachu", 10, 50, 20, 10);
        Pokemon charmander = new Pokemon("Charmander", 8, 40, 15, 8);
        
        System.out.println(pikachu.getNombre() + " ataca a " + charmander.getNombre() + ":");
        pikachu.atacar(charmander);
        System.out.println(charmander.getNombre() + " tiene " + charmander.getVida() + " puntos de vida.");
        
        System.out.println(charmander.getNombre() + " ataca a " + pikachu.getNombre() + ":");
        charmander.atacar(pikachu);
        System.out.println(pikachu.getNombre() + " tiene " + pikachu.getVida() + " puntos de vida.");
    }
}
