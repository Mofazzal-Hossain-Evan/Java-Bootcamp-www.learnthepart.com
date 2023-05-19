import java.util.Arrays;

public class wb6_9 {
    public static void main(String[] args) {
        
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterPrice = new double[price.length];

        for(int i = 0; i < price.length; i++) {
                afterPrice[i] = price[i]*1.13;
        }
        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The after tax prices are: " + Arrays.toString(afterPrice));
    } 
}

/*
This Java code represents a program that calculates the after-tax prices for an array of items. Let's break down the code step by step:

1. The code begins with the import statement `import java.util.Arrays;` This line imports the `Arrays` class from the `java.util` package, 
which provides utility methods for working with arrays.

2. The code defines a class named `wb6_9` using the `public class` syntax. The class encapsulates the program's functionality.

3. Inside the `wb6_9` class, there is a `main` method, which serves as the entry point for the program.

4. Within the `main` method, the code declares and initializes an array called `price` with four elements: `{1.99, 2.99, 3.99, 4.99}`. 
These elements represent the original prices of the items.

5. The code creates another array called `afterPrice` with the same length as the `price` array. This array will store the calculated after-tax prices.

6. A `for` loop is used to iterate over each element of the `price` array. 
The loop variable `i` starts from 0 and goes up to the length of `price` minus 1.

7. Inside the loop, each element of `afterPrice` is calculated by multiplying the corresponding element in `price` by 1.13, 
which represents a 13% tax rate. The result is stored in `afterPrice[i]`.

8. After the loop, the program prints the original prices using `System.out.println("The original prices are: " + Arrays.toString(price));`. 
The `Arrays.toString()` method converts the `price` array into a string representation.

9. Similarly, the program prints the after-tax prices using `System.out.println("The after tax prices are: " + Arrays.toString(afterPrice));`.

In summary, this program takes an array of original prices, multiplies each price by 1.13 to calculate the after-tax prices, 
and then displays the original prices and after-tax prices to the console.
 */