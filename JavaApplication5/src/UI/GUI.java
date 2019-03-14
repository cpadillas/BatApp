package UI;

import data.Emballonuridae;
import data.Murcielago;
import data.Phyllostomidae;
import data.Pregunta;
import data.Vespertilionidae;
import java.awt.Image;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends javax.swing.JFrame {

 
    
    int Afirmativa[]=new int[]{0,2,0,0,7,19,28,8,9,0,0,14,0,0,0,0,0,0,0,0,0,0,0,26,0,0,27,0,0,0,0,0};
    int Negativa[]=new int[]{0,6,3,4,5,21,29,11,10,12,0,15,13,0,0,16,17,18,0,20,0,22,23,24,25,0,0,0,0,30,31,0};
    int valorPregunta=1;
    Boolean FotoSubida=false;
    

    //Importamos las imágenes del menu desde la carpeta
    ImageIcon icon1 = new ImageIcon(
            this.getClass().getResource("/UI/Resources/Libro.png"));

    ImageIcon icon2 = new ImageIcon(
            this.getClass().getResource("/UI/Resources/Lupa.png"));

    ImageIcon icon3 = new ImageIcon(
            this.getClass().getResource("/UI/Resources/Mur.png"));

    ImageIcon icon4 = new ImageIcon(
            this.getClass().getResource("/UI/Resources/Bat.png"));

    ImageIcon Bienvenido = new ImageIcon(
            this.getClass().getResource("/UI/Resources/Bienvenido.png"));

    ImageIcon Encontrar = new ImageIcon(
            this.getClass().getResource("/UI/Resources/Encontrar.png"));

    Image Fotito = icon4.getImage();
    ImageIcon Preview;
    //Creamos los diccionarios de murcielagos y fotos respectivamente
    HashMap<String, Murcielago> MurciHashii = new HashMap<>();
    HashMap<String, ImageIcon> ImageHashii = new HashMap<>();
    HashMap<Integer, Pregunta> bancoPreguntas = new HashMap<>();

    public GUI() {
        
        //Instancioamos los murciélagos con todos sus atributos
        Vespertilionidae MyotisRiparius = new Vespertilionidae(true, 1, 2, "Myotis Riparius",
                "Insectivoro", false, true, true, false);
        Vespertilionidae EptesicusBrasiliensis = new Vespertilionidae(false, 3, 3, "Eptesicus Brasiliensis",
                "Insectivoro", false, true, true, false);
        Emballonuridae SaccopteryxBilienata = new Emballonuridae(true, true, true,
                "Saccopteryx Bilienata", "Insectivoro", false, false, false, true);
        Emballonuridae SaccopteryxLeptura = new Emballonuridae(true, true, false,
                "Saccopteryx Leptura", "Insectivoro", false, false, false, true);
        Emballonuridae RhynchonycterisNaso = new Emballonuridae(true, false, null,
                "Rhynchonycteris Naso", "Insectivoro", false, false, false, true);
        Emballonuridae CormuraBrevisrostris = new Emballonuridae(false, null, null,
                "Cormura Brevisrostris", "Insectivoro", false, false, false, true);
        Phyllostomidae PhyllostomusHastatus = new Phyllostomidae(false, false, false, false, false, true, true, false,
                null, null, false, false, false, false, true, true, null, null, false, true, false, 'L', 'L', null, null, null,
                null, null, null, null, null, null, null, null, null, null, 0, "Phyllostomus Hastatus", "Insectivoro", true);
         Phyllostomidae PhyllostomusElongatus = new Phyllostomidae(false, false, false, false, false, true, true, false,
                null, null, false, true, false, false, true, true, null, null, false, true, false, 'L', 'L', null, null, null,
                null, null, null, null, null, null, null, null, null, null, 0, "Phyllostomus Elongatus", "Insectivoro", true);
        Phyllostomidae PhyllostomusDiscolor = new Phyllostomidae(false, false, false, false, false, true, true, false,
                null, null, false, null, true, true, false, false, null, null, false, true, false, 'L', 'L', null, null, null,
                null, null, null, null, null, null, null, null, null, null, 0, "Phyllostomus Discolor", "Insectivoro", true);
        Phyllostomidae TrachopsChirrosus = new Phyllostomidae(false, false, false, false, false, true, true, false,
                null, null, true, null, null, null, null, null, true, true, false, true, false, 'L', 'L', null, null, null,
                null, null, null, null, null, null, null, null, null, null, 0, "Trachops Chirrosus", "Carnivoro", true);
        Phyllostomidae LampronycterisBrachyotis = new Phyllostomidae(false, false, false, false, false, true, true, false,
                null, null, true, null, true, false, null, null, false, false, false, true, false, 'L', 'L', null, null, null,
                null, null, null, null, null, null, null, null, null, null, 0, "Lampronycteris Brachyotis", "Carnivoro", true);
        Phyllostomidae TrynycterisNiceforti = new Phyllostomidae(false, false, false, false, false, true, true, false,
                null, null, true, null, true, null, null, null, false, false, false, true, false, 'L', 'L', null, null, null,
                null, null, null, null, null, null, null, null, null, null, 0, "Trynycteris Niceforti", "Pendiente", true);
        Phyllostomidae LonchorhinaOrinocensis = new Phyllostomidae(false, false, false, false, false, true, true, false,
                null, null, null, null, null, null, null, null, null, null, true, true, false, 'L', 'L', null, null, null,
                null, null, null, null, null, null, null, null, null, null, 0, "Lonchorhina Orinocensis", "Pendiente", true);
                        //
        Phyllostomidae MimomCrenulatum = new Phyllostomidae(false, false, false, false, false, true, true, false,
                null, null, null, null, null, null, null, null, null, null, null, false, false, 'L', 'L', null, null, null,
                null, null, null, null, null, null, null, null, null, null, 0, "Mimom Crenulatum", "Pendiente", true);
        Phyllostomidae CarolliaBrevicauda = new Phyllostomidae(false, false, false, false, false, true, true, false,
                null, null, null, null, null, null, null, null, null, null, null, null, true, 'M', 'M', false, true, true,
                null, null, null, null, null, null, null, null, null, null, 0, "Carollia Brevicauda", "Pendiente", true);
        Phyllostomidae CarolliaCastanea = new Phyllostomidae(false, false, false, false, false, true, true, false,
                null, null, null, null, null, null, null, null, null, null, null, null, true, 'M', 'M', true, true, true,
                null, null, null, null, null, null, null, null, null, null, 0, "Carollia Castanea", "Pendiente", true);
        Phyllostomidae CarolliaPerspicillata = new Phyllostomidae(false, false, false, false, false, true, true, false,
                null, null, null, null, null, null, null, null, null, null, null, null, true, 'M', 'M', null, false, false,
                null, null, null, null, null, null, null, null, null, null, 0, "Carollia Perspicillata", "Pendiente", true);
        
        Phyllostomidae ArtibeusObscurus = new Phyllostomidae(false, false, false, false, false, false, false, true,
                false, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                true, null, false, true, false, true, null, null, true, null, 0, "Artibeus Obscurus", "Pendiente", true);
        
        Phyllostomidae ArtibeusAuquatorialis = new Phyllostomidae(false, false, false, false, false, false, false, true,
                false, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                true, null, false, true, false, true, null, null, true, null, 0, "Artibeus Auquatorialis", "Pendiente", true);
        Phyllostomidae ArtibeusPlanirostris = new Phyllostomidae(false, false, false, false, false, false, false, true,
                false, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                true, null, false, true, false, true, null, null, true, null, 0, "Artibeus Planirostris", "Pendiente", true);
        Phyllostomidae ArtibeusLituratus = new Phyllostomidae(false, false, false, false, false, false, false, true,
                false, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                true, true, false, true, false, true, null, null, true, null, 0, "Artibeus Lituratus", "Pendiente", true);
        Phyllostomidae DermanuraAnderseni = new Phyllostomidae(false, false, false, false, false, false, false, true,
                false, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                null, null, null, null, false, true, null, null, true, null, 0, "Dermanura Anderseni", "Pendiente", true);
        Phyllostomidae UrodermaMagnirostrum = new Phyllostomidae(false, false, false, false, false, false, false, true,
                true, false, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                null, null, null, null, true, false, false, true, true, null, 0, "Uroderma Magnirostrum", "Pendiente", true);
        
        Phyllostomidae UrodermaBilobatum = new Phyllostomidae(false, false, false, false, false, false, false, true,
                true, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                null, null, null, null, true, false, true, false, true, null, 0, "Uroderma Bilobatum", "Pendiente", true);
        Phyllostomidae SturniraLilium = new Phyllostomidae(false, false, false, false, false, false, false, true,
                false, false, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                null, true, null, null, null, false, null, null, true, null, 0, "Sturnira Lilium", "Pendiente", true);
        Phyllostomidae MesophyllaMacconelli = new Phyllostomidae(false, false, false, false, false, false, false, true,
                false, false, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                true, true, null, null, null, false, null, null, null, null, 0, "Mesphylla Macconelli", "Pendiente", true);
        Phyllostomidae PlatyrrhinusBranchycephalus = new Phyllostomidae(false, false, false, false, false, false, false, true,
                null, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                null, null, null, null, null, false, null, null, false, false, 2, "Platyrrhinus Branchycephalus", "Pendiente", true);
        Phyllostomidae PlatyrrhinusHelleri = new Phyllostomidae(false, false, false, false, false, false, false, true,
                null, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                null, null, null, null, null, false, null, null, false, false, 1, "Platyrrhinus Helleri", "Pendiente", true);
        Phyllostomidae PlatyrhinusInfuscus = new Phyllostomidae(false, false, false, false, false, false, false, true,
                null, true, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                null, null, null, null, null, false, null, null, false, false, 0, "Platyrhinus Infuscus", "Pendiente", true);
        Phyllostomidae DesmodusRotundus = new Phyllostomidae(null, null, null, null, true, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, '\0', '\0', null, null, null,
                null, null, null, null, null, null, null, null, null, null, 0, "Desmodus Rotundus", "Hematófago", true);
        Phyllostomidae GlossophagaSoricina = new Phyllostomidae(true, true, true, true, false, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, '\0', '\0', null, null, null,
                null, null, null, null, null, null, null, null, null, null, 0, "Glossofaga Soricina", "Nectarívoro", true);
        Phyllostomidae Vampyressa = new Phyllostomidae(false, false, false, false, false, false, false, true,
                null, true, null, null, null, null, null, null, null, null, null, null, null, 'M', 'M', null, null, null,
                null, null, null, null, null, false, null, null, false, true, 0, "Vampyressa", "Nectarívoro", true);

        //Importamos los retratos
        ImageIcon IDesmodusRotundus = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Desmodus Rotundus.png"));

        ImageIcon IGlossophagaSoricina = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Glossophaga Soricina.png"));

        ImageIcon IVampyressa = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Vampyressa thyrone.png"));

        ImageIcon IMyotisRiparius = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Myotis riparius.png"));

        ImageIcon IEptesicusBrasiliensis = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Eptesicus brasiliensis.png"));

        ImageIcon ISaccopteryxBilienata = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Saccopteryx bilineata.png"));

        ImageIcon ISaccopteryxLeptura = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Saccopteryx leptura.png"));

        ImageIcon IRhynchonycterisNaso = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Rhynchonycteris naso.png"));

        ImageIcon ICormuraBrevisrostris = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Cormura brevirostris.png"));

        ImageIcon IPhyllostomusHastatus = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Phyllostomus hastatus.png"));

        ImageIcon IPhyllostomusElongatus = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Phyllostomus elongatus.png"));
        
        ImageIcon IPhyllostomusDiscolor = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Phyllostomus discolor.png"));
        ImageIcon ITrachopsChirrosus = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Trachops cirrhosus.png"));
        ImageIcon ILampronycterisBrachyotis = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Lampronycteris brachyotis.png"));
        ImageIcon ITrynycterisNiceforti = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Trinycteris nicefori.png"));
        ImageIcon ILonchorhinaOrinocensis = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Lonchorhina orinocensis.png"));
        ImageIcon IMimomCrenulatum = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/MImon crenulatum.png"));
        ImageIcon ICarolliaBrevicauda = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Carollia brevicauda.png"));
        ImageIcon ICarolliaCastanea = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Carollia castanea.png"));
        ImageIcon ICarolliaPerspicillata = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Carollia perspicillata.png"));
        ImageIcon IArtibeusObscurus = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Artibeus obscurus.png"));
           ImageIcon IArtibeusAuquatorialis = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Artibeus aequatorialis.png"));
              ImageIcon IArtibeusPlanirostris = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Artibeus planirostris.png"));
                 ImageIcon IArtibeusLituratus = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Artibeus lituratus.png"));
                    ImageIcon IDermanuraAnderseni = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Dermanura anderseni.png"));
                       ImageIcon IUrodermaMagnirostrum = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Uroderma magnirostrum.png"));
                        ImageIcon IUrodermaBilobatum = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Uroderma bilobatum.png"));
                          ImageIcon IMesophyllaMacconelli = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Mesophyla macconnelli.png"));
                            ImageIcon IPlatyrrhinusBranchycephalus = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Playrrhinus brachycephalus.png"));
                                 ImageIcon IPlatyrrhinusHelleri = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Platyrrhinus Hillieri.png"));
                                ImageIcon IPlatyrhinusInfuscus = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Playrrhinus infuscus.png"));
        ImageIcon ISturniraLilium = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Retratos/Sturnira lilium.png"));
        
        //Rellenamos los diccionarios
        MurciHashii.put(Vampyressa.getNombre(), Vampyressa);
        MurciHashii.put(GlossophagaSoricina.getNombre(), GlossophagaSoricina);
        MurciHashii.put(DesmodusRotundus.getNombre(), DesmodusRotundus);
        MurciHashii.put(MyotisRiparius.getNombre(), MyotisRiparius);
        MurciHashii.put(EptesicusBrasiliensis.getNombre(), EptesicusBrasiliensis);
        MurciHashii.put(SaccopteryxLeptura.getNombre(), SaccopteryxLeptura);
        MurciHashii.put(SaccopteryxBilienata.getNombre(), SaccopteryxBilienata);
        MurciHashii.put(RhynchonycterisNaso.getNombre(), RhynchonycterisNaso);
        MurciHashii.put(CormuraBrevisrostris.getNombre(), CormuraBrevisrostris);
        MurciHashii.put(PhyllostomusHastatus.getNombre(), PhyllostomusHastatus);
        MurciHashii.put(PhyllostomusElongatus.getNombre(), PhyllostomusElongatus);
        MurciHashii.put(PhyllostomusDiscolor.getNombre(), PhyllostomusDiscolor);
        MurciHashii.put(TrachopsChirrosus.getNombre(), TrachopsChirrosus);
        MurciHashii.put(LampronycterisBrachyotis.getNombre(), LampronycterisBrachyotis);
        MurciHashii.put(TrynycterisNiceforti.getNombre(), TrynycterisNiceforti);
        MurciHashii.put(LonchorhinaOrinocensis.getNombre(), LonchorhinaOrinocensis);
        MurciHashii.put(MimomCrenulatum.getNombre(), MimomCrenulatum);
        MurciHashii.put(CarolliaBrevicauda.getNombre(), CarolliaBrevicauda);
        MurciHashii.put(CarolliaCastanea.getNombre(), CarolliaCastanea);
        MurciHashii.put(CarolliaPerspicillata.getNombre(), CarolliaPerspicillata);
        MurciHashii.put(ArtibeusObscurus.getNombre(), ArtibeusObscurus);
        MurciHashii.put(ArtibeusAuquatorialis.getNombre(), ArtibeusAuquatorialis);
        MurciHashii.put(ArtibeusPlanirostris.getNombre(), ArtibeusPlanirostris);
        MurciHashii.put(ArtibeusLituratus.getNombre(), ArtibeusLituratus);
        MurciHashii.put(DermanuraAnderseni.getNombre(), DermanuraAnderseni);
        MurciHashii.put(UrodermaMagnirostrum.getNombre(), UrodermaMagnirostrum);
        MurciHashii.put(UrodermaBilobatum.getNombre(), UrodermaBilobatum);
        MurciHashii.put(MesophyllaMacconelli.getNombre(), MesophyllaMacconelli);
        MurciHashii.put(PlatyrrhinusBranchycephalus.getNombre(), PlatyrrhinusBranchycephalus);
        MurciHashii.put(PlatyrrhinusHelleri.getNombre(), PlatyrrhinusHelleri);
        MurciHashii.put(PlatyrhinusInfuscus.getNombre(), PlatyrhinusInfuscus);
        MurciHashii.put(SturniraLilium.getNombre(), SturniraLilium);
                  
        

        ImageHashii.put(Vampyressa.getNombre(), IVampyressa);
        ImageHashii.put(GlossophagaSoricina.getNombre(), IGlossophagaSoricina);
        ImageHashii.put(DesmodusRotundus.getNombre(), IDesmodusRotundus);
        ImageHashii.put(MyotisRiparius.getNombre(), IMyotisRiparius);
        ImageHashii.put(EptesicusBrasiliensis.getNombre(), IEptesicusBrasiliensis);
        ImageHashii.put(SaccopteryxBilienata.getNombre(), ISaccopteryxBilienata);
        ImageHashii.put(SaccopteryxLeptura.getNombre(), ISaccopteryxLeptura);
        ImageHashii.put(RhynchonycterisNaso.getNombre(), IRhynchonycterisNaso);
        ImageHashii.put(CormuraBrevisrostris.getNombre(), ICormuraBrevisrostris);
        ImageHashii.put(PhyllostomusHastatus.getNombre(), IPhyllostomusHastatus);
        ImageHashii.put(PhyllostomusElongatus.getNombre(), IPhyllostomusElongatus);
        ImageHashii.put(PhyllostomusDiscolor.getNombre(), IPhyllostomusDiscolor);
        ImageHashii.put(TrachopsChirrosus.getNombre(), ITrachopsChirrosus);
        ImageHashii.put(LampronycterisBrachyotis.getNombre(), ILampronycterisBrachyotis);
        ImageHashii.put(TrynycterisNiceforti.getNombre(), ITrynycterisNiceforti);
        ImageHashii.put(LonchorhinaOrinocensis.getNombre(), ILonchorhinaOrinocensis);
        ImageHashii.put(MimomCrenulatum.getNombre(), IMimomCrenulatum);
        ImageHashii.put(CarolliaBrevicauda.getNombre(), ICarolliaBrevicauda);
        ImageHashii.put(CarolliaCastanea.getNombre(), ICarolliaCastanea);
        ImageHashii.put(CarolliaPerspicillata.getNombre(), ICarolliaPerspicillata);
        ImageHashii.put(ArtibeusObscurus.getNombre(), IArtibeusObscurus);
        ImageHashii.put(ArtibeusAuquatorialis.getNombre(), IArtibeusAuquatorialis);
        ImageHashii.put(ArtibeusPlanirostris.getNombre(), IArtibeusPlanirostris);
        ImageHashii.put(ArtibeusLituratus.getNombre(), IArtibeusLituratus);
        ImageHashii.put(DermanuraAnderseni.getNombre(), IDermanuraAnderseni);
        ImageHashii.put(UrodermaMagnirostrum.getNombre(), IUrodermaMagnirostrum);
        ImageHashii.put(UrodermaBilobatum.getNombre(), IUrodermaBilobatum);
        ImageHashii.put(MesophyllaMacconelli.getNombre(), IMesophyllaMacconelli);
        ImageHashii.put(PlatyrrhinusBranchycephalus.getNombre(), IPlatyrrhinusBranchycephalus);
        ImageHashii.put(PlatyrrhinusHelleri.getNombre(), IPlatyrrhinusHelleri);
        ImageHashii.put(PlatyrhinusInfuscus.getNombre(), IPlatyrhinusInfuscus);
        ImageHashii.put(SturniraLilium.getNombre(), ISturniraLilium);
        
        //Inicializar imagenes preguntas
        
        ImageIcon unoA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/1A.png"));
        ImageIcon unoN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/1N.png"));
        ImageIcon dosA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/2A.png"));
        ImageIcon dosN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/2N.png"));
        ImageIcon tresA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/3A.png"));
        ImageIcon tresN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/3N.png"));
        ImageIcon cuatroA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/4A.png"));
        ImageIcon cuatroN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/4N.png"));
        ImageIcon cincoA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/5A.png"));
        ImageIcon cincoN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/5N.png"));
        ImageIcon seisA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/6A.png"));
        ImageIcon seisN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/6N.png"));
        ImageIcon sieteA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/7A.png"));
        ImageIcon sieteN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/7N.png"));
        ImageIcon ochoA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/8A.png"));
        ImageIcon ochoN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/8N.png"));
        ImageIcon nueveA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/9A.png"));
        ImageIcon nueveN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/9N.png"));
        ImageIcon diezA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/10A.png"));
        ImageIcon diezN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/10N.png"));
        ImageIcon onceA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/11A.png"));
        ImageIcon onceN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/11N.png"));
        ImageIcon doceA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/12A.png"));
        ImageIcon doceN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/12N.png"));
        ImageIcon treceA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/13A.png"));
        ImageIcon treceN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/13N.png"));
        ImageIcon catorceA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/14A.png"));
        ImageIcon catorceN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/14N.png"));
        ImageIcon quinceA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/15A.png"));
        ImageIcon quinceN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/15N.png"));
        ImageIcon dieciseisA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/16A.png"));
        ImageIcon dieciseisN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/16N.png"));
        ImageIcon diecisieteA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/17A.png"));
        ImageIcon diecisieteN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/17N.png"));
        ImageIcon dieciochoA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/18A.png"));
        ImageIcon dieciochoN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/18N.png"));
        ImageIcon diecinueveA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/19A.png"));
        ImageIcon diecinueveN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/19N.png"));
        ImageIcon veinteA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/20A.png"));
        ImageIcon veinteN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/20N.png"));
        ImageIcon veintiunoA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/21A.png"));
        ImageIcon veintiunoN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/21N.png"));
        ImageIcon veintidosA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/22A.png"));
        ImageIcon veintidosN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/22N.png"));
        ImageIcon veintitresA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/23A.png"));
        ImageIcon veintitresN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/23N.png"));
        ImageIcon veinticuatroA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/24A.png"));
        ImageIcon veinticuatroN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/24N.png"));
        ImageIcon veinticincoA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/25A.png"));
        ImageIcon veinticincoN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/25N.png"));
        ImageIcon veintiseisA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/26A.png"));
        ImageIcon veintiseisN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/26N.png"));
        ImageIcon veintisieteA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/27A.png"));
        ImageIcon veintisieteN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/27N.png"));
        ImageIcon veintiochoA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/28A.png"));
        ImageIcon veintiochoN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/28N.png"));
        ImageIcon veintinueveA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/29A.png"));
        ImageIcon veintinueveN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/29N.png"));
        ImageIcon treintaA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/30A.png"));
        ImageIcon treintaN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/30N.png"));
        ImageIcon treintaunoA = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/31N.png"));
        ImageIcon treintaunoN = new ImageIcon(
                this.getClass().getResource("/UI/Resources/Preguntas/31N.png"));
        
        //Inicializar el banco de preguntas
        
        Pregunta pregunta1 = new Pregunta(1, "Hoja nasal presente", "Hoja nasal ausente", unoA, unoN);
        Pregunta pregunta2 = new Pregunta(2, "Hoja nasal rudimentaria, incisivos superiores más anchos que los caninos y pólex bien desarrollado", 
                "Hoja nasal prominente; incisivos superiores menores que los caninos, y pólex pequeño", dosA, dosN);
        Pregunta pregunta3 = new Pregunta(3, "Hocico largo y angosto; orejas pequeñas y bien separadas", 
                "Hocico ni largo ni angosto; hoja nasal generalmente larga; orejas generalmente largas", tresA, tresN);
        Pregunta pregunta4 = new Pregunta(4, "Sin cola; uropatagio reducido y angosto; hoja nasal bien desarrollada pero no excepcionalmente"
                + " larga; varias especies con líneas claras en la espalda o la cara",
                "Con cola; uropatagio usualmente bien desarrollado; hocico no redondeado; orejas grandes o muy grandes; hoja nasal"
                + " larga o muy larga", cuatroA, cuatroN);
        Pregunta pregunta5 = new Pregunta(5, "Mentón con una verruga central rodeada de series de verrugas pequeñas y redondeadas, "
                + "hoja nasal grande; cola hasta la mitad del uropatagio donde sale a la superficie, aunque a veces apenas se nota; "
                + "antebrazo 34-45 mm", "Hoja nasal ausente", cincoA, cincoN);
        Pregunta pregunta6 = new Pregunta(6, "Cola contenida dentro del uropatagio, bolsas ausentes en el protopatagio tres falanges"
                + " en el tercer dedo", "Cola libre, fuera o sobre el uropatagio, bolsas en el protopatagio, sin falanges en el tercer"
                        + " dedo", seisA, seisN);
        Pregunta pregunta7 = new Pregunta(7, "Incisivos superiores centrales oblicuos y de diferente forma que los extremos", 
                "Incisivos superiores centrales rectos y no muy diferentes en forma que los extremos", sieteA, sieteN);
        Pregunta pregunta8 = new Pregunta(8, "Con líneas blancas faciales y con o sin línea dorsal", "Sin líneas blancas faciales "
                + "ni dorsales", ochoA, ochoN);
        Pregunta pregunta9 = new Pregunta(9, "Incisivos medios superiores delgados y bífidos", "Incisivos medios superiores grandes"
                + " y no bífidos", nueveA, nueveN);
        Pregunta pregunta10 = new Pregunta(10, "Molares 2/3; AB 28,5 – 32,3 mm", "Molares 3/3; AB 39 – 60 mm", diezA, diezN);
        Pregunta pregunta11 = new Pregunta(11, "Todos los incisivos superiores bilobados y líneas faciales blancas conspicuas", 
                "Incisivos superiores centrales  bilobados o lisos, con líneas faciales blancas poco conspicuas", onceA, onceN);
        Pregunta pregunta12 = new Pregunta(12, "Pelaje marrón negruzco, largo del cráneo más de 24 mm, incisivos convergentes, "
                + "líneas faciales no conspicuas", "Pelaje marrón claro largo del cráneo menor a 24 mm, incisivos poco convergentes, "
                        + "líneas faciales conspicuas", doceA, doceN);
        Pregunta pregunta13 = new Pregunta(13, "Con dos cúspides accesorias definidas en el margen anterior del segundo molar inferior, "
                + "rostro amplio y corto", "Con una cúspide accesorias definidas en el margen anterior del segundo molar inferior, rostro "
                        + "amplio y corto", treceA, treceN);
        Pregunta pregunta14 = new Pregunta(14, "Franjas faciales anchas, perfil dorsal del cráneo con una pequeña depresión en el rostro",
                "Franjas faciales reducidas o ausentes, perfil del cráneo recto y sin la depresión rostral", catorceA, catorceN);
        Pregunta pregunta15 = new Pregunta(15, "De pequeño tamaño, AB menor a 45 mm", "De mediano a gran tamaño, AB mayor a 45 mm",
                quinceA, quinceN);
        Pregunta pregunta16 = new Pregunta(16, "Procesos preorbitales y postorbitales muy desarrollados, molares 2/3. Pelaje ventral "
                + "uniformemente coloreado", "Procesos pre y postorbitales poco desarrollados, molares 2/2 o 2/3. Pelaje ventral moteado",
                dieciseisA, dieciseisN);
        Pregunta pregunta17 = new Pregunta(17, "AB 70-72 mm", "AB menor a 70 mm ", diecisieteA, diecisieteN);
        Pregunta pregunta18 = new Pregunta(18, "AB mayor a 63 mm", "AB menor a 63 mm", dieciochoA, dieciochoN);
        Pregunta pregunta19 = new Pregunta(19, "hilera dental superior sin entrada o muesca en el perfil labial mandibular", "hilera "
                + "dental superior con entrada o muesca en el perfil labial mandibular", diecinueveA, diecinueveN);
        Pregunta pregunta20 = new Pregunta(20, "Segundo premolar inferior casi el doble de la altura del primer molar, hocico alargado",
                "Segundo premolar inferior ligeramente más alto que el primer molar, hocico corto", veinteA, veinteN);
        Pregunta pregunta21 = new Pregunta(21, "Incisivos 2/1", "Incisivos 2/2 o 1/2", veintiunoA, veintiunoN);
        Pregunta pregunta22 = new Pregunta(22, "Cola larga incluida en el uropatagio hasta el margen posterior", "Cola corta incluida en "
                + "el uropatagio hasta menos del margen posterior ", veintidosA, veintidosN);
        Pregunta pregunta23 = new Pregunta(23, "Dos premolares inferiores", "Tres premolares inferiores", veintitresA, veintitresN);
        Pregunta pregunta24 = new Pregunta(24, "Protuberancias presentes en labios y mentón, margen de la hoja nasal finamente aserrada",
                "Protuberancias ausentes en labios y mentón,  margen de la hoja nasal no aserrada", veinticuatroA, veinticuatroN);
        Pregunta pregunta25 = new Pregunta(25, "Largo de la oreja (desde la muesca) menor a 16 mm, calcar del mismo tamaño al pie, incisivos"
                + " superiores con forma de cincel y en línea con los caninos", "Largo de la oreja (desde la muesca) mayor a 16 mm, calcar de"
                        + " menor tamaño al pie, incisivos superiores sin forma de cincel y no alineados con los caninos", 
                veinticincoA, veinticincoN);
        Pregunta pregunta26 = new Pregunta(26, "Largo del calcar igual o mayor al largo del pie, largo de la oreja (desde la muesca) mayor a "
                + "25 mm, cresta sagital desarrollada, primer incisivo superior e inferior más altos que anchos", "Largo del calcar menor al "
                        + "largo del pie, largo de la oreja (desde la muesca) menor a 25 mm, cresta sagital ausente o poco desarrollada, "
                        + "primer incisivo superior e inferior más anchos que largos", veintiseisA, veintiseisN);
        Pregunta pregunta27 = new Pregunta(27, "Antebrazo menor a 75 mm, membrana alar anclada a los tobillos, la mayor longitud del cráneo es "
                + "menor a 35 mm", "Antebrazo mayor a 75 mm, membrana alar anclada lateralmente al pie, la mayor longitud del cráneo es mayor a "
                        + "35 mm", veintisieteA, veintisieteN);
        Pregunta pregunta28 = new Pregunta(28, "Incisivos superiores externos menos de la mitad de los internos, premolares 1/2", 
                "Incisivos superiores casi del mismo tamaño, premolares 3/3", veintiochoA, veintiochoN);
        Pregunta pregunta29 = new Pregunta(29, "Líneas dorsales blanquecinas ausentes", "Líneas dorsales blanquecinas presentes", 
                veintinueveA, veintinueveN);
        Pregunta pregunta30 = new Pregunta(30, "Sin saco glandular", "Con saco glandular", treintaA, treintaN);
        Pregunta pregunta31 = new Pregunta(31, "AB 45 – 53 mm", "AB menor a 44 mm", treintaunoA, treintaunoN);
        
        
        
        
        
        
        bancoPreguntas.put(pregunta1.getNumero(), pregunta1);
        bancoPreguntas.put(pregunta2.getNumero(), pregunta2);
        bancoPreguntas.put(pregunta3.getNumero(), pregunta3);
        bancoPreguntas.put(pregunta4.getNumero(), pregunta4);
        bancoPreguntas.put(pregunta5.getNumero(), pregunta5);
        bancoPreguntas.put(pregunta6.getNumero(), pregunta6);
        bancoPreguntas.put(pregunta7.getNumero(), pregunta7);
        bancoPreguntas.put(pregunta8.getNumero(), pregunta8);
        bancoPreguntas.put(pregunta9.getNumero(), pregunta9);
        bancoPreguntas.put(pregunta10.getNumero(), pregunta10);
        bancoPreguntas.put(pregunta11.getNumero(), pregunta11);
        bancoPreguntas.put(pregunta12.getNumero(), pregunta12);
        bancoPreguntas.put(pregunta13.getNumero(), pregunta13);
        bancoPreguntas.put(pregunta14.getNumero(), pregunta14);
        bancoPreguntas.put(pregunta15.getNumero(), pregunta15);
        bancoPreguntas.put(pregunta16.getNumero(), pregunta16);
        bancoPreguntas.put(pregunta17.getNumero(), pregunta17);
        bancoPreguntas.put(pregunta18.getNumero(), pregunta18);
        bancoPreguntas.put(pregunta19.getNumero(), pregunta19);
        bancoPreguntas.put(pregunta20.getNumero(), pregunta20);
        bancoPreguntas.put(pregunta21.getNumero(), pregunta21);
        bancoPreguntas.put(pregunta22.getNumero(), pregunta22);
        bancoPreguntas.put(pregunta23.getNumero(), pregunta23);
        bancoPreguntas.put(pregunta24.getNumero(), pregunta24);
        bancoPreguntas.put(pregunta25.getNumero(), pregunta25);
        bancoPreguntas.put(pregunta26.getNumero(), pregunta26);
        bancoPreguntas.put(pregunta27.getNumero(), pregunta27);
        bancoPreguntas.put(pregunta28.getNumero(), pregunta28);
        bancoPreguntas.put(pregunta29.getNumero(), pregunta29);
        bancoPreguntas.put(pregunta30.getNumero(), pregunta30);
        bancoPreguntas.put(pregunta31.getNumero(), pregunta31);
        
        
        
        
        //Asociamos las fotos a los respectivos murcielagos
        AsociarImagenes();

        //Modificamos un tanto la interfaz
        initComponents();
        this.setTitle("BatApp");
        Ventana.setIconAt(0, icon1);
        Ventana.setIconAt(1, icon2);
        Ventana.setIconAt(2, icon3);
        //this.setExtendedState(GUI.MAXIMIZED_BOTH); 
        this.setIconImage(Fotito);
        Foto.setIcon(Bienvenido);
        Agregar.setIcon(Encontrar);

        //Llenamos la lista del banco
        Lista.setModel(DefineModel());
        llenar();

        //this.set
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana = new javax.swing.JTabbedPane();
        Añadir = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        Foto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Familia = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Alimentación = new javax.swing.JLabel();
        Banco = new javax.swing.JPanel();
        ImagenA = new javax.swing.JLabel();
        ImagenN = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        preguntaN = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        preguntaA = new javax.swing.JTextArea();
        Foto1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Familia1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Alimentación1 = new javax.swing.JLabel();
        Identificar = new javax.swing.JPanel();
        Agregar = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        family = new javax.swing.JTextField();
        feeding = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Subir = new javax.swing.JButton();
        Crear = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        BatApp = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N

        Ventana.setFont(new java.awt.Font("Tempus Sans ITC", 0, 15)); // NOI18N
        Ventana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentanaMouseClicked(evt);
            }
        });

        Lista.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        Lista.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ListaPropertyChange(evt);
            }
        });
        Lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Lista);

        jLabel1.setText("Selecciona un murciélago");

        Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre:");

        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("-");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Familia:");

        Familia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Familia.setText("-");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Alimentación:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Alimentación.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Alimentación.setText("-");

        javax.swing.GroupLayout AñadirLayout = new javax.swing.GroupLayout(Añadir);
        Añadir.setLayout(AñadirLayout);
        AñadirLayout.setHorizontalGroup(
            AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AñadirLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AñadirLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addGroup(AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(Familia, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(Alimentación, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(Foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 187, Short.MAX_VALUE))
        );
        AñadirLayout.setVerticalGroup(
            AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AñadirLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AñadirLayout.createSequentialGroup()
                        .addComponent(Foto, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Familia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alimentación))
                    .addComponent(jScrollPane1))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        Ventana.addTab("Banco de Murciélagos", Añadir);

        ImagenA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImagenAMouseClicked(evt);
            }
        });

        ImagenN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImagenNMouseClicked(evt);
            }
        });

        preguntaN.setColumns(20);
        preguntaN.setRows(5);
        jScrollPane2.setViewportView(preguntaN);

        preguntaA.setEditable(false);
        preguntaA.setColumns(20);
        preguntaA.setRows(5);
        jScrollPane3.setViewportView(preguntaA);

        Foto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre:");

        Nombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre1.setText("-");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Familia:");

        Familia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Familia1.setText("-");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Alimentación:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Alimentación1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Alimentación1.setText("-");

        javax.swing.GroupLayout BancoLayout = new javax.swing.GroupLayout(Banco);
        Banco.setLayout(BancoLayout);
        BancoLayout.setHorizontalGroup(
            BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BancoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagenA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagenN, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Familia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Alimentación1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BancoLayout.setVerticalGroup(
            BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BancoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BancoLayout.createSequentialGroup()
                        .addComponent(Foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Familia1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alimentación1))
                    .addGroup(BancoLayout.createSequentialGroup()
                        .addGroup(BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenA, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImagenN, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        Ventana.addTab("Identificar un murciélago", Banco);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        family.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyActionPerformed(evt);
            }
        });

        feeding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedingActionPerformed(evt);
            }
        });

        jLabel9.setText("Nombre");

        jLabel10.setText("Familia");

        jLabel11.setText("Alimentación");

        Subir.setText("Subir Foto");
        Subir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubirMouseClicked(evt);
            }
        });

        Crear.setText("Añadir Murciélago");
        Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout IdentificarLayout = new javax.swing.GroupLayout(Identificar);
        Identificar.setLayout(IdentificarLayout);
        IdentificarLayout.setHorizontalGroup(
            IdentificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IdentificarLayout.createSequentialGroup()
                .addGroup(IdentificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IdentificarLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(Subir))
                    .addGroup(IdentificarLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(162, 162, 162)
                .addGroup(IdentificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Crear)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(family, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feeding, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        IdentificarLayout.setVerticalGroup(
            IdentificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IdentificarLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(IdentificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IdentificarLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(family, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feeding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IdentificarLayout.createSequentialGroup()
                        .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addGap(56, 56, 56)
                        .addGroup(IdentificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Subir)
                            .addComponent(Crear))))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        Ventana.addTab("Añadir un murciélago", Identificar);

        BatApp.setText("BatApp");

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalirMousePressed(evt);
            }
        });
        BatApp.add(Salir);

        Menu.add(BatApp);

        Ayuda.setText("Ayuda");
        Menu.add(Ayuda);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ventana, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ventana))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMousePressed
        System.exit(0);
    }//GEN-LAST:event_SalirMousePressed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void familyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_familyActionPerformed

    private void feedingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feedingActionPerformed

    private void VentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentanaMouseClicked
        // TODO add your handling code here:
       // valorPregunta=1;
       // llenar();
    }//GEN-LAST:event_VentanaMouseClicked

    private void ImagenAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImagenAMouseClicked
        // TODO add your handling code here:
        descartar("A");
        valorPregunta = Afirmativa[valorPregunta];
        if (valorPregunta != 0) {
            llenar();
        }
    }//GEN-LAST:event_ImagenAMouseClicked

    private void ImagenNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImagenNMouseClicked
        // TODO add your handling code here:
       descartar("N");
        valorPregunta = Negativa[valorPregunta];
        if (valorPregunta != 0) {
            llenar();
        }
    }//GEN-LAST:event_ImagenNMouseClicked

    private void SubirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubirMouseClicked
       
        int seleccion;
       JFileChooser Escoger=new JFileChooser();
        seleccion =Escoger.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION){
           
            try{
            FileNameExtensionFilter filter;
            filter = new FileNameExtensionFilter(
                        "Images", "png");
            File fichero =Escoger.getSelectedFile();
            String Location = fichero.getAbsolutePath();
            Preview = new ImageIcon(Location);
            
            Agregar.setIcon(Preview);
            FotoSubida=true;
           // EnviarImagen(Preview);
            }
            catch(Exception NoesImagen){
                System.out.println("El archivo seleccionado no es una imagen");
            }
        }
        else if(seleccion == JFileChooser.CANCEL_OPTION){ 
            Escoger.setVisible(false);
                    }  
        
    }//GEN-LAST:event_SubirMouseClicked

    private void CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearMouseClicked
       if(FotoSubida){
       String Nombre,Familia,alimentacion;
       Nombre=name.getText();
       Familia=family.getText();
       alimentacion=feeding.getText();
       ImageIcon Fotillo=Preview;
       Murcielago TempMurci = new Murcielago(Preview,Nombre,alimentacion);
       MurciHashii.put(Nombre, TempMurci);
       ImageHashii.put(Nombre, Preview);
       Lista.setModel(DefineModel());
       FotoSubida=false;
       }
