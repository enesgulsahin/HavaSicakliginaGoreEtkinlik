import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz:");
        sicaklik = inp.nextInt();
        if (sicaklik < 5) {
            System.out.print("Kayak yapabilirsin.");
        }else if(sicaklik >=5 && sicaklik <10){
            System.out.print("Sinemaya gidebilirsin.");
        }else if(sicaklik >15 && sicaklik <=25){
        System.out.print("Piknik yapabilirsin.");
        }else if(sicaklik >= 10 && sicaklik <=15){
            System.out.print("Sinemaya gidebilirsin veya piknik yapabilirsin.");
        }else if(sicaklik > 25){
            System.out.print("Yüzmeye gidebilirsin.");
        }




    }

}





