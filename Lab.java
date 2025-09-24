public class Lab {

    public static void main(String[] args) {
        int pos1 = findPhrase("Listen to your conscience.", "science", 0);
        int pos2 = findPhrase("Yesterday is today's day before.", "day", 0);
        int pos3 = findPhrase("This will be his first history class.", "is", 10);
        int pos4 = findPhrase("I love computer science class.", "computer", 4);

        System.out.println("pos1: " + pos1);
        System.out.println("pos2: " + pos2);
        System.out.println("pos3: " + pos3);
        System.out.println("pos4: " + pos4);
    }
    
    // This is the corrected findPhrase method from the previous response.
    private static int findPhrase(String statement, String goal, int startPos) {
        String phrase = statement.toLowerCase();
        goal = goal.toLowerCase();
        int position = phrase.indexOf(goal, startPos);

        while (position >= 0) {
            String before = "", after = "";

            if (position > 0) {
                before = phrase.substring(position - 1, position);
            }

            if (position + goal.length() < phrase.length()) {
                after = phrase.substring(position + goal.length(), position + goal.length() + 1);
            }

            // The corrected logic for checking word boundaries
            boolean atStart = position == 0;
            boolean atEnd = position + goal.length() == phrase.length();
            boolean beforeIsNonLetter = ((before.compareTo("a") < 0) || (before.compareTo("z") > 0));
            boolean afterIsNonLetter = ((after.compareTo("a") < 0) || (after.compareTo("z") > 0));

            if ((atStart || beforeIsNonLetter) && (atEnd || afterIsNonLetter)) {
                return position;
            }

            position = phrase.indexOf(goal, position + 1);
        }
        return -1;
    }
}