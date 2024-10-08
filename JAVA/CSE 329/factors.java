public class factors {
    public static void main(String[] args) {
        int n=3;
//Factors
// for(int i=1;i<=Math.sqrt(n);i++){
//     if(n%i==0){
//     System.out.print(i+","+(n/i)+",");
//     }
// }
//Prime Factors
while(n%2==0){
    System.out.print(2+",");
    n=n/2;
}
for(int i=3;i<=Math.sqrt(n);i+=2){
    while(n%i==0){
        System.out.print(i+",");
        n=n/i;
    }
}
if(n>1){
    System.out.print(n);
}
//Prime Factors without Repetition

while(n%2==0){
    System.out.print(2+",");
    n=n/2;
}
for(int i=3;i<=Math.sqrt(n);i+=2){
    while(n%i==0){
        System.out.print(i+",");
        n=n/i;
    }
}
if(n>1){
    System.out.print(n);
}
}
}
