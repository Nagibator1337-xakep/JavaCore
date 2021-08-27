package homework.homeWork13;

public class CasioClock implements Clock {
    private int hours = 0;
    private int minutes = 0;
    private Format format = Format.MILITARY;
    private AmPm amPm = AmPm.AM;

    public CasioClock() {
    }

    public CasioClock(int hours, int minutes) {
        if (hours>=0 && hours<24 && minutes>=0 && minutes<60) {
            if (hours>12 || hours == 0) {
//                this.format = Format.MILITARY;
                this.amPm = AmPm.PM;
            }
            this.hours = hours;
            this.minutes = minutes;
        }
        else System.out.println("Value out of bounds!");
    }

    public CasioClock(Format format, AmPm amPm, int hours, int minutes) {
        this.format = format;
        this.amPm = amPm;
        this.minutes = minutes;
        if (hours>=0 && hours<24) {
            if (format == Format.AM_PM) {
                if(hours>12) {
                    this.hours = hours-12;
                    System.out.println("Due to chosen AM/PM format time changed to "+this.showTime());
                    this.amPm = AmPm.PM;
                }
                else if (hours==0) {
                    this.hours = 12;
                    System.out.println("Due to chosen AM/PM format time changed to "+this.showTime());
                    this.amPm = AmPm.AM;
                } else {
                    this.hours = hours;
                }
            }
            else {
                if (amPm == AmPm.AM && hours >= 12) {
                    this.amPm = AmPm.PM;
                    System.out.println("Due to chosen format and hour AM modifier changed to PM");
                }
                else if (amPm == AmPm.PM && hours < 12) {
                    this.hours = hours+12;
                    System.out.println("Due to chosen format and PM modifier time changed to "+this.showTime());
                } else {
                    this.hours = hours;
                }
            }

//            if (format == Format.AM_PM && hours>12) {
//                this.hours = hours-12;
//                System.out.println("Due to chosen AM/PM format "+hours+" hours changed to "+this.hours+" PM");
//                this.amPm = AmPm.PM;
//            } else if (format==Format.AM_PM && hours==0) {
//                this.hours = 12;
//                System.out.println("Due to chosen AM/PM format "+hours+" hours changed to "+this.hours+" AM");
//                this.amPm = AmPm.AM;
//            } else if (format==Format.MILITARY && amPm == AmPm.AM && hours >= 12) {
//                this.amPm = AmPm.PM;
//                System.out.println("Due to chosen format and hour AM modifier changed to PM");
//            } else if (format==Format.MILITARY && amPm == AmPm.PM && hours < 12) {
//                this.hours = hours+12;
//                System.out.println("Due to chosen format and PM modifier time changed to "+this.hours);
//            }
//            this.hours = hours;
//            this.minutes = minutes;

        }
        else System.out.println("Enter value 0 to 23");
        if (minutes>=0 && minutes<60) this.minutes = minutes;
        else System.out.println("Enter value 0 to 59");
    }

    @Override
    public int getHours() {
        return this.hours;
    }

    @Override
    public int getMinutes() {
        return this.minutes;
    }

    @Override
    public Format getFormat() {
        return this.format;
    }

    @Override
    public AmPm getAmPm() {
        return this.amPm;
    }

    @Override
    public void setHours(int hours) {
        if (hours>=0 && hours<24) {
            if (this.format == Format.AM_PM && (hours>12 || hours == 0)) {
                this.format = Format.MILITARY;
                System.out.println("Format changed to Military");
                this.amPm = AmPm.PM;
            }
            this.hours = hours;
        }
        else System.out.println("Enter value 0 to 23");
    }

    @Override
    public void setMinutes(int minutes) {
        if (minutes>=0 && minutes<60) this.minutes = minutes;
        else System.out.println("Enter value 0 to 59");
    }

    @Override
    public void setFormat(Format format) {
        if (format == Format.MILITARY && this.format == Format.AM_PM){
            if (this.hours == 12 && this.amPm == AmPm.AM) this.hours = 0;
            else if (this.hours < 12 && this.amPm == AmPm.PM) this.hours = this.hours + 12;
        }
        else if (format == Format.AM_PM && this.format == Format.MILITARY) {
            if (this.hours>12) {
                this.hours = this.hours - 12;
                this.amPm = AmPm.PM;
            } else if (this.hours==0) {
                this.hours = 12;
                this.amPm = AmPm.AM;
            } else if (this.hours == 12) {
                this.amPm = AmPm.PM;
            } else this.amPm = AmPm.AM;
        }

//        if (format == Format.AM_PM && this.hours>12) {
//            this.hours = this.hours - 12;
//            this.amPm = AmPm.PM;
//        } else if (format == Format.AM_PM && this.hours==0) {
//            this.hours = 12;
//            this.amPm = AmPm.AM;
//        } else if (format == Format.MILITARY && this.format == Format.AM_PM) {
//            if (this.hours == 12 && this.amPm == AmPm.PM) this.hours = 24;
//            else if (this.hours == 12 && this.amPm == AmPm.AM) this.hours = 0;
//            else this.hours = this.hours + 12;
//        }

        this.format = format;
    }

    @Override
    public void setAmPm(AmPm amPm) {
        if (this.format == Format.MILITARY) {
            System.out.println("Can't adjust AM/PM on Military format");
        } else this.amPm = amPm;
    }

    public String showTime() {
        String hStr=Integer.toString(this.hours);
        String mStr=Integer.toString(this.minutes);
        if (this.format == Format.MILITARY && this.hours < 10) hStr = " " + this.hours;
        if (this.minutes < 10) mStr = "0" + this.minutes;
        if (this.format == Format.AM_PM) return hStr+":"+mStr+" "+this.amPm;
        else return hStr+":"+mStr;
    }
}
