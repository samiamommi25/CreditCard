package cse213.creditcard;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

import static javafx.scene.input.KeyCode.X;

public class creditCardController
{

    @javafx.fxml.FXML
    private TableColumn<String,CreditCard> holdernameTC;
    @javafx.fxml.FXML
    private ComboBox<String> gatewayCB;
    @javafx.fxml.FXML
    private ComboBox<String> filteringGatewayCB;
    @javafx.fxml.FXML
    private TableColumn<Float,CreditCard> CardlimitTC;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableView<CreditCard> Tableview;
    @javafx.fxml.FXML
    private TableColumn<String,CreditCard> gatewaTC;
    @javafx.fxml.FXML
    private TextField filteringCardlimitTF;
    @javafx.fxml.FXML
    private TextField cardlimitTF;
    @javafx.fxml.FXML
    private TableColumn<String,CreditCard> cardnoTC;
    @javafx.fxml.FXML
    private ComboBox<String> cardtypeCB;
    @javafx.fxml.FXML
    private Label outputAverageLable;
    @javafx.fxml.FXML
    private TextField holdernoTF;
    @javafx.fxml.FXML
    private TextField cardNumberTF;
    ArrayList<CreditCard> cardList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        cardtypeCB.getItems().addAll("silver","gold","platinum","titanium");
        gatewayCB.getItems().addAll("Visa","Master");
        filteringGatewayCB.getItems().addAll("Visa","Master");

        holdernameTC.setCellValueFactory(new PropertyValueFactory<String,CreditCard>("holderName"));
        CardlimitTC.setCellValueFactory(new PropertyValueFactory<Float,CreditCard>("creditLimit"));
        gatewaTC.setCellValueFactory(new PropertyValueFactory<String,CreditCard>("gatewayName"));
        cardnoTC.setCellValueFactory(new PropertyValueFactory<String,CreditCard>("cardNo"));





    }

    @javafx.fxml.FXML
    public void averageButton(ActionEvent actionEvent) {
//        int counter = 0;
//        Float sum = 0f ;
//        for(CreditCard X : Tableview.getItems());
//             X.ge

    }

    @javafx.fxml.FXML
    public void loadTableButton(ActionEvent actionEvent) {
        for (CreditCard cards : cardList){
            if(filteringGatewayCB.getValue().equals(cards.getGatewayName() && Float.parseFloat(filteringCardlimitTF.getText())== Float.parseFloat(cards.getCreditLimit()))){

                  Tableview.getItems().add(cards);
            }
        }
    }

    @javafx.fxml.FXML
    public void ValidateAddButton(ActionEvent actionEvent) {
//            public CreditCard(String cardNo, String holderName,
//            String gatewayName, String cardType, float creditLimit, LocalDate dateOfExpiry) {

            String cardNo = cardNumberTF.getText();
            String holderName = holdernoTF.getText();
            String gatewayName = gatewayCB.getValue();
            String cardType = cardtypeCB.getValue();
            LocalDate dateOfExpiry = datePicker.getValue();
            float creditLimit = Float.parseFloat(cardlimitTF.getText());

            CreditCard card = new CreditCard(cardNo,holderName,gatewayName,cardType,creditLimit,dateOfExpiry);
//            System.out.println(card.toString());
            cardList.add(card);

    }
}