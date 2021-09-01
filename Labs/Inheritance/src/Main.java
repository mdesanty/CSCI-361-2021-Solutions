public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.testAddOperation();
        main.testSubtractOperation();

        /* Expected output:
        *
        * Left operand: 0
        * Right operand: 0
        * Result: 0
        *
        * Left operand: -1
        * Right operand: 4
        * Result: 3
        *
        * Left operand: 0
        * Right operand: 0
        * Result: 0
        *
        * Left operand: -1
        * Right operand: 4
        * Result: -5
        */
    }

    public void testAddOperation() {
        AddOperation operation = new AddOperation(4, 2);
        System.out.println("Left operand: " + operation.getLeftOperand());
        System.out.println("Right operand: " + operation.getRightOperand());
        System.out.println("Result: " + operation.execute());

        System.out.println("");
        operation.setLeftOperand(-1);
        operation.setRightOperand(4);
        System.out.println("Left operand: " + operation.getLeftOperand());
        System.out.println("Right operand: " + operation.getRightOperand());
        System.out.println("Result: " + operation.execute());
    }

    public void testSubtractOperation() {
        SubtractOperation operation = new SubtractOperation(4, 2);
        System.out.println("");
        System.out.println("Left operand: " + operation.getLeftOperand());
        System.out.println("Right operand: " + operation.getRightOperand());
        System.out.println("Result: " + operation.execute());

        System.out.println("");
        operation.setLeftOperand(-1);
        operation.setRightOperand(4);
        System.out.println("Left operand: " + operation.getLeftOperand());
        System.out.println("Right operand: " + operation.getRightOperand());
        System.out.println("Result: " + operation.execute());
    }
}