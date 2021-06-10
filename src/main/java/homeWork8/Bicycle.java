package homeWork8;

public class Bicycle {
    public String brand = "Default Brand";
    public String model = "Default Model";
    public String type = "Type";
    public String size = "M";
    public int gearsFront = 1;
    public int gearsBack = 1;
    private int currentGearFront = 1;
    private int currentGearBack = 1;

    public void gearUpFront() {
        if (gearsFront > 1 && currentGearFront < gearsFront) {
            currentGearFront++;
            shiftedGear(1, "Front", "Up");
        } else if (gearsFront == 1 && currentGearFront != gearsFront)
            System.out.println("Cannot shift, only one front gear on your " + brand + " bike");
        else System.out.println("Cannot shift up, your " + brand + " bike is on highest front gear");
    }

    public void gearsUpFront(int gearsUp) {
        if (gearsFront > 1 && currentGearFront < gearsFront && gearsFront - currentGearFront >= gearsUp && gearsUp != 1) {
            currentGearFront += gearsUp;
            shiftedGear(gearsUp, "Front", "Up");
        } else if (gearsUp == 1 && currentGearFront != gearsFront) {
            currentGearFront++;
            shiftedGear(1, "Front", "Up");
        } else if (gearsFront == 1 && currentGearFront != gearsFront)
            System.out.println("Cannot shift, only one front gear on your " + brand + " bike");
        else if (gearsFront - currentGearFront < gearsUp && currentGearFront != gearsFront)
            System.out.println("Your " + brand + " bike is on " + currentGearFront + " front gear of " + gearsFront + ", cannot shift up " + gearsUp);
        else
            System.out.println("Cannot shift up, your " + brand + " bike is on highest front gear");            // if currentGearFront == gearsFront

    }

    public void gearUpBack() {
        if (gearsBack > 1 && currentGearBack < gearsBack) {
            currentGearBack++;
            shiftedGear(1, "Back", "Up");
        } else if (gearsBack == 1 && currentGearBack != gearsBack)
            System.out.println("Cannot shift, only one back gear on your " + brand + " bike");
        else System.out.println("Cannot shift up, your " + brand + " bike is on highest back gear");
    }

    public void gearsUpBack(int gearsUp) {
        if (gearsBack > 1 && currentGearBack < gearsBack && gearsBack - currentGearBack >= gearsUp && gearsUp != 1) {
            currentGearBack += gearsUp;
            shiftedGear(gearsUp, "Back", "Up");
        } else if (gearsUp == 1 && currentGearBack != gearsBack) {
            currentGearBack++;
            shiftedGear(1, "Back", "Up");
        } else if (gearsBack == 1 && currentGearBack != gearsBack)
            System.out.println("Cannot shift, only one back gear on your " + brand + " bike");
        else if (gearsBack - currentGearBack < gearsUp && currentGearBack != gearsBack)
            System.out.println("Your " + brand + " bike is on " + currentGearBack + " back gear of " + gearsBack + ", cannot shift up " + gearsUp);
        else
            System.out.println("Cannot shift up, your " + brand + " bike is on highest back gear");         // if currentGearBack==gearsBack
    }

    public void gearDownFront() {
        if (gearsFront > 1 && currentGearFront <= gearsFront && currentGearFront > 1) {
            currentGearFront--;
            shiftedGear(1, "Front", "Down");
        } else if (gearsFront == 1 && currentGearFront != 1)
            System.out.println("Cannot shift, only one front gear on your " + brand + " bike");
        else
            System.out.println("Cannot shift down, your " + brand + " bike is on lowest front gear");           // if currentGearFront == 1
    }

    public void gearsDownFront(int gearsDown) {
        if (gearsFront > 1 && currentGearFront <= gearsFront && currentGearFront - gearsDown > 0 && gearsDown != 1) {
            currentGearFront -= gearsDown;
            shiftedGear(gearsDown, "Front", "Down");
        } else if (gearsDown == 1 && currentGearFront != 1) {
            currentGearFront--;
            shiftedGear(1, "Front", "Down");
        } else if (gearsFront == 1 && currentGearFront != 1)
            System.out.println("Cannot shift, only one front gear on your " + brand + " bike");
        else if (currentGearFront - gearsDown <= 0 && currentGearFront != 1)
            System.out.println("Your " + brand + " bike is on " + currentGearFront + " front gear of " + gearsFront + ", cannot shift down " + gearsDown);
        else
            System.out.println("Cannot shift down, your " + brand + " bike is on lowest front gear");    // if currentGearFront == 1
    }

    public void gearDownBack() {
        if (gearsBack > 1 && currentGearBack <= gearsBack && currentGearBack > 1) {
            currentGearBack--;
            shiftedGear(1, "Back", "Front");
        } else if (gearsBack == 1 && currentGearBack != 1)
            System.out.println("Cannot shift, only one back gear on your " + brand + " bike");
        else
            System.out.println("Cannot shift down, your " + brand + " bike is on lowest back gear");           // if currentGearBack == 1
    }

