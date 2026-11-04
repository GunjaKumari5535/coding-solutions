import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> roots = new  ArrayList<>();
        double d =(b*b) -(4*a*c);
        if (d<0){
             roots.add(-1);
             return roots;
            
        }
        double fact1 = (-b + Math.sqrt(d))/(2.0*a);
        double fact2 = (-b - Math.sqrt(d))/(2.0*a);
        
    
    int f1 = (int)Math.floor(fact1);
    int f2 = (int)Math.floor(fact2);
    


 roots.add(Math.max(f1,f2));
 roots.add(Math.min(f1,f2));
 
  return roots;
  }
}
