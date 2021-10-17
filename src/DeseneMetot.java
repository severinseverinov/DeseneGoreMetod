import java.util.Scanner;

public class DeseneMetot {
    static int Desen (int nbr1,int nbr2,int nbr3) {
        System.out.print(nbr1 + " ");

        if(nbr1>0 && nbr3==1){
            return Desen(nbr1-5,nbr2,1);
        } else if(nbr1<=0 && nbr3==1 && nbr1<nbr2){
            return Desen(nbr1+5,nbr2,2);
        } else if(nbr1>0 && nbr3==2 && nbr1<nbr2){
            return Desen(nbr1+5,nbr2,2);
        }else {;return 0;}
    }

    public static void main(String[] args) {
        int num;

        Scanner input=new Scanner(System.in);

        System.out.print("N sayısı : ");
        num=input.nextInt();
        System.out.print("Çıktısı : ");
        Desen(num,num,1);


    }
}
