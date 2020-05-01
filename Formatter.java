import java.util.*;
class Formatter
{
  private static boolean USE_FINAL_COMMA = false;

  public static void setFinalComma(boolean isUse)
  {
    USE_FINAL_COMMA = isUse;  
  }

  public static String format(String[] sin)
  {
    Iterator<String> i=Arrays.asList(sin).iterator();

    if (!i.hasNext())
      return "";  // zero length
    String acc=i.next();
    if (!i.hasNext())
      return acc;  // exactly one

    String s=i.next();
    if (!i.hasNext()) 
      return acc+" and "+s; // exactly two
    else
      acc=acc+", "+s;

    for (;;) {
      s=i.next();
      if (!i.hasNext()) 
        return acc+(USE_FINAL_COMMA?",":"")+" and "+s;
      else
        acc=acc+", "+s;
    }
    //never get here!
  }
}