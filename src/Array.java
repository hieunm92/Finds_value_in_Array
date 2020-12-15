import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String [] students = {"Hieu","Mung","Duyet","Dung","Toan","Viet","Ky","Bách","Hoan"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        String inputName = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Vi tri cua sinh vien " + inputName + " trong danh sach la " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Khong tim thay" + inputName + " trong danh sach");

    }
}
