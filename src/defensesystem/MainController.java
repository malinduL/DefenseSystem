/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defensesystem;

/**
 *
 * @author User
 */
public class MainController {
    public static void main(String[] args) {
        
        Observerble observerble=Observerble.getinstace();
        
        
        Helicopter helicopter=new Helicopter();
        Submarine submarine=new Submarine();
        Tank tank=new Tank();
        DefenseBranch defenseBranch=new DefenseBranch();
        
        observerble.addComp(helicopter);
        observerble.addComp(submarine);
        observerble.addComp(tank);
        observerble.addComp(defenseBranch);
    }
}
