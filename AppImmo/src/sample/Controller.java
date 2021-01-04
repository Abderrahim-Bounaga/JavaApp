package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField tfId;

    @FXML
    private TextField tfAdress;

    @FXML
    private TextField tfType;

    @FXML
    private TextField tfSurface;

    @FXML
    private TextField tfPrice;

    @FXML
    private TableView<Product> tvBooks;

    @FXML
    private TableColumn<Product, Integer> colId;

    @FXML
    private TableColumn<Product, String> colAdress;

    @FXML
    private TableColumn<Product, String> colType;

    @FXML
    private TableColumn<Product, String> colSurface;

    @FXML
    private TableColumn<Product, Integer> colPrice;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;
    @FXML
    private TextField fxName;

    @FXML
    private TextField fxMail;

    @FXML
    private TextField fxRole;

    @FXML
    private TextField fxPass;

    @FXML
    private TextField fxPhone;

    @FXML
    private Button btnadd;

    @FXML
    private Button btndelete;

    @FXML
    private TableView<Product> vtable;

    @FXML
    private TableColumn<Product, String> colName;

    @FXML
    private TableColumn<Product, String> colMail;

    @FXML
    private TableColumn<Product, String> colRol;


    @FXML
    private TableColumn<Product, Integer> colNumber;
    private URL arg0;
    private ResourceBundle resourceBundle;
    @FXML
    void UpActionn(ActionEvent event) {

    }
    @FXML
    void addpro(ActionEvent event) {
        Product pobj = new Product();
        pobj.setName(fxName.getText());
        pobj.setMail(fxMail.getText());
        pobj.setRole(fxRole.getText());
        pobj.setPass(fxPass.getText());
        pobj.setPhone(Integer.parseInt(fxPhone.getText()));
        vtable.getItems().add(pobj);
        fxName.clear();
        fxMail.clear();
        fxRole.clear();
        fxPass.clear();
        fxPhone.clear();
    }

    @FXML
    void deletepro(ActionEvent event) {
        vtable.getItems().removeAll(vtable.getSelectionModel().getSelectedItem());

    }

    int index = -1;
    @Override
    public void initialize(URL arg0, ResourceBundle resourceBundle) {

        colId.setCellValueFactory(new PropertyValueFactory<>("ID"));
        colAdress.setCellValueFactory(new PropertyValueFactory<>("Adress"));
        colType.setCellValueFactory(new PropertyValueFactory<>("Type"));
        colSurface.setCellValueFactory(new PropertyValueFactory<>("Surface"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("Price"));
        tvBooks.setItems(getProductList());
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colMail.setCellValueFactory(new PropertyValueFactory<>("Mail"));
        colRol.setCellValueFactory(new PropertyValueFactory<>("Role"));
        colNumber.setCellValueFactory(new PropertyValueFactory<>("Phone"));
        vtable.setItems(getProductList());
    }

    public void addAction(ActionEvent actionEvent) {
        Product pobj1 = new Product();
        pobj1.setID(Integer.parseInt(tfId.getText()));
        pobj1.setAdress(tfAdress.getText());
        pobj1.setType(tfType.getText());
        pobj1.setSurface(tfSurface.getText());
        pobj1.setPrice(Integer.parseInt(tfPrice.getText()));
        tvBooks.getItems().add(pobj1);
        tfId.clear();
        tfAdress.clear();
        tfType.clear();
        tfSurface.clear();
        tfPrice.clear();

    }



public void DeleteAction(ActionEvent actionEvent) {
    tvBooks.getItems().removeAll(tvBooks.getSelectionModel().getSelectedItem());
}


    ObservableList<Product> getProductList(){
        ObservableList<Product> products= FXCollections.observableArrayList();
        products.add(new Product(10 , "marrekech" ,"villa","ddd",233 , "abb","nn", "nn", "hh",1));
        return products;
    }
}
