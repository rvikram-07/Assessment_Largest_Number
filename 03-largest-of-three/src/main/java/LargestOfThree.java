public class LargestOfThree {
    public int largest(int a, int b, int c) { return Math.max(a, Math.max(b, c)); }
    public static void main(String[] args) {
        System.out.println("Largest: " + new LargestOfThree().largest(10, 25, 15));
    }
}
