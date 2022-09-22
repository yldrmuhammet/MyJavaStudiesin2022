import java.util.Scanner;

class SimpleArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  

    System.out.println("A sayısını Giriniz :");
    int a = input.nextInt();
    System.out.println("B sayısını Giriniz :");
    int b = input.nextInt();
    System.out.println("C sayısını Giriniz :");
    int c = input.nextInt();

    if (a>b && a>c) {
      if (b > c){
        System.out.println("Sayı Sıralaması a>b>c :");
      }
      else{
        System.out.println("Sayı Sıralaması a>c>b :");
      }
    }

    if (b>a && b>c) {
        if (a > c){
          System.out.println("Sayı Sıralaması b>a>c :");
        }
        else{
          System.out.println("Sayı Sıralaması b>c>a :");
        }
    }

    if (c>a && c>b) {
      if (a > c){
        System.out.println("Sayı Sıralaması c>a>b :");
      }
      else{
        System.out.println("Sayı Sıralaması c>b>a :");
      }
    }

    input.close();
  }
}
