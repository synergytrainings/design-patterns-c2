package com.synisys.training.designpatterns.composite;

public enum Operator {

	SUM("+")  {
		@Override
		public int compute(int leftOperand, int rightOperand) {
			return leftOperand + rightOperand;
		}
	},
	SUB("-")  {
		@Override
		public int compute(int leftOperand, int rightOperand) {
			return leftOperand - rightOperand;
		}
	},
	MUL("*")  {
		@Override
		public int compute(int leftOperand, int rightOperand) {
			return leftOperand * rightOperand;
		}
	},
	DIV("/") {
		@Override
		public int compute(int leftOperand, int rightOperand) {
			return leftOperand / rightOperand;
		}
	};
	
	private String operatorAsString;
	Operator(String operatorAsString) {
		this.operatorAsString = operatorAsString;
	}
	
	@Override
	public String toString() {
		return this.operatorAsString;
	}
	public abstract int compute(int leftOperand, int rightOperand);
}
