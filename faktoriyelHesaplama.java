import java.util.Scanner;

public class faktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner factorial = new Scanner(System.in);
        int n, total=1;
        System.out.print("Faktoriyel Sayısı: ");
        n = factorial.nextInt();

        for(int i =1; i<=n; i++){
            total= total*i;
        }
        System.out.println(n+ ".faktoriyel: " +total);
    }
}
