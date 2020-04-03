import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // 1. Initialize an ArrayList of Strings, called roasts
        ArrayList<String> roasts = new ArrayList<>();

        //   a. add light, medium, medium, dark to the array list, one at a time
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

//        System.out.println(roasts);

        // 2. Check to see if the list contains "dark" , and then "espresso"
        boolean result;
        result = roasts.contains("dark");
//        System.out.println(result);
        result = roasts.contains("espresso");
//        System.out.println(result);

        // 3. Find the last index of "medium" in the array
        int index = roasts.lastIndexOf("medium");
//        System.out.println(index);

        // 4. Check if the array list is empty
        result = roasts.isEmpty();
//        System.out.println(result);

        // 5. Assign the array list an empty ArrayList object, and then check if empty
        ArrayList<String> emptyList = new ArrayList<>();
        result = emptyList.isEmpty();
//        System.out.println(result);

        // 5a. Add the espresso roast, and try to add it at an out of bounds index
        roasts.add("espresso");
//        System.out.println(roasts);

        // 6. Remove the espresso roast
//        roasts.remove(4);
//        roasts.remove("medium");
        int firstIndex = roasts.indexOf("medium");
        int lastIndex = roasts.lastIndexOf("medium");

        // [light, medium, medium, dark]

//        System.out.println("\t First Index of Medium: " + firstIndex);
        System.out.println("\t Last Index of Medium: " + lastIndex);
//
        roasts.remove(firstIndex);


//        roasts.remove(roasts.lastIndexOf("medium"));
//        System.out.println(roasts);

        // 7. Remove the element at index 2
        roasts.remove(2);
//        System.out.println(roasts);


        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //

        // 1. Create a HashMap called usernames that contains:
        //   a. first name
        //   b. Github username
        HashMap<String, String> usernames = new HashMap<>();

        usernames.put("Casey", "fridaynext");
        usernames.put("Vivian", "viviancan");
        usernames.put("Trant", "trantbatey");

        System.out.println(usernames);

        // 2. re-initialize the HashMap using the .clear() method
        usernames.clear();
        System.out.println(usernames);

        // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map
        usernames.put("Casey", "fridaynext");
        System.out.println(usernames);

        // 4. use the .putIfAbsent() method to add
        //   a. "Vivian" -> "viviancan"
        //   b. "Casey" -> "XpenguinX"
        usernames.putIfAbsent("Vivian", "viviancan");
        usernames.putIfAbsent("Casey", "XpenguinX");
        System.out.println(usernames);

        // 5. What happened with the .putIfAbsent()? Did both items get added? Why/why not?
                // .putIfAbsent() only checks if the **key** is absent, and will not add an element if they key is present
        // 6. Use the .remove() method to remove "Casey"
        usernames.remove("Casey");
        System.out.println(usernames);

        // 7. Use the .replace() method to change Vivian's username to "viviancandev"

        // Replace the key, but keep the same value
        String value = usernames.get("Vivian");
        usernames.remove("Vivian");
        usernames.put("VivianC", value);

        usernames.replace("Vivian", "viviancandev");
        System.out.println(usernames);

        // 8. Use the .clear() method to clear the map
        usernames.clear();
        System.out.println(usernames);

        // 9. Use the .isEmpty() method to verify that it was cleared
//        result = ;
        System.out.println(usernames.isEmpty());

    }
}
