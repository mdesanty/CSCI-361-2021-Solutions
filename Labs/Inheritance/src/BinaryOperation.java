public abstract class BinaryOperation {
    private int leftOperand;
    private int rightOperand;

    public BinaryOperation() {}

    public BinaryOperation(int leftOperand, int rightOperand) {
        setLeftOperand(leftOperand);
        setRightOperand(rightOperand);
    }

    public void setLeftOperand(int operand) {
       leftOperand = operand;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public void setRightOperand(int operand) {
        rightOperand = operand;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public abstract int execute();
}