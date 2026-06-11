import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class minijavaprojectwordpad extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JComboBox<String> fontSizeBox;
    private JButton colorButton, wordCountButton, findButton, dateTimeButton;
    private JLabel statusLabel;

    private JMenuItem newItem, openItem, saveItem, exitItem;
    private JMenuItem cutItem, copyItem, pasteItem;

    public minijavaprojectwordpad() {
        setTitle("Mini Java Project WordPad");
        setSize(850, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 18));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setJMenuBar(menuBar);

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 8));

        JLabel fontLabel = new JLabel("Font Size:");
        String[] sizes = {"12", "14", "16", "18", "20", "24", "28", "32"};
        fontSizeBox = new JComboBox<>(sizes);
        fontSizeBox.setSelectedItem("18");
        fontSizeBox.addActionListener(this);

        colorButton = new JButton("Text Color");
        wordCountButton = new JButton("Word Count");
        findButton = new JButton("Find Word");
        dateTimeButton = new JButton("Insert Date/Time");

        colorButton.addActionListener(this);
        wordCountButton.addActionListener(this);
        findButton.addActionListener(this);
        dateTimeButton.addActionListener(this);

        topPanel.add(fontLabel);
        topPanel.add(fontSizeBox);
        topPanel.add(colorButton);
        topPanel.add(wordCountButton);
        topPanel.add(findButton);
        topPanel.add(dateTimeButton);

        statusLabel = new JLabel("Ready");
        statusLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == newItem) {
            textArea.setText("");
            statusLabel.setText("New file created");
        } 
        else if (source == openItem) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(this);

            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    textArea.read(br, null);
                    statusLabel.setText("Opened: " + file.getName());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error opening file");
                }
            }
        } 
        else if (source == saveItem) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(this);

            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                    textArea.write(bw);
                    statusLabel.setText("Saved: " + file.getName());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error saving file");
                }
            }
        } 
        else if (source == exitItem) {
            System.exit(0);
        } 
        else if (source == cutItem) {
            textArea.cut();
            statusLabel.setText("Text cut");
        } 
        else if (source == copyItem) {
            textArea.copy();
            statusLabel.setText("Text copied");
        } 
        else if (source == pasteItem) {
            textArea.paste();
            statusLabel.setText("Text pasted");
        } 
        else if (source == fontSizeBox) {
            int size = Integer.parseInt((String) fontSizeBox.getSelectedItem());
            textArea.setFont(new Font("Arial", Font.PLAIN, size));
            statusLabel.setText("Font size changed to " + size);
        } 
        else if (source == colorButton) {
            Color color = JColorChooser.showDialog(this, "Choose Text Color", textArea.getForeground());
            if (color != null) {
                textArea.setForeground(color);
                statusLabel.setText("Text color changed");
            }
        } 
        else if (source == wordCountButton) {
            String text = textArea.getText().trim();
            int count = text.isEmpty() ? 0 : text.split("\\s+").length;
            JOptionPane.showMessageDialog(this, "Word Count: " + count);
            statusLabel.setText("Word count checked");
        } 
        else if (source == findButton) {
            String word = JOptionPane.showInputDialog(this, "Enter word to find:");
            if (word != null && !word.trim().isEmpty()) {
                String text = textArea.getText().toLowerCase();
                String searchWord = word.toLowerCase();
                int index = text.indexOf(searchWord);

                if (index >= 0) {
                    textArea.requestFocus();
                    textArea.select(index, index + word.length());
                    statusLabel.setText("Word found");
                } else {
                    JOptionPane.showMessageDialog(this, "Word not found");
                    statusLabel.setText("Word not found");
                }
            }
        } 
        else if (source == dateTimeButton) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String currentDateTime = LocalDateTime.now().format(formatter);
            textArea.insert(currentDateTime, textArea.getCaretPosition());
            statusLabel.setText("Date and time inserted");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new minijavaprojectwordpad());
    }
}