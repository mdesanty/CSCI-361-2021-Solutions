public class SubtractOperation extends BinaryOperation {
  public SubtractOperation() {
    super();
  }

  public SubtractOperation(int leftOperand, int rightOperand) {
    super();
  }

  @Override
  public int execute() {
    return getLeftOperand() - getRightOperand();
  }
}