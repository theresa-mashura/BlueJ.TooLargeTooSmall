
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }
    
    public Integer guess(Integer g) {
        
        int result; 
            
        if(g == chosenNum) {
            result = 0; 
        } else if(g > chosenNum) {
            result = 1; 
        } else{
            result = -1;
        };
        
            
        return result;

    }
}