/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays {
    enum Days {
        Monday("ONE"),
        Tuesday("TWO"),
        Wednesday("THREE"),
        Thursday("FOUR"),
        Friday("FIVE"),
        Saturday("SIX"),
        Sunday("SEVEN");

        private final String code;

        Days(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    public void nameOfDay(String code) {
        for (Days day : Days.values()) {
            if (day.getCode().equalsIgnoreCase(code)) {
                System.out.println(day);
                return;
            }
        }
    }
}


