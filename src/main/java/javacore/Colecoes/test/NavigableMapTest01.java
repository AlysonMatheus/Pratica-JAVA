package javacore.Colecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {

        NavigableMap<String, String > map = new TreeMap<>();
        map.put("A", "LETRA A");
        map.put("B", "LETRA B");
        map.put("C", "LETRA C");
        map.put("E", "LETRA E");
        map.put("D", "LETRA D");

        for (Map.Entry<String, String> entry :map.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }
        // Metodos
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(map.headMap("C", true));
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));

    }
}
