package task7656;

import java.nio.charset.StandardCharsets;

public class AsciiCharSequence implements CharSequence {

    byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    @Override
    public int length() { //done
        return array.length;
    }

    @Override
    public char charAt(int index) { //done
        return (char) array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new String(array).substring(start,end);
    }

    @Override
    public String toString() { // уточнить про символ 
        return new String(array);
    }

    public static void main(String[] args) {
        byte[] a = {100, 40, 50, 60, 70};
        var m = new AsciiCharSequence(a);
        System.out.println(m.subSequence(3,5));
    }
}
