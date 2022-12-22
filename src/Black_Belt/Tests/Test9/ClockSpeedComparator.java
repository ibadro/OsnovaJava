package Black_Belt.Tests.Test9;


import java.util.Comparator;

public class ClockSpeedComparator implements Comparator<CPU> {
    @Override
    public int compare(CPU cpu1, CPU cpu2) {
        if (cpu1.getClockSpeed() == cpu2.getClockSpeed()){
            return 0;
        }else if (cpu1.getClockSpeed() < cpu2.getClockSpeed()){
            return -1;
        }else {
            return 1;
        }
    }
}
