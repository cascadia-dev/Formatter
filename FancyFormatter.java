import java.util.*;
class FancyFormatter
{
  private boolean UseFinalComma = false;
  private String ConnectorSymbol = ", ";
  private String ConnectorString = " and ";

  public void setFinalComma(boolean isUse)
  {
    UseFinalComma = isUse;  
  }

  public void setConnectorSymbol(String s)
  { 
    ConnectorSymbol = s;
  }

  public void setConnectorString(String s)
  { 
    ConnectorString = s;
  }

  // make a string out of the input array 
  // by default the elements will be connected with a comma.
  // this can be changed by calling setConnectorSymbol e.g. to separate elements with a semicolon insead.
  public String format(String[] sin)
  {
    Iterator<String> i=Arrays.asList(sin).iterator();

    if (!i.hasNext())
      return "";  // zero length
    String acc=i.next();
    if (!i.hasNext())
      return acc;  // exactly one

    for (boolean needsConnectorSymbol=false;;needsConnectorSymbol=UseFinalComma) {
      String s=i.next();
      if (!i.hasNext()) 
        return acc+(needsConnectorSymbol?ConnectorSymbol:"")+ConnectorString+s;
      else
        acc=acc+ConnectorSymbol+s;
    }
    //never get here!
  }
}