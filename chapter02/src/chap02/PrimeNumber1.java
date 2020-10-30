package chap02;

public class PrimeNumber1 {

    public static void main(String[] args) {
//        소수는 자신과 1 이외의 정수로 나누어떨어지지 않는 정수입니다.
//        2부터 n - 1까지의 어떤 정수로도 나누어떨어지지 않습니다.
//        만약 나누어떨어지는 정수가 하나 이상 존재하면 그 수는 합성수(composite number)입니다.
        int counter = 0;

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) {
                    break;
                }
            }

            if (n == i) {
                System.out.println(n);
            }
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
