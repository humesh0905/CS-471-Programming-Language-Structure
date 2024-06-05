import java.util.*;

class Assignment_8 {
public static void main (String[] args) {

// Creating a scanner object
Scanner s = new Scanner (System.in);

// Declared the required variable and array here.
int[] freq = new int[11];
int limit_1, limit_2, index;
int new_grade;

/* Getting into the loop.
* The loop will run unlimited times unless there is a negative number in the
input.
*/
for ( ;; ) {
// Scanning input
new_grade = s.nextInt();
try {
if (new_grade < 0) {
throw new ArithmeticException();
}
} catch (ArithmeticException e) { 
  break;
}

// Scaling index
index = new_grade/10 + 1;

// Taking every input grade as an exception. 
try {
if (new_grade >= 0) {
throw new ArithmeticException();
}
}

 
// As part of the logic the freq[] updating is done in the catch section. 
catch (ArithmeticException e) {
if (new_grade < 100)
freq[index] = freq[index] + 1; 
if (new_grade == 100)
freq[10] = freq[10] + 1; 
if (new_grade > 100)
System.out.println("Error -- new grade: " + new_grade + " is out of range");

}

}

System.out.println("Limits Frequency"); 
System.out.println("");

// Printing out the values.
// We can reach 90-100 index.
for ( index=0; index<10; index++ ) { 
limit_1 = 10 * index;
limit_2 = limit_1 + 9; 
if (index == 9)
limit_2 = 100; 
System.out.print(limit_1 + " "); 
System.out.print(limit_2 + "	"); 
System.out.print(freq[index+1]); 
System.out.println("");
}
}
}