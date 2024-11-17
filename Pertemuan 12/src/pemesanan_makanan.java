import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class pemesanan_makanan {
    private JPanel pemesananPanel;
    private JPanel CustomerPanel;
    private JPanel menuPanel;
    private JPanel penjualanPanel;
    private JTextField tf_nama, tf_alamat, tf_telp;
    private JCheckBox steakCheckBox, sphagettiCheckBox, pizzaCheckBox;
    private JSpinner steakSpinner, sphagettiSpinner, pizzaSpinner;
    private JLabel totalBayar;
    private JButton tambahPesananButton;
    private JTable datapenjualan;

    public pemesanan_makanan() {
        // Frame utama
        JFrame frame = new JFrame("Aplikasi Pemesanan Makanan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 400);

        // Panel utama menggunakan BorderLayout
        pemesananPanel = new JPanel(new BorderLayout(10, 10));
        pemesananPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Margin di semua sisi

        // Menambahkan judul di atas aplikasi
        JLabel title = new JLabel("APLIKASI PEMESANAN", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        pemesananPanel.add(title, BorderLayout.NORTH);

        // Panel untuk Data Customer menggunakan GroupLayout
        CustomerPanel = new JPanel();
        CustomerPanel.setBorder(BorderFactory.createTitledBorder("Data Customer"));
        GroupLayout layout = new GroupLayout(CustomerPanel);
        CustomerPanel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JLabel lblNama = new JLabel("Nama:");
        JLabel lblAlamat = new JLabel("Alamat:");
        JLabel lblTelp = new JLabel("No Telp:");
        tf_nama = new JTextField(20);
        tf_alamat = new JTextField(20);
        tf_telp = new JTextField(20);

        // Validasi input nomor telepon
        tf_telp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });

        // Menyusun komponen dengan GroupLayout
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblNama)
                        .addComponent(lblAlamat)
                        .addComponent(lblTelp))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(tf_nama)
                        .addComponent(tf_alamat)
                        .addComponent(tf_telp))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNama)
                        .addComponent(tf_nama))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAlamat)
                        .addComponent(tf_alamat))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelp)
                        .addComponent(tf_telp))
        );

        // Panel untuk Pilih Menu
        menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(3, 3, 10, 10));
        menuPanel.setBorder(BorderFactory.createTitledBorder("Pilih Menu"));

        steakCheckBox = new JCheckBox("Steak (Rp. 40,000)");
        steakSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        sphagettiCheckBox = new JCheckBox("Sphagetti (Rp. 30,000)");
        sphagettiSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        pizzaCheckBox = new JCheckBox("Pizza (Rp. 80,000)");
        pizzaSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));

        menuPanel.add(steakCheckBox);
        menuPanel.add(steakSpinner);
        menuPanel.add(sphagettiCheckBox);
        menuPanel.add(sphagettiSpinner);
        menuPanel.add(pizzaCheckBox);
        menuPanel.add(pizzaSpinner);

        // Panel untuk Total Bayar dan Tombol
        JPanel bayarPanel = new JPanel();
        bayarPanel.setLayout(new BoxLayout(bayarPanel, BoxLayout.Y_AXIS));
        totalBayar = new JLabel("Total Bayar: Rp. 0");
        totalBayar.setAlignmentX(Component.CENTER_ALIGNMENT);

        tambahPesananButton = new JButton("Tambah Pesanan");
        tambahPesananButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        bayarPanel.add(totalBayar);
        bayarPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        bayarPanel.add(tambahPesananButton);

        // Panel kiri untuk CustomerPanel dan menuPanel
        JPanel kiriPanel = new JPanel();
        kiriPanel.setLayout(new BoxLayout(kiriPanel, BoxLayout.Y_AXIS));
        kiriPanel.add(CustomerPanel);
        kiriPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        kiriPanel.add(menuPanel);
        kiriPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        kiriPanel.add(bayarPanel);

        // Panel untuk Data Penjualan
        penjualanPanel = new JPanel(new BorderLayout());
        penjualanPanel.setBorder(BorderFactory.createTitledBorder("Data Penjualan"));

        String[] columnNames = {"Nama", "Alamat", "No.Telp", "Pesanan", "Total Bayar"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        datapenjualan = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(datapenjualan);
        datapenjualan.setRowHeight(50);
        penjualanPanel.add(scrollPane, BorderLayout.CENTER);

        // Menambahkan panel ke pemesananPanel
        pemesananPanel.add(kiriPanel, BorderLayout.WEST);
        pemesananPanel.add(penjualanPanel, BorderLayout.CENTER);

        // Menambahkan pemesananPanel ke Frame
        frame.add(pemesananPanel);
        frame.setVisible(true);

        // Action listener untuk tombol Tambah Pesanan
        tambahPesananButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tf_nama.getText();
                String alamat = tf_alamat.getText();
                String telp = tf_telp.getText();

                if (nama.isEmpty() || alamat.isEmpty() || telp.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                StringBuilder orderDetails = new StringBuilder();
                int totalPrice = 0;

                if (steakCheckBox.isSelected()) {
                    int qty = (Integer) steakSpinner.getValue();
                    orderDetails.append("Steak x").append(qty).append("\n");
                    totalPrice += 40000 * qty;
                }
                if (sphagettiCheckBox.isSelected()) {
                    int qty = (Integer) sphagettiSpinner.getValue();
                    orderDetails.append("Sphagetti x").append(qty).append("\n");
                    totalPrice += 30000 * qty;
                }
                if (pizzaCheckBox.isSelected()) {
                    int qty = (Integer) pizzaSpinner.getValue();
                    orderDetails.append("Pizza x").append(qty).append("\n");
                    totalPrice += 80000 * qty;
                }

                totalBayar.setText("Total Bayar: Rp. " + totalPrice);

                model.addRow(new Object[]{nama, alamat, telp, orderDetails.toString(), "Rp. " + totalPrice});

                tf_nama.setText("");
                tf_alamat.setText("");
                tf_telp.setText("");
                steakCheckBox.setSelected(false);
                sphagettiCheckBox.setSelected(false);
                pizzaCheckBox.setSelected(false);
                steakSpinner.setValue(1);
                sphagettiSpinner.setValue(1);
                pizzaSpinner.setValue(1);
            }
        });
    }

    public static void main(String[] args) {
        new pemesanan_makanan();
    }
}
