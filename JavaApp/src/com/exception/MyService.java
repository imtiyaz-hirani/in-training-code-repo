package com.exception;

public class MyService {

	public double divide(double n1, double n2) {
		if(n2 == 0) {
			throw new RuntimeException("dinominator cannot be zero"); 
		}	 
		int x = (int)n1;
		int y = (int)n2;
		return x/y;
	}

	public double computePercent(int marksSecured, int totalMarks) throws Exception{
		if(marksSecured > totalMarks) {
			throw new Exception("marks secured cannot be > totalMarks"); 
		}
		if(marksSecured < 0)
			throw new Exception("marks secured cannot be < 0");
		
		if(totalMarks <= 0)
			throw new Exception("totalMarks cannot be <= 0");
		
		return (marksSecured * 100) / totalMarks;
	}

	public double computePercentSelfException(int marksSecured, int totalMarks) throws MarksException{
		if(marksSecured > totalMarks) {
			throw new MarksException("marks secured cannot be > totalMarks"); 
		}
		if(marksSecured < 0)
			throw new MarksException("marks secured cannot be < 0");
		
		if(totalMarks <= 0)
			throw new MarksException("totalMarks cannot be <= 0");
		
		return (marksSecured * 100) / totalMarks;
	}
}
