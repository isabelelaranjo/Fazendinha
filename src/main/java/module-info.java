module br.com.isabeleEmilly {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.isabeleEmilly to javafx.fxml;
    exports br.com.isabeleEmilly;
}
