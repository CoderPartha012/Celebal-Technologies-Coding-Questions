# Celebal-Technologies-Coding-Questions
Celebal Technologies Coding Questions for Summer Internship (Code-e-Jung )
1. Write a function to print the following complex star pattern of size n:
    *
   * *  
  * * *    
 * * * *      
* * * * *        
 * * * *      
  * * *    
   * *  
    *
Input Format
The input consists of a single integer n (1 <= n <= 100), which represents the size of the pattern.
Constraints
The pattern size (n) will be a positive integer between 1 and 100.
Output Format
Print the complex star pattern of size n, as shown in the problem statement.
Sample Input 0
5
Sample Output 0
    *
   * *  
  * * *    
 * * * *      
* * * * *        
 * * * *      
  * * *    
   * *  
    *
Explanation 0
The pattern has 5 rows and columns, with the center row containing only one star. The stars are positioned in a way that creates a diamond shape.
ANSWER: First, we import the Scanner class from the java.util package, which is used to take input from the user. Then we define the main() method, which is the entry point of our program. We create an instance of the Scanner class and use it to take the input n from the user. Then we call the printPattern() method and pass the input n as a parameter. Next, we define the printPattern() method, which takes an integer parameter n and prints the complex star pattern of size n. The printPattern() method uses two nested for loops to print the pattern. Inside the first for loop, we use another for loop to print the spaces before the stars. The number of spaces for each row is equal to n-i. So, we iterate j from 1 to n-i and print a space for each iteration. After printing the spaces, we use another for loop to print the stars. The number of stars for each row is equal to i. So, we iterate k from 1 to i and print a star followed by a space for each iteration. Finally, we use System.out.println() to move to the next line after printing each row. The second half of the pattern is printed in a similar way. We use a for loop to print the spaces and another for loop to print the stars. However, in this case, we iterate i from n-1 to 1. Finally, we call the printPattern() method from the main() method and pass the user input n as a parameter.
