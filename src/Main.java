import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day= input.nextInt();

        if (month>=1 && month<=12){
            if (month==1 && (day>=1 && day<=21)) {
                System.out.print("Burcunuz: Oğlak");
            }
            else if(month==1 && (day>21 && day<=31)){
                System.out.print("Burcunuz: Kova");
            }
            else if (((month==1 && !(day>=1 && day<=31)))){
                System.out.print("Hatalı bir gün girdiniz.Lütfen tekrar deneyiniz.");
            }
            if (month==2 && (day>=1 && day<20)) {
                System.out.print("Burcunuz: Kova");
            }
            else if (month==2 && (day>=20 && day<=29)) {
                System.out.print("Burcunuz: Balık");
            }
            else if (((month==2 && !(day>=1 && day<=29)))){
                System.out.println("Hatalı bir gün girdiniz.Lütfen tekrar deneyiniz.");
            }
            if (month==3 && (day>=1 && day<21)) {
                System.out.println("Burcunuz: Balık");
            }
            else if (month==3 && (day>=21 && day<=31)) {
                System.out.print("Burcunuz: Koç");
            }
            else if (((month==3) && !(day>=1 && day<=31))){
                System.out.println("Hatalı bir gün girdiniz.Lütfen tekrar deneyiniz.");
            }
            if (month==4 && (day>=1 && day<21)) {
                System.out.println("Burcunuz: Koç");
            }
            else if (month==4 && (day>=21 && day<=30)){
                System.out.print("Burcunuz: Boğa");
            }
            else if (((month==4) && !(day>=1 && day<=30))) {
                System.out.println("Hatalı bir gün girdiniz.Lütfen tekrar deneyiniz.");
            }
            if (month==5 && (day>=1 && day<22)) {
                System.out.println("Burcunuz: Boğa");
            }
            else if(month==5 && (day>=22 && day<=31)) {
                System.out.print("Burcunuz: İkizler");
            }
            else if (((month==5) && !(day>=1 && day<=31))){
                System.out.println("Hatalı bir gün girdiniz.Lütfen tekrar deneyiniz.");
            }
            if (month==6 && (day>=1 && day<23)) {
                System.out.println("Burcunuz: İkizler");
            }
            else if (month==6 && (day>=23 && day<=30)){
                System.out.print("Burcunuz: Yengeç");
            }
            else if (((month==6 && !(day>=1 && day<=30)))){
                System.out.println("Hatalı bir gün girdiniz.Lütfen tekrar deneyiniz.");
            }
            if (month==7 && (day>=1 && day<23)) {
                System.out.println("Burcunuz: Yengeç");
            }
            else if (month == 7 && (day>=23 && day<=31)) {
                System.out.print("Burcunuz: Aslan");
            }
            else if (((month == 7 && !(day >= 1 && day <= 31)))) {
                System.out.println("Hatalı bir gün girdiniz.Lütfen tekrar deneyiniz.");
            }
            if (month==8 && (day>=1 && day<23)) {
                System.out.println("Burcunuz: Aslan");
            } else if (month==8 && (day>=23 && day<=31)){
                System.out.print("Burcunuz: Başak");
            }
            else if (((month==8 && !(day>=1 && day<=31)))){
                System.out.println("Hatalı bir gün girdiniz.Lütfen tekrar deneyiniz.");
            }
            if (month==9 && (day>=1 && day<23)) {
                System.out.println("Burcunuz: Başak");
            } else if(month==9 && (day>=23 && day<=30)){
                System.out.print("Burcunuz: Terazi");
            }
            else if (((month==9 && !(day>=1 && day<=30)))){
                System.out.println("Hatalı bir gün girdiniz.Lütfen tekrar deneyiniz.");
            }
            if (month==10 && (day>=1 && day<23)) {
                System.out.println("Burcunuz: Terazi");
            } else if (month==10 && (day>=23 && day<=31)){
                System.out.print("Burcunuz: Akrep");
            }
            else if (((month==10 && !(day>=1 && day<=30)))){
                System.out.println("Hatalı bir gün girdiniz.Lütfen tekrar deneyiniz.");
            }
            if (month==11 && (day>=1 && day<22)) {
                System.out.println("Burcunuz: Akrep");
            } else if(month==11 && (day>=22 && day<=30)){
                System.out.print("Burcunuz: Yay");
            }
            else if (((month==11 && !(day>=1 && day<=30)))){
                System.out.println("Hatalı bir gün girdiniz.Lütfen tekrar deneyiniz.");
            }
            if (month==12 && (day>=1 && day<22)) {
                System.out.println("Burcunuz: Yay");
            } else if (month==12 && (day>=22 && day<=31)){
                System.out.print("Burcunuz: Oğlak");
            }
            else if (((month==12 && !(day>=1 && day<=31)))){
                System.out.println("Hatalı bir gün girdiniz.Lütfen tekrar deneyiniz.");
            }
        } else {
            System.out.println("Hatalı bir ay girdiniz.Lütfen tekrar deneyiniz.");
        }
    }
}