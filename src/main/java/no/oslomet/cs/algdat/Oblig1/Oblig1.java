package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if(a ==null || a.length==0)
            throw new NoSuchElementException ("Tabell er tom");
        int m = 0;
        int maksverdi = a[m];

        for( int i = 1; i <a.length; i++){
            /* */ if(a[i-1]> a[i]){
                int temp = a[i-1];
                a[i-1]= a[i];
                a[i] = temp;

            }

        }
        return a[a.length-1];

    }

    public static int ombyttinger(int[] a) {
        if(a ==null)
            throw new NoSuchElementException ("Tabell er tom");
        int antall = 0;
        int m = 0;
        int maksverdi = a[m];

        for( int i = 1; i <a.length; i++){
            if(a[i-1]> a[i]){
                int temp = a[i-1];
                a[i-1]= a[i];
                a[i] = temp;
                antall++;

            }else{

            }
        }
        //}

        return antall;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        if (a.length==0){
            return 0;
        }
        int antallUlike=1;
        for (int i =0; i<a.length-1; i++){
            if (a[i]>a[i+1]){
                throw new IllegalStateException("Arrayet er ikke sortert");
            }
            else {
                if (a[i]!=a[i+1]){
                    antallUlike++;
                }
            }
        }
        return antallUlike;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {

        if (a.length==0){
            throw new UnsupportedOperationException("tabellen er tom!");
            return 0;
        }
        int antallUlikeSorter=0;
        for (int i=0; i<a.length; i++){
            boolean ulike=false;
            for (int j=0;j<i;j++){
                if (a[i]==a[j]){
                    ulike=true;
                    break;
                }
            }
            if (!ulike){
                antallUlikeSorter++;
            }
        }
        return antallUlikeSorter;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
