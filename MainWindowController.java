package kalender;

/**
 * This is the class that controls the MainWindow.fxml 
 * file and assigns actions to the user interface.
 * 
 *  @author jakobhindemith
 */

import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainWindowController {
	
	//Monats Label -> soll den Aktuellen monat der tage in der ansicht zeigen
	@FXML public Label ausgabelabel;
	
/*
	//whole table
	@FXML public TableView tabelle;
	
	//single coluumns for the weekdays
	@FXML public TableColumn spalteMo;
	@FXML public TableColumn spalteDi;
	@FXML public TableColumn spalteMi;
	@FXML public TableColumn spalteDo;
*/
	// is there any better alternativ? 
	// Table for the week view of the Calendar
	@FXML private TableView<ToDay> tabelle;
	    
	@FXML private TableColumn<ToDay, String> tagColumn;
	    
	
	
	//List to assign the categories for the events 
	@FXML public ListView<Kategorien> liste;
	
	//Date Picker to select a date
	@FXML public DatePicker Ereigniss;
	
	
	
	// this function should fill each column with one day of the week in each column there is 
	// planed to be an grid of lines witch mark the hours so you can save youre events in the grid
	// between the lines(hours) 
	// I thought it would be the best to use the TableView 
	@FXML public void handleTableView() {
		
        
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
	//Displays the month of the week in which the user is currently located
	public void handleLabelMonat() {	
	
	}
	
	
	@FXML
	//Handles the individual days (TableColumn)
	public void handleTabelTag() {
		
	}
	
	
	//Handles adding, deleting, and renaming event categories
	@FXML
	public void handleListView() {
		
	}
	
}

