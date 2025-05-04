package com.biblio.soap.client;

public class PreterLivreRequest {
    private Long userId;
    private Long livreId;

    // Getters & Setters
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Long getLivreId() { return livreId; }
    public void setLivreId(Long livreId) { this.livreId = livreId; }
}
