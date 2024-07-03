module com.oop.tutorialproject.midterm2210118sec2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.tutorialproject.midterm2210118sec2 to javafx.fxml;
    exports com.oop.tutorialproject.midterm2210118sec2;
}