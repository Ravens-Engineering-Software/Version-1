package v1_1;

/**
 *
 * @authors Kieran Bingham, Cameron Sokalski, Jacob Larose
 */
public class V1_1 {

    public static void main(String[] args) {
        int[][] materials= {{50},{100},{70},{80},{80},{300},{300},{500},{275}};
        String[] materialNames={"steel","mild steel","carbon steel","stainless steel","bronze","aluminum","brass","plastic","wood"};
        /*int[][] Materials= new int[int[]][9];  //array 9 rows (9 materials) and 2 colums MPM and FPM.  FPM is index 0.
        Materials [0][0]= 50; //steel
        Materials [0][1]= 100; //mild steel
        Materials [0][2]= 70; //carbon steel
        Materials [0][3]= 80; //stainless steel
        Materials [0][4]= 80; //bronze
        Materials [0][5]= 300; //aluminium
        Materials [0][6]= 300; //brass
        Materials [0][7]= 500; //plastic
        Materials [0][8]= 275; //wood */ 
        for (int x=0;x<=(materials.length)-1;x++){
            System.out.print(materialNames[x] + ": ");
            for (int y=0;y<=(materials[x].length)-1;y++){
                System.out.print(materials[x][y]);
            }
            System.out.println("");
        }
        System.out.println(RPMcalc(300,0.25));
    }
    
    static double RPMcalc(int materialSpeed, double diameter) {
        double RPM = ((4*materialSpeed)/diameter);
        return RPM; 
    }
}
