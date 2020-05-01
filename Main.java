class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Formatter.setFinalComma(true);
    System.out.println(Formatter.format(new String[] {"John"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo","Zebulon"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo","Zebulon","Mustafa"}));
    Formatter.setFinalComma(false);
    System.out.println(Formatter.format(new String[] {"John"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo","Zebulon"}));
    System.out.println(Formatter.format(new String[] {"John","Quasimodo","Zebulon","Mustafa"}));
  }
}