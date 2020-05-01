import java.util.*;
class Formatter
{
  public static String format(String[] sin)
  {
    Iterator<String> i=Arrays.asList(sin).iterator();

    if (!i.hasNext())
      return "";  // zero length
    String s1=i.next();
    if (!i.hasNext())
      return s1;  // exactly one

    String acc=s1;
   
    for (;;) {
      String s=i.next();
      if (!i.hasNext()) 
        return acc=acc+", and "+s;
      else
        acc=acc+", "+s;
    }
    //never get here!";
  }
}