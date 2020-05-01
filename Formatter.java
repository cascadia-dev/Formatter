import java.util.*;
class Formatter
{
  private static final boolean USE_FINAL_COMMA = false;

  public static String format(String[] sin)
  {
    Iterator<String> i=Arrays.asList(sin).iterator();

    if (!i.hasNext())
      return "";  // zero length
    String acc=i.next();
    if (!i.hasNext())
      return acc;  // exactly one

    for (;;) {
      String s=i.next();
      if (!i.hasNext()) 
        return acc=acc+(USE_FINAL_COMMA?",":"")+" and "+s;
      else
        acc=acc+", "+s;
    }
    //never get here!
  }
}