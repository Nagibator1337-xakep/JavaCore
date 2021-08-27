package homework.homeWork13;

public class App1 {
    public static void main(String[] args) {
        CasioClock myClock = new CasioClock(23,57);
//        myClock.setHours(0);
//        myClock.setMinutes(0);
//        myClock.setFormat(Format.MILITARY);
        System.out.println(myClock.showTime());
//
        myClock.setFormat(Format.AM_PM);
        System.out.println(myClock.showTime());
//        myClock.setHours(23);
//        myClock.setMinutes(0);
//        myClock.showTime();
//
//        myClock.setFormat(Format.MILITARY);
//        myClock.showTime();

        CasioClock clockTwo = new CasioClock(Format.AM_PM,AmPm.PM,13,57);
        System.out.println(clockTwo.showTime());
        System.out.println(clockTwo.getAmPm());

    }
}
