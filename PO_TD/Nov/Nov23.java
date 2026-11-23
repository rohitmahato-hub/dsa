import java.util.ArrayList;
import java.util.List;

public class Nov23 {
    public static void main(String[] args) {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(5);
        productOfNumbers.add(4);

        System.out.println(productOfNumbers.getProduct(2)); // 20
        System.out.println(productOfNumbers.getProduct(3)); // 40
        System.out.println(productOfNumbers.getProduct(4)); // 40

        productOfNumbers.add(8);
        System.out.println(productOfNumbers.getProduct(2)); // 32
    }

    static class ProductOfNumbers {
        private final List<Long> prefix;

        public ProductOfNumbers() {
            prefix = new ArrayList<>();
            prefix.add(1L);
        }

        public void add(int num) {
            if (num == 0) {
                prefix.clear();
                prefix.add(1L);
            } else {
                long lastProduct = prefix.get(prefix.size() - 1);
                prefix.add(lastProduct * num);
            }
        }

        public int getProduct(int k) {
            int n = prefix.size();
            if (k >= n) {
                return 0;
            }
            long product = prefix.get(n - 1) / prefix.get(n - 1 - k);
            return (int) product;
        }
    }
}