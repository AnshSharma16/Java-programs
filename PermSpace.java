class PermSpace{
  public static void  printperm(String str){
    
        for(int i=0;i<str.length();i++){
            
            System.out.println(str.substring(0,i+1)+" "+str.substring(i+1));
        }
    }
    public static void main(String ars[]){
        String str="ABCD";
        printperm(str);
    }
}
    
    