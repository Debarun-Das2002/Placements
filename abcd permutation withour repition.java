public class substring {
    public static void main(String[] args) {
        String input = "abcd";
        int n = input.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    for (int k = 0; k < n; k++) {
                        if (k != i && k != j) {
                            for (int l = 0; l < n; l++) {
                                if (l != i && l != j && l != k) {
                                    System.out.println("" + input.charAt(i) + input.charAt(j) + input.charAt(k) + input.charAt(l));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
