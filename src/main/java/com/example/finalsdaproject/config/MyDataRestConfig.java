package com.example.finalsdaproject.config;

import com.example.finalsdaproject.entity.Country;
import com.example.finalsdaproject.entity.Product;
import com.example.finalsdaproject.entity.ProductCategory;
import com.example.finalsdaproject.entity.State;
import com.example.finalsdaproject.entity.Customer;
import com.example.finalsdaproject.entity.CustomerOrder;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    private final EntityManager entityManager;

    @Autowired
    public MyDataRestConfig(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] theUnsupportedActions = { HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE };

        // Disable HTTP methods for each Repository Resource: Product, ProductCategory, State, Country
        restrictHttpMethods(Product.class, config, theUnsupportedActions);
        restrictHttpMethods(ProductCategory.class, config, theUnsupportedActions);
        restrictHttpMethods(State.class, config, theUnsupportedActions);
        restrictHttpMethods(Country.class, config, theUnsupportedActions);
        restrictHttpMethods(CustomerOrder.class, config, theUnsupportedActions);
        restrictHttpMethods(Customer.class, config, theUnsupportedActions);
    }

    // Rename the method for clarity
    private void restrictHttpMethods(Class<?> domainType, RepositoryRestConfiguration configuration, HttpMethod[] unsupportedActions) {
        configuration.getExposureConfiguration()
                .forDomainType(domainType)
                .withItemExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedActions));
    }
}