package datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        //LocalDate: Chỉ ngày tháng năm
        LocalDate today = LocalDate.now();
        //of: Tạo thời gian
        LocalDate birthday = LocalDate.of(2004, 7, 8);

       // Cộng trừ thời gian
        System.out.println(today.plusDays(10));
        System.out.println(today.minusMonths(1));

        //LocalTime: Chỉ h phút giây
        LocalTime now = LocalTime.now();

        //Formater để format ngày theo đúng định dạng mong muốn
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String str = today.format(formatter);
        //parse dùng để chuyển sang kiểu date
        LocalDate date = LocalDate.parse("20/07/2026", formatter);
        System.out.println(date);

        //Period: Khoảng cách năm tháng ngày
        Period age = Period.between(
                LocalDate.of(2004, 5, 20),
                LocalDate.now());
        System.out.println(age.getYears());
        //Duration: Khoảng cách h phút giây
        Duration d = Duration.between(
                LocalTime.of(8, 0),
                LocalTime.of(10, 30));
        System.out.println(d.toMinutes());
        //Phương thức so sánh before: trước, after:sau, equal: bằng
        System.out.println(birthday.isBefore(date));
        System.out.println(birthday.isAfter(date));
        System.out.println(birthday.isEqual(date));


    }

}
