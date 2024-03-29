/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public final class Main {

    public static void main(String[] args) {

        // Variables
        double moneyLeft;

        //Constantes
        final String NAME = "Marta";
        final String ARTICULO = "Pulsera hippy";
        final double PAGA_ABU = 1;
        final double PRECIO_PULSERA = 0.7;

        System.out.printf("Secuencia de Canicas%n====================%n");
        System.out.printf("Nombre de la canica ........: %s%n", NAME);
        System.out.printf(Locale.ENGLISH, "Dinero inicial ......: %.2f €%n", PAGA_ABU);
        System.out.printf("---%n");
        System.out.printf("Artículo a comprar ..: %s €%n", ARTICULO);
        System.out.printf(Locale.ENGLISH, "Precio artículo .....: %.2f €%n", PRECIO_PULSERA);
        moneyLeft = PAGA_ABU - PRECIO_PULSERA;
        System.out.printf("---%n");
        System.out.printf(Locale.ENGLISH, "Dinero restante .....: %.2f €%n", moneyLeft);

    }
}
