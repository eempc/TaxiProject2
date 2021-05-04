# Taxi Project Part 2 - Week 4

Due date: Friday 14 May 2021

## New questions

### Exercise 16.26 
Add assertion and exception-throwing consistency checks within each class, to guard against inappropriate use. For instance, ensure that a Passenger is never created with pickup and destination locations that are the same; ensure that a taxi is never requested to go to a pickup when it already has a target location; etc. 

### Exercise 16.27 
Report on the statistical information that is being gathered by taxis and the passenger source; also on taxi idle time and missed pickups. Experiment with different numbers of taxis to see how the balance between these two sets of data varies. 

### Exercise 16.28 
Adapt the vehicle classes so that records are kept of the amount of time spent traveling to pickup locations and passenger destinations. Can you see a possible conflict here for shuttles?

## Previous questions
### Exercise 16.17 
Critically assess the list of steps we have outlined, with the following questions in mind. Do you feel the order is appropriate? Is the level of complexity of each too high, too low, or just right? Are there any steps missing? Revise the list as you see fit, to suit your own view of the project

### Exercise 16.18 
Are the completion criteria (tests on completion) for each stage sufficiently obvious? If so document some tests for each.
 
### Exercise 16.19 
If you have not already done so, take a thorough look through the implementation in the taxi-company-stage-one project. Ensure that you understand how movement of the taxi is effected through its act method.

### Exercise 16.20 
Do you feel that the TaxiCompany object should keep separate lists of those vehicles that are free and those that are not, to improve the efficiency of its scheduling? At what points would a vehicle move between the lists?
 
### Exercise 16.21 
The next planned stage of the implementation is to provide multiple taxis to carry multiple passengers concurrently. Review the TaxiCompany class with this goal in mind. Do you feel that it already supports this functionality? If not, what changes are required?

### Exercise 16.22 
Review the way in which vehicle:passenger associations are stored in the assignments’ map in TaxiCompany. Can you see any weaknesses in this approach? Does it support more than one passenger being picked up from the same location? Could a vehicle ever need to have multiple associations recorded for it?

### Exercise 16.23 
If you see any problems with the current way in which vehicle:passenger associations are stored, would creating a unique identification for each association help, say a “booking number”? If so, would any of the existing method signatures in the Vehicle hierarchy need to be changed? Implement an improved version that supports the requirements of all existing scenarios.

### Exercise 16.24 
Review the tests implemented in the test classes of taxi-company-stage-one. Should it be possible to use these as regression tests during the next stages, or would they require substantial changes?

### Exercise 16.25 
Implement additional tests and further test classes that you feel are necessary to increase your level of confidence in the current implementation. Fix any errors you discover in the process of doing this.
