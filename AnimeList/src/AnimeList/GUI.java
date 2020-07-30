//DimensionWieldr
//April 11, 2020
//AnimeList GUI Handler

package AnimeList;

import java.util.*;

public class GUI extends javax.swing.JFrame {

    ///
    //FIELDS
    ///
    
    AnimeList animeList;
    Anime selectedAnime;
    String[] listStrings;
    final String FILTER_ALL = "All";
    final String FILTER_WATCHING = "Watching";
    final String FILTER_FINISHED = "Finished";
    final String TRUE = "True";
    final String FALSE = "False";
    final String[] FILTER_STRINGS = {FILTER_ALL, FILTER_WATCHING, FILTER_FINISHED};
    final String[] FINISHED_STRINGS = {TRUE, FALSE};
    
    ///
    //CONSTRUCTORS
    ///
    
    public GUI(AnimeList animeList) {
        this.animeList = animeList;
        this.animeList.sort();
        this.listStrings = new String[this.animeList.list.size()];
        for(int i = 0; i < this.animeList.list.size(); i++){
            listStrings[i] = this.animeList.list.get(i).name;
        }
        initComponents();
        updateEpisodeCount();
    }
    public GUI(AnimeList animeList, String[] listStrings){
        this.animeList = animeList;
        this.animeList.sort();
        this.listStrings = listStrings;
        initComponents();
        updateEpisodeCount();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHome = new javax.swing.JPanel();
        jScrollPaneAnimeList = new javax.swing.JScrollPane();
        jListAnimeList = new javax.swing.JList<>();
        jLabelTitle = new javax.swing.JLabel();
        jLabelFilter = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelCurEpisode = new javax.swing.JLabel();
        jLabelFinished = new javax.swing.JLabel();
        jComboBoxFilter = new javax.swing.JComboBox<>();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldCurEpisode = new javax.swing.JTextField();
        jComboBoxFinished = new javax.swing.JComboBox<>();
        jButtonChange = new javax.swing.JButton();
        jLabelName1 = new javax.swing.JLabel();
        jLabelCurEpisode1 = new javax.swing.JLabel();
        jLabelFinished1 = new javax.swing.JLabel();
        jTextFieldName1 = new javax.swing.JTextField();
        jTextFieldCurEpisode1 = new javax.swing.JTextField();
        jComboBoxFinished1 = new javax.swing.JComboBox<>();
        jButtonAdd = new javax.swing.JButton();
        jLabelTitle1 = new javax.swing.JLabel();
        jLabelTitle2 = new javax.swing.JLabel();
        jButtonAddEpisode = new javax.swing.JButton();
        jButtonRemoveEpisode = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jLabelTitle3 = new javax.swing.JLabel();
        jLabelEpisodeCount = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListAnimeList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jListAnimeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = listStrings;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListAnimeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jListAnimeListMousePressed(evt);
            }
        });
        jScrollPaneAnimeList.setViewportView(jListAnimeList);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitle.setText("Anime List!");

        jLabelFilter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFilter.setText("Filter");

        jLabelName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelName.setText("Name");

        jLabelCurEpisode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCurEpisode.setText("Current Episode");

        jLabelFinished.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFinished.setText("Finished");

        jComboBoxFilter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxFilter.setModel(new javax.swing.DefaultComboBoxModel<>(FILTER_STRINGS));
        jComboBoxFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFilterActionPerformed(evt);
            }
        });

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldCurEpisode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jComboBoxFinished.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxFinished.setModel(new javax.swing.DefaultComboBoxModel<>(FINISHED_STRINGS));

        jButtonChange.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonChange.setText("Change");
        jButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeActionPerformed(evt);
            }
        });

        jLabelName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelName1.setText("Name");

        jLabelCurEpisode1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCurEpisode1.setText("Current Episode");

        jLabelFinished1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFinished1.setText("Finished");

        jTextFieldName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldCurEpisode1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jComboBoxFinished1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxFinished1.setModel(new javax.swing.DefaultComboBoxModel<>(FINISHED_STRINGS));

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabelTitle1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitle1.setText("Edit Anime");

        jLabelTitle2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitle2.setText("Add Anime");

        jButtonAddEpisode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAddEpisode.setText("+");
        jButtonAddEpisode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddEpisodeActionPerformed(evt);
            }
        });

        jButtonRemoveEpisode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonRemoveEpisode.setText("—");
        jButtonRemoveEpisode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveEpisodeActionPerformed(evt);
            }
        });

        jButtonRemove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonRemove.setText("Remove Selected Anime");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jLabelTitle3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitle3.setText("Total Episode Count:");

        jLabelEpisodeCount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFilter)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneAnimeList, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChange)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelName1)
                            .addComponent(jLabelCurEpisode1)
                            .addComponent(jLabelFinished1))
                        .addGap(49, 49, 49)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldName1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBoxFinished1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldCurEpisode1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelHomeLayout.createSequentialGroup()
                                .addComponent(jLabelTitle3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEpisodeCount, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButtonAdd)
                    .addComponent(jLabelTitle1)
                    .addComponent(jLabelTitle2)
                    .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonRemove)
                        .addGroup(jPanelHomeLayout.createSequentialGroup()
                            .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCurEpisode)
                                .addComponent(jLabelFinished)
                                .addComponent(jLabelName))
                            .addGap(49, 49, 49)
                            .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelHomeLayout.createSequentialGroup()
                                    .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxFinished, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                                        .addComponent(jTextFieldCurEpisode, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonAddEpisode, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonRemoveEpisode, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearch)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitle)
                    .addComponent(jLabelFilter)
                    .addComponent(jComboBoxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemove))
                .addGap(18, 18, 18)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jScrollPaneAnimeList, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jLabelTitle1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelName)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCurEpisode)
                            .addComponent(jTextFieldCurEpisode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddEpisode)
                            .addComponent(jButtonRemoveEpisode))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFinished)
                            .addComponent(jComboBoxFinished, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSearch))
                        .addGap(42, 42, 42)
                        .addComponent(jLabelTitle2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelName1)
                            .addComponent(jTextFieldName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCurEpisode1)
                            .addComponent(jTextFieldCurEpisode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFinished1)
                            .addComponent(jComboBoxFinished1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHomeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAdd))
                            .addGroup(jPanelHomeLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTitle3)
                                    .addComponent(jLabelEpisodeCount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ///
    //FUNCTIONS
    ///
    
    private void jListAnimeListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAnimeListMousePressed
        if(this.jListAnimeList.getSelectedIndex() != -1){
            this.selectedAnime = this.animeList.list.get(this.animeList.searchAnimeIndex(this.jListAnimeList.getSelectedValue()));
            this.jTextFieldName.setText(selectedAnime.name);
            this.jTextFieldCurEpisode.setText(this.selectedAnime.curEpisode+"");
            if(this.selectedAnime.finished){
                this.jComboBoxFinished.setSelectedIndex(0);
            }else{
                this.jComboBoxFinished.setSelectedIndex(1);
            }
        }
    }//GEN-LAST:event_jListAnimeListMousePressed

    private void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeActionPerformed
        if(this.jListAnimeList.getSelectedIndex() != -1){
            try{
                this.selectedAnime.name = this.jTextFieldName.getText();
                this.selectedAnime.curEpisode = Integer.parseInt(this.jTextFieldCurEpisode.getText());
                this.selectedAnime.finished = this.jComboBoxFinished.getSelectedIndex() == 0;
                updateEpisodeCount();
                this.animeList.saveFile();
                this.listStrings[this.jListAnimeList.getSelectedIndex()] = this.selectedAnime.name;
                this.jListAnimeList.repaint();
            }catch(NumberFormatException nfx){
                //do nothing
            }
        }
    }//GEN-LAST:event_jButtonChangeActionPerformed

    private void jButtonAddEpisodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddEpisodeActionPerformed
        if(this.jListAnimeList.getSelectedIndex() != -1){
            try{
                int curEpisode = Integer.parseInt(this.jTextFieldCurEpisode.getText());
                curEpisode++;
                this.jTextFieldCurEpisode.setText(curEpisode+"");
                this.selectedAnime.curEpisode++;
                updateEpisodeCount();
                this.animeList.saveFile();
            }catch(NumberFormatException nfx){
                //do nothing
            }
        }
    }//GEN-LAST:event_jButtonAddEpisodeActionPerformed

    private void jButtonRemoveEpisodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveEpisodeActionPerformed
        if(this.jListAnimeList.getSelectedIndex() != -1){
            try{
                int curEpisode = Integer.parseInt(this.jTextFieldCurEpisode.getText());
                curEpisode--;
                this.jTextFieldCurEpisode.setText(curEpisode+"");
                this.selectedAnime.curEpisode--;
                updateEpisodeCount();
                this.animeList.saveFile();
            }catch(NumberFormatException nfx){
                //do nothing
            }
        }
    }//GEN-LAST:event_jButtonRemoveEpisodeActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try{
            String name = this.jTextFieldName1.getText();
            int curEpisode = Integer.parseInt(this.jTextFieldCurEpisode1.getText());
            boolean finished = this.jComboBoxFinished1.getSelectedIndex() == 0;
            this.animeList.addAnime(name, curEpisode, finished);
            listStrings = new String[this.animeList.list.size()];
            for(int i = 0; i < this.animeList.list.size(); i++){
                listStrings[i] = this.animeList.list.get(i).name;
            }
            this.dispose();
            start(this.animeList);
        }catch(NumberFormatException nfx){
            //do nothing
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        if(this.jListAnimeList.getSelectedIndex() != -1){
            int index = this.animeList.searchAnimeIndex(this.jListAnimeList.getSelectedValue());
            this.animeList.removeAnime(index);
            this.dispose();
            start(this.animeList);
        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jComboBoxFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFilterActionPerformed
        if(this.jComboBoxFilter.getSelectedItem().equals(FILTER_ALL)){
            this.listStrings = new String[this.animeList.list.size()];
            for(int i = 0; i < this.animeList.list.size(); i++){
                listStrings[i] = this.animeList.list.get(i).name;
            }
        }else if(this.jComboBoxFilter.getSelectedItem().equals(FILTER_FINISHED)){
            int count = 0;
            List<String> tempStrings = new ArrayList();
            for(int i = 0; i < this.animeList.list.size(); i++){
                if(this.animeList.list.get(i).finished){
                    count++;
                    tempStrings.add(this.animeList.list.get(i).name);
                }
            }
            this.listStrings = new String[count];
            for(int i = 0; i < count; i++){
                this.listStrings[i] = tempStrings.get(i);
            }
        }else{
            int count = 0;
            List<String> tempStrings = new ArrayList();
            for(int i = 0; i < this.animeList.list.size(); i++){
                if(!this.animeList.list.get(i).finished){
                    count++;
                    tempStrings.add(this.animeList.list.get(i).name);
                }
            }
            this.listStrings = new String[count];
            for(int i = 0; i < count; i++){
                this.listStrings[i] = tempStrings.get(i);
            }
        }
        this.dispose();
        start1(this.animeList, this.listStrings);
    }//GEN-LAST:event_jComboBoxFilterActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        String search = this.jTextFieldSearch.getText().toLowerCase();
        int count = 0;
        List<String> tempStrings = new ArrayList();
        for(int i = 0; i < this.animeList.list.size(); i++){
            if(this.animeList.list.get(i).name.toLowerCase().contains(search)){
                count++;
                tempStrings.add(this.animeList.list.get(i).name);
            }
        }
        this.listStrings = new String[count];
        for(int i = 0; i < count; i++){
            this.listStrings[i] = tempStrings.get(i);
        }
        this.dispose();
        start1(this.animeList, this.listStrings);
    }//GEN-LAST:event_jButtonSearchActionPerformed

    public static void start(AnimeList animeList) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI(animeList).setVisible(true);
            }
        });
    }
    public static void start1(AnimeList animeList, String[] listStrings) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI(animeList, listStrings).setVisible(true);
            }
        });
    }
    
    public void updateEpisodeCount(){
        this.jLabelEpisodeCount.setText(this.animeList.updateEpisodeCount()+"");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAddEpisode;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonRemoveEpisode;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxFilter;
    private javax.swing.JComboBox<String> jComboBoxFinished;
    private javax.swing.JComboBox<String> jComboBoxFinished1;
    private javax.swing.JLabel jLabelCurEpisode;
    private javax.swing.JLabel jLabelCurEpisode1;
    private javax.swing.JLabel jLabelEpisodeCount;
    private javax.swing.JLabel jLabelFilter;
    private javax.swing.JLabel jLabelFinished;
    private javax.swing.JLabel jLabelFinished1;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelName1;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JLabel jLabelTitle2;
    private javax.swing.JLabel jLabelTitle3;
    private javax.swing.JList<String> jListAnimeList;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JScrollPane jScrollPaneAnimeList;
    private javax.swing.JTextField jTextFieldCurEpisode;
    private javax.swing.JTextField jTextFieldCurEpisode1;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldName1;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
