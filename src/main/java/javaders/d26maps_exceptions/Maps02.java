package javaders.d26maps_exceptions;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        //HasMap arka planda nasil calisiyor?
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.get("USA");
        capitals.put("Italy", "Rome");
        capitals.put("Turkiye", "Ankara");
        capitals.get("Turkiye");

        capitals.put("Turkiye", "Istanbul");

    }
}
