package br.cicero.ecommerce.checkout.resource.checkout;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutResource implements Serializable {

    private String firstNmae;
    private String lastNmae;
    private String username;
    private String email;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private Boolean saveAddress;
    private Boolean saveInfo;
    private String paymentMethod;
    private String cardNome;
    private String cardNumber;
    private String cardDate;
    private String cardCvv;
}
