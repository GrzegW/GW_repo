package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
//komentarz testowy w celu sprawdzenia pullrequests
public class HomeWorkModule4 {
    public static void main(String[] args) {
        int year = getYear();

        int Aga = 1987;
        int Natalia = 2014;
        int Ania = 2016;
        int Grzegorz = 1986;

        int ageAga = year - Aga;
        int ageNatalia = year - Natalia;
        int ageAnia = year - Ania;
        int ageGrzegorz = year - Grzegorz;

        displayAge(ageAga, ageNatalia, ageAnia, ageGrzegorz);

        int sumOfAge = sum(ageAga, ageNatalia, ageAnia, ageGrzegorz);

    }

    static int sum(int a, int b, int c, int d) {
        int sumOfAge = a + b + c + d;
        System.out.println("***********************");
        System.out.println("Wszyscy łącznie mamy " + sumOfAge + " lat!");
        return sumOfAge;
    }

    static void displayAge(int ageAga, int ageNatalia, int ageAnia, int ageGrzegorz) {
        System.out.println("Aga ma " + ageAga + " lat.");
        System.out.println("Natalia ma " + ageNatalia + " lat.");
        System.out.println("Ania ma " + ageAnia + " lat.");
        System.out.println("Grzegorz ma " + ageGrzegorz + " lat.");
    }

    static int getYear() {
        int year = LocalDate.now().getYear();
        System.out.println("Obecny rok => " + year);
        return year;
    }

@Test
void sum() {
    //given
    int a = 37;
    int b = 36;
    int c = 9;
    int d = 7;
    //when
    int sumOfAge = sum(a, b, c, d);
    //then
    assertEquals(89, sumOfAge);
    }


}
