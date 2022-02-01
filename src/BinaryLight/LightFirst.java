package BinaryLight;

public class LightFirst implements BinaryLight {
    // класс моделирует работу гирлянды из 32-х лампочек

    private int currentState; // текущее состояние гирлянды в 32 бита

    public void BinaryLight() {
        currentState = 0b00000000_11111111_00000000_11111111;
    } // изначальное состояние гирлянды

    public int getCurrentState() {
        return currentState;
    } // возвращает состояние битовой гирлянды

    public void setCurrentState(int newState) {
        currentState = newState;
    } // задаёт текущее состояние гирлянды

    public void blink() {
        currentState = ~currentState;
    } // инвертирует состояние битовой гирлянды

    public void shiftLeft() {
        currentState = currentState << 1;
    } // сдвиг влево

    public void shiftRight() {
        currentState = currentState >> 1;
    } // сдвиг вправо

} // end class BinaryLight
