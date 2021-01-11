class Sum{
  public static void main(String[] args){
    int s = 0;
    for (int i = 0; i < args.length; ++i){
      s+=Integer.parseInt(args[i]);
    }

    for(String arg : args){
      s+= Integer.parseInt(arg);
    }
    System.out.println(s);
    System.out.println("C:\\");
    System.out.printf("%d darabszám volt", args.length);
  }
}