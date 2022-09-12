import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<newClass> list = new ArrayList<>();
        newClass c = new newClass(5,6);
        newClass c2 = new newClass(10,12);

        list.add(c);
        list.add(c2);

        System.out.println(list);
    }
}
