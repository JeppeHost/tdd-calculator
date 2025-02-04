package tdd;

public class Calculator {


    public int add(int number1, int number2) {
        if(number1 >= 0 && number2 >= 0){
            return number1 + number2;
        } else {
            System.out.println("Invalid input. A number can't be less than zero.");
        }
        return 0;
    }

    public int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        String [] parts = numbers.split(",");
        int sum = 0;
        for(String num : parts){
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    public int add(int [] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }


    public int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public int divide(int number1, int number2) {
        return number1 / number2;
    }
}
