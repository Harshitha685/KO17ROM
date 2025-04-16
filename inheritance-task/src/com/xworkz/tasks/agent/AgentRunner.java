package com.xworkz.tasks.agent;

public class AgentRunner {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.registerAgent();
        agent.isEligibleForBonus();
        agent.assignArea();
        agent.trackPerformance();
        agent.updateContactInfo();

        Agent agent2 = new SalesAgent();
        agent2.registerAgent();
        agent2.isEligibleForBonus();
        agent2.assignArea();
        agent2.trackPerformance();
        agent2.updateContactInfo();

        SalesAgent salesAgent = new SalesAgent();
        salesAgent.generateSalesReport();
        salesAgent.meetClients();
        salesAgent.closeDeals();
        salesAgent.handleCustomerQueries();
        salesAgent.provideDiscountOffers();

        Agent agent1 = new SalesAgent();

        SalesAgent salesAgent1 = (SalesAgent) agent1;
        System.out.println(salesAgent1);
    }
}
