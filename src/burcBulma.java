import java.util.Scanner;
public class burcBulma {
    public static void main(String[] args) {

        int ay,gun;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        gun = input.nextInt();

        if (ay == 1 && gun >=22){
            System.out.print("Burcunuz Kova");

        }else if (ay == 1){
            System.out.print("Burcunuz Oğlak");
        }
        if (ay == 2 && gun >=20){
            System.out.print("Burcunuz Balık");
        }else if (ay == 2){
            System.out.print("Burcunuz Kova");
        }
        if (ay == 3 && gun >=21){
            System.out.print("Burcunuz Koç");
        }else if (ay == 3){
            System.out.print("Burcunuz Balık");
        }
        if (ay == 4 && gun >=21){
            System.out.print("Burcunuz Boğa");
        }else if (ay == 4){
            System.out.print("Burcunuz Koç");
        }
        if (ay == 5 && gun >=22){
            System.out.print("Burcunuz İkizler");
        }else if (ay == 5){
            System.out.print("Burcunuz Boğa");
        }
        if (ay == 6 && gun >=23){
            System.out.print("Burcunuz Yengeç");
        }else if (ay == 6){
            System.out.print("Burcunuz İkizler");
        }
        if (ay == 7 && gun >=23){
            System.out.print("Burcunuz Aslan");
        }else if (ay == 7){
            System.out.print("Burcunuz Yengeç");
        }
        if (ay == 8 && gun >=23){
            System.out.print("Burcunuz Başak");
        }
        else if (ay == 8){
            System.out.print("Burcunuz Aslan");
        }
        if (ay == 9 && gun >=23){
            System.out.print("Burcunuz Terazi");
        }else if (ay == 9){
            System.out.print("Burcunuz Başak");
        }
        if (ay == 10 && gun >=23){
            System.out.print("Burcunuz Akrep");
        }else if (ay == 10){
            System.out.print("Burcunuz Terazi");
        }
        if (ay == 11 && gun >=22){
            System.out.print("Burcunuz Yay");
        }else if (ay == 11){
            System.out.print("Burcunuz Akrep");
        }
        if (ay == 12 && gun >=22){
            System.out.print("Burcunuz Oğlak");
        }else if (ay == 12){
            System.out.print("Burcunuz Yay");
        }



    }

}
