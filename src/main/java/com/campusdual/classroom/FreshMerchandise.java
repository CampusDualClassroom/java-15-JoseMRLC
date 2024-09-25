package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private Date expirationDate;


    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }


    @Override
    public String getSpecificData() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(this.expirationDate);


        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ").append(getLocation()).append("\n");
        builder.append("Fecha de caducidad: ").append(formattedDate);
        return builder.toString();
    }


    public void printSpecificData() {
        String specificData = getSpecificData();
        System.out.println(specificData);
    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    // Getter para expirationDate
    public Date getExpirationDate() {
        return expirationDate;
    }
}
