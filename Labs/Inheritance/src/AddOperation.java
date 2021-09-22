public class AddOperation extends BinaryOperation {
    public AddOperation() {
       super();
    }

    public AddOperation(int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public int execute() {
        return getLeftOperand() + getRightOperand();
    }
}