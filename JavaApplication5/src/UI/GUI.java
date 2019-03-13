package UI;

import data.Emballonuridae;
import data.Murcielago;
import data.Phyllostomidae;
import data.Vespertilionidae;
import java.awt.Image;
import java.util.HashMap;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

public class GUI extends javax.swing.JFrame {

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

    //Creamos los diccionarios de murcielagos y fotos respectivamente
    HashMap<String, Murcielago> MurciHashii = new HashMap<>();
    HashMap<String, ImageIcon> ImageHashii = new HashMap<>();

    public GUI() {
        
        
       Emballonuridae.Familia="Emballonuridae";
       Phyllostomidae.Familia="Phyllostomidae";
       Vespertilionidae.Familia="Vespertilionidae";

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
        
        //No image
        Phyllostomidae UrodermaSp = new Phyllostomidae(false, false, false, false, false, false, false, true,
                true, null, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                null, null, null, null, true, false, null, null, true, null, 0, "Uroderma Sp", "Pendiente", true);
        Phyllostomidae SturniraParvidens = new Phyllostomidae(false, false, false, false, false, false, false, true,
                false, false, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                null, true, null, null, null, false, null, null, true, null, 0, "Sturnira Parvidens", "Pendiente", true);
        Phyllostomidae SturniraSp = new Phyllostomidae(false, false, false, false, false, false, false, true,
                false, false, null, null, null, null, null, null, null, null, null, null, null, 'S', 'S', null, null, null,
                null, true, null, null, null, false, null, null, true, null, 0, "Sturnira Sp", "Pendiente", true);
       //
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
        Identificar = new javax.swing.JPanel();
        Agregar = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Subir = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        BatApp = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N

        Ventana.setFont(new java.awt.Font("Tempus Sans ITC", 0, 15)); // NOI18N

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
        Nombre.setText("Lala");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Familia:");

        Familia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Familia.setText("Mimi");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Alimentación:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Alimentación.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Alimentación.setText("Dulces");

        javax.swing.GroupLayout AñadirLayout = new javax.swing.GroupLayout(Añadir);
        Añadir.setLayout(AñadirLayout);
        AñadirLayout.setHorizontalGroup(
            AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AñadirLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(Familia, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(Alimentación, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(Foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 125, Short.MAX_VALUE))
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
                .addContainerGap(243, Short.MAX_VALUE))
        );

        Ventana.addTab("Banco de Murciélagos", Añadir);

        javax.swing.GroupLayout BancoLayout = new javax.swing.GroupLayout(Banco);
        Banco.setLayout(BancoLayout);
        BancoLayout.setHorizontalGroup(
            BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        BancoLayout.setVerticalGroup(
            BancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        Ventana.addTab("Identificar un murciélago", Banco);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        Subir.setText("Subir Foto");

        javax.swing.GroupLayout IdentificarLayout = new javax.swing.GroupLayout(Identificar);
        Identificar.setLayout(IdentificarLayout);
        IdentificarLayout.setHorizontalGroup(
            IdentificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IdentificarLayout.createSequentialGroup()
                .addGroup(IdentificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IdentificarLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addGap(168, 168, 168)
                        .addGroup(IdentificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(IdentificarLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Subir)))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        IdentificarLayout.setVerticalGroup(
            IdentificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IdentificarLayout.createSequentialGroup()
                .addGroup(IdentificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IdentificarLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addGroup(IdentificarLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addComponent(Subir)
                .addContainerGap(229, Short.MAX_VALUE))
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
            .addComponent(Ventana)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMousePressed
        System.exit(0);
    }//GEN-LAST:event_SalirMousePressed

    private void ListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaValueChanged
        NavegarBanco();
    }//GEN-LAST:event_ListaValueChanged

    private void ListaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ListaPropertyChange

    }//GEN-LAST:event_ListaPropertyChange

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
        Alimentación.setText(Mumurci.getAlimentacion());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar;
    private javax.swing.JLabel Alimentación;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JPanel Añadir;
    private javax.swing.JPanel Banco;
    private javax.swing.JMenu BatApp;
    private javax.swing.JLabel Familia;
    private javax.swing.JLabel Foto;
    private javax.swing.JPanel Identificar;
    private javax.swing.JList<String> Lista;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel Nombre;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton Subir;
    private javax.swing.JTabbedPane Ventana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    

}
