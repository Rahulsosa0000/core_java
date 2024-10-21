package studentProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class StudentManager extends JFrame {
	private static final long serialVersionUID = 1L;
	private HashMap<Integer, Student> studentMap = new HashMap<>();
	private DefaultListModel<Object> model = new DefaultListModel<>();

	private JTextField idField;
	private JTextField nameField;
	private JTextField addressField;
	private JList<Object> list;
	private JComboBox<String> comboBox;

	public StudentManager() {
		Home();  // call home after layout crate
	}

	private void Home() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		setTitle("Student Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // This is all set layout ,GUI size ,color
		setBounds(100, 100, 954, 721);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(192, 192, 192));

		addLabel("Student ID:", 210, 46);  // Name show Student Id
		addLabel("Student Name:", 210, 121);
		addLabel("Student Address:", 210, 197);

		idField = addTextField(420, 51);
		nameField = addTextField(420, 125); // TextField All
		addressField = addTextField(420, 197);

		list = new JList<>(model);
		list.setBounds(10, 390, 924, 283);   // JList Bar This is Show All Student Details like added,sorted,filter etc....
		getContentPane().add(list);

		addButton("Add Student", 226, 290, this::addStudent); // add btn
		addButton("Sort Students", 431, 290, this::sortStudents);// sort btn
		addButton("Filter", 636, 290, this::filterStudent);// Filter btn

		comboBox = new JComboBox<>(new String[] { "sId", "sName", "sAddress" });  // Sorting and FIlter menu
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setBounds(16, 290, 163, 35);
		getContentPane().add(comboBox);

		setVisible(true);  // this is show GUI
	}

	private void addLabel(String text, int x, int y) {
		JLabel label = new JLabel(text);
		label.setBounds(x, y, 200, 35);
		label.setHorizontalAlignment(SwingConstants.CENTER);  // Label Set all like color,bg color.
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		getContentPane().add(label);
	}

	private JTextField addTextField(int x, int y) {
		JTextField textField = new JTextField();
		textField.setBounds(x, y, 300, 35);     // set textfield 
		getContentPane().add(textField);
		return textField;
	}

	private void addButton(String text, int x, int y, java.awt.event.ActionListener actionListener) {
		JButton button = new JButton(text); // create btn
		button.setBounds(x, y, 158, 35);
		button.setFont(new Font("Tahoma", Font.BOLD, 16));     //set all btn size,front,etc...
		button.addActionListener(actionListener);
		getContentPane().add(button);
	}

	private void addStudent(ActionEvent e) {   // when add button click this method is invoke
		try {
			int id = Integer.parseInt(idField.getText().trim());  // convert String into Integer this make id is unique
			String name = nameField.getText().trim();
			String address = addressField.getText().trim();
			if (name.isEmpty() || address.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Name and address cannot be empty.");// JoptionPane Show Msg Dialog
				return;
			}
			if (!studentMap.containsKey(id)) { // if id not contain so it create new student and add data
				Student student = new Student(id, name, address);
				studentMap.put(id, student);
				model.addElement("Student Added: " +"Name: "+ student.getsName() + ", ID: " + student.getsId()+", Address: "+student.getsAddress());
				model.addElement(student); // Add to display model
				JOptionPane.showMessageDialog(null, "Student added successfully.");
				idField.setText("");
				nameField.setText("");
				addressField.setText("");
			} else {
				JOptionPane.showMessageDialog(null, "ID already exists. Please use a unique ID."); // if id contain same this show(STUDENTMAP) 
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Please enter a valid number for ID.");// not provide number this will show 
		}
	}

	private void sortStudents(ActionEvent e) {
		String selectedField = (String) comboBox.getSelectedItem();  // Convert Object into String 
		List<Entry<Integer, Student>> studentList = new ArrayList<>(studentMap.entrySet());

		// Remove the existing sorting message, if any
		removeSortingMessage();

		// Add a new sorting message based on the selected field
		switch (selectedField) {
		case "sId":
			studentList.sort(Comparator.comparingInt(entry -> entry.getValue().getsId()));
			model.addElement("Sorted by ID:");
			break;
		case "sName":
			studentList.sort(Comparator.comparing(entry -> entry.getValue().getsName()));
			model.addElement("Sorted by Name:");
			break;
		case "sAddress":
			studentList.sort(Comparator.comparing(entry -> entry.getValue().getsAddress()));
			model.addElement("Sorted by Address:");
			break;
		}

		// Add the sorted students after the sorting message
		updateListModelWithEntries(studentList);
	}

	private void removeSortingMessage() {
		// Look for any existing sorting message and remove it
		for (int i = 0; i < model.getSize(); i++) {  // contain jlist 
			Object element = model.getElementAt(i); // sorted by id, sorted by name , sorted by address
			if (element instanceof String && ((String) element).startsWith("Sorted by")) {
				model.removeElementAt(i);
				break; // Only one sorting message exists, so break after removing
			}
		}
	}

	private void updateListModelWithEntries(List<Map.Entry<Integer, Student>> entries) {
		// Remove only the students from the list, keeping messages intact
		for (int i = model.getSize() - 1; i >= 0; i--) {
			Object element = model.getElementAt(i);
			if (element instanceof Student) {
				model.removeElementAt(i); // Remove only Student objects, not messages
			}
		}

		// Add the sorted students after the sorting message
		for (Entry<Integer, Student> entry : entries) {
			model.addElement(entry.getValue());
		}
	}

	private void filterStudent(ActionEvent e) {
	    // Get the selected filter criteria (ID, Name, or Address)
	    String filterField = (String) comboBox.getSelectedItem();

	    // Ask the user to enter a filter value (e.g., "101" for ID, "John" for Name)
	    String filterValue = JOptionPane.showInputDialog(this, "Enter value to filter by " + filterField);

	    if (filterValue == null || filterValue.trim().isEmpty()) {
	        // If no filter value is provided, show a message
	        JOptionPane.showMessageDialog(this, "Please provide a value to filter.");
	        return;
	    }

	    // Create a new model to store the filtered students
	    DefaultListModel<Object> filteredModel = new DefaultListModel<>();

	    // Iterate through the current student map and filter based on the selected field
	    for (Student student : studentMap.values()) {
	        boolean matchesFilter = false;

	        switch (filterField) {
	        case "sId":
	            if (String.valueOf(student.getsId()).equals(filterValue)) {
	                matchesFilter = true;
	            }
	            break;

	        case "sName":
	            if (student.getsName().toLowerCase().contains(filterValue.toLowerCase())) {
	                matchesFilter = true;
	            }
	            break;
	        case "sAddress":
	            if (student.getsAddress().toLowerCase().contains(filterValue.toLowerCase())) {
	                matchesFilter = true;
	            }
	            break;
	        }

	        // If the student matches the filter, add it to the filtered model
	        if (matchesFilter) {
	            filteredModel.addElement(student);
	        }
	    }

	    // Update the list with the filtered students
	    if (filteredModel.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "No students found for the provided filter.");
	    } else {
	        model.clear(); // Clear the existing model, but we will add the "Added Student" messages back

	        // Always show the added student messages
	        for (Student student : studentMap.values()) {
	            model.addElement("Student Added: " +"Name: "+ student.getsName() + ", ID: " + student.getsId()+", Address: "+student.getsAddress());
	        }

	        // Add the filtered students to the model after the added student messages
	        model.addElement("Filtered by " + filterField + ": " + filterValue);
	        for (int i = 0; i < filteredModel.size(); i++) {
	            model.addElement(filteredModel.getElementAt(i));
	        }
	    }
	}

	

	public static void main(String[] args) {
	EventQueue.invokeLater(StudentManager::new);  // EventQueue is used to manage events (like button clicks, UI updates, etc.
				//invokeLater:-Swing applications should always create and update UI
				/*
				 * //This line of code is crucial for creating and //displaying the GUI of your
				 * Student Management System properly and safely in a Swing application.
				 */	
		}
}
