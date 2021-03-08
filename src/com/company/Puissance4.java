package com.company;

import java.util.Scanner;

public class Puissance4<input> {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        // Projet Gilles et Nadia

        System.out.println("Une petite partie de Puissance 4 ?");
        System.out.println();

        // creation du tableau 6x7

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

        System.out.println();
        System.out.println("A vous de jouer Joueur 1 ! Où souhaitez-vous placer votre pion (colonne comprise entre 0 et 6 ?");

        //int positionPion correspond à la position du pion dans la colonne choisie par le le joueur
        positionPion = sc.nextInt();
        sc.nextLine();


//Résultat du choix du joueur

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

        //ensuite faire jouer le joueur 2

        System.out.println("A vous de jouer Joueur 2 ! Où souhaitez-vous placer votre pion (colonne comprise entre 0 et 6 ?");

        //int positionPion correspond à la position du pion dans la colonne choisie par le le joueur
        positionPion = sc.nextInt();
        sc.nextLine();

//resultat du joueur 2

        for (int z = 5; z >= 0; z--) {
            if (puiss4[z][positionPion] == ". ") {
                puiss4[z][positionPion] = joueur2;
                break;
            } else continue; }




            //Ouverture de la boucle de nos 6 lignes pour affichage du tableau apres MAJ
            for (int k = 0; k < 6; k++) {
                //Ouverture de la boucle de nos 7 colonnes
                for (int l = 0; l < 7; l++) {
                    //Print de chaque itération de la boucle j
                    System.out.print(puiss4[k][l]);
                }
                System.out.println();
            }
            sc.close();
        }
    }