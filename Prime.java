import java.util.*;  // Import Scanner for input

class Prime {
    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n < 2) return false; // Numbers less than 2 are not prime
        if (n == 2) return true; // 2 is the only even prime number
        if (n % 2 == 0) return false; // Even numbers > 2 are not prime

        // Check divisibility from 3 to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();  // Always close the Scanner after use

        // Call the method and print the result
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        System.out.println("Jai Jagannath");
        System.out.println("This is a prime number program");
    }
}

