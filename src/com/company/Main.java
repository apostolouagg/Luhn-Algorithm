package com.company;

import java.util.*;

public class Main {

    /*O algorithmos tou luhn xrisimopoieitai gia na apodeixthei h egkurotita tou arithmou mias kartas.
      Arxika, ksekiname apo to 1o psifio kai diplasiazoume ana 2 psifia.
      Ystera an apo to diplasiasmo prokupsei dipsifios arithmos, prosthetoume ta psifia tou metaksi tous (px 5*2=10, 1+0=1).
      Telos, athroizoume ta psifia oloklirou tou neou arithmou kartas kai to diairoume me 10 (mod 10).
      An to upoloipo einai 0 tote h karta einai egkurh.*/

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //gia na paroume to input tou xristi

        System.out.println("Dwse arithmo kartas: ");
        String cardNum = reader.next();
        int[] array = new int[cardNum.length()]; //array sto megethos tou input string
        //voithitikes metablites
        int i =0;
        int char1;
        int char2;

        for (; i < cardNum.length(); i++)
        {
            array[i] = Integer.parseInt(String.valueOf(cardNum.charAt(i))); //basoume ena ena ta stoixeia tou string sto array se morfi integer.
            //To .charAt mas dinei char opote pairnw to string value tou gia na mporw na to kanw integer kai na to balw sto array
        }

        for (i = 0; i < cardNum.length(); i = i+2) //paw ana 2 gia na kanw ton diplasiasmo
        {
            array[i] = array[i] * 2; //diplasiasmos
            if(array[i] > 9) //an dld uparxoun 2 psifia gia na boresw na prosthesw kai na mhn petaksei error
            {
                /* to array[i] einai integer. Gia na mporesw na xwrisw ta 2 psifia pairnw to string value kai xrisimopoiw to .charAt(...). Omws to .charAt mas dinei pisw
                tupo char. Opote pairnw to string value olou autou kai meta to pairnw to integer value tou gia na mporw ustera na kanw thn prosthesi kai antikatastasi */
                char1 = Integer.parseInt(String.valueOf(String.valueOf(array[i]).charAt(0)));
                char2 = Integer.parseInt(String.valueOf(String.valueOf(array[i]).charAt(1)));
                array[i] = char1 + char2; //prosthesi kai antikatastasi
            }
        }

        int sum = 0; //h metabliti gia to athroisma
        for (i = 0; i < cardNum.length(); i++)
        {
            sum = sum + array[i]; //athroisma
        }

        if(sum%10 == 0) //an to ypoloipo einai 0
        {
            System.out.println("H karta einai egkurh!");
        } else {
            System.out.println("H karta einai akurh!");
        }
    }
}
