/**
 * Napisz program, który w przypadku liczb:
 * podzielnych przez 3 wyświetli liczbę i słowo "Fizz",
 * podzielnych przez 5 wyświetli liczbę i słowo "Buzz",
 * a podzielnych zarówno przez 3 i 5 wyświetli liczbę i słowo "FizzBuzz".
 * Pozostałe liczby nie powinny być wyświetlane. Zakładamy, że pracujemy na tablicy liczb z przedziału <1; 100>.
 *
 */
public class main {

    public static void main(String[] args) {
        int[] tab = new int[100];

            for(int i=0; i<100; i++){
                tab[i] = i+1;

                if (tab[i]%3==0 & tab[i]%5==0){
                    System.out.println(tab[i]+" "+"FizzBuzz");
                }
                else if(tab[i]%3==0){
                    System.out.println(tab[i]+" "+"Fizz");
                }
                else  if (tab[i]%5==0){
                    System.out.println(tab[i]+" "+"Buzz");
                }

            }

    }
}
