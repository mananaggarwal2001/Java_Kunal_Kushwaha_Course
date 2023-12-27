public class findingthepowerof2injava {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        int ans = 1;
        while (power != 0) {
            int finalValue = power & 1;
            if (finalValue == 1) {
                ans *= base;
            }
            base *= base; // this is mandatory step to do while finding the power of any given number. the time complexity is log(time)
            power = power >> 1;
        }
        System.out.println("The final answer of this value is :- " + ans);
    }
}
