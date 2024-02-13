class Calculator{
    /**
     * The function "add" takes two float numbers as input and returns their sum.
     * 
     * @param num1 The first number to be added.
     * @param num2 The second number to be added.
     * @return The sum of num1 and num2.
     */
    float add(float num1,float num2){
        return num1+num2;
    }

    /**
     * The function "sub" subtracts two numbers and returns the result.
     * 
     * @param num1 The first number to be subtracted.
     * @param num2 The second number to be subtracted from the first number.
     * @return the difference between `num1` and `num2`.
     */
    float sub(float num1,float num2){
        return num1-num2;
    }
  /**
   * The function "mul" takes two float numbers as input and returns their product.
   * 
   * @param num1 The first number to be multiplied.
   * @param num2 The second number to be multiplied.
   * @return the product of num1 and num2.
   */
    float mul(float num1,float num2){
        return num1*num2;
    }
  /**
   * The function div takes two float numbers as input and returns their division.
   * 
   * @param num1 The first number to be divided.
   * @param num2 The second number that will be divided by the first number.
   * @return the result of dividing `num1` by `num2`.
   */
    float div(float num1,float num2){
        return num1/num2;
    }
    // The code `public static void main(String[] args)` is the main method in Java. It is the entry
    // point of the program and is automatically called when the program is run.
    float sqr(float num1){
        return num1*num1;
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        float num1=10;
        float num2=10;
// The code `float add=c.add(num1,num2);` is calling the `add` method of the `calculator` class and
// passing `num1` and `num2` as arguments. It assigns the result of the addition to the variable `add`.

        float add=c.add(num1,num2);
        System.out.println("Result for add="+add);
// The code `float sub=c.sub(num1,num2);` is calling the `sub` method of the `calculator` class and
// passing `num1` and `num2` as arguments. It assigns the result of the subtraction to the variable
// `sub`. Then, `System.out.println("Result="+sub);` prints the result of the subtraction to the
// console.

        float sub=c.sub(num1,num2);
        System.out.println("Result for sub="+sub);
// The code `float mul=c.mul(num1,num2);` is calling the `mul` method of the `calculator` class and
// passing `num1` and `num2` as arguments. It assigns the result of the multiplication to the variable
// `mul`. Then, `System.out.println("Result="+mul);` prints the result of the multiplication to the
// console.

        float mul=c.mul(num1,num2);
        System.out.println("Result for mul="+mul);
// The code `float div=c.div(num1,num2);` is calling the `div` method of the `calculator` class and
// passing `num1` and `num2` as arguments. It assigns the result of the division to the variable `div`.
// Then, `System.out.println("Result="+div);` prints the result of the division to the console.

        float div=c.div(num1,num2);
        System.out.println("Result for div="+div);


        float sqr=c.sqr(num1);
        System.out.println("Result for sub="+sqr);
    }
}
