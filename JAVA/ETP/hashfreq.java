import java.util.*;
public class hashfreq {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        HashMap <Character,Integer> map=new HashMap<>();
        for(char c:arr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer>e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        sc.close();
    }
}
