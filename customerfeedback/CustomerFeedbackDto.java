package com.xworkz.objectmethodtask.customerfeedback;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerFeedbackDto {

    private String customerName;
    private int rating;
    private String comments;
    private String productName;
    private boolean isSatisfied;

    @Override
    public String toString() {
        return "CustomerFeedbackDto = (" +
                "customerName = " + this.customerName + "," +
                "\nrating = " + this.rating + "/5," +
                "\ncomments = " + this.comments + "," +
                "\nproductName = " + this.productName + "," +
                "\nisSatisfied = " + this.isSatisfied + ")";
    }
}


