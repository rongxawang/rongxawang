package bussiness;

public class sum {
    public static void main(String[] args) {
        int n = 3;
        System.out.print(sum(n));
    }

    public static int sum(int n) {
        int Ni = 0;
        int S = 0;
        if (n == 1) {
            return 1;
        } else {
            for (int i = 0; i < n + 1; i++) {
                Ni += i;
                S += Ni;
            }
        }
        return S;
    }
}
