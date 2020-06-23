import java.util.ArrayList;
import java.util.*;

public class Walmart {






    public static void maximumContainers(List<String> scenarios) {
        for (String s : scenarios) {
            String[] ss = s.split(" ");
            int n = Integer.parseInt(ss[0]);
            int cost = Integer.parseInt(ss[1]);
            int m = Integer.parseInt(ss[2]);
            System.out.println(findNumContainers(n, cost, m));
        }



    }

    public static int findNumContainers(int n, int cost, int m) {
        int start = n / cost;
        if (start == 0) {
            return 0;
        }
        n %= cost;
        n += start / m;
        return start + findNumContainers(n, cost, m);
    }
//start 5
    //n=0
    //n=








    public static String featuredProduct(List<String> products) {
        HashMap<String, Product> ps = new HashMap<>();
        for (int i = 0; i < products.size(); i++) {
            if (ps.containsKey(products.get(i))) {
                ps.get(products.get(i)).inc();
            } else {
                ps.put(products.get(i), new Product(products.get(i)));
            }
        }
        Product[] pa = new Product[ps.size()];
        ps.values().toArray(pa);
        Arrays.sort(pa, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.compareTo(o2);
            }
        });
        return "";
    }

    static class Product {
        String name;
        int count;

        public Product(String name) {
            this.name = name;
            this.count = 1;
        }

        public boolean equals(Product other) {
            return name.equals(other.name);
        }

        public void inc() {
            count++;
        }

        public int compareTo(Product other) {
            int dif = count - other.count;
            if (dif != 0) {
                return dif;
            } else {
                return name.compareTo(other.name);
            }
        }
    }
}
