//@Authors: Kieran Bingham, Cameron SSocalski, & Jacob Larose
package v1_array;

/**
 *
 * @author Administrator
 */
public class V1_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] Materials= new int[2][9];  //array 9 rows (9 materials) and 2 colums MPM and FPM.  FPM is index 0.
        Materials [0][0]= 50; //steel
        Materials [0][1]= 100; //mild steel
        Materials [0][2]= 70; //carbon steel
        Materials [0][3]= 80; //stainless steel
        Materials [0][4]= 80; //bronze
        Materials [0][5]= 300; //aluminium
        Materials [0][6]= 300; //brass
        Materials [0][7]= 500; //plastic
        Materials [0][8]= 275; //wood
        
    }
    
    
}
