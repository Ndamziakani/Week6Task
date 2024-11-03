module com.example.week6task {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week6task to javafx.fxml;
    exports com.example.week6task;
}