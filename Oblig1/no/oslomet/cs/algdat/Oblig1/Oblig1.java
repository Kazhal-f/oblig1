package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 - 2019 ////////////////////////

import java.util.NoSuchElementException;


public class Oblig1 {

    public static int maks(int[] a) {

        if (a.length == 0) {
            throw new NoSuchElementException("Tabellen er Tom");
        }

        int maksVerdi = a[0];

        for (int i = 0; i < a.length; i++) {

            if (a[i] > maksVerdi) {

                maksVerdi = a[i];

            }

        }

        return maksVerdi;

    }

    public static int ombyttinger(int[] a) {

        if (a.length == 0) {
            throw new NoSuchElementException("Tabellen er Tom");
        }
        int maksVerdi = a[0];
        int antallOmbytting = 0;

        for (int i = 0; i < a.length; i++) {

            if (maksVerdi < a[i]) {
                antallOmbytting++;
            }


        }

        return antallOmbytting;

    }


    public static int antallUlikeSortert(int[] a) {

        int antallUlike = 0;

        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length - 1; i++) {

            //   if(a[i] >  a[i + 1 ]){throw new IllegalStateException("verdiene er ikke stigende");}


            if (a[i] != a[i + 1]) {

                antallUlike++;


            }

        }
        return antallUlike + 1;
    }


    public static int antallUlikeUsortert(int[] a) {

        int res = 1;

        // Pick all elements one by one
        for (int i = 1; i < a.length; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {

                if (a[i] == a[j])
                    break;

            }


            // If not printed earlier, then print it
            if (i == j)
                res++;
        }
        return res;
    }

    public static int[] separateEvenOddNumbers(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {

            while (arr[left] % 2 == 0) {
                left++;
            }
            while (arr[right] % 2 == 1) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }


    public static void delsortering(int[] a) {

        int v = a[0];
        int h = a.length - 1;

        for (int i = 0; i < a.length; i++) {

            while (a[v] % 2 == 0) {

                v++;

            }
            while (a[h] % 2 != 0) {
                h--;

            }
            if (v < h) {

                int temp = a[v];
                a[v] = a[h];
                a[h] = temp;

            }

        }

    }


    public static void rotasjon(char[] a) {


    }

    public static void rotasjon(char [] a, int k){


    }

    public static String  flett(String s, String t){
       return s;
    }


    public  static String flett(String ... s){


        return "";
    }


    public static int[] indekssortering(int[]a){
        return new int[]{1,2};
    }

    public static int[] tredjeMin(int [] a){
        return new int[]{1,2};
    }

    public static boolean inneholdt(String a, String b){
        return true;
    }



}
