/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.Emballonuridae;
import data.Vespertilionidae;
import data.Phyllostomidae;

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
        
        Phyllostomidae PhyllostomusHastatus= new Phyllostomidae(false, false, false, false, false, true, true, false, 
                null, null, false, false, false, false, true, true, null, null, false, true, false, 'L', 'L', null, null, null, 
                null, null, null, null, null, null, null, null, null, null, 0, "Phyllostomus Hastatus", "Insectivoro", true);
        Phyllostomidae PhyllostomusElongatus= new Phyllostomidae(false, false, false, false, false, true, true, false, 
                null, null, false, true, false, false, true, true, null, null, false, true, false, 'L', 'L', null, null, null, 
                null, null, null, null, null, null, null, null, null, null, 0, "Phyllostomus Elongatus", "Insectivoro", true);
        Phyllostomidae PhyllostomusDiscolor= new Phyllostomidae(false, false, false, false, false, true, true, false, 
                null, null, false, null, true, true, false, false, null, null, false, true, false, 'L', 'L', null, null, null, 
                null, null, null, null, null, null, null, null, null, null, 0, "Phyllostomus Discolor", "Insectivoro", true);
        Phyllostomidae TrachopsChirrosus= new Phyllostomidae(false, false, false, false, false, true, true, false, 
                null, null, true, null, null, null, null, null, true, true, false, true, false, 'L', 'L', null, null, null, 
                null, null, null, null, null, null, null, null, null, null, 0, "Trachops Chirrosus", "Carnivoro", true);
        Phyllostomidae LampronycterisBrachyotis= new Phyllostomidae(false, false, false, false, false, true, true, false, 
                null, null, true, null, true, false, null, null, false, false, false, true, false, 'L', 'L', null, null, null, 
                null, null, null, null, null, null, null, null, null, null, 0, "Lampronycteris Brachyotis", "Carnivoro", true);
        Phyllostomidae TrynycterisNiceforti= new Phyllostomidae(false, false, false, false, false, true, true, false, 
                null, null, true, null, true, null, null, null, false, false, false, true, false, 'L', 'L', null, null, null, 
                null, null, null, null, null, null, null, null, null, null, 0, "Trynycteris Niceforti", "Pendiente", true);
        Phyllostomidae LonchorhinaOrinocensis= new Phyllostomidae(false, false, false, false, false, true, true, false, 
                null, null, null, null, null, null, null, null, null, null, true, true, false, 'L', 'L', null, null, null, 
                null, null, null, null, null, null, null, null, null, null, 0, "Lonchorhina Orinocensis", "Pendiente", true);
        Phyllostomidae MimomCrenulatum= new Phyllostomidae(false, false, false, false, false, true, true, false, 
                null, null, null, null, null, null, null, null, null, null, null, false, false, 'L', 'L', null, null, null, 
                null, null, null, null, null, null, null, null, null, null, 0, "Mimom Crenulatum", "Pendiente", true);
        Phyllostomidae CarolliaBrevicauda= new Phyllostomidae(false, false, false, false, false, true, true, false, 
                null, null, null, null, null, null, null, null, null, null, null, null, true, 'M', 'M', false, true, true, 
                null, null, null, null, null, null, null, null, null, null, 0, "Carollia Brevicauda", "Pendiente", true);
        Phyllostomidae CarolliaCastanea= new Phyllostomidae(false, false, false, false, false, true, true, false, 
                null, null, null, null, null, null, null, null, null, null, null, null, true, 'M', 'M', true, true, true, 
                null, null, null, null, null, null, null, null, null, null, 0, "Carollia Castanea", "Pendiente", true);
        Phyllostomidae CarolliaPerspicillata= new Phyllostomidae(false, false, false, false, false, true, true, false, 
                null, null, null, null, null, null, null, null, null, null, null, null, true, 'M', 'M', null, false, false, 
                null, null, null, null, null, null, null, null, null, null, 0, "Carollia Perspicillata", "Pendiente", true);
        Phyllostomidae ArtibeusObscurus= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                false, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                true, null, false, true, false, true, null, null, true, null, 0, "Artibeus Obscurus", "Pendiente", true);
        Phyllostomidae ArtibeusAuquatorialis= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                false, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                true, null, false, true, false, true, null, null, true, null, 0, "Artibeus Auquatorialis", "Pendiente", true);
        Phyllostomidae ArtibeusPlanirostris= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                false, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                true, null, false, true, false, true, null, null, true, null, 0, "Artibeus Planirostris", "Pendiente", true);
        Phyllostomidae ArtibeusLituratus= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                false, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                true, true, false, true, false, true, null, null, true, null, 0, "Artibeus Lituratus", "Pendiente", true);
        Phyllostomidae DermanuraAnderseni= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                false, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                null, null, null, null, false, true, null, null, true, null, 0, "Dermanura Anderseni", "Pendiente", true);
        Phyllostomidae UrodermaMagnirostrum= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                true, false, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                null, null, null, null, true, false, false, true, true, null, 0, "Uroderma Magnirostrum", "Pendiente", true);
        Phyllostomidae UrodermaBilobatum= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                true, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                null, null, null, null, true, false, true, false, true, null, 0, "Uroderma Bilobatum", "Pendiente", true);
        Phyllostomidae UrodermaSp= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                true, null, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                null, null, null, null, true, false, null, null, true, null, 0, "Uroderma Sp", "Pendiente", true);
        Phyllostomidae SturniraParvidens= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                false, false, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                null, true, null, null, null, false, null, null, true, null, 0, "Sturnira Parvidens", "Pendiente", true);
        Phyllostomidae SturniraSp= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                false, false, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                null, true, null, null, null, false, null, null, true, null, 0, "Sturnira Sp", "Pendiente", true);
        Phyllostomidae MesophyllaMacconelli= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                false, false, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                true, true, null, null, null, false, null, null, null, null, 0, "Mesphylla Macconelli", "Pendiente", true);
        Phyllostomidae PlatyrrhinusBranchycephalus= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                null, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                null, null, null, null, null, false, null, null, false, false, 2, "Platyrrhinus Branchycephalus", "Pendiente", true);
        Phyllostomidae PlatyrrhinusHelleri= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                null, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                null, null, null, null, null, false, null, null, false, false, 1, "Platyrrhinus Helleri", "Pendiente", true);
        Phyllostomidae PlatyrhinusInfuscus= new Phyllostomidae(false, false, false, false, false, false, false, true, 
                null, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null, 
                null, null, null, null, null, false, null, null, false, false, 0, "Platyrhinus Infuscus", "Pendiente", true);
        
        
        
    }
    
}
