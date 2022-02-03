package BinaryLight;
/**
 * @apiNote Интерфейс для бинарных гирлянд. Их может быть несколько
 */
public interface BinaryLight {

    public int getCurrentState();

    public void setCurrentState(int newState);

    public void blink();

    public void shiftLeft();

    public void shiftRight();

} // end interface BinaryLight
