package posttest;

public abstract class Operation implements OperationInterface {
    @Override
    public abstract double operate(double num1, double num2);
    
    // Overloaded method to operate on three numbers
    public double operate(double num1, double num2, double num3) {
        return operate(operate(num1, num2), num3);
    }
    
    // Overloaded method to operate on an array of numbers
    public double operate(double[] nums) {
        double result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = operate(result, nums[i]);
        }
        return result;
    }
}