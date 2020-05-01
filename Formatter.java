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

    for (boolean commaize=false;;commaize=USE_FINAL_COMMA) {
      String s=i.next();
      if (!i.hasNext()) 
        return acc+(commaize?",":"")+" and "+s;
      else
        acc=acc+", "+s;
    }
    //never get here!
  }
}