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
        
    ImageIcon Encontrar= new ImageIcon(
    this.getClass().getResource("/UI/Resources/Encontrar.png"));
    
    ImageIcon ejemplo = new ImageIcon(
    this.getClass().getResource("/UI/Resources/Retratos/ejemplo.png"));
    
    Image Fotito = icon4.getImage();
    
    HashMap<String, Murcielago> MurciHashii = new HashMap <>();
    HashMap<String, ImageIcon> ImageHashii = new HashMap <>();
    
    
    
    
    
   
   
    
    
    public GUI() {
        
        ImageIcon IDesmodusRotundus = new ImageIcon(
    this.getClass().getResource("/UI/Resources/Retratos/Desmodus Rotundus.png"));
        
        ImageIcon IGlossophagaSoricina = new ImageIcon(
    this.getClass().getResource("/UI/Resources/Retratos/Glossophaga Soricina.png"));
        
        ImageIcon IVampyressa = new ImageIcon(
    this.getClass().getResource("/UI/Resources/Retratos/Vampyressa thyrone.png"));
        
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
        Phyllostomidae DesmodusRotundus= new Phyllostomidae(null,null,null,null, true, null,null,null, 
                null, null, null, null, null,null,null,null, null, null, null,null,null, '\0', '\0', null, null, null, 
                null, null, null, null, null, null, null, null, null, null, 0, "Glossofaga Soricina", "Hematófago", true);
        Phyllostomidae GlossophagaSoricina= new Phyllostomidae(true,true,true,true, false, null,null,null, 
                null, null, null, null, null,null,null,null, null, null, null,null,null, '\0', '\0', null, null, null, 
                null, null, null, null, null, null, null, null, null, null, 0, "Glossofaga Soricina", "Nectarívoro", true);
        Phyllostomidae Vampyressa= new Phyllostomidae(false,false,false,false,false,false,false,true, 
                null, true, null, null, null,null,null,null, null, null, null,null,null, 'M', 'M', null, null, null, 
                null, null, null, null, null, false, null, null, false, true, 0, "Vampyressa", "Nectarívoro", true);
     
        
    MurciHashii.put("Vampyressa", Vampyressa);
    MurciHashii.put("Glossophaga Soricina", GlossophagaSoricina);
    MurciHashii.put("Desmodus Rotundus", DesmodusRotundus);
    
    ImageHashii.put("Desmodus Rotundus", IDesmodusRotundus);
    ImageHashii.put("Glossophaga Soricina", IGlossophagaSoricina);
    ImageHashii.put("Vampyressa", IVampyressa);
        
    
    AsociarImagenes();
    
        
        initComponents();
        this.setTitle("BatApp");
        
        Lista.setModel(DefineModel());
        
        Ventana.setIconAt(0, icon1);
        Ventana.setIconAt(1, icon2);
        Ventana.setIconAt(2, icon3);
        //this.setExtendedState(GUI.MAXIMIZED_BOTH); 
        this.setIconImage(Fotito);
        Foto.setIcon(Bienvenido);
        Agregar.setIcon(Encontrar);
     
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lala");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Familia:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mimi");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Alimentación:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dulces");

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
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
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
                    .addComponent(Foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
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
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    
    
   public DefaultListModel DefineModel(){
       
       
   DefaultListModel<String> model = new DefaultListModel<>();
   
    Set<String> Claves;
        Claves = MurciHashii.keySet();
        Claves.forEach((Clave) -> { 
            model.addElement(Clave);
        });
  
   return model;
}
   
   public void PonerFoto(ImageIcon ejemplo){
       int altura= ejemplo.getIconHeight();
       int ancho= ejemplo.getIconWidth();
       Foto.setSize(ancho,altura);
       Foto.setIcon(ejemplo);
   }
   
   public void LlenarLista(){
   
   
   }
   
   public void NavegarBanco(){
       
   String Murci=Lista.getSelectedValue();
   System.out.println(Lista.getSelectedValue());
   ImageIcon Foto1=ImageHashii.get(Murci);
  
       PonerFoto(Foto1);
   
   
   
   
   }


  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JPanel Añadir;
    private javax.swing.JPanel Banco;
    private javax.swing.JMenu BatApp;
    private javax.swing.JLabel Foto;
    private javax.swing.JPanel Identificar;
    private javax.swing.JList<String> Lista;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton Subir;
    private javax.swing.JTabbedPane Ventana;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void AsociarImagenes() {
        Set<String> Claves;
        Claves = MurciHashii.keySet();
        Claves.forEach((Clave) -> { 
            ImageIcon Temp= ImageHashii.get(Clave);
            Murcielago Temp2 = MurciHashii.get(Clave);
            Temp2.setFoto(Temp);
        });
        
    }
}
