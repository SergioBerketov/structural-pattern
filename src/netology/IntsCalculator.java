package netology;

public class IntsCalculator implements Ints {

 protected final Calculator target;

    public IntsCalculator(Calculator target) {
        this.target = new Calculator();
    }

    @Override
    public Double sum(int arg0, int arg1) {
        return target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result;
    }

    @Override
    public Double mult(int arg0, int arg1) {
        return target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result;
    }

    @Override
    public Double pow(int a, int b) {
        return target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result;
    }
}
