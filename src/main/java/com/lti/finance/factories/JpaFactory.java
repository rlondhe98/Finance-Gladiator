package com.lti.finance.factories;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaFactory
{

    private static EntityManagerFactory factory;

    static
    {
        factory = Persistence.createEntityManagerFactory("OracleJpaUnit");
    }

    public static EntityManagerFactory getFactory()
    {
        return factory;
    }
}
