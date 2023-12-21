

import java.util.Arrays;

public class a_Strings {

  public static void runner() {
    System.out.println("\n=== Strings =================\n");

    String temp = "Welcome to the jungle";
    temp.length();
    System.out.println("testing");

    temp.indexOf('c'); // index of first occurance or -1. returns 3
    temp.indexOf("the"); // index of the first occurance or -1. returns 11
    temp.indexOf("e ", 7); // with a "from index" parameter. returns 13
    temp.indexOf(109); // first occurance of 'm' or -1, which the ascii 'm' is binary 01101101 = 109

    temp.charAt(2); // returns 'l'
    temp.toCharArray(); // returns char array of the string
    temp.lastIndexOf("e", 6); // from index number
    temp.lastIndexOf("he");
    temp.endsWith("gle");
    temp.startsWith("Welcome");
    temp.contains("the"); // returns boolean

    temp.substring(5); // begins with character at index to the end
    temp.substring(6, 9); // begins with character at index to the exclusive index
    temp.substring(0, 0); // from 0 to 0 so nothing

    // replace() can take chars or strings. replace() returns a new String object
    temp.replace("e", "i"); // replaces all occurances of e with i and returns a new String
    temp.replace("e", ""); // removes all occurances of e
    temp.replaceFirst("e", "i"); // replaces first occurance of regex String with i
    String s = temp.replaceAll("come|ngl|to|\s", "go"); // replaces occurances of regex String with replacement string
    System.out.println(s);

    temp.split(" "); // splits string on spaces into String[]
    temp.split(" ", 4); // limit number of splits
    String[] tt = "testingtesttt".split("t"); // splits String into String[], [, es, ing, es] // empty is ignored at the
                                              // end

    temp.compareTo("Other"); // compares unicode, 0 if same
    String[] words = temp.split("\\s");
    String[] words2 = temp.split("\\s"); // limit the number of splits, 3 splits (3 pieces), passing 0 doesn't limit
    System.out.println(Arrays.toString(words2));

    String two = temp.concat(" ending");
    String together = "to".concat("get").concat("her"); // returns "together"
    String.join("java", "is", "cool"); // returns string

    temp.toUpperCase();
    temp.toLowerCase();
    temp.equals("other string"); // compares objects if string is equal
    temp.equalsIgnoreCase("other string"); // compares ignore case
    temp.isEmpty(); // returns true if it has 0 length
    temp.isBlank(); // returns true if it only consists of blank spaces and non-printable,
                    // characters, \n \t

    temp.trim(); // remove whitespace from leading and trailing, returns string; older version of
                 // strip()
    temp.strip(); // remove whitespace from leading and trailing, returns string; also removes
                  // unicode characters
    temp.stripLeading();
    temp.stripTrailing();
    temp.stripIndent(); // removes indents/whitespace
    temp.translateEscapes(); // returns new string with escaped characters as string literals

    // Returns Strings of the given input, boolean char, int. long, double char[],
    // etc.
    String.valueOf(4);
    String xxx = String.valueOf(new char[] { 'a', 'b', 'c' }); // only works for char[]. use Arrays.toString()
    String.valueOf(true); // returns "true"
    String.valueOf(23.4); // retrns "23.4"
    String xx = String.valueOf(new int[] { 1, 2, 3 }); // returns the Address of object!! only works for char[]
    System.out.println(xxx);

    String test1 = "hello";
    String test2 = "   hello ".trim();
    String test11 = " hello".trim();
    System.out.println("test1 == test2? " + (test1 == test2)); // false
    System.out.println("test1.equals(test11))? " + test1.equals(test11)); // true
    System.out.println("test1 == test11? " + (test1 == test11)); // false

    String test3 = "hello";
    String test4 = " hello".trim();
    String test5 = "  hello".trim();
    System.out.println("test3.equals(test4)? " + test3.equals(test4)); //

    // ===== STRINGBUILDER =========

    StringBuilder sb = new StringBuilder("Work on your system.");

    String sub = sb.substring(3, 5); // from index 3 to before 5, "k "
    char ch = sb.charAt(5); // returns char at index 5, 'o'
    int len = sb.length();
    String result = sb.toString(); // When String type is needed

    sb.append(" ");
    sb.append("Don't worry.");
    sb.delete(3, 5); // delete from 3 to before 5
    sb.deleteCharAt(3);
    sb.insert(7, " "); // insert string at index 7
    sb.insert(sb.length(), " ");
    sb.replace(3, 6, "XX");
    sb.reverse();

    var one = new StringBuilder("a");
    var tw2 = new StringBuilder("a");
    var three = one.append("xyz"); // able to return StringBuilder
    System.out.println(one == tw2); // false
    System.out.println(one == three); // true

  }

}