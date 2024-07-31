module workshopjavafxjdbc2 {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
    requires java.sql;
    opens gui to javafx.fxml; // Adicione esta linha para exportar o pacote gui para javafx.fxm
    exports gui; // Se você também precisar exportar o pacote gui para outros módulos
}
