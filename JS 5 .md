|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020040|
| Nama |  Reynaldi Putra Pratama |
| Kelas | TI - 1I |
| Repository | https://github.com/reynaldi669/ALDS-REPO.git | 


# JOB SHEET 5 REPORT

## 5.2 Calculating Factorial Using Brute Force and Divide and Conquer Algorithms
## 5.2.2 Result : 

![image](https://github.com/user-attachments/assets/f187bc85-b8dd-4df4-a728-b1769122e772)

## 5.2.3. Question's Answer : 

1. The difference in base case between if and else 
- The base case is where the recursion stops. For the factorial function, the base case is usually defined for the smallest input, which is 0! or 1!, both of which equal 1.
- Else condition: recursive case is where the function calls itself to break down the problem into smaller subproblems. For factorial, this typically involves calculating n! as n * (n-1)!.

![image](https://github.com/user-attachments/assets/f62a7d37-24b5-4320-8559-fa44df1c4bc8)

So the if condition stops the recursion and return fixed value, while the else condition performs recursive multiplication until it reach value 1.

2. We can use while loop as an factorialBF() method (which presumably stands for "factorial by iteration" or "factorial by brute force") to use alternatives to a for loop :

![image](https://github.com/user-attachments/assets/e9ddc878-0563-4722-b78c-b0742a52848b)

3. Differences Between facto = facto * i; and int facto = n * factorialDC(n-1);
- Facto = facto * i : It updates an modifies the existing value of facto in place. If facto was previously 5 and i is 3, after this operation, facto would become 15.
- int facto = n *statement declares a new variable facto and initializes it with the product of n and the result of a recursive call to factorialDC(n - 1)

4. factorialBF() (iterative approach) and factorialDC() (recursive approach)—we can draw several conclusions about their differences in terms of structure, execution, and performance.

## 5.3 Calculating Exponentiation Using Brute Force and Divide and Conquer Algorithms
## 5.3.2 Result : 

![image](https://github.com/user-attachments/assets/50b1ac91-453a-46e5-b4cd-a85c824839bc)

## 5.3.3. Question's Answer : 

1.  both factorialBF() and factorialDC() effectively compute the factorial of a number, but they do so using fundamentally different approaches. The iterative method (factorialBF()) is generally more efficient in terms of memory and performance, especially for larger inputs, while the recursive method (factorialDC()
2. Yes, combine exist stage in the code 

![image](https://github.com/user-attachments/assets/ce76f0fa-3d6a-42b7-88b9-5e1fb613601c)

3. Yes,  method without parameters by directly using the class attributes, doing so may reduce flexibility and reusability. The choice between using parameters or relying on class attributes depends on the specific design goals of your application.
4. The powerBF() method calculates the power of a base number raised to an exponent using an iterative approach, typically with a loop , The powerDC() method calculates the power of a base number raised to an exponent using a recursive approach.

## 5.4 Calculating Array Sum Using Brute Force and Divide and Conquer Algorithms
## 5.4.2 Result : 

![image](https://github.com/user-attachments/assets/ae29a169-0b6d-4b49-9cce-4e36831a36df)

## 5.4.3. Question's Answer : 
1. mid variable, the method would not be able to effectively implement the Divide and Conquer strategy, as it would lack a clear way to split the array into manageable segments for recursive processing.
2. totalDC() method for summing an array The left half spans from the left index l to the midpoint mid pans from mid + 1 to the right index r half is processed with totalDC(arr, l, mid)
3. which implements the Divide and Conquer strategy to calculate the sum of an array, it is necessary to sum the results of lsum and rsum to obtain the total sum of the elements in the specified range of the array.
4. The if(l==r)l equals r, it means that the subarray being considered has been reduced to just one element, specifically arr[l].

![image](https://github.com/user-attachments/assets/c337f07a-af30-4ebb-83a5-861b66ff77a5)

5. totalDC() method is an implementation of the Divide and Conquer strategy to calculate the sum of elements in an array. 

## 5.5. Assignments
a) Find the highest Midterm Score (UTS) using the Divide and Conquer approach.

![image](https://github.com/user-attachments/assets/0ca534db-44f0-4b4f-b06c-1b6b8d25742c)

b) Find the lowest Midterm Score (UTS) using the Divide and Conquer approach.

![image](https://github.com/user-attachments/assets/745fe260-ca87-485a-93ba-19e4fd24dc13)

c) Calculate the average Final Score (UAS) of all students using the Brute Force approach.

![image](https://github.com/user-attachments/assets/aa206b5d-d542-4755-97e4-502460e36064)

## Main : 

![image](https://github.com/user-attachments/assets/b55c8f62-e762-4c1e-bfcc-7f733ce013b3)

## Result : 

![image](https://github.com/user-attachments/assets/57b8503d-35e4-44c0-a739-0580d656ba18)
























































































