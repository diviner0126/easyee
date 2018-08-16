

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;

public class text {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("5");
        list.add("3");
        list.add("4");
        list.add("1");
        list.add("2");

        list.sort(Comparator.comparingInt(Integer::valueOf));
        System.out.println(list);


    }
}
