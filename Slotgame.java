import java.util.*;

public class Slotgame {
    public static int slotScore(String original, String guess) {
        // Write your code here.
        if (guess.length() == 0 || original.length() == 0) {
            return 0;
        }
        int count = 0;
        Set<Character> originalChars = new HashSet<>(); // To track used characters
        Set<Character> guessChars = new HashSet<>();
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == guess.charAt(i)) {
                count += 2;
            } else {
                originalChars.add(original.charAt(i));
                guessChars.add(guess.charAt(i));
            }
        }
        for (char c : guessChars) {
            if (originalChars.contains(c)) {
                count++;
                originalChars.remove(c); // Remove the character from originalChars to avoid double counting
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        String original = sc.next();
        String guess = sc.next();
        sc.close();
        int ans = slotScore(original, guess);
        System.out.println(ans);
    }
}
