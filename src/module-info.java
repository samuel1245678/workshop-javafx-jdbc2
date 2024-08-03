module workshopjavafxjdbc2 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
    opens gui to javafx.fxml; // Adicione esta linha para exportar o pacote gui para javafx.fxm
    exports gui; // Se você também precisar exportar o pacote gui para outros módulos
    
    
    opens model.entities to javafx.base; // Adicione esta linha para abrir o pacote model.entities para javafx.base

    exports model.entities; // Se você também precisar exportar o pacote model.entities para outros módulos
   



    
}
