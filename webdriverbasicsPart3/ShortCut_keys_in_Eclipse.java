package webdriverbasicsPart3;

public class ShortCut_keys_in_Eclipse {

//	1. Ctrl + Shift + R : To find all resource files, including the config XML files         from the workspace
//	2. Ctrl + Shift + T : To find class in an application or from inside a jar
//	3. Ctrl + W : To close the current file
//	4. Ctrl + Shirt + W : To close all the open files
//	5. Ctrl + Shift + O : To organise the missing imports
//	6. Ctrl + Shift + F : For auto-formatting
//	7. Ctrl + / : To add/remove single line comment for selected line
//	8. Ctrl + Shift + Enter : To add blank line before the current line
//	9. Alt + Shift + S, R : To generate Setters & Getters
//	10. Alt + Shift + S, S : To generate toString() method 
//	11. Alt + Shift + S, o : To add constructor with fields
//	12. Ctrl + 1 + Enter : To store method return value to variable 
//	13. Ctrl + D : To delete current line 
//	14. Ctrl + O : Display all methods of current class, Pressing Ctrl + O again will display all the inherited methods
//	15. Ctrl + Shift + P : Go to matching bracket
//	16. Alt + Shift + R : To rename
//	17. Alt + Shift + T : To open the context-sensitive refactoring menu
//	18. Alt + Shift + Z : To surround a block with try and catch
//	19. Ctrl + Shift + / : To comment and uncomment lines with a block comment
//	20. Ctrl + Q : To go to the last edited position
//
//	Ashok IT
	
	
//	When using an IDE, you cannot be more productive without using its shortcut keys frequently as your habit. In this article, we summarize a list of shortcut keys which are useful for editing Java code in Eclipse IDE.
//	NOTE: Standard shortcuts are not covered, such as Ctrl + A (select all), Ctrl + Z (undo), etc.
//	Ctrl + D: Deletes current line.
//	Ctrl + Delete: Deletes next word after the cursor.
//	Ctrl + Shift + Delete: Deletes from the cursor until end of line.
//	Ctrl + Backspace: Deletes previous word before the cursor.
//	Shift + Ctrl + y: Changes a selection to lowercase.
//	Shift + Ctrl + x: Changes a selection to uppercase.
//	Alt + Up Arrow: Moves up current line (or a selected code block) by one line:Move up a line
//	Alt + Down Arrow: Moves down current line (or a selected code block) by one line:Move down a line
//	Ctrl + Alt + Up Arrow: Copies and moves up current line (or a selected code block) by one line:Copy and move up a line
//	Ctrl + Alt + Down Arrow: Copies and moves down current line (or a selected code block) by one line:Copy and move down a line
//	Shift + Enter: Inserts a blank line after current line, regardless where the cursor is at the current line (very different from press Enter key alone):insert a blank line
//	Ctrl + Shift + Enter: works similar to the Shift + Enter, but inserts a blank line just before the current line.
//	Ctrl + Shift + O: Organizes import statements by removing unused imports and sorts the used ones alphabetically. This shortcut also adds missing imports.organize imports
//	Ctrl + Shift + M: Adds a single import statement for the current error due to missing import. You need to place the cursor inside the error and press this shortcut:add single import
//	Ctrl + Shift + F: Formats a selected block of code or a whole source file. This shortcut is very useful when you want to format messy code to Java-standard code. Note that, if nothing is selected in the editor, Eclipse applies formatting for the whole file:



//	format code
//	Ctrl + I: Corrects indentation for current line or a selected code block. This is useful as it helps you avoid manually using Tab key to correct the indentation:correct indentation
//	Ctrl + /or Ctrl + 7: Toggle single line comment. This shortcut adds single-line comment to current line or a block of code. Press again to remove comment. For example:single line comment code
//	Ctrl + Shift + /: Adds block comment to a selection.add block comment
//	Ctrl + Shift + \: Removes block comment.  
//	 
//	Alt + Shift + S: Shows context menu that lists possible actions for editing code:context menu for code
//	From this context menu, you can press another letter (according to the underscore letters in the names) to access the desired functions.
//	 
//	Alt + Shift + S, R: Generates getters and setters for fields of a class. This is a very handy shortcut that helps us generate getter and setter methods quickly. The following dialog appears:Generate getters and setters
//	Alt + Shift + S, O: Generates constructor using fields. This shortcut is very useful when you want to generate code for a constructor that takes class’ fields as its parameters. The following dialog appears:generare constructor using fields
//	Alt + Shift + S, C: Generates Constructors from Superclass. A common example for using this shortcut is when creating a custom exception class. In this case, we need to write some constructors similar to the Exception superclass. This shortcut brings the Generate Constructors from Superclass dialog which allows us to choose the constructors to be implemented in the subclass:generate constructors from superclass
//	Alt + Shift + S, H: Generates hashCode() and equals() methods, typically for a JavaBean/POJO class. The class must have non-static fields. This shortcut brings the Generate hashCode() and equals() dialog as below:generate hashCode and equals
//	Select the fields to be used in hashCode() and equals() method, and then click OK. We got the following result (example):
//
//	 
//	Alt + Shift + S, S: Generates toString() method. This shortcut comes in handy if we want to override toString() method that returns information of relevant fields of the class. This brings the Generate toString() dialogas below:Generate toString method
//	And here’s sample of a generated toString() method:
//	
//	@Override
//	public String toString() {
//	    return "User [id=" + id + ", username=" + username + ", password="
//	            + password + "]";
//	}
	
	
	
//	Navigation Shortcuts:
//		Ctrl + Shift + T: Open Type - Quickly navigate to a specific class.
//		Ctrl + F6: Switch between open editors.
//		Ctrl + E: Show a list of open editors for quick navigation.
//		Ctrl + Shift + L: Show a list of all available shortcuts.
//		Ctrl + O: Open Quick Outline - Quickly navigate and filter methods within the current class.
//		Code Editing Shortcuts:
//		Ctrl + Space: Content Assist - Auto-complete suggestions for code.
//		Ctrl + 1: Quick Fix - Shows quick fixes for common issues.
//		Ctrl + /: Toggle Comment - Comment or uncomment selected lines.
//		Ctrl + D: Delete Line - Deletes the current line.
//		Ctrl + Shift + F: Format Code - Automatically formats the selected code.
//		Debugging Shortcuts:
//		F5: Step Into - Step into the method being called.
//		F6: Step Over - Execute the current line and stop at the next line in the current method.
//		F7: Step Return - Execute until the current method returns.
//		F8: Resume - Continue execution until the next breakpoint.
//		Search and Refactoring Shortcuts:
//		Ctrl + Shift + R: Open Resource - Search and open a file in the workspace.
//		Ctrl + Shift + G: Search for references in the workspace.
//		Ctrl + Shift + L: Show Key Assist - Display a list of active keyboard shortcuts.
//		Alt + Shift + R: Rename - Quickly rename a variable, method, or class.
//		Other Useful Shortcuts:
//		Ctrl + S: Save.
//		Ctrl + F: Find.
//		Ctrl + H: Open Search Dialog.
//		Ctrl + Shift + O: Organize Imports - Automatically manage and import Java packages.
//		Ctrl + Shift + S: Save All.
	 
	
	
}
