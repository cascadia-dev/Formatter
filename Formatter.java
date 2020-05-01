import java.util.*;
class Formatter
{
  private static boolean UseFinalComma = false;

  public static void setFinalComma(boolean isUse)
  {
    UseFinalComma = isUse;  
  }

  public static String format(String[] sin)
  {
    Iterator<String> i=Arrays.asList(sin).iterator();

    if (!i.hasNext())
      return "";  // zero length
    String acc=i.next();
    if (!i.hasNext())
      return acc;  // exactly one

    for (boolean needsComma=false;;needsComma=UseFinalComma) {
      String s=i.next();
      if (!i.hasNext()) 
        return acc+(needsComma?",":"")+" and "+s;
      else
        acc=acc+", "+s;
    }
    //never get here!
  }
}