public class FizzBuzzTranslate {
    public static String translate(int number) {
        if (number <= 0 || number >= 100) {
            throw new IllegalArgumentException("Number must be between 1 and 100");
        }
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        String numberStr = String.valueOf(number);
        boolean contains3 = numberStr.contains("3");
        boolean contains5 = numberStr.contains("5");
        if ((divisibleBy3 || contains3) && (divisibleBy5 || contains5)) {
            return "FizzBuzz";
        } else if (divisibleBy3 || contains3) {
            return "Fizz";
        } else if (divisibleBy5 || contains5) {
            return "Buzz";
        }
        return numToVietnamese(number);
    }

    private static String numToVietnamese(int number) {
        String[] ones = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        if (number < 10) {
            return ones[number];
        } else {
            int tens = number / 10;
            int onesDigit = number % 10;
            String tensStr = "";
            switch (tens) {
                case 1:
                    tensStr = "mười";
                    break;
                case 2:
                    tensStr = "hai mươi";
                    break;
                case 3:
                    tensStr = "ba mươi";
                    break;
                case 4:
                    tensStr = "bốn mươi";
                    break;
                case 5:
                    tensStr = "năm mươi";
                    break;
                case 6:
                    tensStr = "sáu mươi";
                    break;
                case 7:
                    tensStr = "bảy mươi";
                    break;
                case 8:
                    tensStr = "tám mươi";
                    break;
                case 9:
                    tensStr = "chín mươi";
                    break;
            }
            if (onesDigit == 0) {
                return tensStr;
            } else {
                return tensStr + " " + ones[onesDigit];
            }
        }
    }
}

