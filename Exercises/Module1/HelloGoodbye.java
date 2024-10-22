/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class HelloGoodbye {
    public static void main(String[] args) {
        String firstName = args[0];
        String secondName = args[1];
        StdOut.println(String.format("Hello %s and %s.", firstName, secondName));
        StdOut.println(String.format("Goodbye %s and %s.", secondName, firstName));
    }
}
