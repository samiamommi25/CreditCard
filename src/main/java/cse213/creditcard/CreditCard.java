package cse213.creditcard;

import java.time.LocalDate;

public class CreditCard {
    private String cardNo,holderName,gatewayName,cardType;
    private float creditLimit;
    private LocalDate dateOfExpiry;

    public CreditCard(String cardNo, String holderName, String gatewayName, String cardType, float creditLimit, LocalDate dateOfExpiry) {
        this.cardNo = cardNo;
        this.holderName = holderName;
        this.gatewayName = gatewayName;
        this.cardType = cardType;
        this.creditLimit = creditLimit;
        this.dateOfExpiry = dateOfExpiry;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public String getCardType() {
        return cardType;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getCardNo() {
        return cardNo;
    }

//    public void setCardNo(String cardNo) {
//        this.cardNo = cardNo;
//    }

//    public void setHolderName(String holderName) {
//        this.holderName = holderName;
//    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNo='" + cardNo + '\'' +
                ", holderName='" + holderName + '\'' +
                ", gatewayName='" + gatewayName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", creditLimit=" + creditLimit +
                ", dateOfExpiry=" + dateOfExpiry +
                '}';
    }
    public void showCardInfo(){

    }

}
