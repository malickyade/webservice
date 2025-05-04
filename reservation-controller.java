package com.biblio.rest.controller;

import com.biblio.rest.dto.ReservationRequest;
import com.biblio.rest.soap.SoapConnector;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final SoapConnector soapConnector;

    public ReservationController(SoapConnector soapConnector) {
        this.soapConnector = soapConnector;
    }

    @PostMapping
    public ResponseEntity<String> reserverLivre(@RequestBody ReservationRequest request) {
        try {
            // Construction de la requête SOAP
            PreterLivreRequest soapRequest = new PreterLivreRequest();
            soapRequest.setUserId(request.getUserId());
            soapRequest.setLivreId(request.getLivreId());

            PreterLivreResponse response = (PreterLivreResponse)
                    soapConnector.callWebService("http://localhost:8081/ws", soapRequest);

            return ResponseEntity.ok("Réservation réussie (SOAP): " + response.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erreur SOAP : " + e.getMessage());
        }
    }
}
