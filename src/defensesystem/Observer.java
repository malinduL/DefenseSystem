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
public interface Observer {
    
    public void update(String mg,String name);
    void updateAreaClear(int value);
    void updateJsliderValue(int value);
    void updateJsliderFuelValue(int value,String name);
    void updateJsliderFuelValue(int value,String name);
    void updateJsliderFuelValue(int value,String name);
    void updateJsliderFuelValue(int value,String car);

}
}
}
