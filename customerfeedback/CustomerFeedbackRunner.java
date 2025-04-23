package com.xworkz.objectmethodtask.customerfeedback;

public class CustomerFeedbackRunner {

        public static void main(String[] args) {

            CustomerFeedbackDto feedback = new CustomerFeedbackDto();

            feedback.setCustomerName("Harshitha");
            feedback.setRating(5);
            feedback.setComments("Great product, would definitely recommend!");
            feedback.setProductName("Smartphone");
            feedback.setSatisfied(true);

            System.out.println(feedback);
        }
    }


