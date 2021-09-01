public class AddOperation extends BinaryOperation {
  public AddOperation() {
    super();
  }

  public AddOperation(int leftOperand, int rightOperand) {
    super();
  }

  @Override
  public int execute() {
    return getLeftOperand() + getRightOperand();
  }
}