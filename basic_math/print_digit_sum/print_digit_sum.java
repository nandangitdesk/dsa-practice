

public class print_digit_sum {
    public static void main(String args[]){
        int number = 1221;
        System.out.println(sumDigits(number));
        System.out.println(countDigits(number));
        System.out.println(reverseDigits(number));
        System.out.println(checkPalindrome(number));
        System.out.println(checkPrime(10));
        System.out.println(getGcd(48, 18));
        System.out.println(getLcm(4, 6));
        System.out.println(getFactorial(5));
        System.out.println(getFibonacci(5));
        System.out.println(getArmStrong(153));
    }

    public static int sumDigits(int number){
        if(number == 0){
            return 0;
        }
        int digit = number % 10;
        return digit + sumDigits(number / 10);
    }

    
    public static int countDigits(int number){
        if(number == 0){
            return 0;
        }
        return 1 + countDigits(number / 10);
    }

    public static int reverseDigits(int number){
         int reverseNumber = 0;

            while(number != 0){
                int digit = number % 10;
                reverseNumber = reverseNumber * 10 + digit;
                number /= 10;
            }
        return reverseNumber;
    }

    public static boolean checkPalindrome(int number){
        return number == reverseDigits(number) ? true : false;
    }

    public static String checkPrime(int number){
        //prime number is a number which is greater than 1 and has only two factors 1 and itself
        if(number <= 1){
            return "Not Prime";
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return "Not Prime";
            }
        }
        return "Prime";
    }

    public static int getGcd(int a, int b){
        if(b == 0){
            return a;
        }
        // explain karo : - hinglish me : - a ko b se divide karo aur remainder ko b ke sath a ke jagah rakh do, jab tak b 0 na ho jaye, jo last non zero remainder hoga wahi gcd hoga
        // example : - getGcd(48, 18) => getGcd(18, 48 % 18) => getGcd(18, 12) => getGcd(12, 18 % 12) => getGcd(12, 6) => getGcd(6, 12 % 6) => getGcd(6, 0) => return 6
        // isko Euclidean algorithm kehte hain, jo ki gcd nikalne ka efficient method hai
        return getGcd(b, a % b);
    }

    public static int getLcm(int a, int b){
        // explain karo : - lcm ka formula hai (a * b) / gcd(a, b) 
        // example : - getLcm(4, 6) => (4 * 6) / getGcd(4, 6) => 24 / 2 => 12
        return (a * b) / getGcd(a, b);
    }

    public static int getFactorial(int number){
        if(number == 0 || number == 1){
            return 1;
        }
        // explain karo : - factorial ka formula hai n! = n * (n-1)!, jahan n! ka matlab hai n ka factorial aur (n-1)! ka matlab hai (n-1) ka factorial
        // example : - getFactorial(5) => 5 * getFactorial(4) => 5 * 4 * getFactorial(3) => 5 * 4 * 3 * getFactorial(2) => 5 * 4 * 3 * 2 * getFactorial(1) => 5 * 4 * 3 * 2 * 1 => 120 
        return number * getFactorial(number - 1);
    }

    public static int getFibonacci(int number){
        if(number == 0){
            return 0;
        }
        if(number == 1){
            return 1;
        }
        // explain karo : - fibonacci ka formula hai F(n) = F(n-1) + F(n-2), jahan F(n) ka matlab hai n-th fibonacci number
        // example : - getFibonacci(5) => getFibonacci(4) + getFibonacci(3) => (getFibonacci(3) + getFibonacci(2)) + (getFibonacci(2) + getFibonacci(1)) => ((getFibonacci(2) + getFibonacci(1)) + (getFibonacci(1) + getFibonacci(0))) + ((getFibonacci(1) + getFibonacci(0)) + 1) => (((getFibonacci(1) + getFibonacci(0)) + 1) + (1 + 0)) + ((1 + 0) + 1) => (((1 + 0) + 1) + (1 + 0)) + ((1 + 0) + 1) => ((1 + 1) + (1)) + (1 + 1) => (2 + 1) + (2) => 3 + 2 => 5
        return getFibonacci(number - 1) + getFibonacci(number - 2);
    }

    public static int getArmStrong(int number){
        // explain karo : - armstrong number ka formula hai n = sum of (each digit ^ number of digits), jahan n ka matlab hai number aur each digit ka matlab hai number ke har ek digit
        // example : - getArmStrong(153) => 1^3 + 5^3 + 3^3 => 1 + 125 + 27 => 153
        int sum = 0;
        int temp = number;
        int digits = countDigits(number);
        while(temp != 0){
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum;
    }
}
