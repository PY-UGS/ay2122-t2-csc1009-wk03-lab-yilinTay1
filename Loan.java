package wk03_Lab;
import java.lang.Math;
import java.util.Date;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;
    Date todayDate = new Date();

    private double monthlyPayment;
    private double monthlyInterestRate;
    private double monthlyPart2;
    private double totalPayment;

    public Loan(){ //Default 
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        this.loanDate = todayDate;
    }

    public Loan(double aIR,int noY,double lA){
        this.annualInterestRate = aIR;
        this.numberOfYears = noY;
        this.loanAmount = lA;
        this.loanDate = todayDate;
    }

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
    public int getNumberOfYears() {
		return numberOfYears;
	}
    public double getLoanAmount() {
		return loanAmount;
	}
    public Date getLoanDate() {
		return loanDate;
	}
    
	public void setAnnualInterestRate(double inputAIR) {
		this.annualInterestRate = inputAIR;
	}
	public void setNumberOfYears(int inputNY) {
		this.numberOfYears = inputNY;
	}
    public void setLoanAmount(double inputLA) {
		this.loanAmount = inputLA;
	}

    public double getMonthlyPayment() {
        monthlyInterestRate = (this.annualInterestRate/100)/12;
        monthlyPart2 = 1-(1/Math.pow((1+monthlyInterestRate), this.numberOfYears*12));
        this.monthlyPayment = (loanAmount*monthlyInterestRate)/monthlyPart2;
		
        return this.monthlyPayment;
	}

    public double getTotalPayment() {
        totalPayment = this.monthlyPayment * this.numberOfYears * 12;
		return this.totalPayment;
	}
}
