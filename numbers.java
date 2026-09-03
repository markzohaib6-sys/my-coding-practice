class Numbers {

   
    public static void checkPrime(int n) {
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }

        if (cnt > 2) {
            System.out.println("The number is a composite number");
        } else if (cnt == 2) {
            System.out.println("The number is a prime number");
        } else {
            System.out.println("Error occurred");
        }
    }

    public static void main(String args[]) {
        checkPrime(13);   
        checkPrime(12);   
    }
}