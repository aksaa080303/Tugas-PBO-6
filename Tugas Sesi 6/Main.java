package Tugas_6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Laptop thinkpad = new Lenovo();
        // Laptop toshhiba = new Toshiba();
        // LaptopUser budi = new LaptopUser(toshhiba);
        // LaptopUser andri = new LaptopUser(thinkpad);
        // andri.turnOnLaptop();
        // andri.makeLaptopLouder();
        // andri.makeLaptopLouder();
        // andri.makeLaptopSilence();
        // andri.turnOffLaptop();
        // budi.turnOnLaptop();
        // budi.makeLaptopLouder();
        // budi.makeLaptopLouder();
        // budi.makeLaptopLouder();
        // budi.makeLaptopSilence();
        // budi.turnOffLaptop();
    
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih laptop yang ingin digunakan: LENOVO / TOSHIBA / MACBOOK");
        System.out.print("Masukkan pilihan: ");
        String pilihan = input.nextLine().toUpperCase();

        Laptop laptop;

        switch (pilihan) {
            case "LENOVO":
                laptop = new Lenovo();
                break;
            case "TOSHIBA":
                laptop = new Toshiba();
                break;
            case "MACBOOK":
                laptop = new MacBook();
                break;
            default:
                System.out.println("Pilihan tidak tersedia. Default ke Lenovo.");
                laptop = new Lenovo();
        }

        LaptopUser user = new LaptopUser(laptop);

        String command;
        do {
            System.out.println("\nMenu: ON | OFF | UP | DOWN | EXIT");
            System.out.print("Masukkan perintah: ");
            command = input.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilence();
                    break;
                case "EXIT":
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Perintah tidak dikenali!");
            }
        } while (!command.equals("EXIT"));

        input.close();
        
    }
    
}
