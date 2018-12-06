import java.awt.*;
import javax.swing.*;
/**
 * @author Alexi Musick
 * @author Matthew Klopfer
 * 
 * @version 12-6-2018
 * Project 4
 * 
 * tabel panel class creates a table within the frame.
 */ class TabelPanel extends JPanel {

    /** Create the table column values **/
    private static String[] columNames = { "Station", "Parameter", "Statistics", "Value", "Reporting Stations",
            "Data" };

    private static final long serialVersionUID = 1L;

    /** JTable to hold the values the user wishes to display **/
    private JTable table = new JTable(100, 6);

    /** Creates a scroll pane in the tabel **/
    private JScrollPane scroll = new JScrollPane(table);

    /** Number of rows in the table **/
    private int rows = 0;

    /** constructor for the TabelPanel class **/
    public TabelPanel() {

        setLayout(new BorderLayout());

        /** Sets font and color of the frame **/
        table.setFont(MesonetFrame.timesRoman);
        table.setBackground(Color.WHITE);
        table.setShowGrid(false);

        add(scroll); // Adds in the scrollPane

        // Set the headers in the table
        for (int i = 0; i < columNames.length; ++i) {
            table.getColumnModel().getColumn(i).setHeaderValue(columNames[i]);
        }

    }

    /**
     * This method will set the new row value with the ones the user wishes to
     * display
     * 
     * @param stid
     * @param stat
     * @param param
     * @param value
     * @param stations
     * @param utcDateTimeString
     */
    public void newDataRow(String stid, String stat, String param, double value, int stations,
            String utcDateTimeString) {

        table.setValueAt(stid, rows, 0);
        table.setValueAt(stat, rows, 1);
        table.setValueAt(param, rows, 2);
        table.setValueAt(value, rows, 3);
        table.setValueAt(stations, rows, 4);
        table.setValueAt(utcDateTimeString, rows, 5);
        ++rows; // Increment the number of rows
        
        //table.getColumnModel().getColumn(i).sizeWidthToFit();
    }

    /**
     * Clears the table when the calculate button is hit again by the user
     * 
     */
    public void clearTable() {

        for (int i = 0; i < 100; ++i) {
            for (int j = 0; j < columNames.length; ++j) {
                table.setValueAt("", i, j);
            }
            
            this.rows = 0;

        }
    }

}