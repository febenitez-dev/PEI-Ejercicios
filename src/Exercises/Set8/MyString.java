package Exercises.Set8;

public class MyString {
    public String str;

    public MyString(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {
        return ((int) ch >= 97 && (int) ch <= 102) || ((int) ch >= 65 && (int) ch <= 70);
    }

    public boolean isHexadecimal() {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (char ch: str.toCharArray()) {
            if (!isHexadecimalChar(ch) && !Character.isDigit(ch)) {
                return false;
            }
        }

        return true;
    }
}
