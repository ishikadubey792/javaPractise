import java.util.*;
class Solution {
    public String destCity(List<List<String>> paths) {
        if(paths.isEmpty()){
            return "";
        }
        HashSet<String> startCities = new HashSet<>();
        HashSet<String> endCities = new HashSet<>();
        
        // Store all start and destination cities separately in hash sets
        for(List<String> path : paths){
          startCities.add(path.get(0));
          endCities.add(path.get(1));
        }
 
       // check for the cities which is a destinations but not a start city
       for(String destination : endCities){
           if(!startCities.contains(destination)){
               return destination;
           }
       }

        return "";
    }
}