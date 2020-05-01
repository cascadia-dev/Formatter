import java.util.*;

class Main {

  private static String fmtList(String[] sin)
  {
    Iterator<String> i=Arrays.asList(sin).iterator();

    if (!i.hasNext())
      return "";  // zero length
    String s1=i.next();
    if (!i.hasNext())
      return s1;  // exactly one

    String acc=s1;
    for (String s=i.next(); true;s=i.next()) {
      if (!i.hasNext()) 
        return acc=acc+" and "+s;
      else
        acc=acc+", "+s;
    }
    //return "never get here!";
  }

  public static void main(String[] args) {
    System.out.println("Hello world!");

    System.out.println(fmtList(new String[] {"John"}));
    System.out.println(fmtList(new String[] {"John","Quasimodo"}));
    System.out.println(fmtList(new String[] {"John","Quasimodo","Zebulon"}));
    System.out.println(fmtList(new String[] {"John","Quasimodo","Zebulon","Mustafa"}));
  }
}