package TT_HashMap;

import java.util.HashMap;

public class FindItineraryTickets {
    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revMap =new HashMap<String, String>();
        for (String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
        }
        for (String key : tick.keySet()) {
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets =new HashMap<String, String>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String start=getStart(tickets);
        while (tickets.containsKey(start)){
            System.out.print(start+" -> ");
            start=tickets.get(start);
        }
        System.out.println(start);
    }
}
