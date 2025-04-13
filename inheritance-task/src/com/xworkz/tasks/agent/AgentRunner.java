package com.xworkz.tasks.agent;

public class AgentRunner {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.registerAgent();
        agent.isEligibleForBonus();

        SalesAgent salesAgent = new SalesAgent();
        salesAgent.registerAgent();
        salesAgent.isEligibleForBonus();

        Agent agent1 = new SalesAgent();

        SalesAgent salesAgent1 = (SalesAgent) agent1;
        System.out.println(salesAgent1);
    }
}
