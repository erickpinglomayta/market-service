package pe.com.bank.market.repositorty;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import pe.com.bank.market.document.MarketDocument;


@Repository
public interface MarketRepository extends ReactiveMongoRepository<MarketDocument, String>{

}
