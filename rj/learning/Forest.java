package rj.learning;

import java.time.LocalDate;

public class Forest {

    public static void main(String[] args) {
        var tiger = new Tiger();
        tiger.setSecondColor("Black");
        tiger.setMainColor("White");
        tiger.setBirthdate(LocalDate.of(1989, 1, 7));

        System.out.println(tiger);
    }

}