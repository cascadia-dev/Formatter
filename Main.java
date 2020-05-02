class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    {
    Formatter f=new Formatter();
    System.out.println(f.format(new String[] {"John"}));
    System.out.println(f.format(new String[] {"John","Quasimodo"}));
    System.out.println(f.format(new String[] {"John","Quasimodo","Zebulon"}));
    System.out.println(f.format(new String[] {"John","Quasimodo","Zebulon","Mustafa"}));
    }

    {
    Formatter f=new Formatter();
    f.setFinalComma(false);
    System.out.println(f.format(new String[] {"John"}));
    System.out.println(f.format(new String[] {"John","Quasimodo"}));
    System.out.println(f.format(new String[] {"John","Quasimodo","Zebulon"}));
    System.out.println(f.format(new String[] {"John","Quasimodo","Zebulon","Mustafa"}));
    }

    {
    Formatter f=new Formatter();
    f.setFinalComma(false);
    f.setConnectorSymbol("; ");
    f.setConnectorString("; and ");
    System.out.println(f.format(new String[] {"John"}));
    System.out.println(f.format(new String[] {"John, the plain","Quasimodo, the crooked"}));
    System.out.println(f.format(new String[] {"John, the plain","Quasimodo, the crooked","Zebulon, the confused"}));
    System.out.println(f.format(new String[] {"John, the plain","Quasimodo, the crooked","Zebulon, the confused","Mustafa, the learned"}));
    }

    {
    Formatter f=new Formatter();
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