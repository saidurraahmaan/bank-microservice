package com.s4r.card.repository;

import com.s4r.card.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, Long> {

    Optional<Card> findByMobileNumber(String mobileNumber);

    Optional<Card> findByCardNumber(String cardNumber);

}
