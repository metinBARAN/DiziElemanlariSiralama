import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int interim;
        Scanner input=new Scanner(System.in);
        System.out.println("Dizinin boyutu n: ");
        n=input.nextInt();
        int[] range=new int[n];

        System.out.println("Dizinin elemanlarini giriniz: ");
        for (int i=0;i<n;i++){
            System.out.println((i+1)+".Elemani: ");
            range[i]=input.nextInt();
        }
        System.out.println("Siralama: ");
      for (int i=0;i<(n-1);i++){
          for (int j=i+1;j<n;j++){
              if (range[j]<range[i]){
                  interim=range[i];
                  range[i]=range[j];
                  range[j]=interim;
              }
          }
      }
      for (int i=0;i<n;i++){
          System.out.println((i+1)+". Elemani: "+range[i]);
      }
    }
}