    public void gearsDownBack(int gearsDown) {
        if (gearsBack > 1 && currentGearBack <= gearsBack && currentGearBack - gearsDown > 0 && gearsDown != 1) {
            currentGearBack -= gearsDown;
            shiftedGear(gearsDown, "Back", "Down");
        } else if (gearsDown == 1 && currentGearBack != 1) {
            currentGearBack--;
            shiftedGear(gearsDown, "Back", "Down");
        } else if (gearsBack == 1 && currentGearBack != 1)
            System.out.println("Cannot shift, only one back gear on your " + brand + " bike");
        else if (currentGearBack - gearsDown <= 0 && currentGearBack != 1)
            System.out.println("Your " + brand + " bike is on " + currentGearBack + " back gear of " + gearsBack + ", cannot shift down " + gearsDown);
        else
            System.out.println("Cannot shift down, your " + brand + " bike is on lowest back gear");           // if currentGearBack == 1
    }

    public void getCurrentGearFront() {
        System.out.println("Current front gear on your " + brand + " bike is " + currentGearFront);
    }

    public void getCurrentGearBack() {
        System.out.println("Current back gear on your " + brand + " bike is " + currentGearBack);
    }

    public void setFrontGear(int gear) {
        if (gear <= gearsFront && gear > 0 && gearsFront + gearsBack != 2) {
            currentGearFront = gear;
            System.out.println("Front gear on your " + brand + " bike is shifted to " + currentGearFront + " of " + gearsFront);
        } else if (gearsFront + gearsBack == 2) thisIsFixed();
        else if (gear > gearsFront && gearsFront + gearsBack != 2)
            System.out.println("Cannot shift, only " + gearsFront + " front gears on your " + brand + " bike");
        else System.out.println("Select positive front gear value");
    }

    public void setBackGear(int gear) {
        if (gear <= gearsBack && gear > 0 && gearsFront + gearsBack != 2) {
            currentGearBack = gear;
            System.out.println("Back gear on your " + brand + " bike is shifted to " + currentGearBack + " of " + gearsBack);
        } else if (gearsFront + gearsBack == 2) thisIsFixed();
        else if (gear > gearsBack && gearsFront + gearsBack != 2)
            System.out.println("Cannot shift, only " + gearsBack + " back gears on your " + brand + " bike");
        else System.out.println("Select positive back gear value");
    }

    public void getTotalGears() {
        if (gearsFront * gearsBack == 1) {
            System.out.println("Your " + brand + " is a fixed bike");
        } else System.out.println("There are " + (gearsFront * gearsBack) + " gears total on your " + brand + " bike");
    }


    //----------------------------------------------
    //METHODS
    //----------------------------------------------

    private void thisIsFixed() {
        System.out.println("Your " + brand + " is a fixed bike, cannot shift");
    }

    private void shiftedGear(int gearsShifted, String frontBack, String upDown) {
        String capLocation;
        String location;
        String locationVars;
        String direction;
        String oneOrMany;


        if (gearsShifted != 1) {
            oneOrMany = gearsShifted + " gears";
        } else oneOrMany = "one gear";

        if (frontBack.equals("Front") || frontBack.equals("front")) {
            capLocation = "Front ";
            location = " front ";

            String[] numIndex = new String[gearsFront+1];
            for (int i = 1; i < numIndex.length; i++) {
                if (i % 10 == 1) {
                    numIndex[i] = "st";
                } else if (i % 10 == 2) {
                    numIndex[i] = "nd";
                } else if (i % 10 == 3) {
                    numIndex[i] = "rd";
                } else numIndex[i] = "th";
            }

            locationVars = currentGearFront + numIndex[currentGearFront] + " out of " + gearsFront;
        } else {
            capLocation = "Back ";
            location = " back ";
            String[] numIndex = new String[gearsBack+1];
            for (int i = 1; i < numIndex.length; i++) {
                if (i % 10 == 1) {
                    numIndex[i] = "st";
                } else if (i % 10 == 2) {
                    numIndex[i] = "nd";
                } else if (i % 10 == 3) {
                    numIndex[i] = "rd";
                } else numIndex[i] = "th";
            }
            locationVars = currentGearBack + numIndex[currentGearBack] + " out of " + gearsBack;
        }
        if (upDown.equals("Up") || upDown.equals("up")) {
            direction = " up. ";
        } else direction = " down. ";
        System.out.println("----------");
        System.out.println(capLocation + "gear on your " + brand + " bike has shifted " + oneOrMany + direction + "Current" + location + "gear is now set to " + locationVars);
        System.out.println("----------");

    }
}