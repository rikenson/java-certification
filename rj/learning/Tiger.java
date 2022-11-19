package rj.learning;

import java.time.LocalDate;

public class Tiger extends Animal {


    protected String mainColor;
    protected String secondColor;

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public String getSecondColor() {
        return secondColor;
    }

    public void setSecondColor(String secondColor) {
        this.secondColor = secondColor;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "mainColor='" + mainColor + '\'' +
                ", secondColor='" + secondColor + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
