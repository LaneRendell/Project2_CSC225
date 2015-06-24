# Project2_CSC225





CIS 225 Advanced Java Programming 
Lab 2: Swing Lab Assignment    JResortCalculator


Name___________________________________________

Due Date ________________________________________

Project Grade (100%)		 
 

Documentation (30):
Cover Page (2)
Table of Content (2)
Abstract (5) 
Design (UML diagram and Javadocs) (11)
Source Code  (5)
Sample Input  (5)

	
Sample Output(10)
	
Correct Logic(40):
Clean compile	
Structure(20):
 white spacing 
 proper indentation
 meaningful names
 logical flow


	
          Total points:	


Comments:





CIS 225  Advanced Java –  
Christine Forde  
Swing Lab Assignment: JResortCalculator
                               Program Name:  JResortCalculator 

Abstract: 
Design and Code an user interface program for a summer resort.  The base price for a room is $200 per night. A guest may choose from a combination of several options options.  Or a guest may select no option. Each time the guest changes the option package, the program recalculates the total  bill. The options are:

Options 	Cost
1. Base Price (Base Rate)	$200
2. Weekend  Premium  	$100
3. Breakfast Premium	$20
4. Golf  Premium	$75
		






            
                  
 Implementation:

1.	Name the class JResortCalculator.
2.	This program uses three classes that implements menus: JLabel, JTextField 
and JCheckBox.
3.	Import the following packages and their classes:
javax.swing, java.awt, and java.awt.event.

4.	Permit the class to extend JFrame and implement the ITemListener interface.
5.	Design the window per the sample input/output shown.
6.	Use the FlowLayout manager.
7.	Use the method itemStateChanged to process the events from the menu boxes. 
   

Documentation Tools: Use an UML class diagram and Javadocs. Also include documentation inside your program (you will lose points if your program is not well-documented).  

 






Sample input and output:  #1


 
   




Sample input and output:  #2


          


 
Sample input and output:  #3

 











 




 
See the attached Coding Styles for your program. 

Hand In and Grading Criteria:

For grading submit the following items in a large envelope. Everything must be typed - no handwritten external documentation will be accepted. 
•	A cover sheet with your name, project number, and section
•	Your program design – UMLand  Javadocs, (hard copies)
•	A hard copy of the source files
•	A hard Copy of the test cases stapled together with your name marked on top 
•	A hard copy of the program output
 
The following criteria will be used to grade your work.
•	Program correctness – program runs successfully and as expected
•	Adherence to specifications – appropriate control structures, modular design, etc
•	Documentation – internal and external, meaningful variable names, etc
•	Neatness / Organization – indentation, block formatting, etc
See the evaluation sheet attached to these specifications.
•	You will be required to show us that the programs are working.
 

 

M:\Courses\ICT\CSC Classes\CSC 225 Advanced Java Programming\FordeFolder\Projects\Project 2 SwingClass Project Summer 2014.doc 
Coding Style Example:

Note the indentation, white space, and meaningful names.

/** Program CSC 225 Prog1
 * Course Title:  Introduction to Computer Science
 * Course number: CIS 225-xxx
 * Instructor:    Ms. Christine Forde
 * @author  Your Name
* @version 1.0, 1/10/200x
*
 * Description: Program CSC 225 Prog1
 * This class computes the area of a circle. The radius is hard coded in the class.
 *
 * Input: radius                 
 *       
 * Compute: area
*  radius times radius times PI (3.14159) 
*
 * @author  Your Name
 * @version 1.0, 9/6/2003
 */
 
public class ComputeArea 
{
  /** Main method */
  public static void main(String[] args) {
    double radius;
    double area;
    
    // Assign a radius
    radius = 20;
    
    // Calculate the area
    area = radius * radius * 3.14159;
    
    // Display results
    System.out.println("The area for the circle of radius " +
      radius + " is " + area);

  } // end for main method

} // end for class  ComputeArea 

Coding Style Example.doc
