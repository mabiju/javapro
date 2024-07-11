package F_Data_Types;

public class n_array_sin_index {
    public static void main(String[] args) {
        int stuMarks[];
        stuMarks = new int[5];
        stuMarks[0] = 23;
        stuMarks[1] = 45;
        stuMarks[2] = 22;
        stuMarks[3] = 90;
        stuMarks[4] = 67;

        System.out.println(stuMarks[2]); // 22
        System.out.println(stuMarks[22]); // Exception
    }
}
