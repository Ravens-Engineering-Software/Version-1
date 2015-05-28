/**
 *
 * @author Kieran Bingham
 */
public class DrillDiameter {
    //Variables
    double fractionValue; 
    double numerator;
    double denominator;   
    double drillDiameter = 1; 
    double RPM; 
    int materialSpeed; 
    int index;
    String diameterString;
    String errorMessage; 
    boolean calcError = false; 
    
    boolean findDiameter(){
        errorMessage = ""; 
        if (diameterString.matches(".*[a-zA-Z]+.*")){
            calcError = true;
            errorMessage = "Drill diameter can't be string";
        } else if (diameterString.contains("/")){
            if (diameterString.substring(diameterString.indexOf("/")+1).contains("/")){
                errorMessage = "Only one '/'";
                calcError = true;
            } else {
                drillDiameter = getFractionValue(diameterString);
                if (drillDiameter == -1){
                    errorMessage = "value cannot be 0";
                    calcError = true; 
                } 
            }
        } else {
            drillDiameter = Double.valueOf(diameterString);
        }
        return calcError; 
    }
    
    double getFractionValue (String diameter){
        index = diameter.indexOf("/");
        
        numerator = Double.valueOf(diameter.substring(0,index));
        denominator = Double.valueOf(diameter.substring(index + 1));
        
        if (numerator == 0 || denominator == 0)
            fractionValue = -1; 
        else
            fractionValue = numerator/denominator; 
        
        return fractionValue; 
    }
    
    void calculate(){
        RPM = (materialSpeed * 4)/drillDiameter; 
    }
}
