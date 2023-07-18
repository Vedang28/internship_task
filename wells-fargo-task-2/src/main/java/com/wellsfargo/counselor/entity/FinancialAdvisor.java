package com.wellsfargo.counselor.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue
    private Long advisorId;

    private String name;

    @OneToMany(mappedBy = "financialAdvisor")
    private List<Client> clients;

    // Constructor
    public FinancialAdvisor(String name) {
        this.name = name;
    }

    // Getters and setters
    public Long getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(Long advisorId) {
        this.advisorId = advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
