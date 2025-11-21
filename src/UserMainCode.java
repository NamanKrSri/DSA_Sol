import java.util.*;

class UserMainCode {
    public static String repeatingCharacterExpansion(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string must not be null or empty.");
        }

        Map<Character, Integer> firstOccurrence = new HashMap<>();
        List<String> resultParts = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Store 1-based index of first occurrence
            firstOccurrence.putIfAbsent(ch, i + 1);

            int repeatCount = firstOccurrence.get(ch);
            String repeated = String.valueOf(ch).repeat(repeatCount);
            resultParts.add(repeated);
        }

        return String.join("-", resultParts);
    }

        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            String input1 = sc.nextLine();
//            String output = repeatingCharacterExpansion(input1);
//            System.out.println(output);

            System.out.println("EXP");
            String s="HH";
            System.out.println(s.contains(" ")?(s.length()%2==0?(s.charAt(0)==s.charAt(s.length()-1)?"GOOD":"BAD"):"BAD"):"BAD");
            System.out.println(s.contains(" ")?"BAD":(s.length()%2==0));
        }

}
