import java.util.Scanner;

public class MainMenu {

    public static void currentMenu(BinaryLight garland) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добрый день!");
        System.out.println("Текущее состояние гирлянды:");

        while (true) {
        System.out.println("Выберете один из вариантов работы гирлянды: ");
        System.out.println("0 -  текущее состояние гирлянды");
        System.out.println("1 -  лампочками гирлянды мигают заданное количество раз");
        System.out.println("2 -  гирлянду запускается в режим бегущей строки");
        System.out.println("3 -  выход из программы");

                switch (scanner.nextInt()) {
                    case 0:
                        GarlandServices.printBinary(garland);
                        break;

                    case 1:
                        System.out.println("Введите кол-во повторений(1-32): ");
                        int count = scanner.nextInt();
                        GarlandServices.flashLight(garland, count);
                        break;

                    case 2:
                        System.out.println("Введите направление(1/0): ");
                        int direction = scanner.nextInt();
                        System.out.println("Введите кол-во повторений(1-32): ");
                        count = scanner.nextInt();
                        GarlandServices.runningLight(garland, direction, count);
                        break;

                    case 3:
                        System.exit(0);
                        break;

                }//end switch
        }//end while
    }//end void mainMenu
}//end class MainMenu
