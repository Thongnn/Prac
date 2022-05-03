import java.util.HashMap;

public class map {

    public static void main(String[] args) {

        HashMap<String, Integer> emploIDS = new HashMap<String, Integer> ();

        emploIDS.put("John", 12345);
        emploIDS.put("Carl", 698435);
        emploIDS.put("Jenna", 199);
        emploIDS.put("Furry", 20059439);

        System.out.println(emploIDS);

        System.out.println(emploIDS.get("Carl"));

        System.out.println(emploIDS.containsValue(199));

        System.out.println(emploIDS.containsKey("John"));

        emploIDS.put("John", 99999);

        emploIDS.replace("Kramer", 129321);
        emploIDS.putIfAbsent("steve", 2222222);
        System.out.println(emploIDS);

    }

}
