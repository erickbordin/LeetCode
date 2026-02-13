import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int x) {

        String numeroVef = String.valueOf(x);

        if (numeroVef.length() == 1) {
            return true;
        }

        int j = numeroVef.length() - 1;

        for (int i = 0; i < numeroVef.length(); i++) {

            if (numeroVef.charAt(i) != numeroVef.charAt(j)) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean ret = isPalindrome(entrada.nextInt());

        System.out.println(ret);

        entrada.close();
    }

}
