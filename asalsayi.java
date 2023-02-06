package Giris;

public class asalsayi {
    public static void main(String[] args) {
        int i=2,n=2,asal=0;
        while(i<=100){
            asal=0;
        if(i%n==0){
            i++;
            }else if(i%n!=0){
            while(n<i){
                if(i%n!=0){
                    asal=i;
                    n++;
                }else{
                    asal=0;
                    n=i;
                }

            }i++;
            n=2;

        }if(asal>0){
                System.out.print(asal+",");
            }
        }
    }
}
