package com.company;

import java.util.Scanner;

public class Puissance4<input> {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        // Projet Gilles et Nadia

        System.out.println("Une petite partie de Puissance 4 ?");
        System.out.println();

        // Creation du tableau 6x7

        String puiss4[][] = {{". ", ". ", ". ", ". ", ". ", ". ", ". "},
                {". ", ". ", ". ", ". ", ". ", ". ", ". "},
                {". ", ". ", ". ", ". ", ". ", ". ", ". "},
                {". ", ". ", ". ", ". ", ". ", ". ", ". "},
                {". ", ". ", ". ", ". ", ". ", ". ", ". "},
                {". ", ". ", ". ", ". ", ". ", ". ", ". "}};

        //Ouverture de la boucle de nos 6 lignes pour affichage du tableau
        for (int i = 0; i < 6; i++) {
            //Ouverture de la boucle de nos 7 colonnes
            for (int j = 0; j < 7; j++) {
                //Print de chaque itération de la boucle j
                System.out.print(puiss4[i][j]);
            }
            //Retour à la ligne après chaque itération de la boucle i
            System.out.println();
        }
        //Affectation d'un index à chaque colonne
        System.out.println("0 1 2 3 4 5 6");

        // Déclaration des joueurs, des pions et de la position choisie par le joueur
        String joueur1 = "x ";
        String joueur2 = "o ";
        int positionPion;
        Boolean victoire = false;

        System.out.println();

        //Début de la partie, démarrage de la "Grande" boucle pour gérer les 42 coups
        for (int x = 0; x < 42; x++) {
            System.out.println("A vous de jouer Joueur 1 ! Où souhaitez-vous placer votre pion (colonne comprise entre 0 et 6 ?");

            //int positionPion correspond à la position du pion dans la colonne choisie par le joueur
            positionPion = sc.nextInt();
            sc.nextLine();


        //Bloc joueur 1 : boucle pour placer le pion sur la bonne ligne de la colonne choisie par le joueur
            for (int z = 5; z >= 0; z--) {
                if (puiss4[z][positionPion] == ". ") {
                    puiss4[z][positionPion] = joueur1;
                    break;
                }
            }

            //Ouverture de la boucle de nos 6 lignes pour affichage du tableau apres MAJ
            for (int i = 0; i < 6; i++) {
                //Ouverture de la boucle de nos 7 colonnes
                for (int j = 0; j < 7; j++) {
                    //Print de chaque itération de la boucle j
                    System.out.print(puiss4[i][j]);
                }
                System.out.println();
            }
            System.out.println("0 1 2 3 4 5 6");
            System.out.println();

            //Création des boucles pour vérifier les conditions de victoire. Pour une position donnée, on vérifie la présence des mêmes pions sur les 3 cases adjacentes
// dans la boucle ci dessous , "l" correspond a lignes et "c" a colonnes.

            for (int l = 5; l >= 3; l--) {
                for (int c = 0; c < 4; c++) {
                    if (puiss4[l][c] == joueur1 &&
                            puiss4[l - 1][c] == joueur1 &&
                            puiss4[l - 2][c] == joueur1 &&
                            puiss4[l - 3][c] == joueur1 ||
                            puiss4[l][c] == joueur1 &&
                                    puiss4[l][c + 1] == joueur1 &&
                                    puiss4[l][c + 2] == joueur1 &&
                                    puiss4[l][c + 3] == joueur1) {
                        victoire=true;
                        System.out.print("Victoire!! Bravo !! T'es la meilleure !! \nFIN DE PARTIE");
                    }
                }
            }
            System.out.println();

           if(victoire ==true){
                break;
            }


            //Bloc joueur 2

            System.out.println("A vous de jouer Joueur 2 ! Où souhaitez-vous placer votre pion (colonne comprise entre 0 et 6 ?");

            //int positionPion correspond à la position du pion dans la colonne choisie par le le joueur
            positionPion = sc.nextInt();
            sc.nextLine();

            //resultat du joueur 2

            for (int z = 5; z >= 0; z--) {
                if (puiss4[z][positionPion] == ". ") {
                    puiss4[z][positionPion] = joueur2;
                    break;
                } else continue;
            }

            //Ouverture de la boucle de nos 6 lignes pour affichage du tableau apres MAJ
            for (int k = 0; k < 6; k++) {
                //Ouverture de la boucle de nos 7 colonnes
                for (int m = 0; m < 7; m++) {
                    //Print de chaque itération de la boucle j
                    System.out.print(puiss4[k][m]);
                }
                System.out.println();
            }
            System.out.println("0 1 2 3 4 5 6");
            System.out.println();

            for (int l = 5; l >= 3; l--) {
                for (int c = 0; c < 4; c++) {
                    if (puiss4[l][c] == joueur2 &&
                            puiss4[l - 1][c] == joueur2 &&
                            puiss4[l - 2][c] == joueur2 &&
                            puiss4[l - 3][c] == joueur2 ||
                            puiss4[l][c] == joueur2 &&
                                    puiss4[l][c + 1] == joueur2 &&
                                    puiss4[l][c + 2] == joueur2 &&
                                    puiss4[l][c + 3] == joueur2) {
                        victoire=true;
                        System.out.print("Victoire!! Bravo !! T'es la meilleure !! \nFIN DE PARTIE");
                    }
                }
            }
            System.out.println();

            if(victoire ==true){
               break;
            }


        }
        sc.close();
    }
}