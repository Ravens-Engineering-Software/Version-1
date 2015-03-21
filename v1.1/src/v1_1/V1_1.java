package v1_1;

/**
 *
 * @authors Kieran Bingham, Cameron Sokalski, Jacob Larose
 */
public class V1_1 {

    public static void main(String[] args) {
        //Variable definition
        int[][] materials= {{50},{100},{70},{80},{80},{300},{300},{500},{275}};
        double[][] drillSize={{0.03125},{0.0625},{0.078125}};
        String[] materialNames={"steel","mild steel","carbon steel","stainless steel","bronze","aluminum","brass","plastic","wood"};
        
        System.out.println(drillSize[0][0]);
        //Code Start
        for (int x = 0; x <= (materials.length) - 1; x++) {
            System.out.print(materialNames[x] + ": ");
            for (int y = 0; y <= (materials[x].length) - 1; y++) {
                System.out.print(materials[x][y]);
            }
            System.out.println("");
        }
        System.out.println(RPMcalc(materials[5][0],drillSize[0][0]));
    }
    
    static double RPMcalc(int materialSpeed, double diameter) {
        double RPM = ((4*materialSpeed)/diameter);
        return RPM; 
    }
}
