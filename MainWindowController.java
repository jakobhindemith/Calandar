package kalender;


import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
	Die ist die Klasse welche die MainWindow.fxml datei Steuert und der Oberfläche aktionen 
	zuweist

*/



public class MainWindowController {
	
	//Monats Label -> soll den Aktuellen monat der tage in der ansicht zeigen
	@FXML public Label ausgabelabel;
	
	//gesamte Tabelle
//	@FXML public TableView tabelle;
//	
//	//einzelen Spalten für die Tage
//	@FXML public TableColumn spalteMo;
//	@FXML public TableColumn spalteDi;
//	@FXML public TableColumn spalteMi;
//	@FXML public TableColumn spalteDo;
	
	@FXML private TableView<ToDay> tabelle;
	    
	@FXML private TableColumn<ToDay, String> tagColumn;
	    
	
	
	//Liste für Kategorie zuweisungen
	@FXML public ListView<Kategorien> liste;
	
	//Date Picker zum raus suchen einen Tages
	@FXML public DatePicker Ereigniss;
	
	
	
	
	@FXML
	public void handleTableView() {
		
        
        // Create an empty list to hold the days
        ObservableList<ToDay> tage = FXCollections.observableArrayList();
        
        // Loop through the days of the current month
        LocalDate now = LocalDate.now();
        int daysInMonth = now.lengthOfMonth();
        for (int day = 1; day <= daysInMonth; day++) {
            // Create a new day object and add it to the list
            ToDay toDay = new ToDay();
            toDay.setTag(day);
            tage.add(toDay);
        }
        
        // Set the items of the TableView to the list of days
        tabelle.setItems(tage);
        
        // Set the cell value factory for the tag column to display the day number
        tagColumn.setCellValueFactory(cellData -> cellData.getValue().tagProperty().asString());
    }
    
	
	
	
	@FXML 
	//Behandelt die Anzeige des Monatz der Woche in welcher der Benutzer sich befindet
	public void handleLabelMonat() {	
	
	}
	
	
	@FXML
	//Behandelt die Einzelen Tage (TableColumn)
	public void handleTabelTag() {
		
	}
	
	
	//behandelt das hinzufügen und löschensowie umbennenen der EreignissKategorien
	@FXML
	public void handleListView() {
		
	}
	
}

