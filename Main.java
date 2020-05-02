class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(Formatter.format(new String[] {"John"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo","Zebulon"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo","Zebulon","Mustafa"}));
    System.out.println();

    Formatter.reset();
    Formatter.setFinalComma(false);
    Formatter.setConnectorSymbol(", ");
    Formatter.setConnectorString(", and ");
    System.out.println(Formatter.format(new String[] {"John"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo","Zebulon"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo","Zebulon","Mustafa"}));
    System.out.println();

    Formatter.reset();
    Formatter.setFinalComma(false);
    Formatter.setConnectorSymbol("; ");
    Formatter.setConnectorString("; and ");
    System.out.println(Formatter.format(new String[] {"John"}));
    System.out.println(Formatter.format(new String[] {"John, the plain","Quasimodo, the crooked"}));
    System.out.println(Formatter.format(new String[] {"John, the plain","Quasimodo, the crooked","Zebulon, the confused"}));
    System.out.println(Formatter.format(new String[] {"John, the plain","Quasimodo, the crooked","Zebulon, the confused","Mustafa, the learned"}));
    System.out.println();

    Formatter.reset();
    Formatter.setFinalComma(false);
    Formatter.setConnectorSymbol(" & ");
    Formatter.setConnectorString(" & ");
    System.out.println(Formatter.format(new String[] {"John"}));
    System.out.println(Formatter.format(new String[] {"John, the plain","Quasimodo, the crooked"}));
    System.out.println(Formatter.format(new String[] {"John, the plain","Quasimodo, the crooked","Zebulon, the confused"}));
    System.out.println(Formatter.format(new String[] {"John, the plain","Quasimodo, the crooked","Zebulon, the confused","Mustafa, the learned"}));
  }
}