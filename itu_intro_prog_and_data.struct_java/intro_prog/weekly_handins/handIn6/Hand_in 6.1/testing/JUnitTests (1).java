import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class JUnitTests {
  private List<String> tokens(String s) {
    try (var scan = new Scanner(s)) {
      return scan.tokens().collect(Collectors.toList());
    }
  }

  @Test public void test1() {
    var oldin = System.in;
    var oldout = System.out;
    var newline = System.lineSeparator();
    var input = "hate fudgesicles" + newline +
      "I bleeping hate those fudgesicles.";
    System.setIn(new ByteArrayInputStream(input.getBytes()));
    var output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
    ProfanityFilter.main(new String[0]);
    System.setIn(oldin);
    System.setOut(oldout);
    var expected = "I bleeping *&#$ those *&#$%*&#$%*." + newline +
      "";
    var actual = output.toString();
    if (!tokens(expected).equals(tokens(actual))) assertEquals(expected, actual);
  }

  @Test public void test2() {
    var oldin = System.in;
    var oldout = System.out;
    var newline = System.lineSeparator();
    var input = "fricking" + newline +
      "I cannot eat another FRICKing meatball!";
    System.setIn(new ByteArrayInputStream(input.getBytes()));
    var output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
    ProfanityFilter.main(new String[0]);
    System.setIn(oldin);
    System.setOut(oldout);
    var expected = "I cannot eat another *&#$%*&# meatball!" + newline +
      "";
    var actual = output.toString();
    if (!tokens(expected).equals(tokens(actual))) assertEquals(expected, actual);
  }

  @Test public void test3() {
    var oldin = System.in;
    var oldout = System.out;
    var newline = System.lineSeparator();
    var input = "fruit" + newline +
      "I wonder how much fruit? is actually in fruitcake?";
    System.setIn(new ByteArrayInputStream(input.getBytes()));
    var output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
    ProfanityFilter.main(new String[0]);
    System.setIn(oldin);
    System.setOut(oldout);
    var expected = "I wonder how much *&#$%? is actually in fruitcake?" + newline +
      "";
    var actual = output.toString();
    if (!tokens(expected).equals(tokens(actual))) assertEquals(expected, actual);
  }

  @Test public void test4() {
    var oldin = System.in;
    var oldout = System.out;
    var newline = System.lineSeparator();
    var input = "COUNT" + newline +
      "You know that I am called the Count" + newline +
      "Because I really love to count" + newline +
      "I could sit and count all day" + newline +
      "Sometimes I get carried away" + newline +
      "" + newline +
      "I count slowly, slowly, slowly getting faster" + newline +
      "Once I've started to count it's really hard to stop" + newline +
      "Faster, faster. It is so exciting!" + newline +
      "I could count forever, count until I drop" + newline +
      "" + newline +
      "1! 2! 3! 4!" + newline +
      "1-2-3-4, 1-2-3-4," + newline +
      "1-2, i love to count whatever the ammount haha!" + newline +
      "1-2-3-4, heyyayayay heyayayay that's the sound of the count!" + newline +
      "" + newline +
      "I count the spiders on the wall..." + newline +
      "I count the cobwebs in the hall..." + newline +
      "I count the candles on the shelf..." + newline +
      "When I'm alone, I count myself!" + newline +
      "" + newline +
      "I count slowly, slowly, slowly getting faster" + newline +
      "Once I've started to count it's really hard to stop" + newline +
      "Faster, faster. It is so exciting!" + newline +
      "I could count forever, count until I drop" + newline +
      "" + newline +
      "1! 2! 3! 4!" + newline +
      "1-2-3-4, 1-2-3-4, 1," + newline +
      "2 I love to count whatever the" + newline +
      "Ammount! 1-2-3-4 heyayayay heayayay 1-2-3-4" + newline +
      "That's the song of the Count!";
    System.setIn(new ByteArrayInputStream(input.getBytes()));
    var output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
    ProfanityFilter.main(new String[0]);
    System.setIn(oldin);
    System.setOut(oldout);
    var expected = "You know that I am called the *&#$%" + newline +
      "Because I really love to *&#$%" + newline +
      "I could sit and *&#$% all day" + newline +
      "Sometimes I get carried away" + newline +
      "" + newline +
      "I *&#$% slowly, slowly, slowly getting faster" + newline +
      "Once I've started to *&#$% it's really hard to stop" + newline +
      "Faster, faster. It is so exciting!" + newline +
      "I could *&#$% forever, *&#$% until I drop" + newline +
      "" + newline +
      "1! 2! 3! 4!" + newline +
      "1-2-3-4, 1-2-3-4," + newline +
      "1-2, i love to *&#$% whatever the ammount haha!" + newline +
      "1-2-3-4, heyyayayay heyayayay that's the sound of the *&#$%!" + newline +
      "" + newline +
      "I *&#$% the spiders on the wall..." + newline +
      "I *&#$% the cobwebs in the hall..." + newline +
      "I *&#$% the candles on the shelf..." + newline +
      "When I'm alone, I *&#$% myself!" + newline +
      "" + newline +
      "I *&#$% slowly, slowly, slowly getting faster" + newline +
      "Once I've started to *&#$% it's really hard to stop" + newline +
      "Faster, faster. It is so exciting!" + newline +
      "I could *&#$% forever, *&#$% until I drop" + newline +
      "" + newline +
      "1! 2! 3! 4!" + newline +
      "1-2-3-4, 1-2-3-4, 1," + newline +
      "2 I love to *&#$% whatever the" + newline +
      "Ammount! 1-2-3-4 heyayayay heayayay 1-2-3-4" + newline +
      "That's the song of the *&#$%!" + newline +
      "";
    var actual = output.toString();
    if (!tokens(expected).equals(tokens(actual))) assertEquals(expected, actual);
  }

  @Test public void test5() {
    var oldin = System.in;
    var oldout = System.out;
    var newline = System.lineSeparator();
    var input = "2 3 5 7 11 13 17 19 23 29" + newline +
      "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30";
    System.setIn(new ByteArrayInputStream(input.getBytes()));
    var output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
    ProfanityFilter.main(new String[0]);
    System.setIn(oldin);
    System.setOut(oldout);
    var expected = "1 * * 4 * 6 * 8 9 10 *& 12 *& 14 15 16 *& 18 *& 20 21 22 *& 24 25 26 27 28 *& 30" + newline +
      "";
    var actual = output.toString();
    if (!tokens(expected).equals(tokens(actual))) assertEquals(expected, actual);
  }

  @Test public void test6() {
    var oldin = System.in;
    var oldout = System.out;
    var newline = System.lineSeparator();
    var input = "" + newline +
      "This is a test, without any filtered words.";
    System.setIn(new ByteArrayInputStream(input.getBytes()));
    var output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
    ProfanityFilter.main(new String[0]);
    System.setIn(oldin);
    System.setOut(oldout);
    var expected = "This is a test, without any filtered words." + newline +
      "";
    var actual = output.toString();
    if (!tokens(expected).equals(tokens(actual))) assertEquals(expected, actual);
  }
}