public class SubtractOperation extends BinaryOperation {
    public SubtractOperation() {
        super();
    }

    public SubtractOperation(int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public int execute() {
        return getLeftOperand() - getRightOperand();
    }
}