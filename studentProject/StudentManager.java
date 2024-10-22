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
		list.setBounds(10, 390, 1200, 283);   // JList Bar This is Show All Student Details like added,sorted,filter etc....
		getContentPane().add(list);

		addButton("Add Student", 200, 290, this::addStudent);   // Positioned after comboBox
		addButton("Sort Students", 400, 290, this::sortStudents); // Positioned after Add Student
		addButton("Filter", 600, 290, this::filterStudent);     // Positioned after Sort Students
		addButton("Delete", 800, 290, this::DeleteStudent);     // Positioned after Filter
		addButton("Update", 1000, 290, this::updateStudent);  // Positioned after Delete

		comboBox = new JComboBox<>(new String[] { "sId", "sName", "sAddress" });  // Sorting and FIlter menu
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setBounds(16, 290, 163, 36);
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
	    JButton button = new JButton(text); // Create the button
	    button.setBounds(x, y, 150, 35); // Set the position and a standard size (150x35)
	    button.setFont(new Font("Tahoma", Font.BOLD, 16)); // Set font properties
	    button.addActionListener(actionListener); // Add action listener
	    getContentPane().add(button); // Add button to the GUI
	}


	private void addStudent(ActionEvent e) {
	    try {
	        int id = Integer.parseInt(idField.getText().trim());  // Convert String into Integer; this makes id unique
	        String name = nameField.getText().trim();
	        String address = addressField.getText().trim();
	        
	        if (name.isEmpty() || address.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Name and address cannot be empty."); // Show message if fields are empty
	            return;
	        }

	        if (!studentMap.containsKey(id)) { // Check if ID is unique
	            Student student = new Student(id, name, address);
	            studentMap.put(id, student);
	            model.addElement("Student Added List: Name: " + student.getsName() + ", ID: " + student.getsId() + ", Address: " + student.getsAddress());
	            JOptionPane.showMessageDialog(null, "Student added successfully.");
	            idField.setText(""); // Clear fields after adding
	            nameField.setText("");
	            addressField.setText("");
	        } else {
	            JOptionPane.showMessageDialog(null, "ID already exists. Please use a unique ID."); // Notify if ID is not unique
	        }
	    } catch (NumberFormatException ex) {
	        JOptionPane.showMessageDialog(null, "Please enter a valid number for ID."); // Handle non-numeric ID input
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
           // int filterId = Integer.parseInt(filterValue.trim()); // filter greter then number

	        switch (filterField) {
	        case "sId":
	            if (String.valueOf(student.getsId()).equals(filterValue)) {
	                matchesFilter = true;
	            }
	            
				/*
				 * if (student.getsId() > filterId) { // If student ID is greater than the input
				 * value filteredModel.addElement(student); // Add student to filtered list }
				 */
	            break;

	        case "sName":
//	            if (student.getsName().toLowerCase().contains(filterValue.toLowerCase())) {
//	                matchesFilter = true;
//	            }
	        	if (student.getsName().equals(filterValue)) {
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
	            model.addElement("Student Added List: " +"Name: "+ student.getsName() + ", ID: " + student.getsId()+", Address: "+student.getsAddress());
	        }

	        // Add the filtered students to the model after the added student messages
	        model.addElement("Filtered by " + filterField + ": " + filterValue);
	        for (int i = 0; i < filteredModel.size(); i++) {
	            model.addElement(filteredModel.getElementAt(i));
	        }
	    }
	}
	
	private void DeleteStudent(ActionEvent e) {
	    String selectedField = (String) comboBox.getSelectedItem();  // Get the selected field from the comboBox

	    String input = JOptionPane.showInputDialog(this, "Enter " + selectedField + " of the student to delete:");

	    if (input == null || input.trim().isEmpty()) {
	        JOptionPane.showMessageDialog(this, "The input cannot be empty.");
	        return;
	    }

	    if ("sId".equals(selectedField)) {
	        try {
	            int idToDelete = Integer.parseInt(input.trim());
	            if (studentMap.containsKey(idToDelete)) {
	                studentMap.remove(idToDelete);
	                JOptionPane.showMessageDialog(this, "Student with ID " + idToDelete + " deleted successfully.");
	                updateStudentList();  // Refresh list after deletion
	            } else {
	                JOptionPane.showMessageDialog(this, "Student with ID " + idToDelete + " not found.");
	            }
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "Please enter a valid number for the ID.");
	        }
	        
	    }
	    else if ("sName".equals(selectedField)) {
	        boolean isDeleted = false;
	        List<Integer> keysToRemove = new ArrayList<>();
	        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
	            if (entry.getValue().getsName().equalsIgnoreCase(input.trim())) {
	                keysToRemove.add(entry.getKey());
	                isDeleted = true;
	            }
	        }
	        keysToRemove.forEach(studentMap::remove);
	        if (isDeleted) {
	            JOptionPane.showMessageDialog(this, "Student(s) with name '" + input.trim() + "' deleted successfully.");
	            updateStudentList();  // Refresh list after deletion
	        } else {
	            JOptionPane.showMessageDialog(this, "No student found with the name '" + input.trim() + "'.");
	        }
	    }
	}
	
	private void updateStudentList() {
	    model.clear(); // Clear the existing list
	    for (Student student : studentMap.values()) {
	        model.addElement("Student List: Name: " + student.getsName() + ", ID: " + student.getsId() + ", Address: " + student.getsAddress());
	    }
	}
	  
