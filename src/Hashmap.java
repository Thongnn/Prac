import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<String, String> fun = new HashMap<String, String>();

        fun.put("bobbyJoe1996", "fluffyP0nies!");
        fun.put("helloKittyFan", "AloeVera?");
        fun.put("coolguyswag", "password123");

        fun.remove("helloKittyFan");

        System.out.println(fun);


    }

}
