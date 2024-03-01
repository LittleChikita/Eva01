/*
 * Copyright (C) 2024 Josias Junior Santos <josiajrsantos@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pacotinho;
import java.util.Scanner;
/**
 *
 * @author Josias Junior Santos <josiajrsantos@gmail.com>
* @date 24/02/2024
* @brief Class somaNumeros
 */
public class somaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number1;
        int number2;
        int sum;
        
        System.out.print("Informe o primeiro número inteiro: ");
        number1 = sc.nextInt();
         System.out.print("Informe o segundo número inteiro: ");
        number2 = sc.nextInt();
        
        sum = number1 + number2;
        
         System.out.printf("A soma é %d\n", sum);
    }
}
