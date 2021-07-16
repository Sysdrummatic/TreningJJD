import java.util.*;

public class FirstCollection {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Listy:");

        List<String> listWithNames = new LinkedList<>();

        listWithNames.add("Izunia");
        listWithNames.add("Wojtus");
        listWithNames.add("Krzys");
        listWithNames.add("Lukasz");

        List<String> otherListWithNames = new LinkedList<>();

        otherListWithNames.add("Hanna");
        otherListWithNames.add("Jacek");
        otherListWithNames.addAll(listWithNames);
        otherListWithNames.add("Dorota");
        otherListWithNames.add("Wojciech");

        System.out.println(otherListWithNames.contains("Hanna"));
        System.out.println(otherListWithNames.get(0));
        System.out.println(otherListWithNames.isEmpty());
        System.out.println(otherListWithNames.indexOf("Jacek"));
        System.out.println(otherListWithNames.lastIndexOf("Dorota"));
        System.out.println(otherListWithNames.get(otherListWithNames.toArray().length - 1));

        System.out.println();
        System.out.println("Zbiory:");

        Set<String> setWithNames = new HashSet<>();
        setWithNames.add("Izunia");
        setWithNames.add("Wojtus");
        setWithNames.add("Krzys");
        setWithNames.add("Lukasz");

        Set<String> otherSetWithNames = new HashSet<>();
        otherSetWithNames.add("Izunia");
        otherSetWithNames.add("Hanna");
        otherSetWithNames.add("Dorota");

        setWithNames.addAll(otherSetWithNames);
        System.out.println(setWithNames.isEmpty());
        System.out.println(setWithNames.size());
        System.out.println(setWithNames.contains("Izunia"));
        System.out.println(setWithNames.remove("Lukasz"));
        System.out.println(setWithNames.size());

        //System.out.println(setWithNames.toArray());

        System.out.println();
        System.out.println("Mapy:");

        Map<String, String> pairMap = new HashMap<>();
        pairMap.put("Lukasz","Izunia");
        pairMap.put("Wojtuś","Krzyś");

        Map<String,String> otherPairMap = new HashMap<>();
        otherPairMap.put("Hanna","Jacek");
        otherPairMap.put("Dorota","Wojciech");

        pairMap.putAll(otherPairMap);

        System.out.println(pairMap.get("Lukasz"));
        System.out.println(pairMap.remove("Wojtuś"));
        System.out.println(pairMap.size());
        System.out.println(pairMap.isEmpty());
        System.out.println(pairMap.containsKey("Hanna"));
        System.out.println(pairMap.containsValue("Wojciech"));

        List<String> sampleList = new ArrayList<>();

        sampleList.add("Izunia");
        sampleList.add("Wojtus");
        sampleList.add("Krzys");
        sampleList.add("Lukasz");

        System.out.println("Iterowanie po liście (foreach)");
        for(String item: sampleList){
            System.out.println(item);
        }
        System.out.println("Iterowanie po liście (for)");
        for(int index = 0; index < sampleList.size();index++){
            System.out.println(sampleList);
        }

        Set<String> sampleSet = new HashSet<>();
        sampleSet.add("Lukasz");
        sampleSet.add("Wojtus");
        sampleSet.add("Krzys");
        sampleSet.add("Izunia");

        System.out.println("Iterowanie po zbiorze (foreach)");
        for(String item: sampleSet){
            System.out.println(item);
        }

        Map<String,String> sampleMap = new HashMap<>();
        sampleMap.put("Lukasz","Izunia");
        sampleMap.put("Wojtus","Krzys");

        System.out.println("Iterowanie po wartościach");
        for(String value: sampleMap.values()) {
            System.out.println(value);
        }

        System.out.println("Iterowanie po kluczach i pobieranie watości");
        for(String key: sampleMap.keySet()) {
            String value = sampleMap.get(key);
            System.out.println(key + " " + value);
        }

        System.out.println("Iterowanie po kluczach i wartościach");
        for(Map.Entry<String,String> entry : sampleMap.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
