

class toh {
    public static void main(String[] args) {
        toh(3,'A','B','C');
    }
    public static void toh(int n,char from,char aux,char to){
         if(n==1){
             System.out.println("Move disk1 from rod "+from+" to rod "+to);
             return;
         }
         toh(n-1,from,to,aux);
         System.out.println("Move disk "+n+" from rod "+from+" to rod "+to);
         toh(n-1,aux,from,to);
    }
}