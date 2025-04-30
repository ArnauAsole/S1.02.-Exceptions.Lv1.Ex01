🛍💶📊 Product and Sale – Sales Management with Custom Exceptions
📄 Exercise Description
The goal of this exercise is to create a Java application that simulates a basic sales system. You'll work with a Product class, a Sale class that calculates the total price of a sale, and a custom exception called EmptySaleException. The project also includes an example of how to generate and catch an IndexOutOfBoundsException.

✅ What You Must Implement
🔹 Product Class
Contains two attributes: name (String) and price (double).

Represents a single product.

🔹 Sale Class
Contains a collection of products (ArrayList<Product>) and a totalPrice (double) attribute.

Includes a method calcuteTotalProduct() that:

Throws a custom EmptySaleException if the list of products is empty.

Otherwise, iterates over the products and sums their prices into totalPrice.

🔹 Custom Exception EmptySaleException
Inherits from Exception.

Displays the message: “To make a sale you must first add products” when thrown.

🔹 Handling IndexOutOfBoundsException
Includes a working example that generates and catches an IndexOutOfBoundsException.

📝 Example Usage
To compile and run the program from the command line:

# Compile all .java files
javac Product.java Sale.java EmptySaleException.java Main.java

# Run the main program
java Main

💻 Technologies Used
Java 17

IntelliJ IDEA or Eclipse

Git & GitHub

📋 Prerequisites
To run this project, you will need:

Java JDK 17

IntelliJ IDEA or Eclipse

Git Bash or compatible terminal

GitHub account (optional for version control)

🛠️ Installation and Setup
Install Required Tools

Java JDK 17

IntelliJ IDEA or Eclipse

Git Bash or other terminal

Clone the Repository (Optional)

git clone https://github.com/ArnauAsole/S1.02.-Exceptions.Lv1.Ex01.git
cd ArnauAsole/S1.02.-Exceptions.Lv1.Ex01
Open the Project in the IDE

IntelliJ: File → Open and select the folder.

Eclipse: File → Import → Existing Projects into Workspace

📜 Commands to Compile and Run

# Compile the program
javac *.java

# Run the application
java Main

🌐 Deployment
This is a command-line based Java application that runs locally in your terminal or IDE. No deployment to a server is required.

🤝 Acknowledgements
Special thanks to Adria, Ignasi, Ana, Alejandro, and Marina for designing and contributing to this exercise.
