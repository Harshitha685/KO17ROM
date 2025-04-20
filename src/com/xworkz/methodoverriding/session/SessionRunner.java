package com.xworkz.methodoverriding.session;

public class SessionRunner {
        public static void main(String[] args) {
            Session session = new Session();
            session.startSession();
            session.validateSession();
            session.refreshSession();
            session.endSession();
            System.out.println();

            Session us = new UserSession();
            us.startSession();
            us.validateSession();
            us.refreshSession();
            us.endSession();
            System.out.println();

            UserSession userSession = new UserSession();
            userSession.startSession();
            userSession.validateSession();
            userSession.refreshSession();
            userSession.endSession();
            userSession.trackActivity();  // Unique method
        }
    }


