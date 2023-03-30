/* Create a class that can be used across programs to accept an array
   of strings and search for a word that is within it. After the code
   determines if the value is found it will say at what index it was found
   at. If the value was not found I plan on adding a method later that will insert
   the word at that correct spot.
 */

public class BinarySearch {

    private static String[] key;
    private static String key_word;
    private static int key_start = 0, key_end = 0, key_mid = 0, key_found = 0;
    private static boolean checked = false;

    // This is the actual binary search.
    public static boolean binarysearch(String[] key_user_input, String key_word_user_input) {
        key = key_user_input;
        key_word = key_word_user_input;

        // This checks the amount of strings in the array.
        if (!checked) { // This checks to see if the array was already checked once which was when the
                        // method was called.
            int array_size = 0;
            for (String word_counted : key) {
                ++array_size;
            }
            if (array_size == 0) {
                System.out.println("The array is empty.");
                return false;
            }
            key_end = array_size - 1; // Sets the size of the array.

            checked = true; // Sets checked to true meaning it will not use this again in the recursive
                            // calls.
        }

        key_mid = (key_start + key_end) / 2; // Set the middle of the array to key_mid.

        if (key_start > key_end) { // Determines if the string was found in the array.
            System.out.println("The value was not found.");
            return false; // Returns false since the array was fully checked.
        }

        key_found = key_word.compareTo(key[key_mid]); // Set the value of key_found to the correct value to check where
                                                      // it is in the array.

        if (key_found == 0) {
            System.out.println("The value was found at index " + key_mid);
            return true; // This means it was found at the index of mid.
        }

        else if (key_found < 1) {
            key_end = key_mid - 1; // Sets the new end point to 1 less than the middle index.
            return binarysearch(key, key_word);
        }

        else {
            key_start = key_mid + 1; // Sets the new starting point to 1 more than the middle index.
            return binarysearch(key, key_word);
        }
    }
}