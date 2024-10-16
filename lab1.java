package lab1;

import java.util.Scanner;


	public class lab1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();
	        
	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();
	        
	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);
	        
	        double result;
	        
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                result = num1 / num2;
	                break;
	            default:
	                System.out.printf("Error! operator is not correct");
	                return;
	        }
	        
	        System.out.printf("%.1f %c %.1f = %.1f", num1, operator, num2, result);
	    }
	}



