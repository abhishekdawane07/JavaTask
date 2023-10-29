
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;




public class Assignment {

    
    public static int romanToInteger(String romanNumeral) {
        // Define a mapping of Roman numeral characters to their respective integer values
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string in reverse order
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanToIntMap.get(romanNumeral.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }
    
    public static boolean isPangram(String input) {
        String lowercaseInput = input.toLowerCase();
        Set<Character> alphabetSet = new HashSet<>();
        for (char ch : lowercaseInput.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabetSet.add(ch);
            }
        }

        return alphabetSet.size() == 26;  // Check if all letters of the alphabet are present
    }
    
    
    public static void main(String[] args) {
      
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        Collections.shuffle(Arrays.asList(array));
        System.out.println("Shuffled array: " + Arrays.toString(array));
        String romanNumeral = "IX";
        int integerValue = romanToInteger(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is: " + integerValue);
        
        
        
        String inputString = "The quick brown fox jumps over the lazy dog";
        boolean isPangramResult = isPangram(inputString);

        if (isPangramResult) {
            System.out.println("'" + inputString + "' is a pangram.");
        } else {
            System.out.println("'" + inputString + "' is not a pangram.");
        }
        
        
    }
    
    
    
    
    
    }
    

