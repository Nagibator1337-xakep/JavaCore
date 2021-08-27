package homework.homeWork13;

public interface Clock {
    int getHours();
    int getMinutes();
    Format getFormat();
    AmPm getAmPm();
    void setHours(int hours);
    void setMinutes(int minutes);
    void setFormat(Format format);
    void setAmPm(AmPm amPm);

}