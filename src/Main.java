import BinaryLight.BinaryLight;
import BinaryLight.LightFirst;


public class Main {

    public static void main(String[] args) {

        BinaryLight grlnd = new LightFirst();
        grlnd.setCurrentState(0b00000000_10000000_10000000_100000000);
        MainMenu.currentMenu(grlnd);
        // write your code here


    }
}
