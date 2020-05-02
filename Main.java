class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(Formatter.format(new String[] {"John"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo","Zebulon"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo","Zebulon","Mustafa"}));

    {
    FancyFormatter f=new FancyFormatter();
    f.setFinalComma(true);
    System.out.println(f.format(new String[] {"John"}));
    System.out.println(f.format(new String[] {"John","Quasimodo"}));
    System.out.println(f.format(new String[] {"John","Quasimodo","Zebulon"}));
    System.out.println(f.format(new String[] {"John","Quasimodo","Zebulon","Mustafa"}));
    }

    {
    FancyFormatter f=new FancyFormatter();
    f.setFinalComma(false);
    f.setConnectorSymbol("; ");
    f.setConnectorString("; and ");
    System.out.println(f.format(new String[] {"John"}));
    System.out.println(f.format(new String[] {"John, the plain","Quasimodo, the crooked"}));
    System.out.println(f.format(new String[] {"John, the plain","Quasimodo, the crooked","Zebulon, the confused"}));
    System.out.println(f.format(new String[] {"John, the plain","Quasimodo, the crooked","Zebulon, the confused","Mustafa, the learned"}));
    }

    {
    FancyFormatter f=new FancyFormatter();
    f.setFinalComma(false);
    f.setConnectorSymbol(" & ");
    f.setConnectorString(" & ");

    System.out.println(f.format(new String[] {"John"}));
    System.out.println(f.format(new String[] {"John, the plain","Quasimodo, the crooked"}));
    System.out.println(f.format(new String[] {"John, the plain","Quasimodo, the crooked","Zebulon, the confused"}));
    System.out.println(f.format(new String[] {"John, the plain","Quasimodo, the crooked","Zebulon, the confused","Mustafa, the learned"}));
    }
  }
}