//catch(){
         //  System.out.println("No hay imagen");
          // JOptionPane.showInputDialog("Seleccione una foto");
      // }
    
    }//GEN-LAST:event_CrearMouseClicked

    private void ListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaValueChanged
        NavegarBanco();
    }//GEN-LAST:event_ListaValueChanged

    private void ListaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ListaPropertyChange

    }//GEN-LAST:event_ListaPropertyChange

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
        

    }
    
    public void descartar(String op) {
        System.out.println("Es la pregunta" + valorPregunta +op);
        if (valorPregunta == 1) {
            if (op == "A") {
                
            } else {
 
            }
        } else if (valorPregunta == 2) {
            if (op == "A") {
                /*Set<String> Claves;
                Claves = PhyllostomidaeHashii.keySet();
                Claves.forEach((Clave) -> {
                    Phyllostomidae Temp2 = PhyllostomidaeHashii.get(Clave);
                    if (Temp2.getPolexDesarrollado() != true) {
                        PhyllostomidaeHashii.remove(Clave);
                    }
                });*/
                Murcielago Mumurci =(MurciHashii.get("Desmodus Rotundus"));
                ImageIcon Fotito=ImageHashii.get("Desmodus Rotundus");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
        } else if (valorPregunta == 3) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Glossofaga Soricina"));
                ImageIcon Fotito=ImageHashii.get("Glossofaga Soricina");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            } else {
            }
        } else if (valorPregunta == 9) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Vampyressa"));
                ImageIcon Fotito=ImageHashii.get("Vampyressa");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            } else {
            }
        }else if (valorPregunta == 10 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Mesphylla Macconelli"));
                ImageIcon Fotito=ImageHashii.get("Mesphylla Macconelli");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            } else {
                Murcielago Mumurci =(MurciHashii.get("Sturnira Lilium"));
                ImageIcon Fotito=ImageHashii.get("Sturnira Lilium");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
        }else if (valorPregunta == 12 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Platyrrhinus Infuscus"));
                ImageIcon Fotito=ImageHashii.get("Platyrrhinus Infuscus");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
        }else if (valorPregunta == 13 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Platyrrhinus Branchycephalus"));
                ImageIcon Fotito=ImageHashii.get("Platyrrhinus Branchycephalus");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            } else {
                Murcielago Mumurci =(MurciHashii.get("Platyrrhinus Helleri"));
                ImageIcon Fotito=ImageHashii.get("Platyrrhinus Helleri");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
        }else if (valorPregunta == 14 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Uroderma Bilobatum"));
                ImageIcon Fotito=ImageHashii.get("Uroderma Bilobatum");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            } else {
                Murcielago Mumurci =(MurciHashii.get("Uroderma Magnirostrum"));
                ImageIcon Fotito=ImageHashii.get("Uroderma Magnirostrum");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
        }else if (valorPregunta == 15 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Dermanura Anderseni"));
                ImageIcon Fotito=ImageHashii.get("Dermanura Anderseni");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
        }else if (valorPregunta == 16 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Artibeus Lituratus"));
                ImageIcon Fotito=ImageHashii.get("Artibeus Lituratus");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
        }else if (valorPregunta == 17 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Artibeus Planirostris"));
                ImageIcon Fotito=ImageHashii.get("Artibeus Planirsotris");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
        }else if (valorPregunta == 18 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Artibeus Auquatorialis"));
                ImageIcon Fotito=ImageHashii.get("Artibeus Auquatorialis");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            } else {
                Murcielago Mumurci =(MurciHashii.get("Artibeus Obscurus"));
                ImageIcon Fotito=ImageHashii.get("Artibeus Obscurus");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
        }
        else if (valorPregunta == 19 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Carollia Perspicillata"));
                ImageIcon Fotito=ImageHashii.get("Carollia Perspicillata");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
        }
         else if (valorPregunta == 20 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Carollia Castanea"));
                ImageIcon Fotito=ImageHashii.get("Carollia Castanea");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
            else{
                Murcielago Mumurci =(MurciHashii.get("Carollia Brevicauda"));
                ImageIcon Fotito=ImageHashii.get("Carollia Brevicauda");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito); 
            }
         }
             else if (valorPregunta == 21 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Mimom Crenulatum"));
                ImageIcon Fotito=ImageHashii.get("Mimom Crenulatum");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
    }
        
            else if (valorPregunta == 22 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Lonchorhina Orinocensis"));
                ImageIcon Fotito=ImageHashii.get("Lonchorhina Orinocensis");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
           
    }
        
        else if (valorPregunta == 24 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Trachops Chirrosus"));
                ImageIcon Fotito=ImageHashii.get("Trachops chirrosus");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
           
    }
        
        else if (valorPregunta == 25 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Lampronycteris Brachyotis"));
                ImageIcon Fotito=ImageHashii.get("Lampronycteris Brachyotis");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
            else{
              Murcielago Mumurci =(MurciHashii.get("Trynycteris Niceforti"));
                ImageIcon Fotito=ImageHashii.get("Trynycteris Niceforti");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
           
    }
        
        
            else if (valorPregunta == 26 ) {
            if (op != "A") {
                Murcielago Mumurci =(MurciHashii.get("Phyllostomus Discolor"));
                ImageIcon Fotito=ImageHashii.get("Phyllostomus Discolor");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
           
           
    }
        
                    else if (valorPregunta == 27 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Phyllostomus Elongatus"));
                ImageIcon Fotito=ImageHashii.get("Phyllostomus Elongatus");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
            else{
             Murcielago Mumurci =(MurciHashii.get("Phyllostomus Hastatus"));
                ImageIcon Fotito=ImageHashii.get("Phyllostomus Hastatus");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
           
           
    }
        
        
                else if (valorPregunta == 28 ) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Eptesicus Brasiliensis"));
                ImageIcon Fotito=ImageHashii.get("Eptesicus Brasiliensis");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
            
            else{
                Murcielago Mumurci =(MurciHashii.get("Myotis Riparius"));
                ImageIcon Fotito=ImageHashii.get("Myotis Riparius");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
                }
            else if (valorPregunta == 29) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Cormura Brevisrostris"));
                ImageIcon Fotito=ImageHashii.get("Cormura Brevisrostris");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
            }
        
         else if (valorPregunta == 30) {
            if (op == "A") {
                Murcielago Mumurci =(MurciHashii.get("Rhynchonycteris Naso"));
                ImageIcon Fotito=ImageHashii.get("Rhynchonycteris Naso");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
            }
        
          else if (valorPregunta == 31) {
            if (op != "A") {
                Murcielago Mumurci =(MurciHashii.get("Saccopteryx Leptura"));
                ImageIcon Fotito=ImageHashii.get("Saccopteryx Leptura");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            }
            else{
                Murcielago Mumurci =(MurciHashii.get("Saccopteryx Bilienata"));
                ImageIcon Fotito=ImageHashii.get("Saccopteryx Bilienata");
                Nombre1.setText(Mumurci.getNombre());
                Familia1.setText(Mumurci.getClass().getSimpleName());
                Alimentación1.setText(Mumurci.getAlimentacion());
                int altura = Fotito.getIconHeight();
                int ancho = Fotito.getIconWidth();
                Foto1.setSize(ancho, altura);
                Foto1.setIcon(Fotito);
            
            }
            }
        
        
    }
    public void llenar(){
        Pregunta x= bancoPreguntas.get(valorPregunta);
        int altura = x.getAfirmativo().getIconHeight();
        int ancho = x.getAfirmativo().getIconWidth();
        ImagenA.setSize(ancho, altura);
        ImagenA.setIcon(x.getAfirmativo());
        altura = x.getNegativo().getIconHeight();
        ancho = x.getNegativo().getIconWidth();
        ImagenN.setSize(ancho, altura);
        ImagenN.setIcon(x.getNegativo());
        preguntaA.setText(x.getPreguntaA());
        preguntaN.setText(x.getPreguntaN());
    }
    public void Interfazpregunta(ImageIcon fotito){
        int altura = fotito.getIconHeight();
        int ancho = fotito.getIconWidth();
        Foto.setSize(ancho, altura);
        Foto.setIcon(fotito);
    }
    
    public DefaultListModel DefineModel() {

        DefaultListModel<String> model = new DefaultListModel<>();

        Set<String> Claves;
        Claves = MurciHashii.keySet();
        Claves.forEach((Clave) -> {
            model.addElement(Clave);
        });

        return model;
    }

    public void PonerFoto(ImageIcon fotito) {
        int altura = fotito.getIconHeight();
        int ancho = fotito.getIconWidth();
        Foto.setSize(ancho, altura);
        Foto.setIcon(fotito);
        
    }

    public void NavegarBanco() {

        String Murci = Lista.getSelectedValue();
        System.out.println(Lista.getSelectedValue());
        ImageIcon Foto1 = ImageHashii.get(Murci);
        Murcielago Mumurci = MurciHashii.get(Murci);

        PonerFoto(Foto1);
        PonerInfo(Mumurci);

    }

    private void AsociarImagenes() {
        Set<String> Claves;
        Claves = MurciHashii.keySet();
        Claves.forEach((Clave) -> {
            ImageIcon Temp = ImageHashii.get(Clave);
            Murcielago Temp2 = MurciHashii.get(Clave);
            Temp2.setFoto(Temp);
        });

    }
    
    private void PonerInfo(Murcielago Mumurci) {
        
        Nombre.setText(Mumurci.getNombre());
        Familia.setText(Mumurci.getClass().getSimpleName());
        Alimentación.setText(Mumurci.getAlimentacion());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar;
    private javax.swing.JLabel Alimentación;
    private javax.swing.JLabel Alimentación1;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JPanel Añadir;
    private javax.swing.JPanel Banco;
    private javax.swing.JMenu BatApp;
    private javax.swing.JButton Crear;
    private javax.swing.JLabel Familia;
    private javax.swing.JLabel Familia1;
    private javax.swing.JLabel Foto;
    private javax.swing.JLabel Foto1;
    private javax.swing.JPanel Identificar;
    private javax.swing.JLabel ImagenA;
    private javax.swing.JLabel ImagenN;
    private javax.swing.JList<String> Lista;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton Subir;
    private javax.swing.JTabbedPane Ventana;
    private javax.swing.JTextField family;
    private javax.swing.JTextField feeding;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField name;
    private javax.swing.JTextArea preguntaA;
    private javax.swing.JTextArea preguntaN;
    // End of variables declaration//GEN-END:variables

    

}
