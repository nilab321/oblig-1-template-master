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
             if(a[i-1]> a[i]){
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
        int antall = 0; //teller
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
            System.out.println("tabellen er tom!");
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

        int lengde = a.length;
        int left = 0;
        int right = lengde - 1;
        if (a.length == 0) return;

        while (left <= right) {
            if (((a[left] % 2) == 0) && !((a[right] % 2) == 0)) {
                bytt(a, left++, right--);
            } else if ((a[left] % 2) == 0) {
                right--;
            } else if (!((a[right] % 2) == 0)) {
                left++;
            } else if (!((a[left] % 2) == 0) && ((a[right] % 2) == 0)) {
                left++;
                right--;
            }
        }
        kvikksortering(a,0,left);
        kvikksortering(a,left,lengde);
    }
    private static void kvikksortering0(int[] a, int v, int h)
    {
        if (v >= h){
            return;
        }
        int k = sParter0(a, v, h, (v + h)/2);
        kvikksortering0(a, v, k - 1);
        kvikksortering0(a, k + 1, h);
    }


    private static int sParter0(int[] a, int v, int h, int indeks)
    {
        bytt(a, indeks, h);
        int pos = parter0(a, v, h - 1, a[h]);
        bytt(a, pos, h);
        return pos;
    }
    private static int parter0(int[] a, int v, int h, int skilleverdi)
    {
        while (true)
        {
            while (v <= h && a[v] < skilleverdi) v++;
            while (v <= h && a[h] >= skilleverdi) h--;

            if (v < h) bytt(a,v++,h--);
            else  return v;
        }
    }

    public static void kvikksortering(int[] a, int fra, int til)
    {
        kvikksortering0(a, fra, til - 1);
    }

    public static void kvikksortering(int[] a)
    {
        kvikksortering0(a, 0, a.length - 1);
    }
    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }





    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        int indeks = 0;
        int n = a.length-1;
        for(int i = 0; i < a.length-1; i++){
            char flytt = a[n];
            a[n] = a[indeks];
            a[indeks]  = flytt;
            indeks++;
        }
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        String output="";
        int n=s.length()+t.length();
        for (int i=0; i<n; i++){
            if (i<s.length()){
                output+=s.charAt(i);
            }
            if (i<t.length()){
                output +=t.charAt(i);
            }
        }
        return output;
    }

    /// 7b)
    public static String flett(String... s) {
        String out = "";
        int totalLength =0;
        for (int i=0; i<s.length;i++){
            totalLength +=s[i].length();
        }
        for (int i=0;i<totalLength;i++){
            for (int j=0; j<s.length;j++){
                if (i<s[j].length()){
                    out+=s[j].charAt(i);
                }
            }
        }
        return out;
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
