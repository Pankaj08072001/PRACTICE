// public class Calculator extends Frame implements ActionListener {

//     // Declare components
//     TextField textField;
//     Button[] numberButtons = new Button[10];
//     Button addButton, subButton, mulButton, divButton, equalsButton, clearButton, decButton;
//     String input = "";
//     double num1, num2, result;
//     char operator;

//     // Constructor to set up the GUI
//     public Calculator() {
//         // Frame setup
//         setTitle("Simple Calculator");
//         setSize(400, 500);
//         setLayout(null);

//         // Create text field for display
//         textField = new TextField();
//         textField.setBounds(30, 40, 340, 50);
//         add(textField);

//         // Create number buttons (0-9)
//         int x = 30, y = 100;
//         for (int i = 0; i < 10; i++) {
//             numberButtons[i] = new Button(String.valueOf(i));
//             numberButtons[i].setBounds(x, y, 50, 50);
//             numberButtons[i].addActionListener(this);
//             add(numberButtons[i]);

//             x += 60; // Move horizontally
//             if ((i + 1) % 3 == 0) {
//                 x = 30; // Reset to first column
//                 y += 60; // Move vertically down
//             }
//         }

//         // Create operator buttons (+, -, *, /)
//         addButton = new Button("+");
//         addButton.setBounds(270, 100, 50, 50);
//         addButton.addActionListener(this);
//         add(addButton);

//         subButton = new Button("-");
//         subButton.setBounds(270, 160, 50, 50);
//         subButton.addActionListener(this);
//         add(subButton);

//         mulButton = new Button("*");
//         mulButton.setBounds(270, 220, 50, 50);
//         mulButton.addActionListener(this);
//         add(mulButton);

//         divButton = new Button("/");
//         divButton.setBounds(270, 280, 50, 50);
//         divButton.addActionListener(this);
//         add(divButton);

//         // Equals button
//         equalsButton = new Button("=");
//         equalsButton.setBounds(210, 340, 50, 50);
//         equalsButton.addActionListener(this);
//         add(equalsButton);

//         // Clear button
//         clearButton = new Button("C");
//         clearButton.setBounds(30, 340, 50, 50);
//         clearButton.addActionListener(this);
//         add(clearButton);

//         // Decimal button
//         decButton = new Button(".");
//         decButton.setBounds(90, 340, 50, 50);
//         decButton.addActionListener(this);
//         add(decButton);

//         // Set window to be visible
//         setVisible(true);

//         // Close operation
//         addWindowListener(new WindowAdapter() {
//             public void windowClosing(WindowEvent we) {
//                 System.exit(0);
//             }
//         });
//     }

//     // Action handling for button clicks
//     public void actionPerformed(ActionEvent e) {
//         String command = e.getActionCommand();

//         if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
//             input += command;
//             textField.setText(input);
//         } else if (command.equals("C")) {
//             input = "";
//             textField.setText(input);
//         } else if (command.equals("=")) {
//             num2 = Double.parseDouble(input);
//             switch (operator) {
//                 case '+':
//                     result = num1 + num2;
//                     break;
//                 case '-':
//                     result = num1 - num2;
//                     break;
//                 case '*':
//                     result = num1 * num2;
//                     break;
//                 case '/':
//                     result = num1 / num2;
//                     break;
//             }
//             textField.setText(String.valueOf(result));
//             input = "";
//         } else {
//             if (input.equals("")) return;
//             num1 = Double.parseDouble(input);
//             operator = command.charAt(0);
//             input = "";
//         }
//     }

//     // Main method to run the calculator
//     public static void main(String[] args) {
//         new Calculator();
//     }
// }
