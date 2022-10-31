import java.util.HashMap;

class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> newHashMap = new HashMap<String, String>();
        newHashMap.put("Chacha", "Nurholis");
        newHashMap.put("Lorem", "Ipsum");
        System.out.println(newHashMap);

        // get hashmap
        System.out.println(newHashMap.get("Chacha"));

        // remove hashmap
        newHashMap.remove("Lorem");
        System.out.println(newHashMap);
    }
}