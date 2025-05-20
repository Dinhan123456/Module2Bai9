public class TriangleClassifier {
    public static String classify(int a, int b, int c) {
        // Kiểm tra cạnh không hợp lệ (<= 0)
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Không phải là tam giác";
        }

        // Kiểm tra tính hợp lệ của tam giác theo bất đẳng thức tam giác
        if (!(a + b > c && a + c > b && b + c > a)) {
            return "Không phải là tam giác";
        }

        // Tam giác đều
        if (a == b && b == c) {
            return "Tam giác đều";
        }

        // Tam giác cân
        if (a == b || b == c || a == c) {
            return "Tam giác cân";
        }

        // Tam giác thường
        return "Tam giác thường";
    }
}
