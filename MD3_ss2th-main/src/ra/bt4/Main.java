package ra.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để nhập cân nặng và chiều cao từ người dùng
        Scanner input = new Scanner(System.in);

        // Nhập cân nặng (kilogram) và chiều cao (meters) từ người dùng
        System.out.print("Nhập cân nặng của bạn (kg): ");
        double weight = input.nextDouble();

        System.out.print("Nhập chiều cao của bạn (m): ");
        double height = input.nextDouble();

        // Tính chỉ số BMI
        double bmi = weight / (height * height);

        // Phân loại chỉ số BMI và diễn giải
        if (bmi < 18.5) {
            System.out.printf("BMI của bạn là %.2f, được phân loại là Underweight (Thiếu cân).%n", bmi);
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.printf("BMI của bạn là %.2f, được phân loại là Normal (Bình thường).%n", bmi);
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.printf("BMI của bạn là %.2f, được phân loại là Overweight (Thừa cân).%n", bmi);
        } else {
            System.out.printf("BMI của bạn là %.2f, được phân loại là Obese (Béo phì).%n", bmi);
        }

        // Đóng đối tượng Scanner sau khi sử dụng
        input.close();
    }
}
