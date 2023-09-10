public class Main {
    public static String returnEvenNumbers() {
        StringBuilder out = new StringBuilder();
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) out.append(i).append(" ");
        }
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.print(returnEvenNumbers());
    }
}