package Calculator;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1=0, number2=0;
        do {
            System.out.println("Scientific Calculator, Choose to perform operation");
            System.out.print("Press 1 to Square root function\nPress 2 to Factorial function\nPress 3 to Natural logrithm\nPress 4 to power function\n" +
                    "Press any  key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                return ;
            }
            try {
                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                }
                if (choice == 4) {
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                }
            } catch (InputMismatchException e) {
                logger.error("Invalid input, Entered input is not a number");
                return;
            }
            switch (choice) {
                case 1:
                    //Square root
                    System.out.println("Square root  is : " + calculator.Square_root(number1));
                    break;
                case 2:
                    //Factorial function
                    System.out.println("Factorial is : " + calculator.Fact(number1));
                    break;
                case 3:
                    // Natural Logrithm
                    System.out.println("Natural logrithm is : " + calculator.Natural_log(number1));
                    break;
                case 4:
                    //Power Function
                    System.out.println("power is : " + calculator.Power(number1, number2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

    public double Square_root(double number1) {
        double result = 0;
        try {
            logger.info("Square root of number " + number1);
            if (number1 < 0 || number1 == Double.NaN) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            } else if (number1 == Double.POSITIVE_INFINITY) {
                result = Double.POSITIVE_INFINITY;
                throw new ArithmeticException("Case of Positive Infinity 1.0/0.0");
            } else {
                result = Math.sqrt(number1);
            }
        } catch (ArithmeticException error) {
            logger.error(" sqrt of a number cannot be find" + error.getLocalizedMessage());
        } finally {
            logger.info("Result of Square root  is " + result);
        }

        return result;

}


    public double Fact(double number1)
    {          double result =0;
                try{
                logger.info("Factorial  of number " + number1 );
                if(number1==0){
                    result =0;
                }
                 else if (number1 < 0) {
                     result = Double.NaN;
                     throw new ArithmeticException("Factorial of negative number not possible");}
                else if(number1 ==1){
                    result=1;
                }
                else {
                    double fact = 1;
                    for (double i = 2; i <= number1; i++) {
                        fact = fact * i;
                    }
                    result = fact;
                }
                }
                catch (ArithmeticException error) {
                    logger.error(" Factorial of a number cannot be find" + error.getLocalizedMessage());
                } finally {
                    logger.info("Result of Factorial log is " + result);
                }
        return result;
    }

public double Natural_log(double number1) {
        double result = 0;
        try {
        logger.info("NAtural logrithm of numbers " + number1 );
        if (number1 < 0 || number1 == Double.NaN) {
        result = Double.NaN;
        throw new ArithmeticException("Case of NaN 0.0/0.0");
        } else if (number1 == Double.POSITIVE_INFINITY) {
        result = Double.POSITIVE_INFINITY;
        throw new ArithmeticException("Case of Positive Infinity 1.0/0.0");
        } else {
        result = Math.log(number1);
        }
        } catch (ArithmeticException error) {
        logger.error(" Natural logrithm of a number cannot be find" + error.getLocalizedMessage());
        } finally {
        logger.info("Result of Natural log is " + result);
        }
        return result;
        }

public double Power(double number1, double number2) {
        double result = 0;
        try {
        logger.info("power of numbers " + number1 + " and " + number2);
        if ( number2 == 0) {
        result = 1.0;
        } else if (number2 == 1.0) {
        result = number1;
        } else if ( number2 == Double.NaN) {
        result = Double.NaN;
        throw new ArithmeticException("Case of Negative Infinity 0.0/0.0");
        } else {
        result = Math.pow(number1,number2);
        }
        } catch (ArithmeticException error) {
        logger.error("powers of a number cannot be found " + error.getLocalizedMessage());
        } finally {
        logger.info("Result of power is " + result);
        }
        return result;
        }
        }
