package team1.funddigging.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team1.funddigging.domain.entity.Funding;
import team1.funddigging.domain.entity.Funding_amount;

public interface Funding_amountRepository extends JpaRepository<Funding_amount, Long> {
}