//	private void DeleteStudent(ActionEvent e) {
//	    String input = JOptionPane.showInputDialog(this, "Enter Student ID to delete:");
//
//	    try {
//	        int idToDelete = Integer.parseInt(input);
//	        if (studentMap.containsKey(idToDelete)) {
//	            studentMap.remove(idToDelete);
//	            JOptionPane.showMessageDialog(this, "Student with ID " + idToDelete + " deleted successfully.");
//	            updateStudentList(); // Refresh list after deletion
//	        } else {
//	            JOptionPane.showMessageDialog(this, "Student with ID " + idToDelete + " not found.");
//	        }
//	    } catch (NumberFormatException ex) {
//	        JOptionPane.showMessageDialog(this, "Please enter a valid number for the ID.");
//	    }
//	}
//
	
//	------------------------------------------------------
//	private void DeleteStudent(ActionEvent e) {
//	    // Prompt for the name of the student to delete
//	    String nameToDelete = JOptionPane.showInputDialog(this, "Enter the name of the student to delete:");
//	    
//	    // Check if the input is empty or null
//	    if (nameToDelete == null || nameToDelete.trim().isEmpty()) {
//	        JOptionPane.showMessageDialog(this, "The name cannot be empty.");
//	        return;
//	    }
//
//	    // Iterate over the studentMap to find and remove the student by name
//	    boolean isDeleted = false;
//	    for (Map.Entry<Integer, Student> entry : new ArrayList<>(studentMap.entrySet())) {
//	        Student student = entry.getValue();
//	        if (student.getsName().equalsIgnoreCase(nameToDelete.trim())) {
//	            studentMap.remove(entry.getKey());
//	            isDeleted = true;
//	            break; // Stop after the first match is found and deleted
//	        }
//	    }
//
//	    // Display the appropriate message based on whether a student was deleted
//	    if (isDeleted) {
//	        JOptionPane.showMessageDialog(this, "Student deleted successfully.");
//	        updateStudentList(); // Update the list to reflect the changes
//	    } else {
//	        JOptionPane.showMessageDialog(this, "No student found with the name '" + nameToDelete + "'.");
//	    }
//	}

	private void updateStudent(ActionEvent e) {
	    String selectedField = (String) comboBox.getSelectedItem();  // Get the selected field from the comboBox
	    String input = JOptionPane.showInputDialog(this, "Enter the existing " + selectedField + " of the student to update:");

	    if (input == null || input.trim().isEmpty()) {
	        JOptionPane.showMessageDialog(this, "The input cannot be empty.");
	        return;
	    }

	    if ("sId".equals(selectedField)) {
	        try {
	            int idToUpdate = Integer.parseInt(input.trim());
	            if (studentMap.containsKey(idToUpdate)) {
	                Student student = studentMap.get(idToUpdate);
	                String newName = JOptionPane.showInputDialog(this, "Enter new name:", student.getsName());
	                String newAddress = JOptionPane.showInputDialog(this, "Enter new address:", student.getsAddress());
	                if (newName != null && !newName.trim().isEmpty() && newAddress != null && !newAddress.trim().isEmpty()) {
	                    student.setsName(newName.trim());
	                    student.setsAddress(newAddress.trim());
	                    JOptionPane.showMessageDialog(this, "Student details updated successfully.");
	                    updateStudentList();  // Refresh list after update
	                } else {
	                    JOptionPane.showMessageDialog(this, "Name and address cannot be empty.");
	                }
	            } else {
	                JOptionPane.showMessageDialog(this, "Student with ID " + idToUpdate + " not found.");
	            }
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "Please enter a valid number for the ID.");
	        }
	    } else if ("sName".equals(selectedField)) {
	        boolean isUpdated = false;
	        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
	            if (entry.getValue().getsName().equalsIgnoreCase(input.trim())) {
	                String newID = JOptionPane.showInputDialog(this, "Enter new ID for the student:", entry.getKey());
	                String newAddress = JOptionPane.showInputDialog(this, "Enter new address for the student:", entry.getValue().getsAddress());
	                try {
	                    int newIDInt = Integer.parseInt(newID.trim());
	                    if (!studentMap.containsKey(newIDInt) || newIDInt == entry.getKey()) {
	                        entry.getValue().setsId(newIDInt);
	                        entry.getValue().setsAddress(newAddress.trim());
	                        isUpdated = true;
	                    } else {
	                        JOptionPane.showMessageDialog(this, "New ID already exists. Please use a unique ID.");
	                        break;
	                    }
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(this, "Please enter a valid number for the new ID.");
	                    break;
	                }
	            }
	        }
	        if (isUpdated) {
	            JOptionPane.showMessageDialog(this, "Student details updated successfully.");
	            updateStudentList();  // Refresh list after update
	        } else {
	            JOptionPane.showMessageDialog(this, "No student found with the name '" + input.trim() + "'.");
	        }
	    }
	    else if ("sAddress".equals(selectedField)) {
	        boolean isUpdated = false;
	        List<Integer> keysToUpdate = new ArrayList<>();
	        // Collect all students with the given address to update them
	        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
	            if (entry.getValue().getsAddress().equalsIgnoreCase(input.trim())) {
	                keysToUpdate.add(entry.getKey());
	            }
	        }

	        for (Integer key : keysToUpdate) {
	            Student student = studentMap.get(key);
	            String newName = JOptionPane.showInputDialog(this, "Enter new name for the student:", student.getsName());
	            String newID = JOptionPane.showInputDialog(this, "Enter new ID for the student:", key);
	            try {
	                int newIDInt = Integer.parseInt(newID.trim());
	                if (!studentMap.containsKey(newIDInt) || newIDInt == key) {
	                    student.setsId(newIDInt);
	                    student.setsName(newName.trim());
	                    isUpdated = true;
	                } else {
	                    JOptionPane.showMessageDialog(this, "New ID already exists. Please use a unique ID.");
	                    continue;  // Skip updating this student and move to the next
	                }
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(this, "Please enter a valid number for the new ID.");
	                continue;  // Skip updating this student and move to the next
	            }
	        }

	        if (isUpdated) {
	            JOptionPane.showMessageDialog(this, "Student details updated successfully.");
	            updateStudentList();  // Refresh list after update
	        } else {
	            JOptionPane.showMessageDialog(this, "No student found with the address '" + input.trim() + "'.");
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
