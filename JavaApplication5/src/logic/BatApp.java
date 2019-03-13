/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.Emballonuridae;
import data.Vespertilionidae;

/**
 *
 * @author crist
 */
public class BatApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vespertilionidae MyotisRiparius = new Vespertilionidae (true, 1, 2, "Myotis Riparius", 
                "Insectivoro", false, true, true, false);
        Vespertilionidae EptesicusBrasiliensis = new Vespertilionidae (false, 3, 3, "Eptesicus Brasiliensis", 
                "Insectivoro", false, true, true, false);
        
        Emballonuridae SaccopteryxBilienata= new Emballonuridae(true, true, true, 
            "Saccopteryx Bilienata", "Insectivoro", false, false, false, true);
        Emballonuridae SaccopteryxLeptura= new Emballonuridae(true, true,false, 
            "Saccopteryx Leptura", "Insectivoro", false, false, false, true);
        Emballonuridae RhynchonycterisNaso= new Emballonuridae(true, false, null, 
            "Rhynchonycteris Naso", "Insectivoro", false, false, false, true);
        Emballonuridae CormuraBrevisrostris= new Emballonuridae(false, null, null, 
            "Cormura Brevisrostris", "Insectivoro", false, false, false, true);
    }
    
}
