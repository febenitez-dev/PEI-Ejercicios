package ExercisesSet1;

public class ExercisesSet1 {

    // 1.
    public int hello() {
        //TODO: Make this return 1
        return 1;
    }

    // 2.
    public void helloWorld() {
        //print "Hello World"
        System.out.println("Hello World");
    }

    // 3.
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        int ret = -1;
        if(hours>=0){
            ret = hours*60;
        }
        return ret;
    }

    // 4.
    public boolean isPass(int marks) {
        // Update Code : If the student's marks are greater than 50, they have passed the exam.
        return marks > 50;
    }

    // 5.
    public long calculateSumOfSquares(int n) {
        // write your code here
        int ret = -1;
        if (n>=0) {
            ret=0;
            for(int i = 1; i<=n; i++) {
                ret = ret + (i*i);
            }
        }
        return ret;
    }
}
