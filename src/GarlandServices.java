public class GarlandServices {

    public static void printBinary(BinaryLight garland)
    //метод выводит на консоль число в 32 бита в 2чном формате
    {
        int value = garland.getCurrentState();

        for(int i = 31; i >= 0; i--){
            int mask = 1 << i;
            int result = (mask & value) >> i;
            System.out.print(result);
        }//end for
        System.out.println();
    }//end void printBinary

    public static void flashLight (BinaryLight garland, int count)
    //метод "мигает лампочками" заданное кол-во раз
    {
        for(int i = 1; i <= count; i++) {
            printBinary(garland);
            garland.blink();
        }
    }//end void flashLight

    public static void runningLight (BinaryLight garland, int leftOrRight, int count)
    //метод бегущей строки
    {
        if (leftOrRight == 1) {
            for(int i = 1; i <= count; i++) {
                printBinary(garland);
                garland.shiftLeft();
            }
        }
        if (leftOrRight == 0) {
            for(int i = 1; i <= count; i++) {
                printBinary(garland);
                garland.shiftRight();
            }
        }
    }//end void runningLight


}
